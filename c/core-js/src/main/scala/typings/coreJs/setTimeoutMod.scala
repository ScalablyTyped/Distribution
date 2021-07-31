package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setTimeoutMod {
  
  /* was `typeof core.setTimeout` */
  @scala.inline
  def apply(handler: js.Any, timeout: js.Any, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply(handler: js.Any, timeout: Unit, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/fn/set-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
