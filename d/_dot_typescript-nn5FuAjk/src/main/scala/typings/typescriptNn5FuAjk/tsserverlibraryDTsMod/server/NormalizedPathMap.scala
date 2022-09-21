package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedPathMap[T] extends StObject {
  
  def contains(path: NormalizedPath): Boolean
  
  def get(path: NormalizedPath): js.UndefOr[T]
  
  def remove(path: NormalizedPath): Unit
  
  def set(path: NormalizedPath, value: T): Unit
}
object NormalizedPathMap {
  
  inline def apply[T](
    contains: NormalizedPath => Boolean,
    get: NormalizedPath => js.UndefOr[T],
    remove: NormalizedPath => Unit,
    set: (NormalizedPath, T) => Unit
  ): NormalizedPathMap[T] = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[NormalizedPathMap[T]]
  }
  
  extension [Self <: NormalizedPathMap[?], T](x: Self & NormalizedPathMap[T]) {
    
    inline def setContains(value: NormalizedPath => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGet(value: NormalizedPath => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: NormalizedPath => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (NormalizedPath, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
