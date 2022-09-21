package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserQSearchBarEmbeddingConfiguration extends StObject {
  
  /**
    * The ID of the Q topic that you want to make the starting topic in the Q search bar. You can find a topic ID by navigating to the Topics pane in the Amazon QuickSight application and opening a topic. The ID is in the URL for the topic that you open. If you don't specify an initial topic, a list of all shared topics is shown in the Q bar for your readers. When you select an initial topic, you can specify whether or not readers are allowed to select other topics from the available ones in the list.
    */
  var InitialTopicId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object RegisteredUserQSearchBarEmbeddingConfiguration {
  
  inline def apply(): RegisteredUserQSearchBarEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserQSearchBarEmbeddingConfiguration]
  }
  
  extension [Self <: RegisteredUserQSearchBarEmbeddingConfiguration](x: Self) {
    
    inline def setInitialTopicId(value: RestrictiveResourceId): Self = StObject.set(x, "InitialTopicId", value.asInstanceOf[js.Any])
    
    inline def setInitialTopicIdUndefined: Self = StObject.set(x, "InitialTopicId", js.undefined)
  }
}
