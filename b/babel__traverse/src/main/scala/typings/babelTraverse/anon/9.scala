package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var `type`: InterfaceTypeAnnotation
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setType(value: InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
