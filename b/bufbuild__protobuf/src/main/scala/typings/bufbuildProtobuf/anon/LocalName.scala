package typings.bufbuildProtobuf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalName extends StObject {
  
  var localName: js.UndefOr[String] = js.undefined
}
object LocalName {
  
  inline def apply(): LocalName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalName] (val x: Self) extends AnyVal {
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
  }
}
