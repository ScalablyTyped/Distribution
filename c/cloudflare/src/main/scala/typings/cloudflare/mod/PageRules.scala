package typings.cloudflare.mod

import typings.cloudflare.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRules extends StObject {
  
  def add(zone: Actions): js.Promise[js.Object]
  
  def browse(): js.Promise[js.Object]
  
  def del(id: String): js.Promise[js.Object]
  
  def edit(id: String, page_rule: Actions): js.Promise[js.Object]
  
  def read(id: String): js.Promise[js.Object]
}
object PageRules {
  
  inline def apply(
    add: Actions => js.Promise[js.Object],
    browse: () => js.Promise[js.Object],
    del: String => js.Promise[js.Object],
    edit: (String, Actions) => js.Promise[js.Object],
    read: String => js.Promise[js.Object]
  ): PageRules = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), browse = js.Any.fromFunction0(browse), del = js.Any.fromFunction1(del), edit = js.Any.fromFunction2(edit), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[PageRules]
  }
  
  extension [Self <: PageRules](x: Self) {
    
    inline def setAdd(value: Actions => js.Promise[js.Object]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setBrowse(value: () => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction0(value))
    
    inline def setDel(value: String => js.Promise[js.Object]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
    
    inline def setEdit(value: (String, Actions) => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction2(value))
    
    inline def setRead(value: String => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
  }
}
