package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callsignature extends StObject {
  
  var `call-signature`: String
  
  var `index-signature`: String
  
  var parameter: String
  
  var `property-declaration`: String
  
  var `variable-declaration`: String
}
object Callsignature {
  
  inline def apply(
    `call-signature`: String,
    `index-signature`: String,
    parameter: String,
    `property-declaration`: String,
    `variable-declaration`: String
  ): Callsignature = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("call-signature")(`call-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("index-signature")(`index-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("property-declaration")(`property-declaration`.asInstanceOf[js.Any])
    __obj.updateDynamic("variable-declaration")(`variable-declaration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callsignature]
  }
  
  extension [Self <: Callsignature](x: Self) {
    
    inline def `setCall-signature`(value: String): Self = StObject.set(x, "call-signature", value.asInstanceOf[js.Any])
    
    inline def `setIndex-signature`(value: String): Self = StObject.set(x, "index-signature", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def `setProperty-declaration`(value: String): Self = StObject.set(x, "property-declaration", value.asInstanceOf[js.Any])
    
    inline def `setVariable-declaration`(value: String): Self = StObject.set(x, "variable-declaration", value.asInstanceOf[js.Any])
  }
}
