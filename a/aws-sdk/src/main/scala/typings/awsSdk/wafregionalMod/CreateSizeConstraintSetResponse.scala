package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSizeConstraintSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.undefined
  
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[typings.awsSdk.wafregionalMod.SizeConstraintSet] = js.undefined
}
object CreateSizeConstraintSetResponse {
  
  inline def apply(): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
  
  extension [Self <: CreateSizeConstraintSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setSizeConstraintSet(value: SizeConstraintSet): Self = StObject.set(x, "SizeConstraintSet", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintSetUndefined: Self = StObject.set(x, "SizeConstraintSet", js.undefined)
  }
}
