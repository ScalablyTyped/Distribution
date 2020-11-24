package typings.bootstrap.anon

import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bootstrap.bootstrap/js/dist/scrollspy.ScrollSpy.Options> */
@js.native
trait PartialOptionsMethod extends js.Object {
  
  var method: js.UndefOr[auto | offset | position] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.native
}
object PartialOptionsMethod {
  
  @scala.inline
  def apply(): PartialOptionsMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsMethod]
  }
  
  @scala.inline
  implicit class PartialOptionsMethodOps[Self <: PartialOptionsMethod] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: auto | offset | position): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setTarget(value: String | Element | JQuery[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
