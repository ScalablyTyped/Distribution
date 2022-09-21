package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserEmbeddingExperienceConfiguration extends StObject {
  
  /**
    * The configuration details for providing a dashboard embedding experience.
    */
  var Dashboard: js.UndefOr[RegisteredUserDashboardEmbeddingConfiguration] = js.undefined
  
  /**
    * The type of embedding experience. In this case, Amazon QuickSight visuals.
    */
  var DashboardVisual: js.UndefOr[RegisteredUserDashboardVisualEmbeddingConfiguration] = js.undefined
  
  /**
    * The configuration details for embedding the Q search bar. For more information about embedding the Q search bar, see Embedding Overview in the Amazon QuickSight User Guide.
    */
  var QSearchBar: js.UndefOr[RegisteredUserQSearchBarEmbeddingConfiguration] = js.undefined
  
  /**
    * The configuration details for providing each Amazon QuickSight console embedding experience. This can be used along with custom permissions to restrict access to certain features. For more information, see Customizing Access to the Amazon QuickSight Console in the Amazon QuickSight User Guide. Use  GenerateEmbedUrlForRegisteredUser  where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to the author or admin security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile to the user with the  UpdateUser  API operation. Use the  RegisterUser  API operation to add a new user with a custom permission profile attached. For more information, see the following sections in the Amazon QuickSight User Guide:    Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users     Customizing Access to the Amazon QuickSight Console    For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  var QuickSightConsole: js.UndefOr[RegisteredUserQuickSightConsoleEmbeddingConfiguration] = js.undefined
}
object RegisteredUserEmbeddingExperienceConfiguration {
  
  inline def apply(): RegisteredUserEmbeddingExperienceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserEmbeddingExperienceConfiguration]
  }
  
  extension [Self <: RegisteredUserEmbeddingExperienceConfiguration](x: Self) {
    
    inline def setDashboard(value: RegisteredUserDashboardEmbeddingConfiguration): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    inline def setDashboardUndefined: Self = StObject.set(x, "Dashboard", js.undefined)
    
    inline def setDashboardVisual(value: RegisteredUserDashboardVisualEmbeddingConfiguration): Self = StObject.set(x, "DashboardVisual", value.asInstanceOf[js.Any])
    
    inline def setDashboardVisualUndefined: Self = StObject.set(x, "DashboardVisual", js.undefined)
    
    inline def setQSearchBar(value: RegisteredUserQSearchBarEmbeddingConfiguration): Self = StObject.set(x, "QSearchBar", value.asInstanceOf[js.Any])
    
    inline def setQSearchBarUndefined: Self = StObject.set(x, "QSearchBar", js.undefined)
    
    inline def setQuickSightConsole(value: RegisteredUserQuickSightConsoleEmbeddingConfiguration): Self = StObject.set(x, "QuickSightConsole", value.asInstanceOf[js.Any])
    
    inline def setQuickSightConsoleUndefined: Self = StObject.set(x, "QuickSightConsole", js.undefined)
  }
}
