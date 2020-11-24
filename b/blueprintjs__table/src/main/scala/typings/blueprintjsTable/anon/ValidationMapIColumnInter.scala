package typings.blueprintjsTable.anon

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.IColumnInteractionBarContextTypes> */
@js.native
trait ValidationMapIColumnInter extends js.Object {
  
  var enableColumnInteractionBar: js.UndefOr[Validator[Boolean]] = js.native
}
object ValidationMapIColumnInter {
  
  @scala.inline
  def apply(): ValidationMapIColumnInter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIColumnInter]
  }
  
  @scala.inline
  implicit class ValidationMapIColumnInterOps[Self <: ValidationMapIColumnInter] (val x: Self) extends AnyVal {
    
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
    def setEnableColumnInteractionBar(value: Validator[Boolean]): Self = this.set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnInteractionBar: Self = this.set("enableColumnInteractionBar", js.undefined)
  }
}
