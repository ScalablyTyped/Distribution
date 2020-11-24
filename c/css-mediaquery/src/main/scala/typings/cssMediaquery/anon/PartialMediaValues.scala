package typings.cssMediaquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<css-mediaquery.css-mediaquery.MediaValues> */
@js.native
trait PartialMediaValues extends js.Object {
  
  var `aspect-ratio`: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[js.Any] = js.native
  
  var `color-index`: js.UndefOr[js.Any] = js.native
  
  var `device-aspect-ratio`: js.UndefOr[js.Any] = js.native
  
  var `device-height`: js.UndefOr[js.Any] = js.native
  
  var `device-width`: js.UndefOr[js.Any] = js.native
  
  var grid: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[js.Any] = js.native
  
  var monochrome: js.UndefOr[js.Any] = js.native
  
  var orientation: js.UndefOr[js.Any] = js.native
  
  var resolution: js.UndefOr[js.Any] = js.native
  
  var scan: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[js.Any] = js.native
}
object PartialMediaValues {
  
  @scala.inline
  def apply(): PartialMediaValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaValues]
  }
  
  @scala.inline
  implicit class PartialMediaValuesOps[Self <: PartialMediaValues] (val x: Self) extends AnyVal {
    
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
    def `setAspect-ratio`(value: js.Any): Self = this.set("aspect-ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAspect-ratio`: Self = this.set("aspect-ratio", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def `setColor-index`(value: js.Any): Self = this.set("color-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-index`: Self = this.set("color-index", js.undefined)
    
    @scala.inline
    def `setDevice-aspect-ratio`(value: js.Any): Self = this.set("device-aspect-ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDevice-aspect-ratio`: Self = this.set("device-aspect-ratio", js.undefined)
    
    @scala.inline
    def `setDevice-height`(value: js.Any): Self = this.set("device-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDevice-height`: Self = this.set("device-height", js.undefined)
    
    @scala.inline
    def `setDevice-width`(value: js.Any): Self = this.set("device-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDevice-width`: Self = this.set("device-width", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMonochrome(value: js.Any): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    
    @scala.inline
    def setOrientation(value: js.Any): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setResolution(value: js.Any): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setScan(value: js.Any): Self = this.set("scan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScan: Self = this.set("scan", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
