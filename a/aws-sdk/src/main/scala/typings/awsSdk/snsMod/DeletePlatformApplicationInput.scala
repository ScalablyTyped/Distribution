package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlatformApplicationInput extends js.Object {
  
  /**
    * PlatformApplicationArn of platform application object to delete.
    */
  var PlatformApplicationArn: String = js.native
}
object DeletePlatformApplicationInput {
  
  @scala.inline
  def apply(PlatformApplicationArn: String): DeletePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlatformApplicationInput]
  }
  
  @scala.inline
  implicit class DeletePlatformApplicationInputOps[Self <: DeletePlatformApplicationInput] (val x: Self) extends AnyVal {
    
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
    def setPlatformApplicationArn(value: String): Self = this.set("PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
