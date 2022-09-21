package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteCompletionsCache extends StObject {
  
  def clear(): Unit
  
  def get(): js.UndefOr[CompletionInfo]
  
  def set(response: CompletionInfo): Unit
}
object IncompleteCompletionsCache {
  
  inline def apply(clear: () => Unit, get: () => js.UndefOr[CompletionInfo], set: CompletionInfo => Unit): IncompleteCompletionsCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IncompleteCompletionsCache]
  }
  
  extension [Self <: IncompleteCompletionsCache](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => js.UndefOr[CompletionInfo]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: CompletionInfo => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
