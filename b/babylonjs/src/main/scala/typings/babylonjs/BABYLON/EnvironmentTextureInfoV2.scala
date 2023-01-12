package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * v2 of EnvironmentTextureInfo
  */
trait EnvironmentTextureInfoV2
  extends StObject
     with EnvironmentTextureInfo {
  
  /**
    * The mime type used to encode the image data.
    */
  var imageType: String
  
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
  var version: `2`
  
  /**
    * Width of image
    */
  var width: Double
}
object EnvironmentTextureInfoV2 {
  
  inline def apply(imageType: String, irradiance: Any, specular: Any, width: Double): EnvironmentTextureInfoV2 = {
    val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 2, width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureInfoV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentTextureInfoV2] (val x: Self) extends AnyVal {
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setIrradiance(value: Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
    
    inline def setSpecular(value: Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
