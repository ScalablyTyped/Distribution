package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-warning-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var name: `support-warning-inverse`
  
  var `type`: color
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal(name = "support-warning-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setName(value: `support-warning-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
