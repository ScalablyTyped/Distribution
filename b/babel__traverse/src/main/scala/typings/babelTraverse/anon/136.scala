package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceExtends
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `136` extends js.Object {
  
  var `type`: InterfaceExtends = js.native
}
object `136` {
  
  @scala.inline
  def apply(`type`: InterfaceExtends): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit class `136Ops`[Self <: `136`] (val x: Self) extends AnyVal {
    
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
    def setType(value: InterfaceExtends): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
