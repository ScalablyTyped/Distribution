package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  var `type`: ExportDefaultDeclaration
}
object `78` {
  
  inline def apply(): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[`78`]
  }
  
  extension [Self <: `78`](x: Self) {
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
