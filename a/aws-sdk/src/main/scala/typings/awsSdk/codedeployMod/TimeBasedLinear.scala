package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeBasedLinear extends StObject {
  
  /**
    * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
    */
  var linearInterval: js.UndefOr[WaitTimeInMins] = js.native
  
  /**
    * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
    */
  var linearPercentage: js.UndefOr[Percentage] = js.native
}
object TimeBasedLinear {
  
  @scala.inline
  def apply(): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedLinear]
  }
  
  @scala.inline
  implicit class TimeBasedLinearMutableBuilder[Self <: TimeBasedLinear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinearInterval(value: WaitTimeInMins): Self = StObject.set(x, "linearInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearIntervalUndefined: Self = StObject.set(x, "linearInterval", js.undefined)
    
    @scala.inline
    def setLinearPercentage(value: Percentage): Self = StObject.set(x, "linearPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearPercentageUndefined: Self = StObject.set(x, "linearPercentage", js.undefined)
  }
}
