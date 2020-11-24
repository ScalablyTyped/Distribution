package typings.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSequenceOptions extends js.Object {
  
  var temp: js.UndefOr[Boolean] = js.native
}
object CreateSequenceOptions {
  
  @scala.inline
  def apply(): CreateSequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSequenceOptions]
  }
  
  @scala.inline
  implicit class CreateSequenceOptionsOps[Self <: CreateSequenceOptions] (val x: Self) extends AnyVal {
    
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
    def setTemp(value: Boolean): Self = this.set("temp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemp: Self = this.set("temp", js.undefined)
  }
}
