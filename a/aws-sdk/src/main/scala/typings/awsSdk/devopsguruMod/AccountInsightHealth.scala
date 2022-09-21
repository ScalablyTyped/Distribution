package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInsightHealth extends StObject {
  
  /**
    * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
    */
  var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined
  
  /**
    * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
    */
  var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
}
object AccountInsightHealth {
  
  inline def apply(): AccountInsightHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInsightHealth]
  }
  
  extension [Self <: AccountInsightHealth](x: Self) {
    
    inline def setOpenProactiveInsights(value: NumOpenProactiveInsights): Self = StObject.set(x, "OpenProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenProactiveInsightsUndefined: Self = StObject.set(x, "OpenProactiveInsights", js.undefined)
    
    inline def setOpenReactiveInsights(value: NumOpenReactiveInsights): Self = StObject.set(x, "OpenReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenReactiveInsightsUndefined: Self = StObject.set(x, "OpenReactiveInsights", js.undefined)
  }
}
