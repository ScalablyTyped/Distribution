package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArgumentPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  var `type`: ArgumentPlaceholder
}
object `239` {
  
  inline def apply(): `239` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[`239`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `239`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ArgumentPlaceholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
