package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`skeleton-background`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var name: `skeleton-background`
  
  var `type`: color
}
object `143` {
  
  inline def apply(): `143` = {
    val __obj = js.Dynamic.literal(name = "skeleton-background")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `skeleton-background`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
