package typings.baseui.anon

import typings.baseui.baseuiStrings.change_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  val change: change_
}
object Change {
  
  inline def apply(): Change = {
    val __obj = js.Dynamic.literal(change = "change")
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
