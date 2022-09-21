package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorOnLine extends StObject {
  
  val onLine: scala.Boolean
}
object NavigatorOnLine {
  
  inline def apply(onLine: scala.Boolean): NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOnLine]
  }
  
  extension [Self <: NavigatorOnLine](x: Self) {
    
    inline def setOnLine(value: scala.Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
  }
}
