package typings.depd

import typings.depd.depdStrings.deprecation
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("depd", JSImport.Namespace)
  @js.native
  def apply(namespace: String): Deprecate = js.native
  
  @js.native
  trait Deprecate extends StObject {
    
    def apply(message: String): Unit = js.native
    
    // tslint:disable-next-line ban-types
    def function[T /* <: js.Function */](fn: T): T = js.native
    def function[T /* <: js.Function */](fn: T, message: String): T = js.native
    
    def property[T /* <: js.Object */](obj: T, prop: /* keyof T */ String, message: String): Unit = js.native
  }
  
  @js.native
  trait DeprecationError extends Error {
    
    @JSName("name")
    val name_DeprecationError: typings.depd.depdStrings.DeprecationError = js.native
    
    var namespace: String = js.native
    
    @JSName("stack")
    var stack_DeprecationError: String = js.native
  }
  object DeprecationError {
    
    @scala.inline
    def apply(message: String, name: typings.depd.depdStrings.DeprecationError, namespace: String, stack: String): DeprecationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecationError]
    }
    
    @scala.inline
    implicit class DeprecationErrorMutableBuilder[Self <: DeprecationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.depd.depdStrings.DeprecationError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Process extends StObject {
        
        @JSName("addListener")
        def addListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
        
        @JSName("emit")
        def emit_deprecation(event: deprecation, code: DeprecationError): Boolean = js.native
        
        @JSName("listeners")
        def listeners_deprecation(event: deprecation): js.Array[DeprecationError] = js.native
        
        @JSName("on")
        def on_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
        
        @JSName("once")
        def once_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
        
        @JSName("prependListener")
        def prependListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
        
        @JSName("prependOnceListener")
        def prependOnceListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
      }
      object Process {
        
        @scala.inline
        def apply(
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
        
        @scala.inline
        implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
          
          @scala.inline
          def setEmit(value: (deprecation, DeprecationError) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
          
          @scala.inline
          def setListeners(value: deprecation => js.Array[DeprecationError]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
          
          @scala.inline
          def setOn(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
          
          @scala.inline
          def setOnce(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
          
          @scala.inline
          def setPrependListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
          
          @scala.inline
          def setPrependOnceListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
