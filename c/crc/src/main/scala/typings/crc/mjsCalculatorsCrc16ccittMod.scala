package typings.crc

import org.scalablytyped.runtime.Shortcut
import typings.crc.mjsTypesMod.CRCCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mjsCalculatorsCrc16ccittMod extends Shortcut {
  
  @JSImport("crc/mjs/calculators/crc16ccitt", JSImport.Default)
  @js.native
  val default: CRCCalculator[js.typedarray.Uint8Array] = js.native
  
  type _To = CRCCalculator[js.typedarray.Uint8Array]
  
  /* This means you don't have to write `default`, but can instead just say `mjsCalculatorsCrc16ccittMod.foo` */
  override def _to: CRCCalculator[js.typedarray.Uint8Array] = default
}
