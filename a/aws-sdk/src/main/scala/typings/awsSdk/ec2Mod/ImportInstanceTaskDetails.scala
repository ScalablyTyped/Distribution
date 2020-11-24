package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ImportInstanceTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceTaskDetails]
  }
  
  @scala.inline
  implicit class ImportInstanceTaskDetailsOps[Self <: ImportInstanceTaskDetails] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setPlatform(value: PlatformValues): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: ImportInstanceVolumeDetailItem*): Self = this.set("Volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: ImportInstanceVolumeDetailSet): Self = this.set("Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("Volumes", js.undefined)
  }
}
