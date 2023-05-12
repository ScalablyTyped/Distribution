package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var fieldKind: `enum`
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(fieldKind = "enum")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setFieldKind(value: `enum`): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
  }
}
