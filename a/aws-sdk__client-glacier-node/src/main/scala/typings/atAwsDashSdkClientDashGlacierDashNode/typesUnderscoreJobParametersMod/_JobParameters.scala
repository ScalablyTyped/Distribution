package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreJobParametersMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInventoryRetrievalJobInputMod._InventoryRetrievalJobInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputLocationMod._OutputLocation
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreSelectParametersMod._SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _JobParameters extends js.Object {
  /**
    * <p>The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. </p>
    */
  var ArchiveId: js.UndefOr[String] = js.undefined
  /**
    * <p>The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".</p>
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  var InventoryRetrievalParameters: js.UndefOr[_InventoryRetrievalJobInput] = js.undefined
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  var OutputLocation: js.UndefOr[_OutputLocation] = js.undefined
  /**
    * <p>The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response. </p> <p>An error occurs if you specify this field for an inventory retrieval job request.</p>
    */
  var RetrievalByteRange: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.</p>
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  var SelectParameters: js.UndefOr[_SelectParameters] = js.undefined
  /**
    * <p>The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
    */
  var Tier: js.UndefOr[String] = js.undefined
  /**
    * <p>The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".</p>
    */
  var Type: js.UndefOr[String] = js.undefined
}

object _JobParameters {
  @scala.inline
  def apply(
    ArchiveId: String = null,
    Description: String = null,
    Format: String = null,
    InventoryRetrievalParameters: _InventoryRetrievalJobInput = null,
    OutputLocation: _OutputLocation = null,
    RetrievalByteRange: String = null,
    SNSTopic: String = null,
    SelectParameters: _SelectParameters = null,
    Tier: String = null,
    Type: String = null
  ): _JobParameters = {
    val __obj = js.Dynamic.literal()
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_JobParameters]
  }
}

