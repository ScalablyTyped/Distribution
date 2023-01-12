package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var `type`: ExportNamedDeclaration
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `46`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
