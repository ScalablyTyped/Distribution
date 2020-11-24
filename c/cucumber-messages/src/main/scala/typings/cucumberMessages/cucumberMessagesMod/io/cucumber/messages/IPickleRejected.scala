package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleRejected. */
@js.native
trait IPickleRejected extends js.Object {
  
  /** PickleRejected pickleId */
  var pickleId: js.UndefOr[String | Null] = js.native
}
object IPickleRejected {
  
  @scala.inline
  def apply(): IPickleRejected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleRejected]
  }
  
  @scala.inline
  implicit class IPickleRejectedOps[Self <: IPickleRejected] (val x: Self) extends AnyVal {
    
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
    def setPickleId(value: String): Self = this.set("pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleId: Self = this.set("pickleId", js.undefined)
    
    @scala.inline
    def setPickleIdNull: Self = this.set("pickleId", null)
  }
}
