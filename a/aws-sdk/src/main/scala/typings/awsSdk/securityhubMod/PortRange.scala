package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The first port in the port range.
    */
  var Begin: js.UndefOr[Integer] = js.undefined
  
  /**
    * The last port in the port range.
    */
  var End: js.UndefOr[Integer] = js.undefined
}
object PortRange {
  
  inline def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  
  extension [Self <: PortRange](x: Self) {
    
    inline def setBegin(value: Integer): Self = StObject.set(x, "Begin", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "Begin", js.undefined)
    
    inline def setEnd(value: Integer): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
  }
}
