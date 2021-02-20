package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSizeConstraintSetRequest extends StObject {
  
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to get. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
}
object GetSizeConstraintSetRequest {
  
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId): GetSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSizeConstraintSetRequest]
  }
  
  @scala.inline
  implicit class GetSizeConstraintSetRequestMutableBuilder[Self <: GetSizeConstraintSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeConstraintSetId(value: ResourceId): Self = StObject.set(x, "SizeConstraintSetId", value.asInstanceOf[js.Any])
  }
}
