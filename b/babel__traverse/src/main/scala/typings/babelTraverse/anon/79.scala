package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeSpreadProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `79` extends js.Object {
  
  var `type`: ObjectTypeSpreadProperty = js.native
}
object `79` {
  
  @scala.inline
  def apply(`type`: ObjectTypeSpreadProperty): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit class `79Ops`[Self <: `79`] (val x: Self) extends AnyVal {
    
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
    def setType(value: ObjectTypeSpreadProperty): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
