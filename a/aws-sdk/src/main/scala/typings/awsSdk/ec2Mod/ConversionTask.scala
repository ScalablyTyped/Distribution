package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionTask extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: js.UndefOr[String] = js.native
  /**
    * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel the task.
    */
  var ExpirationTime: js.UndefOr[String] = js.native
  /**
    * If the task is for importing an instance, this contains information about the import instance task.
    */
  var ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.native
  /**
    * If the task is for importing a volume, this contains information about the import volume task.
    */
  var ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.native
  /**
    * The state of the conversion task.
    */
  var State: js.UndefOr[ConversionTaskState] = js.native
  /**
    * The status message related to the conversion task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ConversionTask {
  @scala.inline
  def apply(
    ConversionTaskId: String = null,
    ExpirationTime: String = null,
    ImportInstance: ImportInstanceTaskDetails = null,
    ImportVolume: ImportVolumeTaskDetails = null,
    State: ConversionTaskState = null,
    StatusMessage: String = null,
    Tags: TagList = null
  ): ConversionTask = {
    val __obj = js.Dynamic.literal()
    if (ConversionTaskId != null) __obj.updateDynamic("ConversionTaskId")(ConversionTaskId.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (ImportInstance != null) __obj.updateDynamic("ImportInstance")(ImportInstance.asInstanceOf[js.Any])
    if (ImportVolume != null) __obj.updateDynamic("ImportVolume")(ImportVolume.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionTask]
  }
}

