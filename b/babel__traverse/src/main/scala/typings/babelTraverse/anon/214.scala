package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var `type`: UnionTypeAnnotation
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[`214`]
  }
  
  extension [Self <: `214`](x: Self) {
    
    inline def setType(value: UnionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
