package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldKind extends StObject {
  
  var fieldKind: map
}
object FieldKind {
  
  inline def apply(): FieldKind = {
    val __obj = js.Dynamic.literal(fieldKind = "map")
    __obj.asInstanceOf[FieldKind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldKind] (val x: Self) extends AnyVal {
    
    inline def setFieldKind(value: map): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
  }
}
