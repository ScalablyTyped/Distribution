package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateByteMatchSetRequest extends StObject {
  
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to update. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  
  /**
    * An array of ByteMatchSetUpdate objects that you want to insert into or delete from a ByteMatchSet. For more information, see the applicable data types:    ByteMatchSetUpdate: Contains Action and ByteMatchTuple     ByteMatchTuple: Contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var Updates: ByteMatchSetUpdates = js.native
}
object UpdateByteMatchSetRequest {
  
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ChangeToken: ChangeToken, Updates: ByteMatchSetUpdates): UpdateByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], ChangeToken = ChangeToken.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByteMatchSetRequest]
  }
  
  @scala.inline
  implicit class UpdateByteMatchSetRequestMutableBuilder[Self <: UpdateByteMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: ByteMatchSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: ByteMatchSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
