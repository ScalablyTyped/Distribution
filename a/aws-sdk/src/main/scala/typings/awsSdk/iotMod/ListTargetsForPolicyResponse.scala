package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsForPolicyResponse extends StObject {
  
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * The policy targets.
    */
  var targets: js.UndefOr[PolicyTargets] = js.native
}
object ListTargetsForPolicyResponse {
  
  @scala.inline
  def apply(): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
  
  @scala.inline
  implicit class ListTargetsForPolicyResponseMutableBuilder[Self <: ListTargetsForPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    @scala.inline
    def setTargets(value: PolicyTargets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: PolicyTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
