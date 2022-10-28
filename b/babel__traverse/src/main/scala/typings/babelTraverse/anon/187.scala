package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var `type`: TSInterfaceDeclaration
}
object `187` {
  
  inline def apply(): `187` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[`187`]
  }
  
  extension [Self <: `187`](x: Self) {
    
    inline def setType(value: TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
