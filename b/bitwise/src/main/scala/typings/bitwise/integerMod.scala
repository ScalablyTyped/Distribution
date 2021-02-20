package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integerMod {
  
  object default {
    
    @JSImport("bitwise/esm/integer", "default.getBit")
    @js.native
    def getBit(int32: Double, position: Double): Bit = js.native
    
    @JSImport("bitwise/esm/integer", "default.setBit")
    @js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    
    @JSImport("bitwise/esm/integer", "default.toggleBit")
    @js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  @JSImport("bitwise/esm/integer", "getBit")
  @js.native
  def getBit(int32: Double, position: Double): Bit = js.native
  
  @JSImport("bitwise/esm/integer", "setBit")
  @js.native
  def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
  
  @JSImport("bitwise/esm/integer", "toggleBit")
  @js.native
  def toggleBit(int32: Double, position: Double): Double = js.native
}
