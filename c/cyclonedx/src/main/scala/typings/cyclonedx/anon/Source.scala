package typings.cyclonedx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var id: String
  
  var source: typings.cyclonedx.mod.Source
}
object Source {
  
  inline def apply(id: String, source: typings.cyclonedx.mod.Source): Source = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.cyclonedx.mod.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
