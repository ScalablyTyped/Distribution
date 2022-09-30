package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-green`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var name: `tag-hover-green`
  
  var `type`: color
}
object `203` {
  
  inline def apply(): `203` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-green")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setName(value: `tag-hover-green`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
