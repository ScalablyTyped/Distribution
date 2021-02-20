package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySchedule extends StObject {
  
  /**
    * Specifies how frequently inventory results are produced.
    */
  var Frequency: InventoryFrequency = js.native
}
object InventorySchedule {
  
  @scala.inline
  def apply(Frequency: InventoryFrequency): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  
  @scala.inline
  implicit class InventoryScheduleMutableBuilder[Self <: InventorySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: InventoryFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
  }
}
