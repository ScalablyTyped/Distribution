package typings.continuationLocalStorage

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("continuation-local-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNamespace(name: String): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  inline def destroyNamespace(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getNamespace(name: String): js.UndefOr[Namespace] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Namespace]]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @js.native
  trait BindCallbackFn[T] extends StObject {
    
    def apply(args: Any*): T = js.native
  }
  
  type Context = StringDictionary[Any]
  
  @js.native
  trait Namespace extends StObject {
    
    // Note: this is readonly because changing it does not actually rename it
    val active: Context = js.native
    
    def bind[T](callback: BindCallbackFn[T]): BindCallbackFn[T] = js.native
    def bind[T](callback: BindCallbackFn[T], context: Context): BindCallbackFn[T] = js.native
    
    def bindEmitter(emitter: EventEmitter): Unit = js.native
    
    // Note: this is readonly because changing it manually will break functionality
    def createContext(): Context = js.native
    
    def enter(context: Context): Unit = js.native
    
    def exit(context: Context): Unit = js.native
    
    def get[T](key: String): js.UndefOr[T] = js.native
    
    val name: String = js.native
    
    def run[T](callback: RunCallbackFn[T]): Context = js.native
    
    def runAndReturn[T](callback: RunCallbackFn[T]): T = js.native
    
    def set[T](key: String, value: T): T = js.native
  }
  
  type RunCallbackFn[T] = js.Function1[/* context */ Context, T]
}
