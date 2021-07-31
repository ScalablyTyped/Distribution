package typings.browserfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setImmediateMod {
  
  @JSImport("browserfs/dist/node/generic/setImmediate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browserfs/dist/node/generic/setImmediate", JSImport.Default)
  @js.native
  def default: js.Function1[/* cb */ js.Function, js.Any] = js.native
  @scala.inline
  def default_=(x: js.Function1[/* cb */ js.Function, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
