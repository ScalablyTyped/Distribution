package typings.babylonjs.pbrSheenConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialSheenDefines extends js.Object {
  
  var SHEEN: Boolean = js.native
  
  var SHEEN_ALBEDOSCALING: Boolean = js.native
  
  var SHEEN_LINKWITHALBEDO: Boolean = js.native
  
  var SHEEN_ROUGHNESS: Boolean = js.native
  
  var SHEEN_TEXTURE: Boolean = js.native
  
  var SHEEN_TEXTUREDIRECTUV: Double = js.native
  
  var SHEEN_TEXTURE_ROUGHNESS: Boolean = js.native
  
  var SHEEN_TEXTURE_ROUGHNESSDIRECTUV: Double = js.native
  
  var SHEEN_TEXTURE_ROUGHNESS_IDENTICAL: Boolean = js.native
  
  var SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean = js.native
  
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}
object IMaterialSheenDefines {
  
  @scala.inline
  def apply(
    SHEEN: Boolean,
    SHEEN_ALBEDOSCALING: Boolean,
    SHEEN_LINKWITHALBEDO: Boolean,
    SHEEN_ROUGHNESS: Boolean,
    SHEEN_TEXTURE: Boolean,
    SHEEN_TEXTUREDIRECTUV: Double,
    SHEEN_TEXTURE_ROUGHNESS: Boolean,
    SHEEN_TEXTURE_ROUGHNESSDIRECTUV: Double,
    SHEEN_TEXTURE_ROUGHNESS_IDENTICAL: Boolean,
    SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialSheenDefines = {
    val __obj = js.Dynamic.literal(SHEEN = SHEEN.asInstanceOf[js.Any], SHEEN_ALBEDOSCALING = SHEEN_ALBEDOSCALING.asInstanceOf[js.Any], SHEEN_LINKWITHALBEDO = SHEEN_LINKWITHALBEDO.asInstanceOf[js.Any], SHEEN_ROUGHNESS = SHEEN_ROUGHNESS.asInstanceOf[js.Any], SHEEN_TEXTURE = SHEEN_TEXTURE.asInstanceOf[js.Any], SHEEN_TEXTUREDIRECTUV = SHEEN_TEXTUREDIRECTUV.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESS = SHEEN_TEXTURE_ROUGHNESS.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESSDIRECTUV = SHEEN_TEXTURE_ROUGHNESSDIRECTUV.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESS_IDENTICAL = SHEEN_TEXTURE_ROUGHNESS_IDENTICAL.asInstanceOf[js.Any], SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE = SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialSheenDefines]
  }
  
  @scala.inline
  implicit class IMaterialSheenDefinesOps[Self <: IMaterialSheenDefines] (val x: Self) extends AnyVal {
    
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
    def setSHEEN(value: Boolean): Self = this.set("SHEEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_ALBEDOSCALING(value: Boolean): Self = this.set("SHEEN_ALBEDOSCALING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_LINKWITHALBEDO(value: Boolean): Self = this.set("SHEEN_LINKWITHALBEDO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_ROUGHNESS(value: Boolean): Self = this.set("SHEEN_ROUGHNESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTURE(value: Boolean): Self = this.set("SHEEN_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTUREDIRECTUV(value: Double): Self = this.set("SHEEN_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTURE_ROUGHNESS(value: Boolean): Self = this.set("SHEEN_TEXTURE_ROUGHNESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTURE_ROUGHNESSDIRECTUV(value: Double): Self = this.set("SHEEN_TEXTURE_ROUGHNESSDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTURE_ROUGHNESS_IDENTICAL(value: Boolean): Self = this.set("SHEEN_TEXTURE_ROUGHNESS_IDENTICAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE(value: Boolean): Self = this.set("SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = this.set("_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
