package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentTextureInfo extends StObject {
  
  /**
    * Irradiance information stored in the file.
    */
  var irradiance: js.Any
  
  /**
    * Specular information stored in the file.
    */
  var specular: js.Any
  
  /**
    * Version of the environment map
    */
  var version: Double
  
  /**
    * Width of image
    */
  var width: Double
}
object EnvironmentTextureInfo {
  
  inline def apply(irradiance: js.Any, specular: js.Any, version: Double, width: Double): EnvironmentTextureInfo = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureInfo]
  }
  
  extension [Self <: EnvironmentTextureInfo](x: Self) {
    
    inline def setIrradiance(value: js.Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
    
    inline def setSpecular(value: js.Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
