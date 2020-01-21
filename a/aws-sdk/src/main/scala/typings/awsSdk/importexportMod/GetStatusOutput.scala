package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatusOutput extends js.Object {
  var ArtifactList: js.UndefOr[typings.awsSdk.importexportMod.ArtifactList] = js.native
  var Carrier: js.UndefOr[typings.awsSdk.importexportMod.Carrier] = js.native
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.native
  var CurrentManifest: js.UndefOr[typings.awsSdk.importexportMod.CurrentManifest] = js.native
  var ErrorCount: js.UndefOr[typings.awsSdk.importexportMod.ErrorCount] = js.native
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.native
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.native
  var LocationCode: js.UndefOr[typings.awsSdk.importexportMod.LocationCode] = js.native
  var LocationMessage: js.UndefOr[typings.awsSdk.importexportMod.LocationMessage] = js.native
  var LogBucket: js.UndefOr[typings.awsSdk.importexportMod.LogBucket] = js.native
  var LogKey: js.UndefOr[typings.awsSdk.importexportMod.LogKey] = js.native
  var ProgressCode: js.UndefOr[typings.awsSdk.importexportMod.ProgressCode] = js.native
  var ProgressMessage: js.UndefOr[typings.awsSdk.importexportMod.ProgressMessage] = js.native
  var Signature: js.UndefOr[typings.awsSdk.importexportMod.Signature] = js.native
  var SignatureFileContents: js.UndefOr[Signature] = js.native
  var TrackingNumber: js.UndefOr[typings.awsSdk.importexportMod.TrackingNumber] = js.native
}

object GetStatusOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    Carrier: Carrier = null,
    CreationDate: CreationDate = null,
    CurrentManifest: CurrentManifest = null,
    ErrorCount: Int | Double = null,
    JobId: JobId = null,
    JobType: JobType = null,
    LocationCode: LocationCode = null,
    LocationMessage: LocationMessage = null,
    LogBucket: LogBucket = null,
    LogKey: LogKey = null,
    ProgressCode: ProgressCode = null,
    ProgressMessage: ProgressMessage = null,
    Signature: Signature = null,
    SignatureFileContents: Signature = null,
    TrackingNumber: TrackingNumber = null
  ): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList.asInstanceOf[js.Any])
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CurrentManifest != null) __obj.updateDynamic("CurrentManifest")(CurrentManifest.asInstanceOf[js.Any])
    if (ErrorCount != null) __obj.updateDynamic("ErrorCount")(ErrorCount.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (LocationCode != null) __obj.updateDynamic("LocationCode")(LocationCode.asInstanceOf[js.Any])
    if (LocationMessage != null) __obj.updateDynamic("LocationMessage")(LocationMessage.asInstanceOf[js.Any])
    if (LogBucket != null) __obj.updateDynamic("LogBucket")(LogBucket.asInstanceOf[js.Any])
    if (LogKey != null) __obj.updateDynamic("LogKey")(LogKey.asInstanceOf[js.Any])
    if (ProgressCode != null) __obj.updateDynamic("ProgressCode")(ProgressCode.asInstanceOf[js.Any])
    if (ProgressMessage != null) __obj.updateDynamic("ProgressMessage")(ProgressMessage.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    if (SignatureFileContents != null) __obj.updateDynamic("SignatureFileContents")(SignatureFileContents.asInstanceOf[js.Any])
    if (TrackingNumber != null) __obj.updateDynamic("TrackingNumber")(TrackingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatusOutput]
  }
}

