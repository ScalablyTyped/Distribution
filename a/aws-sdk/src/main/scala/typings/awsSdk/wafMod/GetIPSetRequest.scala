package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIPSetRequest extends StObject {
  
  /**
    * The IPSetId of the IPSet that you want to get. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
}
object GetIPSetRequest {
  
  inline def apply(IPSetId: ResourceId): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetRequest]
  }
  
  extension [Self <: GetIPSetRequest](x: Self) {
    
    inline def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
  }
}
