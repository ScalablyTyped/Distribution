package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlReference extends StObject {
  
  /**
    * Identifier of the URL reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * A valid URL.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object UrlReference {
  
  inline def apply(): UrlReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlReference]
  }
  
  extension [Self <: UrlReference](x: Self) {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
