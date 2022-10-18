package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetByteMatchSetRequest extends StObject {
  
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to get. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
}
object GetByteMatchSetRequest {
  
  inline def apply(ByteMatchSetId: ResourceId): GetByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetByteMatchSetRequest]
  }
  
  extension [Self <: GetByteMatchSetRequest](x: Self) {
    
    inline def setByteMatchSetId(value: ResourceId): Self = StObject.set(x, "ByteMatchSetId", value.asInstanceOf[js.Any])
  }
}
