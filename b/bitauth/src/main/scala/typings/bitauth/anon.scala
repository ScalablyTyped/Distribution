package typings.bitauth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Created extends StObject {
    
    var created: Double
    
    var priv: String
    
    var pub: String
    
    var sin: String
  }
  object Created {
    
    inline def apply(created: Double, priv: String, pub: String, sin: String): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], priv = priv.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setPriv(value: String): Self = StObject.set(x, "priv", value.asInstanceOf[js.Any])
      
      inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      inline def setSin(value: String): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    }
  }
}
