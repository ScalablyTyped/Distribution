package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Script = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setScriptArn(value: ScriptArn): Self = this.set("ScriptArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptArn: Self = this.set("ScriptArn", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("ScriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptId: Self = this.set("ScriptId", js.undefined)
    
    @scala.inline
    def setSizeOnDisk(value: PositiveLong): Self = this.set("SizeOnDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeOnDisk: Self = this.set("SizeOnDisk", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: S3Location): Self = this.set("StorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocation: Self = this.set("StorageLocation", js.undefined)
    
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
