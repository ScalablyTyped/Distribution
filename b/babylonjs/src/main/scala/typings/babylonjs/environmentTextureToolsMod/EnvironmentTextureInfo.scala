package typings.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentTextureInfo extends js.Object {
  
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
  implicit class EnvironmentTextureInfoOps[Self <: EnvironmentTextureInfo] (val x: Self) extends AnyVal {
    
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
    def setIrradiance(value: js.Any): Self = this.set("irradiance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecular(value: js.Any): Self = this.set("specular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
