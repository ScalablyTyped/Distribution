package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var `type`: TSEnumMember
}
object `133` {
  
  inline def apply(): `133` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[`133`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `133`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
