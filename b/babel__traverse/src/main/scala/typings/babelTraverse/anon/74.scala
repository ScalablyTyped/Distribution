package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var `type`: QualifiedTypeIdentifier
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
