package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPU extends StObject {
  
  /**
    * The CPU's architecture (for example, x86 or ARM).
    */
  var architecture: js.UndefOr[String] = js.native
  
  /**
    * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as 1200000000.
    */
  var clock: js.UndefOr[Double] = js.native
  
  /**
    * The CPU's frequency.
    */
  var frequency: js.UndefOr[String] = js.native
}
object CPU {
  
  @scala.inline
  def apply(): CPU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPU]
  }
  
  @scala.inline
  implicit class CPUMutableBuilder[Self <: CPU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setClock(value: Double): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    @scala.inline
    def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
