package typings.bootstrap.scrollspyMod.ScrollSpy

import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.offset
import typings.bootstrap.bootstrapStrings.position
import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Finds which section the spied element is in. auto will choose the
    * best method to get scroll coordinates. offset will use the
    * Element.getBoundingClientRect() method to get scroll coordinates.
    * position will use the HTMLElement.offsetTop and
    * HTMLElement.offsetLeft properties to get scroll coordinates.
    *
    * @default 'auto'
    */
  var method: auto | offset | position = js.native
  
  /**
    * Pixels to offset from top when calculating position of scroll.
    *
    * @default 10
    */
  var offset: Double = js.native
  
  /**
    * Specifies element to apply Scrollspy plugin.
    */
  var target: String | Element | JQuery[HTMLElement] = js.native
}
object Options {
  
  @scala.inline
  def apply(method: auto | offset | position, offset: Double, target: String | Element | JQuery[HTMLElement]): Options = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | Element | JQuery[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
