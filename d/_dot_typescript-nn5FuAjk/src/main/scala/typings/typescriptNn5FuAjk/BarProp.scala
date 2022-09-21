package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarProp extends StObject {
  
  val visible: scala.Boolean
}
object BarProp {
  
  inline def apply(visible: scala.Boolean): BarProp = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProp]
  }
  
  extension [Self <: BarProp](x: Self) {
    
    inline def setVisible(value: scala.Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
