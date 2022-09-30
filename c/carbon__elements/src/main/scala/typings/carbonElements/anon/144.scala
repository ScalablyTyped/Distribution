package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`skeleton-element`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var name: `skeleton-element`
  
  var `type`: color
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal(name = "skeleton-element")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setName(value: `skeleton-element`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
