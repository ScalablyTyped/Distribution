package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partMod {
  
  /* was `typeof core.Function.part` */
  inline def apply(target: Function, args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(target.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("core-js/fn/function/part", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
