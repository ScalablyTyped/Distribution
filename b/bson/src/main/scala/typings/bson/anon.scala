package typings.bson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Relaxed extends StObject {
    
    var relaxed: js.UndefOr[Boolean] = js.undefined
  }
  object Relaxed {
    
    inline def apply(): Relaxed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relaxed]
    }
    
    extension [Self <: Relaxed](x: Self) {
      
      inline def setRelaxed(value: Boolean): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
    }
  }
}
