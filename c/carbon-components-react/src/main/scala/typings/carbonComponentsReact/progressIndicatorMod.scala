package typings.carbonComponentsReact

import typings.carbonComponentsReact.progressIndicatorProgressIndicatorMod.ProgressIndicatorProps
import typings.carbonComponentsReact.progressIndicatorProgressIndicatorMod.ProgressStepProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorMod {
  
  @JSImport("carbon-components-react/lib/components/ProgressIndicator", "ProgressIndicator")
  @js.native
  open class ProgressIndicator protected ()
    extends typings.carbonComponentsReact.progressIndicatorProgressIndicatorMod.ProgressIndicator {
    def this(props: ProgressIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressIndicatorProps, context: Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/ProgressIndicator", "ProgressStep")
  @js.native
  val ProgressStep: FC[ProgressStepProps] = js.native
}
