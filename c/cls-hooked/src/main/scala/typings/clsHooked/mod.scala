package typings.clsHooked

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cls-hooked", "createNamespace")
  @js.native
  def createNamespace(name: String): Namespace = js.native
  
  @JSImport("cls-hooked", "destroyNamespace")
  @js.native
  def destroyNamespace(name: String): Unit = js.native
  
  @JSImport("cls-hooked", "getNamespace")
  @js.native
  def getNamespace(name: String): js.UndefOr[Namespace] = js.native
  
  @JSImport("cls-hooked", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @js.native
  trait Namespace extends StObject {
    
    var active: js.Any = js.native
    
    def bind[F /* <: js.Function */](fn: F): F = js.native
    def bind[F /* <: js.Function */](fn: F, context: js.Any): F = js.native
    
    // tslint:disable-line: ban-types
    def bindEmitter(emitter: EventEmitter): Unit = js.native
    
    def createContext(): js.Any = js.native
    
    def enter(context: js.Any): Unit = js.native
    
    def exit(context: js.Any): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    def run(fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    def runAndReturn[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
    
    def runPromise[T](fn: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
    
    def set[T](key: String, value: T): T = js.native
  }
}
