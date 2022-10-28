package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var `type`: DeclareModule
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setType(value: DeclareModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
