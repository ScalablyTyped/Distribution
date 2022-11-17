package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tick extends StObject {
  
  @JSName("$context")
  var $context: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var major: js.UndefOr[Boolean] = js.undefined
  
  var value: Double | String
}
object Tick {
  
  inline def apply(value: Double | String): Tick = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tick]
  }
  
  extension [Self <: Tick](x: Self) {
    
    inline def set$context(value: Any): Self = StObject.set(x, "$context", value.asInstanceOf[js.Any])
    
    inline def set$contextUndefined: Self = StObject.set(x, "$context", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMajor(value: Boolean): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
