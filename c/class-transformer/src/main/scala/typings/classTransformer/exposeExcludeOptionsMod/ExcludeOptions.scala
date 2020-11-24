package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeOptions extends js.Object {
  
  var toClassOnly: js.UndefOr[Boolean] = js.native
  
  var toPlainOnly: js.UndefOr[Boolean] = js.native
}
object ExcludeOptions {
  
  @scala.inline
  def apply(): ExcludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeOptions]
  }
  
  @scala.inline
  implicit class ExcludeOptionsOps[Self <: ExcludeOptions] (val x: Self) extends AnyVal {
    
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
    def setToClassOnly(value: Boolean): Self = this.set("toClassOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToClassOnly: Self = this.set("toClassOnly", js.undefined)
    
    @scala.inline
    def setToPlainOnly(value: Boolean): Self = this.set("toPlainOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPlainOnly: Self = this.set("toPlainOnly", js.undefined)
  }
}
