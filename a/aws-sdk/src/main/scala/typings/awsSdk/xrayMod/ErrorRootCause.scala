package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorRootCause extends js.Object {
  
  /**
    * A flag that denotes that the root cause impacts the trace client.
    */
  var ClientImpacting: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID, type, and inferred flag.
    */
  var Services: js.UndefOr[ErrorRootCauseServices] = js.native
}
object ErrorRootCause {
  
  @scala.inline
  def apply(): ErrorRootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorRootCause]
  }
  
  @scala.inline
  implicit class ErrorRootCauseOps[Self <: ErrorRootCause] (val x: Self) extends AnyVal {
    
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
    def setClientImpacting(value: NullableBoolean): Self = this.set("ClientImpacting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientImpacting: Self = this.set("ClientImpacting", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: ErrorRootCauseService*): Self = this.set("Services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: ErrorRootCauseServices): Self = this.set("Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
  }
}
