package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var `type`: TSModuleDeclaration
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setType(value: TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
