package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Function` */
object es6FunctionMod {
  
  @JSImport("core-js/es6/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(target: Function, thisArg: Any, argArray: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")((scala.List(target.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).`++`(argArray.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def part(target: Function, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("part")(scala.List(target.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
