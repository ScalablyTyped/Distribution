package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSizeConstraintSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to delete. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
}
object DeleteSizeConstraintSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId): DeleteSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSizeConstraintSetRequest]
  }
  
  extension [Self <: DeleteSizeConstraintSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintSetId(value: ResourceId): Self = StObject.set(x, "SizeConstraintSetId", value.asInstanceOf[js.Any])
  }
}
