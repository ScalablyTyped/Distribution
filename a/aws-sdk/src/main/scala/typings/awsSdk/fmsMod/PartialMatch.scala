package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialMatch extends StObject {
  
  /**
    * The reference rule from the master security group of the AWS Firewall Manager policy.
    */
  var Reference: js.UndefOr[ReferenceRule] = js.undefined
  
  /**
    * The violation reason.
    */
  var TargetViolationReasons: js.UndefOr[typings.awsSdk.fmsMod.TargetViolationReasons] = js.undefined
}
object PartialMatch {
  
  inline def apply(): PartialMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatch]
  }
  
  extension [Self <: PartialMatch](x: Self) {
    
    inline def setReference(value: ReferenceRule): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "Reference", js.undefined)
    
    inline def setTargetViolationReasons(value: TargetViolationReasons): Self = StObject.set(x, "TargetViolationReasons", value.asInstanceOf[js.Any])
    
    inline def setTargetViolationReasonsUndefined: Self = StObject.set(x, "TargetViolationReasons", js.undefined)
    
    inline def setTargetViolationReasonsVarargs(value: TargetViolationReason*): Self = StObject.set(x, "TargetViolationReasons", js.Array(value :_*))
  }
}
