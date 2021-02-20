package typings.busboy

import org.scalablytyped.runtime.Shortcut
import typings.busboy.busboy.Busboy
import typings.busboy.busboy.BusboyConfig
import typings.busboy.busboy.BusboyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("busboy", JSImport.Namespace)
  @js.native
  class ^ protected () extends Busboy {
    def this(options: BusboyConfig) = this()
  }
  @JSImport("busboy", JSImport.Namespace)
  @js.native
  val ^ : BusboyConstructor = js.native
  
  type _To = BusboyConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BusboyConstructor = ^
}
