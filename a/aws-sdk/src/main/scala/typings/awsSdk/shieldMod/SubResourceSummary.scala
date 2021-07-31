package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubResourceSummary extends StObject {
  
  /**
    * The list of attack types and associated counters.
    */
  var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined
  
  /**
    * The counters that describe the details of the attack.
    */
  var Counters: js.UndefOr[SummarizedCounterList] = js.undefined
  
  /**
    * The unique identifier (ID) of the SubResource.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The SubResource type.
    */
  var Type: js.UndefOr[SubResourceType] = js.undefined
}
object SubResourceSummary {
  
  @scala.inline
  def apply(): SubResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubResourceSummary]
  }
  
  @scala.inline
  implicit class SubResourceSummaryMutableBuilder[Self <: SubResourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackVectors(value: SummarizedAttackVectorList): Self = StObject.set(x, "AttackVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackVectorsUndefined: Self = StObject.set(x, "AttackVectors", js.undefined)
    
    @scala.inline
    def setAttackVectorsVarargs(value: SummarizedAttackVector*): Self = StObject.set(x, "AttackVectors", js.Array(value :_*))
    
    @scala.inline
    def setCounters(value: SummarizedCounterList): Self = StObject.set(x, "Counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersUndefined: Self = StObject.set(x, "Counters", js.undefined)
    
    @scala.inline
    def setCountersVarargs(value: SummarizedCounter*): Self = StObject.set(x, "Counters", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setType(value: SubResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
