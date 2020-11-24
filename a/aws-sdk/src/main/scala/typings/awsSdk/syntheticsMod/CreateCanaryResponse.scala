package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCanaryResponse extends js.Object {
  
  /**
    * The full details about the canary you have created.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.native
}
object CreateCanaryResponse {
  
  @scala.inline
  def apply(): CreateCanaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCanaryResponse]
  }
  
  @scala.inline
  implicit class CreateCanaryResponseOps[Self <: CreateCanaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanary(value: Canary): Self = this.set("Canary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanary: Self = this.set("Canary", js.undefined)
  }
}
