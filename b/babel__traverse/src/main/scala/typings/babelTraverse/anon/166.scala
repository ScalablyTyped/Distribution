package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var `type`: ForOfStatement
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
