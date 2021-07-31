package typings.confirmdialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object options {
  
  trait buttonOptionss extends StObject {
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object buttonOptionss {
    
    @scala.inline
    def apply(): buttonOptionss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[buttonOptionss]
    }
    
    @scala.inline
    implicit class buttonOptionssMutableBuilder[Self <: buttonOptionss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setConfirm(value: () => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    }
  }
  
  trait confirmOptions extends StObject {
    
    var autoClose: js.UndefOr[String] = js.undefined
    
    var backgroundDismiss: js.UndefOr[js.Any] = js.undefined
    
    var backgroundDismissAnimation: js.UndefOr[String] = js.undefined
    
    var bootstrapClasses: js.UndefOr[js.Any] = js.undefined
    
    var boxWidth: js.UndefOr[String] = js.undefined
    
    var buttons: js.UndefOr[js.Any] = js.undefined
    
    var closeIcon: js.UndefOr[js.Any] = js.undefined
    
    var closeIconClass: js.UndefOr[String] = js.undefined
    
    var columnClass: js.UndefOr[String] = js.undefined
    
    var containerFluid: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[js.Any] = js.undefined
    
    var contentLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var dragWindowBorder: js.UndefOr[Boolean] = js.undefined
    
    var dragWindowGap: js.UndefOr[Double] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var escapeKey: js.UndefOr[String | Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var lazyOpen: js.UndefOr[Boolean] = js.undefined
    
    var onAction: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContentReady: js.UndefOr[js.Any] = js.undefined
    
    var onDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpenBefore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[String | Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeAnimated: js.UndefOr[Boolean] = js.undefined
    
    var useBootstrap: js.UndefOr[Boolean] = js.undefined
  }
  object confirmOptions {
    
    @scala.inline
    def apply(): confirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[confirmOptions]
    }
    
    @scala.inline
    implicit class confirmOptionsMutableBuilder[Self <: confirmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: String): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBackgroundDismiss(value: js.Any): Self = StObject.set(x, "backgroundDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundDismissAnimation(value: String): Self = StObject.set(x, "backgroundDismissAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundDismissAnimationUndefined: Self = StObject.set(x, "backgroundDismissAnimation", js.undefined)
      
      @scala.inline
      def setBackgroundDismissUndefined: Self = StObject.set(x, "backgroundDismiss", js.undefined)
      
      @scala.inline
      def setBootstrapClasses(value: js.Any): Self = StObject.set(x, "bootstrapClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapClassesUndefined: Self = StObject.set(x, "bootstrapClasses", js.undefined)
      
      @scala.inline
      def setBoxWidth(value: String): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: js.Any): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconClass(value: String): Self = StObject.set(x, "closeIconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconClassUndefined: Self = StObject.set(x, "closeIconClass", js.undefined)
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setColumnClass(value: String): Self = StObject.set(x, "columnClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnClassUndefined: Self = StObject.set(x, "columnClass", js.undefined)
      
      @scala.inline
      def setContainerFluid(value: Boolean): Self = StObject.set(x, "containerFluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFluidUndefined: Self = StObject.set(x, "containerFluid", js.undefined)
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLoaded(value: () => Unit): Self = StObject.set(x, "contentLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentLoadedUndefined: Self = StObject.set(x, "contentLoaded", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDragWindowBorder(value: Boolean): Self = StObject.set(x, "dragWindowBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragWindowBorderUndefined: Self = StObject.set(x, "dragWindowBorder", js.undefined)
      
      @scala.inline
      def setDragWindowGap(value: Double): Self = StObject.set(x, "dragWindowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragWindowGapUndefined: Self = StObject.set(x, "dragWindowGap", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEscapeKey(value: String | Boolean): Self = StObject.set(x, "escapeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeKeyUndefined: Self = StObject.set(x, "escapeKey", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLazyOpen(value: Boolean): Self = StObject.set(x, "lazyOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyOpenUndefined: Self = StObject.set(x, "lazyOpen", js.undefined)
      
      @scala.inline
      def setOnAction(value: () => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnContentReady(value: js.Any): Self = StObject.set(x, "onContentReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
      
      @scala.inline
      def setOnDestroy(value: () => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenBefore(value: () => Unit): Self = StObject.set(x, "onOpenBefore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenBeforeUndefined: Self = StObject.set(x, "onOpenBefore", js.undefined)
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAnimated(value: Boolean): Self = StObject.set(x, "typeAnimated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAnimatedUndefined: Self = StObject.set(x, "typeAnimated", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseBootstrap(value: Boolean): Self = StObject.set(x, "useBootstrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBootstrapUndefined: Self = StObject.set(x, "useBootstrap", js.undefined)
    }
  }
}
