package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.ModalBodyProps
import typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.ModalFooterProps
import typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.ModalHeaderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsComposedModalMod {
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", JSImport.Default)
  @js.native
  open class default ()
    extends typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.default
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalBody")
  @js.native
  val ModalBody: FC[ModalBodyProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalFooter")
  @js.native
  open class ModalFooter protected ()
    extends typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.ModalFooter {
    def this(props: ModalFooterProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalFooterProps, context: Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/ComposedModal", "ModalHeader")
  @js.native
  open class ModalHeader protected ()
    extends typings.carbonComponentsReact.libComponentsComposedModalComposedModalMod.ModalHeader {
    def this(props: ModalHeaderProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalHeaderProps, context: Any) = this()
  }
}
