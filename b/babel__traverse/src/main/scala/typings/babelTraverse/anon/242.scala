package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var `type`: ImportDeclaration
}
object `242` {
  
  inline def apply(): `242` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[`242`]
  }
  
  extension [Self <: `242`](x: Self) {
    
    inline def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
