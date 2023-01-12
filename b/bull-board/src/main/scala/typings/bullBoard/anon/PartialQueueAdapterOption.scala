package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bull-board.bull-board/dist/app.QueueAdapterOptions> */
trait PartialQueueAdapterOption extends StObject {
  
  var readOnlyMode: js.UndefOr[Boolean] = js.undefined
}
object PartialQueueAdapterOption {
  
  inline def apply(): PartialQueueAdapterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueueAdapterOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialQueueAdapterOption] (val x: Self) extends AnyVal {
    
    inline def setReadOnlyMode(value: Boolean): Self = StObject.set(x, "readOnlyMode", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyModeUndefined: Self = StObject.set(x, "readOnlyMode", js.undefined)
  }
}
