package typings.carbonElements.anon

import typings.carbonElements.carbonElementsInts.`600`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var fontWeight: `600`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(fontWeight = 600)
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
