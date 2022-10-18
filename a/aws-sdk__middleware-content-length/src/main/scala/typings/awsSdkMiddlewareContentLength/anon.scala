package typings.awsSdkMiddlewareContentLength

import typings.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BodyLengthChecker extends StObject {
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator
  }
  object BodyLengthChecker {
    
    inline def apply(bodyLengthChecker: /* body */ Any => js.UndefOr[Double]): BodyLengthChecker = {
      val __obj = js.Dynamic.literal(bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker))
      __obj.asInstanceOf[BodyLengthChecker]
    }
    
    extension [Self <: BodyLengthChecker](x: Self) {
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
    }
  }
}
