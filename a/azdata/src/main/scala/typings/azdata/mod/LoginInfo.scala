package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginInfo extends StObject {
  
  var name: String
}
object LoginInfo {
  
  @scala.inline
  def apply(name: String): LoginInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginInfo]
  }
  
  @scala.inline
  implicit class LoginInfoMutableBuilder[Self <: LoginInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
