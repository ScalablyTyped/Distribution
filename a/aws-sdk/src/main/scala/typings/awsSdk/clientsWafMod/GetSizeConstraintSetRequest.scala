package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSizeConstraintSetRequest extends StObject {
  
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to get. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
}
object GetSizeConstraintSetRequest {
  
  inline def apply(SizeConstraintSetId: ResourceId): GetSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSizeConstraintSetRequest]
  }
  
  extension [Self <: GetSizeConstraintSetRequest](x: Self) {
    
    inline def setSizeConstraintSetId(value: ResourceId): Self = StObject.set(x, "SizeConstraintSetId", value.asInstanceOf[js.Any])
  }
}
