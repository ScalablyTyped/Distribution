package typings.chromecastCafSender

import typings.chromecastCafSender.anon.Typeofcast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Global object
////////////////////
@js.native
trait Window extends js.Object {
  
  def __onGCastApiAvailable(available: Boolean): Unit = js.native
  
  var cast: Typeofcast = js.native
}
object Window {
  
  @scala.inline
  def apply(__onGCastApiAvailable: Boolean => Unit, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(__onGCastApiAvailable = js.Any.fromFunction1(__onGCastApiAvailable), cast = cast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def set__onGCastApiAvailable(value: Boolean => Unit): Self = this.set("__onGCastApiAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCast(value: Typeofcast): Self = this.set("cast", value.asInstanceOf[js.Any])
  }
}
