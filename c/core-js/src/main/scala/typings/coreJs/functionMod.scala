package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Function` */
object functionMod {
  
  @JSImport("core-js/core/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], argArray.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def part(target: Function, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("part")(target.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
