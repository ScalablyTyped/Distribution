package typings.cloudflare.mod

import typings.cloudflare.anon.Action
import typings.cloudflare.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zones extends StObject {
  
  def activationCheck(id: String): js.Promise[js.Object]
  
  def add(zone: Action): js.Promise[js.Object]
  
  def browse(): js.Promise[js.Object]
  
  def del(id: String): js.Promise[js.Object]
  
  def edit(id: String, zone: Action): js.Promise[js.Object]
  
  def purgeCache(id: String, params: Files): js.Promise[js.Object]
  
  def read(id: String): js.Promise[js.Object]
}
object Zones {
  
  inline def apply(
    activationCheck: String => js.Promise[js.Object],
    add: Action => js.Promise[js.Object],
    browse: () => js.Promise[js.Object],
    del: String => js.Promise[js.Object],
    edit: (String, Action) => js.Promise[js.Object],
    purgeCache: (String, Files) => js.Promise[js.Object],
    read: String => js.Promise[js.Object]
  ): Zones = {
    val __obj = js.Dynamic.literal(activationCheck = js.Any.fromFunction1(activationCheck), add = js.Any.fromFunction1(add), browse = js.Any.fromFunction0(browse), del = js.Any.fromFunction1(del), edit = js.Any.fromFunction2(edit), purgeCache = js.Any.fromFunction2(purgeCache), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Zones]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Zones] (val x: Self) extends AnyVal {
    
    inline def setActivationCheck(value: String => js.Promise[js.Object]): Self = StObject.set(x, "activationCheck", js.Any.fromFunction1(value))
    
    inline def setAdd(value: Action => js.Promise[js.Object]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setBrowse(value: () => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction0(value))
    
    inline def setDel(value: String => js.Promise[js.Object]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
    
    inline def setEdit(value: (String, Action) => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction2(value))
    
    inline def setPurgeCache(value: (String, Files) => js.Promise[js.Object]): Self = StObject.set(x, "purgeCache", js.Any.fromFunction2(value))
    
    inline def setRead(value: String => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
  }
}
