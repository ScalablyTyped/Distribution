package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dialogCommand extends StObject {
  
  var value: Any
}
object dialogCommand {
  
  inline def apply(value: Any): dialogCommand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dialogCommand]
  }
  
  extension [Self <: dialogCommand](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
