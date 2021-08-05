package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceTaskDetails extends StObject {
  
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance operating system.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  
  /**
    * The volumes.
    */
  var Volumes: js.UndefOr[ImportInstanceVolumeDetailSet] = js.undefined
}
object ImportInstanceTaskDetails {
  
  inline def apply(): ImportInstanceTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceTaskDetails]
  }
  
  extension [Self <: ImportInstanceTaskDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setVolumes(value: ImportInstanceVolumeDetailSet): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: ImportInstanceVolumeDetailItem*): Self = StObject.set(x, "Volumes", js.Array(value :_*))
  }
}
