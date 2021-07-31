package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewPolicy extends StObject {
  
  /**
    * Name of the parameter from the Review policy.
    */
  var Parameters: js.UndefOr[PolicyParameterList] = js.undefined
  
  /**
    *  Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01 
    */
  var PolicyName: String
}
object ReviewPolicy {
  
  @scala.inline
  def apply(PolicyName: String): ReviewPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPolicy]
  }
  
  @scala.inline
  implicit class ReviewPolicyMutableBuilder[Self <: ReviewPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PolicyParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: PolicyParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
