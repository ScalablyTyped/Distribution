package typings.cloudflare.mod

import typings.cloudflare.anon.Action
import typings.cloudflare.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zones extends StObject {
  
  def activationCheck(id: String): ResponseObjectPromise
  
  def add(zone: Action): ResponseObjectPromise
  
  def browse(): ResponseObjectPromise
  
  def del(id: String): ResponseObjectPromise
  
  def edit(id: String, zone: Action): ResponseObjectPromise
  
  def purgeCache(id: String, params: Files): ResponseObjectPromise
  
  def read(id: String): ResponseObjectPromise
}
object Zones {
  
  inline def apply(
    activationCheck: String => ResponseObjectPromise,
    add: Action => ResponseObjectPromise,
    browse: () => ResponseObjectPromise,
    del: String => ResponseObjectPromise,
    edit: (String, Action) => ResponseObjectPromise,
    purgeCache: (String, Files) => ResponseObjectPromise,
    read: String => ResponseObjectPromise
  ): Zones = {
    val __obj = js.Dynamic.literal(activationCheck = js.Any.fromFunction1(activationCheck), add = js.Any.fromFunction1(add), browse = js.Any.fromFunction0(browse), del = js.Any.fromFunction1(del), edit = js.Any.fromFunction2(edit), purgeCache = js.Any.fromFunction2(purgeCache), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Zones]
  }
  
  extension [Self <: Zones](x: Self) {
    
    inline def setActivationCheck(value: String => ResponseObjectPromise): Self = StObject.set(x, "activationCheck", js.Any.fromFunction1(value))
    
    inline def setAdd(value: Action => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setBrowse(value: () => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction0(value))
    
    inline def setDel(value: String => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
    
    inline def setEdit(value: (String, Action) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction2(value))
    
    inline def setPurgeCache(value: (String, Files) => ResponseObjectPromise): Self = StObject.set(x, "purgeCache", js.Any.fromFunction2(value))
    
    inline def setRead(value: String => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
  }
}
