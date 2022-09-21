package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassAccessorProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  var `type`: ClassAccessorProperty
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setType(value: ClassAccessorProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
