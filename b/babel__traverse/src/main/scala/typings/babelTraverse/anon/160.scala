package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var `type`: DeclareInterface
}
object `160` {
  
  inline def apply(): `160` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def setType(value: DeclareInterface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
