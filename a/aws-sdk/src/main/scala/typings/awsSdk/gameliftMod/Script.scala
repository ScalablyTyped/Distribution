package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  /**
    * A time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift script resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typings.awsSdk.gameliftMod.ScriptArn] = js.native
  /**
    * A unique identifier for a Realtime script
    */
  var ScriptId: js.UndefOr[typings.awsSdk.gameliftMod.ScriptId] = js.native
  /**
    * The file size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this value remains at "0".
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.native
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * The version that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}

object Script {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    Name: NonZeroAndMaxString = null,
    ScriptArn: ScriptArn = null,
    ScriptId: ScriptId = null,
    SizeOnDisk: Int | scala.Double = null,
    StorageLocation: S3Location = null,
    Version: NonZeroAndMaxString = null
  ): Script = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ScriptArn != null) __obj.updateDynamic("ScriptArn")(ScriptArn.asInstanceOf[js.Any])
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId.asInstanceOf[js.Any])
    if (SizeOnDisk != null) __obj.updateDynamic("SizeOnDisk")(SizeOnDisk.asInstanceOf[js.Any])
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
}

