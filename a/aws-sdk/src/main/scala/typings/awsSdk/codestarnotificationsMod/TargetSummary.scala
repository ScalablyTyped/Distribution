package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetAddress] = js.native
  
  /**
    * The status of the target.
    */
  var TargetStatus: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetStatus] = js.native
  
  /**
    * The type of the target (for example, SNS).
    */
  var TargetType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetType] = js.native
}
object TargetSummary {
  
  @scala.inline
  def apply(): TargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSummary]
  }
  
  @scala.inline
  implicit class TargetSummaryMutableBuilder[Self <: TargetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAddressUndefined: Self = StObject.set(x, "TargetAddress", js.undefined)
    
    @scala.inline
    def setTargetStatus(value: TargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
