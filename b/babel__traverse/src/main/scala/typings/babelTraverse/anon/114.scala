package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  var `type`: ImportSpecifier
}
object `114` {
  
  inline def apply(): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `114`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
