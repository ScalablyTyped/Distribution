package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformTranslate extends StObject {
  
  @JSName("$performTranslate")
  var $performTranslate: Boolean
  
  @JSName("$translateAmount")
  var $translateAmount: Double
}
object PerformTranslate {
  
  inline def apply($performTranslate: Boolean, $translateAmount: Double): PerformTranslate = {
    val __obj = js.Dynamic.literal($performTranslate = $performTranslate.asInstanceOf[js.Any], $translateAmount = $translateAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformTranslate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformTranslate] (val x: Self) extends AnyVal {
    
    inline def set$performTranslate(value: Boolean): Self = StObject.set(x, "$performTranslate", value.asInstanceOf[js.Any])
    
    inline def set$translateAmount(value: Double): Self = StObject.set(x, "$translateAmount", value.asInstanceOf[js.Any])
  }
}
