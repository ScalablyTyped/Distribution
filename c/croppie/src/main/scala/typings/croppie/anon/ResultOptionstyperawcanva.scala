package typings.croppie.anon

import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.rawcanvas
import typings.croppie.croppieStrings.viewport
import typings.croppie.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined croppie.croppie.ResultOptions & {  type :'rawcanvas'} */
@js.native
trait ResultOptionstyperawcanva extends js.Object {
  
  var circle: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[Format] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[viewport | original | Height] = js.native
  
  var `type`: js.UndefOr[typings.croppie.mod.Type] with rawcanvas = js.native
}
object ResultOptionstyperawcanva {
  
  @scala.inline
  def apply(`type`: js.UndefOr[typings.croppie.mod.Type] with rawcanvas): ResultOptionstyperawcanva = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOptionstyperawcanva]
  }
  
  @scala.inline
  implicit class ResultOptionstyperawcanvaOps[Self <: ResultOptionstyperawcanva] (val x: Self) extends AnyVal {
    
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
    def setType(value: js.UndefOr[typings.croppie.mod.Type] with rawcanvas): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircle(value: Boolean): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setFormat(value: Format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSize(value: viewport | original | Height): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
