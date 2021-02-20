package typings.blazy

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("blazy", JSImport.Namespace)
  @js.native
  val ^ : Blazy = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("blazy", JSImport.Namespace)
  @js.native
  class Class protected () extends BlazyInstance {
    def this(options: BlazyOptions) = this()
  }
  
  type _To = Blazy
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Blazy = ^
}
