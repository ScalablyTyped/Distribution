package typings.baseui

import typings.baseui.anon.`18`
import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.FocusOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalTypesMod {
  
  /* keyof baseui.anon.Backdrop */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.closeButton
    - typings.baseui.baseuiStrings.backdrop
    - typings.baseui.baseuiStrings.escape_
  */
  trait CloseSource extends StObject
  
  trait ModalOverrides extends StObject {
    
    var Close: js.UndefOr[Override[Any]] = js.undefined
    
    var Dialog: js.UndefOr[Override[Any]] = js.undefined
    
    var DialogContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ModalOverrides {
    
    inline def apply(): ModalOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalOverrides]
    }
    
    extension [Self <: ModalOverrides](x: Self) {
      
      inline def setClose(value: Override[Any]): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "Close", js.undefined)
      
      inline def setDialog(value: Override[Any]): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogContainer(value: Override[Any]): Self = StObject.set(x, "DialogContainer", value.asInstanceOf[js.Any])
      
      inline def setDialogContainerUndefined: Self = StObject.set(x, "DialogContainer", js.undefined)
      
      inline def setDialogUndefined: Self = StObject.set(x, "Dialog", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ModalProps extends StObject {
    
    /** Sets whether the Modal should be displayed by easing in and out */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** If true, focus will shift to the first interactive element within the modal.
      * If false, the modal container itself will receive focus.
      * Moving focus into a newly opened modal is important for accessibility purposes, so please be careful!
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Modal content. The children-as-function API may be preferable
      * for performance reasons (wont render until opened) */
    var children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    /** Whether the modal should be closeable by the user
      *  (either via escape, dialog container click, etc). You can set this to
      * false if your modal has an action that the user must take before closing.*/
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    /** If true, focus will be locked to elements within the modal.
      */
    var focusLock: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Where to mount the modal */
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /** A callback that is invoked when the modal will close.
      * Callback is passed a constant identifying what triggered the close. */
    var onClose: js.UndefOr[js.Function1[/* a */ `18`, Any]] = js.undefined
    
    var overrides: js.UndefOr[ModalOverrides] = js.undefined
    
    /**
      * if true, will return focus to the previous position on trap disable.
      * Optionally, can pass focus options instead of `true` to control the focus
      * more precisely (ie. `{ preventScroll: true }`)
      */
    var returnFocus: js.UndefOr[
        Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
      ] = js.undefined
    
    /** Which accessibility role this modal should have. */
    var role: js.UndefOr[RoleProp] = js.undefined
    
    /** Controls the size of the modal (primarily width).
      * Can be a SIZE constant or css width property value. */
    var size: js.UndefOr[SizeProp] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction0(value: () => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClose(value: /* a */ `18` => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOverrides(value: ModalOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setReturnFocus(value: Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusFunction1(value: /* returnTo */ Element => Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", js.Any.fromFunction1(value))
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setRole(value: RoleProp): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: SizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Inlined std.Omit<baseui.baseui/modal/types.ModalProps, 'children'> */
  trait ModalPropsWithoutChildren extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    var focusLock: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* a */ `18`, Any]] = js.undefined
    
    var overrides: js.UndefOr[ModalOverrides] = js.undefined
    
    var returnFocus: js.UndefOr[
        Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
      ] = js.undefined
    
    var role: js.UndefOr[RoleProp] = js.undefined
    
    var size: js.UndefOr[SizeProp] = js.undefined
  }
  object ModalPropsWithoutChildren {
    
    inline def apply(): ModalPropsWithoutChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalPropsWithoutChildren]
    }
    
    extension [Self <: ModalPropsWithoutChildren](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClose(value: /* a */ `18` => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOverrides(value: ModalOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setReturnFocus(value: Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusFunction1(value: /* returnTo */ Element => Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", js.Any.fromFunction1(value))
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setRole(value: RoleProp): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: SizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ModalState extends StObject {
    
    var isFocusVisible: Boolean
    
    var isVisible: Boolean
    
    var mounted: Boolean
  }
  object ModalState {
    
    inline def apply(isFocusVisible: Boolean, isVisible: Boolean, mounted: Boolean): ModalState = {
      val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalState]
    }
    
    extension [Self <: ModalState](x: Self) {
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Alertdialog */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.dialog
    - typings.baseui.baseuiStrings.alertdialog
  */
  trait Role extends StObject
  
  type RoleProp = Role | String
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$animate")
    var $animate: Boolean
    
    @JSName("$closeable")
    var $closeable: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isOpen")
    var $isOpen: Boolean
    
    @JSName("$isVisible")
    var $isVisible: Boolean
    
    @JSName("$role")
    var $role: RoleProp
    
    @JSName("$size")
    var $size: SizeProp
  }
  object SharedStylePropsArg {
    
    inline def apply(
      $animate: Boolean,
      $closeable: Boolean,
      $isFocusVisible: Boolean,
      $isOpen: Boolean,
      $isVisible: Boolean,
      $role: RoleProp,
      $size: SizeProp
    ): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($animate = $animate.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $role = $role.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$animate(value: Boolean): Self = StObject.set(x, "$animate", value.asInstanceOf[js.Any])
      
      inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
      
      inline def set$role(value: RoleProp): Self = StObject.set(x, "$role", value.asInstanceOf[js.Any])
      
      inline def set$size(value: SizeProp): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Auto */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.full
    - typings.baseui.baseuiStrings.auto
  */
  trait Size extends StObject
  
  type SizeProp = Size | Double | String
}
