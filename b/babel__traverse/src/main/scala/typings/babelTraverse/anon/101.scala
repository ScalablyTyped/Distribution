package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSStringKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var `type`: TSStringKeyword
}
object `101` {
  
  inline def apply(): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[`101`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `101`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
