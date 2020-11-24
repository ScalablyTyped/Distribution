package typings.debounceFn.mod

import typings.debounceFn.debounceFnBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeOptions extends Options {
  
  @JSName("before")
  val before_BeforeOptions: `true` = js.native
}
object BeforeOptions {
  
  @scala.inline
  def apply(before: `true`): BeforeOptions = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeOptions]
  }
  
  @scala.inline
  implicit class BeforeOptionsOps[Self <: BeforeOptions] (val x: Self) extends AnyVal {
    
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
    def setBefore(value: `true`): Self = this.set("before", value.asInstanceOf[js.Any])
  }
}
