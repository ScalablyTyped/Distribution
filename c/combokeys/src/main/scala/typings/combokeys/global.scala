package typings.combokeys

import typings.combokeys.Combokeys.CombokeysStatic
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("combokeys")
  @js.native
  class combokeys protected ()
    extends StObject
       with typings.combokeys.Combokeys.Combokeys {
    def this(element: Element) = this()
  }
  @JSGlobal("combokeys")
  @js.native
  def combokeys: CombokeysStatic = js.native
  @scala.inline
  def combokeys_=(x: CombokeysStatic): Unit = js.Dynamic.global.updateDynamic("combokeys")(x.asInstanceOf[js.Any])
}
