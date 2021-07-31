package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2IntegrityAlgorithmsRequestListValue extends StObject {
  
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase2IntegrityAlgorithmsRequestListValue {
  
  @scala.inline
  def apply(): Phase2IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsRequestListValue]
  }
  
  @scala.inline
  implicit class Phase2IntegrityAlgorithmsRequestListValueMutableBuilder[Self <: Phase2IntegrityAlgorithmsRequestListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
