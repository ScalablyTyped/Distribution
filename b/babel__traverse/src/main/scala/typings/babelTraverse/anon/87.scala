package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  var `type`: JSXIdentifier
}
object `87` {
  
  inline def apply(): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
