package typings.blueprintjsTable.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.ColumnInteractionBarContextTypes> */
trait ValidationMapColumnIntera extends StObject {
  
  var enableColumnInteractionBar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object ValidationMapColumnIntera {
  
  inline def apply(): ValidationMapColumnIntera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapColumnIntera]
  }
  
  extension [Self <: ValidationMapColumnIntera](x: Self) {
    
    inline def setEnableColumnInteractionBar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    inline def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
  }
}
