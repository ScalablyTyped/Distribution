package typings.crc

import typings.crc.typesMod.CRCCalculator
import typings.crc.typesMod.CRCModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defineCrcMod {
  
  @JSImport("crc/mjs/define_crc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(model: String, calculator: CRCCalculator[js.typedarray.Uint8Array]): CRCModule = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(model.asInstanceOf[js.Any], calculator.asInstanceOf[js.Any])).asInstanceOf[CRCModule]
}
