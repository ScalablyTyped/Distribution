package typings.cradle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesOptions extends js.Object {
  
  var since: Double = js.native
}
object ChangesOptions {
  
  @scala.inline
  def apply(since: Double): ChangesOptions = {
    val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesOptions]
  }
  
  @scala.inline
  implicit class ChangesOptionsOps[Self <: ChangesOptions] (val x: Self) extends AnyVal {
    
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
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
  }
}
