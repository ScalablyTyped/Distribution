package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThisTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var `type`: ThisTypeAnnotation
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setType(value: ThisTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
