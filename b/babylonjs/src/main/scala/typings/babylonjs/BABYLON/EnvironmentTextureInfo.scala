package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentTextureInfo extends StObject {
  
  /**
    * Irradiance information stored in the file.
    */
  var irradiance: js.Any = js.native
  
  /**
    * Specular information stored in the file.
    */
  var specular: js.Any = js.native
  
  /**
    * Version of the environment map
    */
  var version: Double = js.native
  
  /**
    * Width of image
    */
  var width: Double = js.native
}
object EnvironmentTextureInfo {
  
  @scala.inline
  def apply(irradiance: js.Any, specular: js.Any, version: Double, width: Double): EnvironmentTextureInfo = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureInfo]
  }
  
  @scala.inline
  implicit class EnvironmentTextureInfoMutableBuilder[Self <: EnvironmentTextureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIrradiance(value: js.Any): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecular(value: js.Any): Self = StObject.set(x, "specular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
