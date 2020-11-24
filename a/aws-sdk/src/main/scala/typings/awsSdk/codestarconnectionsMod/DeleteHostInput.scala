package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHostInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be deleted.
    */
  var HostArn: typings.awsSdk.codestarconnectionsMod.HostArn = js.native
}
object DeleteHostInput {
  
  @scala.inline
  def apply(HostArn: HostArn): DeleteHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostInput]
  }
  
  @scala.inline
  implicit class DeleteHostInputOps[Self <: DeleteHostInput] (val x: Self) extends AnyVal {
    
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
    def setHostArn(value: HostArn): Self = this.set("HostArn", value.asInstanceOf[js.Any])
  }
}
