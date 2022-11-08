package typings.blake2bWasm

import typings.blake2bWasm.blake2bWasmStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.typedarray.Uint8Array = js.native
    def apply(enc: String): String = js.native
    def apply(enc: binary): js.typedarray.Uint8Array = js.native
    def apply[T /* <: js.typedarray.Uint8Array */](enc: T): T = js.native
  }
}
