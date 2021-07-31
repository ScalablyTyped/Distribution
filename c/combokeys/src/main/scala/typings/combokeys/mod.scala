package typings.combokeys

import org.scalablytyped.runtime.Shortcut
import typings.combokeys.Combokeys.CombokeysStatic
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("combokeys", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with typings.combokeys.Combokeys.Combokeys {
    def this(element: Element) = this()
  }
  @JSImport("combokeys", JSImport.Namespace)
  @js.native
  val ^ : CombokeysStatic = js.native
  
  type _To = CombokeysStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CombokeysStatic = ^
}
