package typings.crc

import org.scalablytyped.runtime.Shortcut
import typings.crc.mjsTypesMod.CRCModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mjsCrc81wireMod extends Shortcut {
  
  @JSImport("crc/mjs/crc81wire", JSImport.Default)
  @js.native
  val default: CRCModule = js.native
  
  type _To = CRCModule
  
  /* This means you don't have to write `default`, but can instead just say `mjsCrc81wireMod.foo` */
  override def _to: CRCModule = default
}
