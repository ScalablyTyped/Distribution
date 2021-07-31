package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Function` */
object es6FunctionMod {
  
  @JSImport("core-js/es6/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], argArray.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def part(target: Function, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("part")(target.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
