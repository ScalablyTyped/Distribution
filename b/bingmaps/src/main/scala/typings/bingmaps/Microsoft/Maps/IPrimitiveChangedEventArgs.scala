package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrimitiveChangedEventArgs extends js.Object {
  
  /** The name of the change that occured; 'locations' or 'options'. */
  var name: String = js.native
  
  /** The IPrimitive shape the event occured on. */
  var sender: IPrimitive = js.native
}
object IPrimitiveChangedEventArgs {
  
  @scala.inline
  def apply(name: String, sender: IPrimitive): IPrimitiveChangedEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrimitiveChangedEventArgs]
  }
  
  @scala.inline
  implicit class IPrimitiveChangedEventArgsOps[Self <: IPrimitiveChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: IPrimitive): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
}
