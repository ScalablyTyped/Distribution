package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of S3 prefixes for the documents that should be included in the index.
    */
  var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}
object S3DataSourceConfiguration {
  
  @scala.inline
  def apply(BucketName: S3BucketName): S3DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSourceConfiguration]
  }
  
  @scala.inline
  implicit class S3DataSourceConfigurationOps[Self <: S3DataSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: S3BucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListConfiguration(value: AccessControlListConfiguration): Self = this.set("AccessControlListConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlListConfiguration: Self = this.set("AccessControlListConfiguration", js.undefined)
    
    @scala.inline
    def setDocumentsMetadataConfiguration(value: DocumentsMetadataConfiguration): Self = this.set("DocumentsMetadataConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentsMetadataConfiguration: Self = this.set("DocumentsMetadataConfiguration", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusionPatterns: Self = this.set("ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusionPatterns: Self = this.set("InclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPrefixesVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("InclusionPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPrefixes(value: DataSourceInclusionsExclusionsStrings): Self = this.set("InclusionPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusionPrefixes: Self = this.set("InclusionPrefixes", js.undefined)
  }
}
