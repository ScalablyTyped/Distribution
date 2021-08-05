package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scram extends StObject {
  
  /**
    * 
    SASL/SCRAM authentication is enabled or not.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object Scram {
  
  inline def apply(): Scram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scram]
  }
  
  extension [Self <: Scram](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
