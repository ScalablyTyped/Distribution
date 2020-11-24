package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialClearCoatDefines extends js.Object {
  
  var CLEARCOAT: Boolean = js.native
  
  var CLEARCOAT_BUMP: Boolean = js.native
  
  var CLEARCOAT_BUMPDIRECTUV: Double = js.native
  
  var CLEARCOAT_DEFAULTIOR: Boolean = js.native
  
  var CLEARCOAT_REMAP_F0: Boolean = js.native
  
  var CLEARCOAT_TEXTURE: Boolean = js.native
  
  var CLEARCOAT_TEXTUREDIRECTUV: Double = js.native
  
  var CLEARCOAT_TEXTURE_ROUGHNESS: Boolean = js.native
  
  var CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double = js.native
  
  var CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean = js.native
  
  var CLEARCOAT_TINT: Boolean = js.native
  
  var CLEARCOAT_TINT_TEXTURE: Boolean = js.native
  
  var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double = js.native
  
  var CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean = js.native
  
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}
object IMaterialClearCoatDefines {
  
  @scala.inline
  def apply(
    CLEARCOAT: Boolean,
    CLEARCOAT_BUMP: Boolean,
    CLEARCOAT_BUMPDIRECTUV: Double,
    CLEARCOAT_DEFAULTIOR: Boolean,
    CLEARCOAT_REMAP_F0: Boolean,
    CLEARCOAT_TEXTURE: Boolean,
    CLEARCOAT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_TEXTURE_ROUGHNESS: Boolean,
    CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double,
    CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean,
    CLEARCOAT_TINT: Boolean,
    CLEARCOAT_TINT_TEXTURE: Boolean,
    CLEARCOAT_TINT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialClearCoatDefines = {
    val __obj = js.Dynamic.literal(CLEARCOAT = CLEARCOAT.asInstanceOf[js.Any], CLEARCOAT_BUMP = CLEARCOAT_BUMP.asInstanceOf[js.Any], CLEARCOAT_BUMPDIRECTUV = CLEARCOAT_BUMPDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_DEFAULTIOR = CLEARCOAT_DEFAULTIOR.asInstanceOf[js.Any], CLEARCOAT_REMAP_F0 = CLEARCOAT_REMAP_F0.asInstanceOf[js.Any], CLEARCOAT_TEXTURE = CLEARCOAT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TEXTUREDIRECTUV = CLEARCOAT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS = CLEARCOAT_TEXTURE_ROUGHNESS.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV = CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL = CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL.asInstanceOf[js.Any], CLEARCOAT_TINT = CLEARCOAT_TINT.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTURE = CLEARCOAT_TINT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTUREDIRECTUV = CLEARCOAT_TINT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE = CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialClearCoatDefines]
  }
  
  @scala.inline
  implicit class IMaterialClearCoatDefinesOps[Self <: IMaterialClearCoatDefines] (val x: Self) extends AnyVal {
    
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
    def setCLEARCOAT(value: Boolean): Self = this.set("CLEARCOAT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_BUMP(value: Boolean): Self = this.set("CLEARCOAT_BUMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_BUMPDIRECTUV(value: Double): Self = this.set("CLEARCOAT_BUMPDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_DEFAULTIOR(value: Boolean): Self = this.set("CLEARCOAT_DEFAULTIOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_REMAP_F0(value: Boolean): Self = this.set("CLEARCOAT_REMAP_F0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTURE(value: Boolean): Self = this.set("CLEARCOAT_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTUREDIRECTUV(value: Double): Self = this.set("CLEARCOAT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTURE_ROUGHNESS(value: Boolean): Self = this.set("CLEARCOAT_TEXTURE_ROUGHNESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV(value: Double): Self = this.set("CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL(value: Boolean): Self = this.set("CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT(value: Boolean): Self = this.set("CLEARCOAT_TINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT_TEXTURE(value: Boolean): Self = this.set("CLEARCOAT_TINT_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT_TEXTUREDIRECTUV(value: Double): Self = this.set("CLEARCOAT_TINT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE(value: Boolean): Self = this.set("CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = this.set("_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
