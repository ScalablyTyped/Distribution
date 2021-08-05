package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemControl extends StObject {
  
  /**
    * The namespaced kernel parameter for which to set a value.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the namespaced kernel parameter specified in namespace.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SystemControl {
  
  inline def apply(): SystemControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemControl]
  }
  
  extension [Self <: SystemControl](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
