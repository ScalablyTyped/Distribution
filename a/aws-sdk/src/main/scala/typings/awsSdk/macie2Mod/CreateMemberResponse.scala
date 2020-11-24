package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMemberResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the account that was associated with the master account.
    */
  var arn: js.UndefOr[string] = js.native
}
object CreateMemberResponse {
  
  @scala.inline
  def apply(): CreateMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberResponse]
  }
  
  @scala.inline
  implicit class CreateMemberResponseOps[Self <: CreateMemberResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
  }
}
