package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.elevationMod.Elevation
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/card/card", "Card")
  @js.native
  class Card protected ()
    extends AbstractPureComponent2[ICardProps, js.Object, js.Object] {
    def this(props: ICardProps) = this()
    def this(props: ICardProps, context: js.Any) = this()
  }
  /* static members */
  object Card {
    
    @JSImport("@blueprintjs/core/lib/esm/components/card/card", "Card")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/card/card", "Card.defaultProps")
    @js.native
    def defaultProps: ICardProps = js.native
    @scala.inline
    def defaultProps_=(x: ICardProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/card/card", "Card.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait ICardProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Controls the intensity of the drop shadow beneath the card: the higher
      * the elevation, the higher the drop shadow. At elevation `0`, no drop
      * shadow is applied.
      *
      * @default 0
      */
    var elevation: js.UndefOr[Elevation] = js.native
    
    /**
      * Whether the card should respond to user interactions. If set to `true`,
      * hovering over the card will increase the card's elevation
      * and change the mouse cursor to a pointer.
      *
      * Recommended when `onClick` is also defined.
      *
      * @default false
      */
    var interactive: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback invoked when the card is clicked.
      * Recommended when `interactive` is `true`.
      */
    @JSName("onClick")
    var onClick_ICardProps: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  }
  object ICardProps {
    
    @scala.inline
    def apply(): ICardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardProps]
    }
    
    @scala.inline
    implicit class ICardPropsMutableBuilder[Self <: ICardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation(value: Elevation): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
