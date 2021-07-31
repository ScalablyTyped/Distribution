package typings.carbonComponentsReact

import typings.carbonComponentsReact.composedModalComposedModalMod.ModalBodyProps
import typings.carbonComponentsReact.composedModalComposedModalMod.ModalFooterProps
import typings.carbonComponentsReact.composedModalComposedModalMod.ModalHeaderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composedModalMod {
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", JSImport.Default)
  @js.native
  class default ()
    extends typings.carbonComponentsReact.composedModalComposedModalMod.default
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalBody")
  @js.native
  val ModalBody: FC[ModalBodyProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalFooter")
  @js.native
  class ModalFooter protected ()
    extends typings.carbonComponentsReact.composedModalComposedModalMod.ModalFooter {
    def this(props: ModalFooterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalFooterProps, context: js.Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalHeader")
  @js.native
  class ModalHeader protected ()
    extends typings.carbonComponentsReact.composedModalComposedModalMod.ModalHeader {
    def this(props: ModalHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalHeaderProps, context: js.Any) = this()
  }
}
