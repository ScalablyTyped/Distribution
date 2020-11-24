package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomDataIdentifierResponse extends js.Object {
  
  /**
    * The unique identifier for the custom data identifier that was created.
    */
  var customDataIdentifierId: js.UndefOr[string] = js.native
}
object CreateCustomDataIdentifierResponse {
  
  @scala.inline
  def apply(): CreateCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomDataIdentifierResponse]
  }
  
  @scala.inline
  implicit class CreateCustomDataIdentifierResponseOps[Self <: CreateCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomDataIdentifierId(value: string): Self = this.set("customDataIdentifierId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDataIdentifierId: Self = this.set("customDataIdentifierId", js.undefined)
  }
}
