package typings.blazy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Blazy")
  @js.native
  class Blazy protected ()
    extends StObject
       with BlazyInstance {
    def this(options: BlazyOptions) = this()
  }
  @JSGlobal("Blazy")
  @js.native
  def Blazy: typings.blazy.Blazy = js.native
  @scala.inline
  def Blazy_=(x: typings.blazy.Blazy): Unit = js.Dynamic.global.updateDynamic("Blazy")(x.asInstanceOf[js.Any])
}
