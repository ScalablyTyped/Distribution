package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Truncated extends StObject {
  
  var truncated: Boolean
  
  var wrapText: Boolean
}
object Truncated {
  
  inline def apply(truncated: Boolean, wrapText: Boolean): Truncated = {
    val __obj = js.Dynamic.literal(truncated = truncated.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Truncated]
  }
  
  extension [Self <: Truncated](x: Self) {
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
  }
}
