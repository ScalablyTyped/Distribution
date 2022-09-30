package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-helper`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var name: `text-helper`
  
  var `type`: color
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal(name = "text-helper")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setName(value: `text-helper`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
