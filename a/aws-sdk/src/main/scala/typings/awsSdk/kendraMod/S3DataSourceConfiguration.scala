package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DataSourceConfiguration extends js.Object {
  /**
    * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
    */
  var AccessControlListConfiguration: js.UndefOr[typings.awsSdk.kendraMod.AccessControlListConfiguration] = js.native
  /**
    * The name of the bucket that contains the documents.
    */
  var BucketName: S3BucketName = js.native
  var DocumentsMetadataConfiguration: js.UndefOr[typings.awsSdk.kendraMod.DocumentsMetadataConfiguration] = js.native
  /**
    * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * A list of S3 prefixes for the documents that should be included in the index.
    */
  var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}

object S3DataSourceConfiguration {
  @scala.inline
  def apply(
    BucketName: S3BucketName,
    AccessControlListConfiguration: AccessControlListConfiguration = null,
    DocumentsMetadataConfiguration: DocumentsMetadataConfiguration = null,
    ExclusionPatterns: DataSourceInclusionsExclusionsStrings = null,
    InclusionPrefixes: DataSourceInclusionsExclusionsStrings = null
  ): S3DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    if (AccessControlListConfiguration != null) __obj.updateDynamic("AccessControlListConfiguration")(AccessControlListConfiguration.asInstanceOf[js.Any])
    if (DocumentsMetadataConfiguration != null) __obj.updateDynamic("DocumentsMetadataConfiguration")(DocumentsMetadataConfiguration.asInstanceOf[js.Any])
    if (ExclusionPatterns != null) __obj.updateDynamic("ExclusionPatterns")(ExclusionPatterns.asInstanceOf[js.Any])
    if (InclusionPrefixes != null) __obj.updateDynamic("InclusionPrefixes")(InclusionPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSourceConfiguration]
  }
}

