package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsMountPoint extends StObject {
  
  /**
    * The path on the container to mount the host volume at. 
    */
  var ContainerPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the volume to mount. Must be a volume name referenced in the name parameter of task definition volume. 
    */
  var SourceVolume: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsMountPoint {
  
  inline def apply(): AwsMountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsMountPoint]
  }
  
  extension [Self <: AwsMountPoint](x: Self) {
    
    inline def setContainerPath(value: NonEmptyString): Self = StObject.set(x, "ContainerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "ContainerPath", js.undefined)
    
    inline def setSourceVolume(value: NonEmptyString): Self = StObject.set(x, "SourceVolume", value.asInstanceOf[js.Any])
    
    inline def setSourceVolumeUndefined: Self = StObject.set(x, "SourceVolume", js.undefined)
  }
}
