package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var name: `text-inverse`
  
  var `type`: color
}
object `108` {
  
  inline def apply(): `108` = {
    val __obj = js.Dynamic.literal(name = "text-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `108`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
