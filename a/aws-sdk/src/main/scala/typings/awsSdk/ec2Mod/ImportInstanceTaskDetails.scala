package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceTaskDetails extends js.Object {
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The instance operating system.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
  /**
    * The volumes.
    */
  var Volumes: js.UndefOr[ImportInstanceVolumeDetailSet] = js.native
}

object ImportInstanceTaskDetails {
  @scala.inline
  def apply(
    Description: String = null,
    InstanceId: String = null,
    Platform: PlatformValues = null,
    Volumes: ImportInstanceVolumeDetailSet = null
  ): ImportInstanceTaskDetails = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceTaskDetails]
  }
}

