package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFace
  extends Node
     with AtRule {
  
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.native
}
object FontFace {
  
  @scala.inline
  def apply(): FontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit class FontFaceOps[Self <: FontFace] (val x: Self) extends AnyVal {
    
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
    def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[Declaration | Comment]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
  }
}
