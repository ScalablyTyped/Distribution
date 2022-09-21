package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  @JSName("$width")
  var $width: String
}
object Width {
  
  inline def apply($width: String): Width = {
    val __obj = js.Dynamic.literal($width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
