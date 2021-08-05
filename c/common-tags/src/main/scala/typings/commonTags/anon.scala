package typings.commonTags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Conjunction extends StObject {
    
    var conjunction: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var serial: js.UndefOr[Boolean] = js.undefined
  }
  object Conjunction {
    
    inline def apply(): Conjunction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Conjunction]
    }
    
    extension [Self <: Conjunction](x: Self) {
      
      inline def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSerial(value: Boolean): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    }
  }
}
