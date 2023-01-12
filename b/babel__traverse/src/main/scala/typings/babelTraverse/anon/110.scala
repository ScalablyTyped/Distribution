package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var `type`: DeclareExportAllDeclaration
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `110`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
