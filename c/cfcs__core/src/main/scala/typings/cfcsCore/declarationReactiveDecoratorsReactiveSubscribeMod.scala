package typings.cfcsCore

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveDecoratorsReactiveSubscribeMod {
  
  @JSImport("@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ReactiveSubscribe[State /* <: Record[String, Any] */] extends StObject {
    
    /**
      * When the value of the property changes, the callback function is called.
      */
    def subscribe[Name /* <: /* keyof State */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: State[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Unregister the callback function corresponding to the property.
      */
    def unsubscribe[Name /* <: /* keyof State */ String */](): Unit = js.native
    def unsubscribe[Name /* <: /* keyof State */ String */](name: Name): Unit = js.native
    def unsubscribe[Name /* <: /* keyof State */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: State[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def unsubscribe[Name /* <: /* keyof State */ String */](
      name: Unit,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: State[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
  }
  object ReactiveSubscribe {
    
    @JSImport("@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe", "ReactiveSubscribe")
    @js.native
    def apply(Constructor: Any): Unit = js.native
  }
  
  inline def injectReactiveSubscribe(`object`: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectReactiveSubscribe")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
