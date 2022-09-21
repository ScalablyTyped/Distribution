package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var `type`: DeclareVariable
}
object `181` {
  
  inline def apply(): `181` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setType(value: DeclareVariable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
