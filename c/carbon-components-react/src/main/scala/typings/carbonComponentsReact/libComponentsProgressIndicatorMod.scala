package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsProgressIndicatorProgressIndicatorMod.ProgressIndicatorProps
import typings.carbonComponentsReact.libComponentsProgressIndicatorProgressIndicatorMod.ProgressStepProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressIndicatorMod {
  
  @JSImport("carbon-components-react/lib/components/ProgressIndicator", "ProgressIndicator")
  @js.native
  open class ProgressIndicator protected ()
    extends typings.carbonComponentsReact.libComponentsProgressIndicatorProgressIndicatorMod.ProgressIndicator {
    def this(props: ProgressIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ProgressIndicatorProps, context: Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/ProgressIndicator", "ProgressStep")
  @js.native
  val ProgressStep: FC[ProgressStepProps] = js.native
}
