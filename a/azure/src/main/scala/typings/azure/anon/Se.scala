package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Se extends StObject {
  
  var se: String
  
  var sig: String
  
  var sp: String
  
  var sr: String
  
  var sv: String
}
object Se {
  
  inline def apply(se: String, sig: String, sp: String, sr: String, sv: String): Se = {
    val __obj = js.Dynamic.literal(se = se.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Se]
  }
  
  extension [Self <: Se](x: Self) {
    
    inline def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    inline def setSp(value: String): Self = StObject.set(x, "sp", value.asInstanceOf[js.Any])
    
    inline def setSr(value: String): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
    
    inline def setSv(value: String): Self = StObject.set(x, "sv", value.asInstanceOf[js.Any])
  }
}
