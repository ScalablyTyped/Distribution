package typings.countdown

import org.scalablytyped.runtime.Shortcut
import typings.countdown.countdown.CountdownStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("countdown", JSImport.Namespace)
  @js.native
  val ^ : CountdownStatic = js.native
  
  type _To = CountdownStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CountdownStatic = ^
}
