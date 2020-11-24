package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyGroupRequest extends js.Object {
  
  /**
    * A key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.cloudfrontMod.KeyGroupConfig = js.native
}
object CreateKeyGroupRequest {
  
  @scala.inline
  def apply(KeyGroupConfig: KeyGroupConfig): CreateKeyGroupRequest = {
    val __obj = js.Dynamic.literal(KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyGroupRequest]
  }
  
  @scala.inline
  implicit class CreateKeyGroupRequestOps[Self <: CreateKeyGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setKeyGroupConfig(value: KeyGroupConfig): Self = this.set("KeyGroupConfig", value.asInstanceOf[js.Any])
  }
}
