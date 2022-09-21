package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var `type`: ExportDefaultDeclaration
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
