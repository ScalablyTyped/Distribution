package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.LoadingComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined loading, showText, loadingText, loadingCompletedText */ @js.native
trait LoadingComponent
  extends StObject
     with Component {
  
  /**
    * The component displayed when the loading property is false
    */
  var component: Component = js.native
  
  /**
    * Whether to show the loading spinner instead of the contained component. True by default
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display while loading is set to false. Will also be announced through screen readers
    * once loading is completed.
    */
  var loadingCompletedText: js.UndefOr[String] = js.native
  
  /**
    * The text to display while loading is set to true
    */
  var loadingText: js.UndefOr[String] = js.native
  
  /**
    * Whether to show the loading text next to the spinner
    */
  var showText: js.UndefOr[Boolean] = js.native
}
