package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  var `type`: ImportNamespaceSpecifier
}
object `197` {
  
  inline def apply(): `197` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[`197`]
  }
  
  extension [Self <: `197`](x: Self) {
    
    inline def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
