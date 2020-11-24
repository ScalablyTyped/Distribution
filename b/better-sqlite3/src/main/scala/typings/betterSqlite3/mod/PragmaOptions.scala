package typings.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PragmaOptions extends js.Object {
  
  var simple: js.UndefOr[Boolean] = js.native
}
object PragmaOptions {
  
  @scala.inline
  def apply(): PragmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PragmaOptions]
  }
  
  @scala.inline
  implicit class PragmaOptionsOps[Self <: PragmaOptions] (val x: Self) extends AnyVal {
    
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
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
  }
}
