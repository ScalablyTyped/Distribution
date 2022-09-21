package typings.cborg

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticMod {
  
  @JSImport("cborg/types/lib/diagnostic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDiag(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDiag")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def tokensToDiagnostic(inp: js.typedarray.Uint8Array): Generator[String, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToDiagnostic")(inp.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Any]]
  inline def tokensToDiagnostic(inp: js.typedarray.Uint8Array, width: Double): Generator[String, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToDiagnostic")(inp.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Any]]
}
