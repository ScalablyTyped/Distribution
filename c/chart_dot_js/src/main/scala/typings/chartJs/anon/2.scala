package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var cancelable: true
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(cancelable = true)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setCancelable(value: true): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
  }
}
