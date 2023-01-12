package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var `type`: EnumNumberBody
}
object `240` {
  
  inline def apply(): `240` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `240`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
