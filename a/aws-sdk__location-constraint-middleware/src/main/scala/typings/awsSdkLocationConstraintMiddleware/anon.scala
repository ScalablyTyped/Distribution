package typings.awsSdkLocationConstraintMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LocationConstraint extends StObject {
    
    var LocationConstraint: js.UndefOr[String] = js.undefined
  }
  object LocationConstraint {
    
    inline def apply(): LocationConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationConstraint]
    }
    
    extension [Self <: LocationConstraint](x: Self) {
      
      inline def setLocationConstraint(value: String): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
      
      inline def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
    }
  }
}
