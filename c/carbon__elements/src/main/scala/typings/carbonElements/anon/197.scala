package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-cyan`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  var name: `tag-hover-cyan`
  
  var `type`: color
}
object `197` {
  
  inline def apply(): `197` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-cyan")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`197`]
  }
  
  extension [Self <: `197`](x: Self) {
    
    inline def setName(value: `tag-hover-cyan`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
