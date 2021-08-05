package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var `type`: TSNamespaceExportDeclaration
}
object `88` {
  
  inline def apply(): `88` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[`88`]
  }
  
  extension [Self <: `88`](x: Self) {
    
    inline def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
