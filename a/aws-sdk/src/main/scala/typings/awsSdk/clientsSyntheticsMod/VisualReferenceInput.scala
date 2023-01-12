package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualReferenceInput extends StObject {
  
  /**
    * Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with this canary. Valid values are nextrun to use the screenshots from the next run after this update is made, lastrun to use the screenshots from the most recent run before this update was made, or the value of Id in the  CanaryRun from any past run of this canary.
    */
  var BaseCanaryRunId: String
  
  /**
    * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
    */
  var BaseScreenshots: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.BaseScreenshots] = js.undefined
}
object VisualReferenceInput {
  
  inline def apply(BaseCanaryRunId: String): VisualReferenceInput = {
    val __obj = js.Dynamic.literal(BaseCanaryRunId = BaseCanaryRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualReferenceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualReferenceInput] (val x: Self) extends AnyVal {
    
    inline def setBaseCanaryRunId(value: String): Self = StObject.set(x, "BaseCanaryRunId", value.asInstanceOf[js.Any])
    
    inline def setBaseScreenshots(value: BaseScreenshots): Self = StObject.set(x, "BaseScreenshots", value.asInstanceOf[js.Any])
    
    inline def setBaseScreenshotsUndefined: Self = StObject.set(x, "BaseScreenshots", js.undefined)
    
    inline def setBaseScreenshotsVarargs(value: BaseScreenshot*): Self = StObject.set(x, "BaseScreenshots", js.Array(value*))
  }
}
