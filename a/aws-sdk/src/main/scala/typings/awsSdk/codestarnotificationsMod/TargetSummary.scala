package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetAddress] = js.undefined
  
  /**
    * The status of the target.
    */
  var TargetStatus: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetStatus] = js.undefined
  
  /**
    * The type of the target (for example, SNS).
    */
  var TargetType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetType] = js.undefined
}
object TargetSummary {
  
  inline def apply(): TargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSummary]
  }
  
  extension [Self <: TargetSummary](x: Self) {
    
    inline def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
    
    inline def setTargetAddressUndefined: Self = StObject.set(x, "TargetAddress", js.undefined)
    
    inline def setTargetStatus(value: TargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    inline def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
