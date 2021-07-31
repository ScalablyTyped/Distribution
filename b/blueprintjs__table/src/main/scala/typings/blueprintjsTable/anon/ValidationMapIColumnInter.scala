package typings.blueprintjsTable.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.IColumnInteractionBarContextTypes> */
trait ValidationMapIColumnInter extends StObject {
  
  var enableColumnInteractionBar: js.UndefOr[Validator[Boolean]] = js.undefined
}
object ValidationMapIColumnInter {
  
  @scala.inline
  def apply(): ValidationMapIColumnInter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIColumnInter]
  }
  
  @scala.inline
  implicit class ValidationMapIColumnInterMutableBuilder[Self <: ValidationMapIColumnInter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableColumnInteractionBar(value: Validator[Boolean]): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
  }
}
