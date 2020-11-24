package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleActiveLine extends js.Object {
  
  /**
    * Controls whether single-line selections, or just cursor selections, are styled. Defaults to false (only cursor selections).
    */
  var nonEmpty: Boolean = js.native
}
object StyleActiveLine {
  
  @scala.inline
  def apply(nonEmpty: Boolean): StyleActiveLine = {
    val __obj = js.Dynamic.literal(nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleActiveLine]
  }
  
  @scala.inline
  implicit class StyleActiveLineOps[Self <: StyleActiveLine] (val x: Self) extends AnyVal {
    
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
    def setNonEmpty(value: Boolean): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
}
