package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase2IntegrityAlgorithmsListValue extends StObject {
  
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}
object Phase2IntegrityAlgorithmsListValue {
  
  @scala.inline
  def apply(): Phase2IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsListValue]
  }
  
  @scala.inline
  implicit class Phase2IntegrityAlgorithmsListValueMutableBuilder[Self <: Phase2IntegrityAlgorithmsListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
