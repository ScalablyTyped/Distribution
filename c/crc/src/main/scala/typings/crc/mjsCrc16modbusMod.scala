package typings.crc

import org.scalablytyped.runtime.Shortcut
import typings.crc.typesMod.CRCModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mjsCrc16modbusMod extends Shortcut {
  
  @JSImport("crc/mjs/crc16modbus", JSImport.Default)
  @js.native
  val default: CRCModule = js.native
  
  type _To = CRCModule
  
  /* This means you don't have to write `default`, but can instead just say `mjsCrc16modbusMod.foo` */
  override def _to: CRCModule = default
}
