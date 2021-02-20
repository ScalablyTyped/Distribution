package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends StObject {
  
  /**
    * The location in the profiling graph that contains a recommendation found during analysis.
    */
  var frameAddress: js.UndefOr[String] = js.native
  
  /**
    * The target frame that triggered a match.
    */
  var targetFramesIndex: js.UndefOr[Integer] = js.native
  
  /**
    * The value in the profile data that exceeded the recommendation threshold.
    */
  var thresholdBreachValue: js.UndefOr[Double] = js.native
}
object Match {
  
  @scala.inline
  def apply(): Match = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameAddress(value: String): Self = StObject.set(x, "frameAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameAddressUndefined: Self = StObject.set(x, "frameAddress", js.undefined)
    
    @scala.inline
    def setTargetFramesIndex(value: Integer): Self = StObject.set(x, "targetFramesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFramesIndexUndefined: Self = StObject.set(x, "targetFramesIndex", js.undefined)
    
    @scala.inline
    def setThresholdBreachValue(value: Double): Self = StObject.set(x, "thresholdBreachValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdBreachValueUndefined: Self = StObject.set(x, "thresholdBreachValue", js.undefined)
  }
}
