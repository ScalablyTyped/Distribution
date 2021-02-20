package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIOverlayProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import typings.react.mod.PureComponent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omnibarMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/omnibar/omnibar", "Omnibar")
  @js.native
  class Omnibar[T] protected ()
    extends PureComponent[IOmnibarProps[T], js.Object, js.Any] {
    def this(props: IOmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOmnibarProps[T], context: js.Any) = this()
    
    var TypedQueryList: js.Any = js.native
    
    var handleOverlayClose: js.Any = js.native
    
    var renderQueryList: js.Any = js.native
  }
  /* static members */
  object Omnibar {
    
    @JSImport("@blueprintjs/select/lib/esm/components/omnibar/omnibar", "Omnibar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/omnibar/omnibar", "Omnibar.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/omnibar/omnibar", "Omnibar.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ IOmnibarProps[U], Omnibar[U]] = js.native
  }
  
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
}
