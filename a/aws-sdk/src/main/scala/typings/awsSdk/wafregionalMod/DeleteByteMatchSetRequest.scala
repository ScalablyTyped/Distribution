package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteByteMatchSetRequest extends StObject {
  
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to delete. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
}
object DeleteByteMatchSetRequest {
  
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ChangeToken: ChangeToken): DeleteByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], ChangeToken = ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteByteMatchSetRequest]
  }
  
  @scala.inline
  implicit class DeleteByteMatchSetRequestMutableBuilder[Self <: DeleteByteMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
  }
}
