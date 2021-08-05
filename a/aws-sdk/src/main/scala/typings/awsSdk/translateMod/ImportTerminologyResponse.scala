package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTerminologyResponse extends StObject {
  
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.undefined
}
object ImportTerminologyResponse {
  
  inline def apply(): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
  
  extension [Self <: ImportTerminologyResponse](x: Self) {
    
    inline def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    inline def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
