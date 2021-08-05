package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var `type`: InterfaceDeclaration
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setType(value: InterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
