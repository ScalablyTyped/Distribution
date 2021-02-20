package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberEpsilonMod extends Shortcut {
  
  @JSImport("core-js/library/fn/number/epsilon", JSImport.Namespace)
  @js.native
  val ^ : Double = js.native
  
  type _To = Double
  
  /* This means you don't have to write `^`, but can instead just say `numberEpsilonMod.foo` */
  override def _to: Double = ^
}
