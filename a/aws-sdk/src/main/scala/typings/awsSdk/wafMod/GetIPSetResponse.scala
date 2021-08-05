package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIPSetResponse extends StObject {
  
  /**
    * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
    */
  var IPSet: js.UndefOr[typings.awsSdk.wafMod.IPSet] = js.undefined
}
object GetIPSetResponse {
  
  inline def apply(): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIPSetResponse]
  }
  
  extension [Self <: GetIPSetResponse](x: Self) {
    
    inline def setIPSet(value: IPSet): Self = StObject.set(x, "IPSet", value.asInstanceOf[js.Any])
    
    inline def setIPSetUndefined: Self = StObject.set(x, "IPSet", js.undefined)
  }
}
