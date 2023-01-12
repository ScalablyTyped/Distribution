package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumBooleanMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  var `type`: EnumBooleanMember
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `117`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
