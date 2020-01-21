package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ArchiveRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Failed
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InProgress
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InventoryRetrieval
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Select
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Succeeded
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.UnmarshalledInventoryRetrievalJobDescription
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/DescribeJobOutput", JSImport.Namespace)
@js.native
object typesDescribeJobOutputMod extends js.Object {
  @js.native
  trait DescribeJobOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or <code>Select</code>. </p>
      */
    var Action: js.UndefOr[ArchiveRetrieval | InventoryRetrieval | Select | String] = js.native
    /**
      * <p>The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.</p>
      */
    var ArchiveId: js.UndefOr[String] = js.native
    /**
      * <p>The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.</p>
      */
    var ArchiveSHA256TreeHash: js.UndefOr[String] = js.native
    /**
      * <p>For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.</p>
      */
    var ArchiveSizeInBytes: js.UndefOr[Double] = js.native
    /**
      * <p>The job status. When a job is completed, you get the job's output using Get Job Output (GET output).</p>
      */
    var Completed: js.UndefOr[Boolean] = js.native
    /**
      * <p>The UTC time that the job request completed. While the job is in progress, the value is null.</p>
      */
    var CompletionDate: js.UndefOr[String] = js.native
    /**
      * <p>The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example <code>"2012-03-20T17:03:43.221Z"</code>.</p>
      */
    var CreationDate: js.UndefOr[String] = js.native
    /**
      * <p>Parameters used for range inventory retrieval.</p>
      */
    var InventoryRetrievalParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobDescription] = js.native
    /**
      * <p>For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.</p>
      */
    var InventorySizeInBytes: js.UndefOr[Double] = js.native
    /**
      * <p>The job description provided when initiating the job.</p>
      */
    var JobDescription: js.UndefOr[String] = js.native
    /**
      * <p>An opaque string that identifies an Amazon Glacier job.</p>
      */
    var JobId: js.UndefOr[String] = js.native
    /**
      * <p>Contains the job output location.</p>
      */
    var JobOutputPath: js.UndefOr[String] = js.native
    /**
      * <p>Contains the location where the data from the select job is stored.</p>
      */
    var OutputLocation: js.UndefOr[UnmarshalledOutputLocation] = js.native
    /**
      * <p>The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. </p>
      */
    var RetrievalByteRange: js.UndefOr[String] = js.native
    /**
      * <p>For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.</p> <p>The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an archive specified a tree-hash aligned range, then this field returns a value.</p> <p>If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.</p> <p>This field is null for the following:</p> <ul> <li> <p>Archive retrieval jobs that specify a range that is not tree-hash aligned</p> </li> </ul> <ul> <li> <p>Archival jobs that specify a range that is equal to the whole archive, when the job status is <code>InProgress</code> </p> </li> </ul> <ul> <li> <p>Inventory jobs</p> </li> <li> <p>Select jobs</p> </li> </ul>
      */
    var SHA256TreeHash: js.UndefOr[String] = js.native
    /**
      * <p>An Amazon SNS topic that receives notification.</p>
      */
    var SNSTopic: js.UndefOr[String] = js.native
    /**
      * <p>Contains the parameters used for a select.</p>
      */
    var SelectParameters: js.UndefOr[UnmarshalledSelectParameters] = js.native
    /**
      * <p>The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the status of the job.</p>
      */
    var StatusCode: js.UndefOr[InProgress | Succeeded | Failed | String] = js.native
    /**
      * <p>A friendly message that describes the job status.</p>
      */
    var StatusMessage: js.UndefOr[String] = js.native
    /**
      * <p>The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
      */
    var Tier: js.UndefOr[String] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.</p>
      */
    var VaultARN: js.UndefOr[String] = js.native
  }
  
}

