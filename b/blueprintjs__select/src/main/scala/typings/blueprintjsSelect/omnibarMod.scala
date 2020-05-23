package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIOverlayProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/omnibar/omnibar", JSImport.Namespace)
@js.native
object omnibarMod extends js.Object {
  @js.native
  trait IOmnibarProps[T] extends IListItemsProps[T] {
    /**
      * Props to spread to the query `InputGroup`. Use `query` and
      * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
      * to control this input.
      */
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    /**
      * Toggles the visibility of the omnibar.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean = js.native
    /**
      * A callback that is invoked when user interaction causes the omnibar to
      * close, such as clicking on the overlay or pressing the `esc` key (if
      * enabled). Receives the event from the user's interaction, if there was an
      * event (generally either a mouse or key event).
      *
      * Note that due to controlled usage, this component will not actually close
      * itself until the `isOpen` prop becomes `false`.
      * .
      */
    var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
    /** Props to spread to `Overlay`. */
    var overlayProps: js.UndefOr[PartialIOverlayProps] = js.native
  }
  
  @js.native
  class Omnibar[T] ()
    extends Component[IOmnibarProps[T], js.Object, js.Any] {
    var TypedQueryList: js.Any = js.native
    var handleOverlayClose: js.Any = js.native
    var renderQueryList: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ IOmnibarProps[T], Omnibar[T]] = js.native
  }
  
}

