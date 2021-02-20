package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetByteMatchSetRequest extends StObject {
  
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to get. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
}
object GetByteMatchSetRequest {
  
  @scala.inline
  def apply(ByteMatchSetId: ResourceId): GetByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetByteMatchSetRequest]
  }
  
  @scala.inline
  implicit class GetByteMatchSetRequestMutableBuilder[Self <: GetByteMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
  }
}
