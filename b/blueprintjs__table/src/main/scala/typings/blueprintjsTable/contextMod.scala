package typings.blueprintjsTable

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  /* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.IColumnInteractionBarContextTypes> */
  object columnInteractionBarContextTypes {
    
    @JSImport("@blueprintjs/table/lib/esm/common/context", "columnInteractionBarContextTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common/context", "columnInteractionBarContextTypes.enableColumnInteractionBar")
    @js.native
    def enableColumnInteractionBar: js.UndefOr[Validator[Boolean]] = js.native
    inline def enableColumnInteractionBar_=(x: js.UndefOr[Validator[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(x.asInstanceOf[js.Any])
  }
  
  trait IColumnInteractionBarContextTypes extends StObject {
    
    var enableColumnInteractionBar: Boolean
  }
  object IColumnInteractionBarContextTypes {
    
    inline def apply(enableColumnInteractionBar: Boolean): IColumnInteractionBarContextTypes = {
      val __obj = js.Dynamic.literal(enableColumnInteractionBar = enableColumnInteractionBar.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumnInteractionBarContextTypes]
    }
    
    extension [Self <: IColumnInteractionBarContextTypes](x: Self) {
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
    }
  }
}
