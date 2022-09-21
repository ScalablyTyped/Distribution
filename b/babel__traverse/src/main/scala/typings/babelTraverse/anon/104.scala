package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var `type`: DeclareFunction
}
object `104` {
  
  inline def apply(): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setType(value: DeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
