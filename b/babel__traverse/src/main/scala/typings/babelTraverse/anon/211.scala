package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSObjectKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `211` extends js.Object {
  
  var `type`: TSObjectKeyword = js.native
}
object `211` {
  
  @scala.inline
  def apply(`type`: TSObjectKeyword): `211` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`211`]
  }
  
  @scala.inline
  implicit class `211Ops`[Self <: `211`] (val x: Self) extends AnyVal {
    
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
    def setType(value: TSObjectKeyword): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
