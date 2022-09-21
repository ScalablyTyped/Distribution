package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeMount extends StObject {
  
  /**
    * The path in the container at which the volume should be mounted. 
    */
  var MountPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the volume. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object VolumeMount {
  
  inline def apply(): VolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMount]
  }
  
  extension [Self <: VolumeMount](x: Self) {
    
    inline def setMountPath(value: NonEmptyString): Self = StObject.set(x, "MountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "MountPath", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
