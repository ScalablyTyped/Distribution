package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSBigIntKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var `type`: TSBigIntKeyword
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[`53`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
