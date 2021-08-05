package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSLiteralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var `type`: TSLiteralType
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setType(value: TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
