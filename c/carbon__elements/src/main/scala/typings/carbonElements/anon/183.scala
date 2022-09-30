package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-red`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  var name: `tag-background-red`
  
  var `type`: color
}
object `183` {
  
  inline def apply(): `183` = {
    val __obj = js.Dynamic.literal(name = "tag-background-red")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setName(value: `tag-background-red`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
