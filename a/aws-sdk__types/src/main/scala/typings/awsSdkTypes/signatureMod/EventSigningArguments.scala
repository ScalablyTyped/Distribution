package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSigningArguments extends SigningArguments {
  
  var priorSignature: String = js.native
}
object EventSigningArguments {
  
  @scala.inline
  def apply(priorSignature: String): EventSigningArguments = {
    val __obj = js.Dynamic.literal(priorSignature = priorSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSigningArguments]
  }
  
  @scala.inline
  implicit class EventSigningArgumentsOps[Self <: EventSigningArguments] (val x: Self) extends AnyVal {
    
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
    def setPriorSignature(value: String): Self = this.set("priorSignature", value.asInstanceOf[js.Any])
  }
}
