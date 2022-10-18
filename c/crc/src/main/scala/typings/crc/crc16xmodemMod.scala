package typings.crc

import org.scalablytyped.runtime.Shortcut
import typings.crc.mjsTypesMod.CRCModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object crc16xmodemMod extends Shortcut {
  
  @JSImport("crc/crc16xmodem", JSImport.Default)
  @js.native
  val default: CRCModule = js.native
  
  type _To = CRCModule
  
  /* This means you don't have to write `default`, but can instead just say `crc16xmodemMod.foo` */
  override def _to: CRCModule = default
}
