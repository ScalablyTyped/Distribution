package typings.depd

import typings.depd.depdStrings.deprecation
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(namespace: String): Deprecate = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[Deprecate]
  
  @JSImport("depd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Deprecate extends StObject {
    
    def apply(message: String): Unit = js.native
    
    // tslint:disable-next-line ban-types
    def function[T /* <: js.Function */](fn: T): T = js.native
    def function[T /* <: js.Function */](fn: T, message: String): T = js.native
    
    def property[T /* <: js.Object */](obj: T, prop: /* keyof T */ String, message: String): Unit = js.native
  }
  
  trait DeprecationError
    extends StObject
       with Error {
    
    @JSName("name")
    val name_DeprecationError: typings.depd.depdStrings.DeprecationError
    
    var namespace: String
    
    @JSName("stack")
    var stack_DeprecationError: String
  }
  object DeprecationError {
    
    inline def apply(message: String, namespace: String, stack: String): DeprecationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "DeprecationError", namespace = namespace.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecationError]
    }
    
    extension [Self <: DeprecationError](x: Self) {
      
      inline def setName(value: typings.depd.depdStrings.DeprecationError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object NodeJS {
      
      trait Process extends StObject {
        
        @JSName("addListener")
        def addListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
        
        @JSName("emit")
        def emit_deprecation(event: deprecation, code: DeprecationError): Boolean
        
        @JSName("listeners")
        def listeners_deprecation(event: deprecation): js.Array[DeprecationError]
        
        @JSName("on")
        def on_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
        
        @JSName("once")
        def once_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
        
        @JSName("prependListener")
        def prependListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
        
        @JSName("prependOnceListener")
        def prependOnceListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
      }
      object Process {
        
        inline def apply(
          addListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
          emit: (deprecation, DeprecationError) => Boolean,
          listeners: deprecation => js.Array[DeprecationError],
          on: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
          once: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
          prependListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
          prependOnceListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process
        ): Process = {
          val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener))
          __obj.asInstanceOf[Process]
        }
        
        extension [Self <: Process](x: Self) {
          
          inline def setAddListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
          
          inline def setEmit(value: (deprecation, DeprecationError) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
          
          inline def setListeners(value: deprecation => js.Array[DeprecationError]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
          
          inline def setOn(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
          
          inline def setOnce(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
          
          inline def setPrependListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
          
          inline def setPrependOnceListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
