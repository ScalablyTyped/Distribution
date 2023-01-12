package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var `type`: EnumDefaultedMember
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `191`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
