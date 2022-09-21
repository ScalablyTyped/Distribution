package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyFrames
  extends StObject
     with Node
     with AtRule {
  
  /** Array of nodes with the types keyframe and comment. */
  var keyframes: js.UndefOr[js.Array[KeyFrame | Comment]] = js.undefined
  
  /** The name of the keyframes rule. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The vendor prefix in @keyframes, or undefined if there is none. */
  var vendor: js.UndefOr[String] = js.undefined
}
object KeyFrames {
  
  inline def apply(): KeyFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrames]
  }
  
  extension [Self <: KeyFrames](x: Self) {
    
    inline def setKeyframes(value: js.Array[KeyFrame | Comment]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
    
    inline def setKeyframesVarargs(value: (KeyFrame | Comment)*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
