package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryLastRun extends StObject {
  
  /**
    * The name of the canary.
    */
  var CanaryName: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryName] = js.native
  
  /**
    * The results from this canary's most recent run.
    */
  var LastRun: js.UndefOr[CanaryRun] = js.native
}
object CanaryLastRun {
  
  @scala.inline
  def apply(): CanaryLastRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryLastRun]
  }
  
  @scala.inline
  implicit class CanaryLastRunMutableBuilder[Self <: CanaryLastRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanaryName(value: CanaryName): Self = StObject.set(x, "CanaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanaryNameUndefined: Self = StObject.set(x, "CanaryName", js.undefined)
    
    @scala.inline
    def setLastRun(value: CanaryRun): Self = StObject.set(x, "LastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunUndefined: Self = StObject.set(x, "LastRun", js.undefined)
  }
}
