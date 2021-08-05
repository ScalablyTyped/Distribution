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
  
  inline def getNamespace(name: String): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  type Context = StringDictionary[js.Any]
  
  @js.native
  trait Func[T] extends StObject {
    
    def apply(args: js.Any*): T = js.native
  }
  
  @js.native
  trait Namespace extends StObject {
    
    // Note: this is readonly because changing it does not actually rename it
    val active: Context = js.native
    
    def bind(callback: Func[Unit]): Func[Unit] = js.native
    def bind(callback: Func[Unit], context: Context): Func[Unit] = js.native
    
    def bindEmitter(emitter: EventEmitter): Unit = js.native
    
    @JSName("bind")
    def bind_T[T](callback: Func[T]): Func[T] = js.native
    @JSName("bind")
    def bind_T[T](callback: Func[T], context: Context): Func[T] = js.native
    
    // Note: this is readonly because changing it manually will break functionality
    def createContext(): Context = js.native
    
    def enter(context: Context): Unit = js.native
    
    def exit(context: Context): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    val name: String = js.native
    
    def run(callback: Func[Unit]): Context = js.native
    
    def runAndReturn[T](callback: Func[T]): T = js.native
    
    @JSName("run")
    def run_T[T](callback: Func[T]): Context = js.native
    
    def set[T](key: String, value: T): T = js.native
  }
}
