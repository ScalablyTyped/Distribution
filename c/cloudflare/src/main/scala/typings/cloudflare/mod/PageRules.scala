package typings.cloudflare.mod

import typings.cloudflare.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRules extends StObject {
  
  def add(zone: Actions): ResponseObjectPromise
  
  def browse(): ResponseObjectPromise
  
  def del(id: String): ResponseObjectPromise
  
  def edit(id: String, page_rule: Actions): ResponseObjectPromise
  
  def read(id: String): ResponseObjectPromise
}
object PageRules {
  
  inline def apply(
    add: Actions => ResponseObjectPromise,
    browse: () => ResponseObjectPromise,
    del: String => ResponseObjectPromise,
    edit: (String, Actions) => ResponseObjectPromise,
    read: String => ResponseObjectPromise
  ): PageRules = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), browse = js.Any.fromFunction0(browse), del = js.Any.fromFunction1(del), edit = js.Any.fromFunction2(edit), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[PageRules]
  }
  
  extension [Self <: PageRules](x: Self) {
    
    inline def setAdd(value: Actions => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setBrowse(value: () => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction0(value))
    
    inline def setDel(value: String => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
    
    inline def setEdit(value: (String, Actions) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction2(value))
    
    inline def setRead(value: String => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
  }
}
