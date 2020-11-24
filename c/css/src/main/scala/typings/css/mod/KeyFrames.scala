package typings.css.mod

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
  implicit class KeyFramesOps[Self <: KeyFrames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyframesVarargs(value: (KeyFrame | Comment)*): Self = this.set("keyframes", js.Array(value :_*))
    
    @scala.inline
    def setKeyframes(value: js.Array[KeyFrame | Comment]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
}
