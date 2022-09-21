package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.odata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `type`: odata
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("odata")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: odata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
