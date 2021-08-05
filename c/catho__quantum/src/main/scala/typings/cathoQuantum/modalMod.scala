package typings.cathoQuantum

import typings.cathoQuantum.anon.BreakpointsColors
import typings.cathoQuantum.anon.`1`
import typings.cathoQuantum.footerMod.Footer
import typings.cathoQuantum.headerTextMod.HeaderText
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Modal", "default.Content")
    @js.native
    def Content: ModalContent = js.native
    inline def Content_=(x: ModalContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Footer")
    @js.native
    def Footer: typings.cathoQuantum.footerMod.Footer = js.native
    inline def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Modal", "default.Header")
    @js.native
    def Header: ModalHeader = js.native
    
    @JSImport("@catho/quantum/Modal", "default.HeaderText")
    @js.native
    def HeaderText: typings.cathoQuantum.headerTextMod.HeaderText = js.native
    inline def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    inline def Header_=(x: ModalHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  }
  
  type Modal = Component[ModalProps, js.Object, js.Any]
  
  type ModalContent = ComponentType[StaticProps]
  
  type ModalHeader = ComponentType[StaticProps]
  
  trait ModalProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[BreakpointsColors] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setTheme(value: BreakpointsColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait StaticProps extends StObject {
    
    var theme: js.UndefOr[`1`] = js.undefined
  }
  object StaticProps {
    
    inline def apply(): StaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticProps]
    }
    
    extension [Self <: StaticProps](x: Self) {
      
      inline def setTheme(value: `1`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
