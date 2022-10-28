package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `215` extends StObject {
  
  var `type`: IntersectionTypeAnnotation
}
object `215` {
  
  inline def apply(): `215` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[`215`]
  }
  
  extension [Self <: `215`](x: Self) {
    
    inline def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
