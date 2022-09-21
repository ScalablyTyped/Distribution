package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  var `type`: GenericTypeAnnotation
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[`243`]
  }
  
  extension [Self <: `243`](x: Self) {
    
    inline def setType(value: GenericTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
