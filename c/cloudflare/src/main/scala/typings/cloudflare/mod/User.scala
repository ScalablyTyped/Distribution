package typings.cloudflare.mod

import typings.cloudflare.anon.Country
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  def edit(user: Country): js.Promise[js.Object]
  
  def read(): js.Promise[js.Object]
}
object User {
  
  inline def apply(edit: Country => js.Promise[js.Object], read: () => js.Promise[js.Object]): User = {
    val __obj = js.Dynamic.literal(edit = js.Any.fromFunction1(edit), read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setEdit(value: Country => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    inline def setRead(value: () => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
