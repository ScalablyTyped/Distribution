package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var `type`: ExportAllDeclaration
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setType(value: ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
