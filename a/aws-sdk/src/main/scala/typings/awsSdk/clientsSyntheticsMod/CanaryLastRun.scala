package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryLastRun extends StObject {
  
  /**
    * The name of the canary.
    */
  var CanaryName: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.CanaryName] = js.undefined
  
  /**
    * The results from this canary's most recent run.
    */
  var LastRun: js.UndefOr[CanaryRun] = js.undefined
}
object CanaryLastRun {
  
  inline def apply(): CanaryLastRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryLastRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanaryLastRun] (val x: Self) extends AnyVal {
    
    inline def setCanaryName(value: CanaryName): Self = StObject.set(x, "CanaryName", value.asInstanceOf[js.Any])
    
    inline def setCanaryNameUndefined: Self = StObject.set(x, "CanaryName", js.undefined)
    
    inline def setLastRun(value: CanaryRun): Self = StObject.set(x, "LastRun", value.asInstanceOf[js.Any])
    
    inline def setLastRunUndefined: Self = StObject.set(x, "LastRun", js.undefined)
  }
}
