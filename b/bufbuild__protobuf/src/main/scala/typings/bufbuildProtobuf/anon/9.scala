package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var fieldKind: scalar
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(fieldKind = "scalar")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setFieldKind(value: scalar): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
  }
}
