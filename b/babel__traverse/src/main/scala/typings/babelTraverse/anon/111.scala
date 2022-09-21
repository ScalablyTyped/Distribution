package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var `type`: TSTypeAnnotation
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setType(value: TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
