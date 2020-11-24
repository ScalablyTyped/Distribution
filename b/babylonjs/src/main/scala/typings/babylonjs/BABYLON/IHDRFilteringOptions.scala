package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for texture filtering
  */
@js.native
trait IHDRFilteringOptions extends js.Object {
  
  /**
    * Scales pixel intensity for the input HDR map.
    */
  var hdrScale: js.UndefOr[Double] = js.native
  
  /**
    * Quality of the filter. Should be `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` for prefiltering
    */
  var quality: js.UndefOr[Double] = js.native
}
object IHDRFilteringOptions {
  
  @scala.inline
  def apply(): IHDRFilteringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHDRFilteringOptions]
  }
  
  @scala.inline
  implicit class IHDRFilteringOptionsOps[Self <: IHDRFilteringOptions] (val x: Self) extends AnyVal {
    
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
    def setHdrScale(value: Double): Self = this.set("hdrScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHdrScale: Self = this.set("hdrScale", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
}
