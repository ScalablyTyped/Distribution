package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotMigration extends StObject {
  
  /**
    * The percentage of the slot migration that is complete.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.native
}
object SlotMigration {
  
  @scala.inline
  def apply(): SlotMigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotMigration]
  }
  
  @scala.inline
  implicit class SlotMigrationMutableBuilder[Self <: SlotMigration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressPercentage(value: Double): Self = StObject.set(x, "ProgressPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentageUndefined: Self = StObject.set(x, "ProgressPercentage", js.undefined)
  }
}
