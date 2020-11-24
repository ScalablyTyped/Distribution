package typings.babylonjs.materialDetailMapConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialDetailMapDefines extends js.Object {
  
  var DETAIL: Boolean = js.native
  
  var DETAILDIRECTUV: Double = js.native
  
  var DETAIL_NORMALBLENDMETHOD: Double = js.native
  
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}
object IMaterialDetailMapDefines {
  
  @scala.inline
  def apply(
    DETAIL: Boolean,
    DETAILDIRECTUV: Double,
    DETAIL_NORMALBLENDMETHOD: Double,
    _areTexturesDirty: Boolean
  ): IMaterialDetailMapDefines = {
    val __obj = js.Dynamic.literal(DETAIL = DETAIL.asInstanceOf[js.Any], DETAILDIRECTUV = DETAILDIRECTUV.asInstanceOf[js.Any], DETAIL_NORMALBLENDMETHOD = DETAIL_NORMALBLENDMETHOD.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialDetailMapDefines]
  }
  
  @scala.inline
  implicit class IMaterialDetailMapDefinesOps[Self <: IMaterialDetailMapDefines] (val x: Self) extends AnyVal {
    
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
    def setDETAIL(value: Boolean): Self = this.set("DETAIL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDETAILDIRECTUV(value: Double): Self = this.set("DETAILDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDETAIL_NORMALBLENDMETHOD(value: Double): Self = this.set("DETAIL_NORMALBLENDMETHOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = this.set("_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
