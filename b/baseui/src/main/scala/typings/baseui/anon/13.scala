package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  @JSName("$size")
  var $size: Double
}
object `13` {
  
  inline def apply($size: Double): `13` = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
