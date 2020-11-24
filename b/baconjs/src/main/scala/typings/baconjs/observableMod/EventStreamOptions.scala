package typings.baconjs.observableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamOptions extends js.Object {
  
  var forceAsync: Boolean = js.native
}
object EventStreamOptions {
  
  @scala.inline
  def apply(forceAsync: Boolean): EventStreamOptions = {
    val __obj = js.Dynamic.literal(forceAsync = forceAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamOptions]
  }
  
  @scala.inline
  implicit class EventStreamOptionsOps[Self <: EventStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setForceAsync(value: Boolean): Self = this.set("forceAsync", value.asInstanceOf[js.Any])
  }
}
