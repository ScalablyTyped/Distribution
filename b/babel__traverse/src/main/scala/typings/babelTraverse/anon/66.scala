package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIntrinsicKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var `type`: TSIntrinsicKeyword
}
object `66` {
  
  inline def apply(): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `66`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSIntrinsicKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
