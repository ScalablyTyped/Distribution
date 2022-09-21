package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummarizedAttackVector extends StObject {
  
  /**
    * The list of counters that describe the details of the attack.
    */
  var VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
  
  /**
    * The attack type, for example, SNMP reflection or SYN flood.
    */
  var VectorType: String
}
object SummarizedAttackVector {
  
  inline def apply(VectorType: String): SummarizedAttackVector = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummarizedAttackVector]
  }
  
  extension [Self <: SummarizedAttackVector](x: Self) {
    
    inline def setVectorCounters(value: SummarizedCounterList): Self = StObject.set(x, "VectorCounters", value.asInstanceOf[js.Any])
    
    inline def setVectorCountersUndefined: Self = StObject.set(x, "VectorCounters", js.undefined)
    
    inline def setVectorCountersVarargs(value: SummarizedCounter*): Self = StObject.set(x, "VectorCounters", js.Array(value*))
    
    inline def setVectorType(value: String): Self = StObject.set(x, "VectorType", value.asInstanceOf[js.Any])
  }
}
