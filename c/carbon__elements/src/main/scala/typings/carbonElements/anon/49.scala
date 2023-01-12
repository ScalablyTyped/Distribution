package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var name: `background-inverse`
  
  var `type`: color
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(name = "background-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `background-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
