package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var `type`: ImportDefaultSpecifier
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
