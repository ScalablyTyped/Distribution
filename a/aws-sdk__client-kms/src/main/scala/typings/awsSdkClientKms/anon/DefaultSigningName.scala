package typings.awsSdkClientKms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSigningName extends StObject {
  
  var defaultSigningName: String
}
object DefaultSigningName {
  
  inline def apply(defaultSigningName: String): DefaultSigningName = {
    val __obj = js.Dynamic.literal(defaultSigningName = defaultSigningName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSigningName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSigningName] (val x: Self) extends AnyVal {
    
    inline def setDefaultSigningName(value: String): Self = StObject.set(x, "defaultSigningName", value.asInstanceOf[js.Any])
  }
}
