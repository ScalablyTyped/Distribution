package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var `type`: TSNamespaceExportDeclaration
}
object `90` {
  
  inline def apply(): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `90`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
