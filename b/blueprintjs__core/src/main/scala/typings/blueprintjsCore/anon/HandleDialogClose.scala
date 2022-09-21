package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleDialogClose extends StObject {
  
  def handleDialogClose(): Unit
}
object HandleDialogClose {
  
  inline def apply(handleDialogClose: () => Unit): HandleDialogClose = {
    val __obj = js.Dynamic.literal(handleDialogClose = js.Any.fromFunction0(handleDialogClose))
    __obj.asInstanceOf[HandleDialogClose]
  }
  
  extension [Self <: HandleDialogClose](x: Self) {
    
    inline def setHandleDialogClose(value: () => Unit): Self = StObject.set(x, "handleDialogClose", js.Any.fromFunction0(value))
  }
}
