package typings.coreJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxSafeIntegerMod extends Shortcut {
  
  @JSImport("core-js/fn/number/max-safe-integer", JSImport.Namespace)
  @js.native
  val ^ : Double = js.native
  
  type _To = Double
  
  /* This means you don't have to write `^`, but can instead just say `maxSafeIntegerMod.foo` */
  override def _to: Double = ^
}
