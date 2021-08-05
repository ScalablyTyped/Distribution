package typings.blissfuljs

import typings.blissfuljs.BlissNS.BlissStatic
import typings.blissfuljs.BlissNS.BlissStaticCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("$$")
  @js.native
  def $: BlissStaticCollection = js.native
  
  inline def $_=(x: BlissStaticCollection): Unit = js.Dynamic.global.updateDynamic("$$")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Bliss")
  @js.native
  def Bliss: BlissStatic = js.native
  inline def Bliss_=(x: BlissStatic): Unit = js.Dynamic.global.updateDynamic("Bliss")(x.asInstanceOf[js.Any])
  
  @JSGlobal("$")
  @js.native
  def _empty: BlissStatic = js.native
  
  inline def _empty_=(x: BlissStatic): Unit = js.Dynamic.global.updateDynamic("$")(x.asInstanceOf[js.Any])
}
