package typings.awsSdkClientXrayNode.typesTraceUserMod

import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledTraceUser extends TraceUser {
  
  /**
    * <p>Services that the user's request hit.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceUser: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
}
object UnmarshalledTraceUser {
  
  @scala.inline
  def apply(): UnmarshalledTraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTraceUser]
  }
  
  @scala.inline
  implicit class UnmarshalledTraceUserOps[Self <: UnmarshalledTraceUser] (val x: Self) extends AnyVal {
    
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
    def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
  }
}
