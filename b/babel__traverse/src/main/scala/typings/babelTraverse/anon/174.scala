package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  var `type`: ExportNamespaceSpecifier
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[`174`]
  }
  
  extension [Self <: `174`](x: Self) {
    
    inline def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
