package typings.cuss

import org.scalablytyped.runtime.Shortcut
import typings.cuss.mod.Cuss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod extends Shortcut {
  
  @JSImport("cuss/es", JSImport.Namespace)
  @js.native
  val ^ : Cuss = js.native
  
  type _To = Cuss
  
  /* This means you don't have to write `^`, but can instead just say `esMod.foo` */
  override def _to: Cuss = ^
}
