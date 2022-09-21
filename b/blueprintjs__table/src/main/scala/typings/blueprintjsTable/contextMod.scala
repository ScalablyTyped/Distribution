package typings.blueprintjsTable

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  /* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.ColumnInteractionBarContextTypes> */
  object columnInteractionBarContextTypes {
    
    @JSImport("@blueprintjs/table/lib/esm/common/context", "columnInteractionBarContextTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common/context", "columnInteractionBarContextTypes.enableColumnInteractionBar")
    @js.native
    def enableColumnInteractionBar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    inline def enableColumnInteractionBar_=(x: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(x.asInstanceOf[js.Any])
  }
  
  trait ColumnInteractionBarContextTypes_ extends StObject {
    
    var enableColumnInteractionBar: js.UndefOr[Boolean | Null] = js.undefined
  }
  object ColumnInteractionBarContextTypes_ {
    
    inline def apply(): ColumnInteractionBarContextTypes_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnInteractionBarContextTypes_]
    }
    
    extension [Self <: ColumnInteractionBarContextTypes_](x: Self) {
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnInteractionBarNull: Self = StObject.set(x, "enableColumnInteractionBar", null)
      
      inline def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
    }
  }
}
