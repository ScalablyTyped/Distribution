package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var fieldKind: message_
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(fieldKind = "message")
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setFieldKind(value: message_): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
  }
}
