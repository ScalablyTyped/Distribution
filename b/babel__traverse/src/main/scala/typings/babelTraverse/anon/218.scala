package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSObjectKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  var `type`: TSObjectKeyword
}
object `218` {
  
  inline def apply(): `218` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `218`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
