package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSRestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var `type`: TSRestType
}
object `210` {
  
  inline def apply(): `210` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[`210`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `210`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
