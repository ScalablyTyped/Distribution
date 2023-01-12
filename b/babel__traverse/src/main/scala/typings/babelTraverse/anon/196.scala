package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  var `type`: TSParameterProperty
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[`196`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `196`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
