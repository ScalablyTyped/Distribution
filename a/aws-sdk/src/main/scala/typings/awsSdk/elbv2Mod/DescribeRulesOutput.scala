package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRulesOutput extends StObject {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.native
}
object DescribeRulesOutput {
  
  @scala.inline
  def apply(): DescribeRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRulesOutput]
  }
  
  @scala.inline
  implicit class DescribeRulesOutputMutableBuilder[Self <: DescribeRulesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
