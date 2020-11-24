package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSizeConstraintSetResponse extends js.Object {
  
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.native
  
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[typings.awsSdk.wafregionalMod.SizeConstraintSet] = js.native
}
object CreateSizeConstraintSetResponse {
  
  @scala.inline
  def apply(): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
  
  @scala.inline
  implicit class CreateSizeConstraintSetResponseOps[Self <: CreateSizeConstraintSetResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    
    @scala.inline
    def setSizeConstraintSet(value: SizeConstraintSet): Self = this.set("SizeConstraintSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeConstraintSet: Self = this.set("SizeConstraintSet", js.undefined)
  }
}
