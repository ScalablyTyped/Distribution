package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummarizedAttackVector extends StObject {
  
  /**
    * The list of counters that describe the details of the attack.
    */
  var VectorCounters: js.UndefOr[SummarizedCounterList] = js.native
  
  /**
    * The attack type, for example, SNMP reflection or SYN flood.
    */
  var VectorType: String = js.native
}
object SummarizedAttackVector {
  
  @scala.inline
  def apply(VectorType: String): SummarizedAttackVector = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummarizedAttackVector]
  }
  
  @scala.inline
  implicit class SummarizedAttackVectorMutableBuilder[Self <: SummarizedAttackVector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVectorCounters(value: SummarizedCounterList): Self = StObject.set(x, "VectorCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorCountersUndefined: Self = StObject.set(x, "VectorCounters", js.undefined)
    
    @scala.inline
    def setVectorCountersVarargs(value: SummarizedCounter*): Self = StObject.set(x, "VectorCounters", js.Array(value :_*))
    
    @scala.inline
    def setVectorType(value: String): Self = StObject.set(x, "VectorType", value.asInstanceOf[js.Any])
  }
}
