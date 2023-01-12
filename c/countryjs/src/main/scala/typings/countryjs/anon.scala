package typings.countryjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha2 extends StObject {
    
    var alpha2: String
    
    var alpha3: String
  }
  object Alpha2 {
    
    inline def apply(alpha2: String, alpha3: String): Alpha2 = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alpha2] (val x: Self) extends AnyVal {
      
      inline def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
    }
  }
  
  trait De extends StObject {
    
    var de: String
    
    var es: String
    
    var fr: String
    
    var it: String
    
    var ja: String
  }
  object De {
    
    inline def apply(de: String, es: String, fr: String, it: String, ja: String): De = {
      val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], fr = fr.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], ja = ja.asInstanceOf[js.Any])
      __obj.asInstanceOf[De]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: De] (val x: Self) extends AnyVal {
      
      inline def setDe(value: String): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
      
      inline def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      inline def setIt(value: String): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setJa(value: String): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
    }
  }
}
