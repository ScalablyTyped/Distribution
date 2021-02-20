package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstanceTaskDetails extends StObject {
  
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
  implicit class ImportInstanceTaskDetailsMutableBuilder[Self <: ImportInstanceTaskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setVolumes(value: ImportInstanceVolumeDetailSet): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: ImportInstanceVolumeDetailItem*): Self = StObject.set(x, "Volumes", js.Array(value :_*))
  }
}
