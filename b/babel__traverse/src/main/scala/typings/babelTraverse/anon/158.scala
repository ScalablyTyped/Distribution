package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var `type`: DeclareExportDeclaration
}
object `158` {
  
  inline def apply(): `158` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[`158`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `158`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
