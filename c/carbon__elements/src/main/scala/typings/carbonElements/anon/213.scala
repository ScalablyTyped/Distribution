package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`caption-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var name: `caption-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(name = "caption-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setName(value: `caption-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
