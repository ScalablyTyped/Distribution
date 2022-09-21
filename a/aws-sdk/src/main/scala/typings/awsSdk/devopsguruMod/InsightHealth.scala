package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightHealth extends StObject {
  
  /**
    *  The Meant Time to Recover (MTTR) for the insight. 
    */
  var MeanTimeToRecoverInMilliseconds: js.UndefOr[typings.awsSdk.devopsguruMod.MeanTimeToRecoverInMilliseconds] = js.undefined
  
  /**
    *  The number of open proactive insights. 
    */
  var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined
  
  /**
    *  The number of open reactive insights. 
    */
  var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
}
object InsightHealth {
  
  inline def apply(): InsightHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightHealth]
  }
  
  extension [Self <: InsightHealth](x: Self) {
    
    inline def setMeanTimeToRecoverInMilliseconds(value: MeanTimeToRecoverInMilliseconds): Self = StObject.set(x, "MeanTimeToRecoverInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setMeanTimeToRecoverInMillisecondsUndefined: Self = StObject.set(x, "MeanTimeToRecoverInMilliseconds", js.undefined)
    
    inline def setOpenProactiveInsights(value: NumOpenProactiveInsights): Self = StObject.set(x, "OpenProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenProactiveInsightsUndefined: Self = StObject.set(x, "OpenProactiveInsights", js.undefined)
    
    inline def setOpenReactiveInsights(value: NumOpenReactiveInsights): Self = StObject.set(x, "OpenReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenReactiveInsightsUndefined: Self = StObject.set(x, "OpenReactiveInsights", js.undefined)
  }
}
