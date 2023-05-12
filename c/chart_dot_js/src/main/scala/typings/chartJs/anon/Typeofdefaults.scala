package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdefaults extends StObject {
  
  val algorithm: String
  
  val enabled: Boolean
}
object Typeofdefaults {
  
  inline def apply(algorithm: String, enabled: Boolean): Typeofdefaults = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofdefaults] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
