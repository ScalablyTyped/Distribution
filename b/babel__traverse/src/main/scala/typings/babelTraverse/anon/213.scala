package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXOpeningFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `213` extends js.Object {
  
  var `type`: JSXOpeningFragment = js.native
}
object `213` {
  
  @scala.inline
  def apply(`type`: JSXOpeningFragment): `213` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`213`]
  }
  
  @scala.inline
  implicit class `213Ops`[Self <: `213`] (val x: Self) extends AnyVal {
    
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
    def setType(value: JSXOpeningFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
