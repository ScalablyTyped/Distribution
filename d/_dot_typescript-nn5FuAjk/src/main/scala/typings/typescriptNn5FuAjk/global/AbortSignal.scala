package typings.typescriptNn5FuAjk.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AbortSignal")
@js.native
open class AbortSignal ()
  extends StObject
     with typings.typescriptNn5FuAjk.AbortSignal
object AbortSignal {
  
  @JSGlobal("AbortSignal")
  @js.native
  val ^ : js.Any = js.native
  
  inline def abort(): typings.typescriptNn5FuAjk.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[typings.typescriptNn5FuAjk.AbortSignal]
  inline def abort(reason: Any): typings.typescriptNn5FuAjk.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.AbortSignal]
}
