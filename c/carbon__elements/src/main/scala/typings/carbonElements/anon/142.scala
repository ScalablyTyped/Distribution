package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`focus-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var name: `focus-inverse`
  
  var `type`: color
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal(name = "focus-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`142`]
  }
  
  extension [Self <: `142`](x: Self) {
    
    inline def setName(value: `focus-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
