package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var serializerFn: js.UndefOr[js.Function] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSerializerFn(value: js.Function): Self = StObject.set(x, "serializerFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializerFnUndefined: Self = StObject.set(x, "serializerFn", js.undefined)
  }
}
