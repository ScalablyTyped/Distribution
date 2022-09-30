package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  var name: `link-inverse`
  
  var `type`: color
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal(name = "link-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setName(value: `link-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
