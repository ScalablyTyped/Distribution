package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyFrames
  extends Node
     with AtRule {
  
  /** Array of nodes with the types keyframe and comment. */
  var keyframes: js.UndefOr[js.Array[KeyFrame | Comment]] = js.native
  
  /** The name of the keyframes rule. */
  var name: js.UndefOr[String] = js.native
  
  /** The vendor prefix in @keyframes, or undefined if there is none. */
  var vendor: js.UndefOr[String] = js.native
}
object KeyFrames {
  
  @scala.inline
  def apply(): KeyFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrames]
  }
  
  @scala.inline
  implicit class KeyFramesMutableBuilder[Self <: KeyFrames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyframes(value: js.Array[KeyFrame | Comment]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
    
    @scala.inline
    def setKeyframesVarargs(value: (KeyFrame | Comment)*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
