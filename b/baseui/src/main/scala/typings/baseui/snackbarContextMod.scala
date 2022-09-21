package typings.baseui

import typings.baseui.anon.Dequeue
import typings.baseui.snackbarTypesMod.Duration
import typings.baseui.snackbarTypesMod.SnackbarElementProps
import typings.baseui.snackbarTypesMod.SnackbarProviderProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarContextMod {
  
  @JSImport("baseui/snackbar/snackbar-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenOverridesPlacementDefaultDuration: SnackbarProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenOverridesPlacementDefaultDuration.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/snackbar/snackbar-context", "SnackbarContext")
  @js.native
  val SnackbarContext: typings.react.mod.Context[Context] = js.native
  
  inline def useSnackbar(): Dequeue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSnackbar")().asInstanceOf[Dequeue]
  
  @js.native
  trait Context extends StObject {
    
    def dequeue(): Unit = js.native
    
    def enqueue(elementProps: SnackbarElementProps): Unit = js.native
    def enqueue(elementProps: SnackbarElementProps, duration: Duration): Unit = js.native
  }
}
