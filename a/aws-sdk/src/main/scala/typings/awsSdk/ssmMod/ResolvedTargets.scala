package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedTargets extends StObject {
  
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.undefined
  
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}
object ResolvedTargets {
  
  @scala.inline
  def apply(): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedTargets]
  }
  
  @scala.inline
  implicit class ResolvedTargetsMutableBuilder[Self <: ResolvedTargets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterValues(value: TargetParameterList): Self = StObject.set(x, "ParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValuesUndefined: Self = StObject.set(x, "ParameterValues", js.undefined)
    
    @scala.inline
    def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "ParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
