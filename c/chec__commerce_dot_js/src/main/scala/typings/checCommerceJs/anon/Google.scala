package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Google extends StObject {
  
  var google: Settings
}
object Google {
  
  inline def apply(google: Settings): Google = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[Google]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Google] (val x: Self) extends AnyVal {
    
    inline def setGoogle(value: Settings): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
