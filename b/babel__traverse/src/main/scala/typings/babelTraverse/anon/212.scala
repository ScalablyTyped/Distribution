package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `212` extends StObject {
  
  var `type`: TSConstructorType
}
object `212` {
  
  inline def apply(): `212` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[`212`]
  }
  
  extension [Self <: `212`](x: Self) {
    
    inline def setType(value: TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
