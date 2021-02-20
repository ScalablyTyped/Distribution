package typings.deferPromise

import typings.deferPromise.mod.global.DeferPromise.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("defer-promise", JSImport.Namespace)
  @js.native
  def apply[T](): Deferred[T] = js.native
  
  object global {
    
    object DeferPromise {
      
      @js.native
      trait Deferred[T] extends StObject {
        
        var promise: js.Promise[T] = js.native
        
        def reject(): Unit = js.native
        def reject(reason: js.Any): Unit = js.native
        
        def resolve(): Unit = js.native
        def resolve(value: T): Unit = js.native
        def resolve(value: js.Thenable[T]): Unit = js.native
      }
    }
  }
}
