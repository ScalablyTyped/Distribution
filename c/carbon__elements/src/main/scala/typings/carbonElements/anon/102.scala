package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  var name: `border-disabled`
  
  var `type`: color
}
object `102` {
  
  inline def apply(): `102` = {
    val __obj = js.Dynamic.literal(name = "border-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`102`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `102`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
