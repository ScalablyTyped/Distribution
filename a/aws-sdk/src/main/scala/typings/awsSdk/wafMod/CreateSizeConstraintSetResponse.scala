package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSizeConstraintSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
  
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[typings.awsSdk.wafMod.SizeConstraintSet] = js.undefined
}
object CreateSizeConstraintSetResponse {
  
  @scala.inline
  def apply(): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
  
  @scala.inline
  implicit class CreateSizeConstraintSetResponseMutableBuilder[Self <: CreateSizeConstraintSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setSizeConstraintSet(value: SizeConstraintSet): Self = StObject.set(x, "SizeConstraintSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintSetUndefined: Self = StObject.set(x, "SizeConstraintSet", js.undefined)
  }
}
