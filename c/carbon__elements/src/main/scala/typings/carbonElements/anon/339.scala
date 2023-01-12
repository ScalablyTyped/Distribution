package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-03`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `339` extends StObject {
  
  var name: `layout-03`
  
  var `type`: layout
}
object `339` {
  
  inline def apply(): `339` = {
    val __obj = js.Dynamic.literal(name = "layout-03")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`339`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `339`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layout-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
