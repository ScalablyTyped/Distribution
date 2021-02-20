package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase1IntegrityAlgorithmsListValue extends StObject {
  
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}
object Phase1IntegrityAlgorithmsListValue {
  
  @scala.inline
  def apply(): Phase1IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsListValue]
  }
  
  @scala.inline
  implicit class Phase1IntegrityAlgorithmsListValueMutableBuilder[Self <: Phase1IntegrityAlgorithmsListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
