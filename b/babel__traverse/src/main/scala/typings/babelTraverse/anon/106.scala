package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var `type`: ClassDeclaration
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setType(value: ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
