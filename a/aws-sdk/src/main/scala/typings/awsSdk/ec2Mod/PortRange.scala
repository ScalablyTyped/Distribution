package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The first port in the range.
    */
  var From: js.UndefOr[Integer] = js.undefined
  
  /**
    * The last port in the range.
    */
  var To: js.UndefOr[Integer] = js.undefined
}
object PortRange {
  
  inline def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  
  extension [Self <: PortRange](x: Self) {
    
    inline def setFrom(value: Integer): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setTo(value: Integer): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
