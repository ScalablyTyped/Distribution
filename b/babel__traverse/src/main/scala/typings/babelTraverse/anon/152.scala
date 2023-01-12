package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var `type`: JSXFragment
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `152`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
