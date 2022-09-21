package typings.dedentJs

import org.scalablytyped.runtime.Shortcut
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dedent-js", JSImport.Namespace)
  @js.native
  val ^ : Dedent = js.native
  
  type Dedent = js.Function2[/* templateStrings */ TemplateStringsArray | String, /* repeated */ Any, String]
  
  type _To = Dedent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Dedent = ^
}
