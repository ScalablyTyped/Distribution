package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserQuickSightConsoleEmbeddingConfiguration extends StObject {
  
  /**
    * The initial URL path for the Amazon QuickSight console. InitialPath is required. The entry point URL is constrained to the following paths:    /start     /start/analyses     /start/dashboards     /start/favorites     /dashboards/DashboardId. DashboardId is the actual ID key from the Amazon QuickSight console URL of the dashboard.    /analyses/AnalysisId. AnalysisId is the actual ID key from the Amazon QuickSight console URL of the analysis.  
    */
  var InitialPath: js.UndefOr[EntryPath] = js.undefined
}
object RegisteredUserQuickSightConsoleEmbeddingConfiguration {
  
  inline def apply(): RegisteredUserQuickSightConsoleEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserQuickSightConsoleEmbeddingConfiguration]
  }
  
  extension [Self <: RegisteredUserQuickSightConsoleEmbeddingConfiguration](x: Self) {
    
    inline def setInitialPath(value: EntryPath): Self = StObject.set(x, "InitialPath", value.asInstanceOf[js.Any])
    
    inline def setInitialPathUndefined: Self = StObject.set(x, "InitialPath", js.undefined)
  }
}
