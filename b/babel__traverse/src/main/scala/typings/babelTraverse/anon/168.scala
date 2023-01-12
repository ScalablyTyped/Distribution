package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var `type`: Placeholder
}
object `168` {
  
  inline def apply(): `168` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `168`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
