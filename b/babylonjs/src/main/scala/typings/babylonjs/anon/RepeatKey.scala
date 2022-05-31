package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatKey extends StObject {
  
  var repeatKey: js.UndefOr[String] = js.undefined
  
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.undefined
}
object RepeatKey {
  
  inline def apply(): RepeatKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatKey]
  }
  
  extension [Self <: RepeatKey](x: Self) {
    
    inline def setRepeatKey(value: String): Self = StObject.set(x, "repeatKey", value.asInstanceOf[js.Any])
    
    inline def setRepeatKeyUndefined: Self = StObject.set(x, "repeatKey", js.undefined)
    
    inline def setReplaceStrings(value: js.Array[Replace]): Self = StObject.set(x, "replaceStrings", value.asInstanceOf[js.Any])
    
    inline def setReplaceStringsUndefined: Self = StObject.set(x, "replaceStrings", js.undefined)
    
    inline def setReplaceStringsVarargs(value: Replace*): Self = StObject.set(x, "replaceStrings", js.Array(value :_*))
  }
}
