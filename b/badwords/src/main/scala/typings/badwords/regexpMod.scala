package typings.badwords

import org.scalablytyped.runtime.Shortcut
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regexpMod extends Shortcut {
  
  @JSImport("badwords/regexp", JSImport.Namespace)
  @js.native
  val ^ : RegExp = js.native
  
  type _To = RegExp
  
  /* This means you don't have to write `^`, but can instead just say `regexpMod.foo` */
  override def _to: RegExp = ^
}
