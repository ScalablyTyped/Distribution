package typings.crocks

import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialMod {
  
  @JSImport("crocks/helpers/partial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * partial :: (((*) -> c), *) -> (*) -> c
    */
  inline def default(fn: VariadicFunction, args: Any*): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VariadicFunction]
}
