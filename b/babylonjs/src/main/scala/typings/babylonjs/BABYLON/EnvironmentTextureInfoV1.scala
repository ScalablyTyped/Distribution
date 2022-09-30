package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * v1 of EnvironmentTextureInfo
  */
trait EnvironmentTextureInfoV1
  extends StObject
     with EnvironmentTextureInfo {
  
  /**
    * Irradiance information stored in the file.
    */
  var irradiance: Any
  
  /**
    * Specular information stored in the file.
    */
  var specular: Any
  
  /**
    * Version of the environment map
    */
  var version: `1`
  
  /**
    * Width of image
    */
  var width: Double
}
object EnvironmentTextureInfoV1 {
  
  inline def apply(irradiance: Any, specular: Any, width: Double): EnvironmentTextureInfoV1 = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 1, width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureInfoV1]
  }
  
  extension [Self <: EnvironmentTextureInfoV1](x: Self) {
    
    inline def setIrradiance(value: Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
    
    inline def setSpecular(value: Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
