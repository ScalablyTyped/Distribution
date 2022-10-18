package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualReferenceOutput extends StObject {
  
  /**
    * The ID of the canary run that produced the baseline screenshots that are used for visual monitoring comparisons by this canary.
    */
  var BaseCanaryRunId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
    */
  var BaseScreenshots: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.BaseScreenshots] = js.undefined
}
object VisualReferenceOutput {
  
  inline def apply(): VisualReferenceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualReferenceOutput]
  }
  
  extension [Self <: VisualReferenceOutput](x: Self) {
    
    inline def setBaseCanaryRunId(value: String): Self = StObject.set(x, "BaseCanaryRunId", value.asInstanceOf[js.Any])
    
    inline def setBaseCanaryRunIdUndefined: Self = StObject.set(x, "BaseCanaryRunId", js.undefined)
    
    inline def setBaseScreenshots(value: BaseScreenshots): Self = StObject.set(x, "BaseScreenshots", value.asInstanceOf[js.Any])
    
    inline def setBaseScreenshotsUndefined: Self = StObject.set(x, "BaseScreenshots", js.undefined)
    
    inline def setBaseScreenshotsVarargs(value: BaseScreenshot*): Self = StObject.set(x, "BaseScreenshots", js.Array(value*))
  }
}
