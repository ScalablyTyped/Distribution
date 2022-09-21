package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var common: String
  
  var scientific: String
  
  var taxid: String
}
object Host {
  
  inline def apply(common: String, scientific: String, taxid: String): Host = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], scientific = scientific.asInstanceOf[js.Any], taxid = taxid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  extension [Self <: Host](x: Self) {
    
    inline def setCommon(value: String): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setScientific(value: String): Self = StObject.set(x, "scientific", value.asInstanceOf[js.Any])
    
    inline def setTaxid(value: String): Self = StObject.set(x, "taxid", value.asInstanceOf[js.Any])
  }
}
