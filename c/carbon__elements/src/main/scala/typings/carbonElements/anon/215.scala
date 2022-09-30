package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`label-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `215` extends StObject {
  
  var name: `label-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `215` {
  
  inline def apply(): `215` = {
    val __obj = js.Dynamic.literal(name = "label-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`215`]
  }
  
  extension [Self <: `215`](x: Self) {
    
    inline def setName(value: `label-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
