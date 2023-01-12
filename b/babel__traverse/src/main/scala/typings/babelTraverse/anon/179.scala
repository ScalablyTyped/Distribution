package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var `type`: ExportNamespaceSpecifier
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `179`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
