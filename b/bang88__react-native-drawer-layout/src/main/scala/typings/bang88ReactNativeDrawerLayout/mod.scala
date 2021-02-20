package typings.bang88ReactNativeDrawerLayout

import typings.bang88ReactNativeDrawerLayout.anon.Left
import typings.bang88ReactNativeDrawerLayout.anon.Offset
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.`locked-closed`
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.`locked-open`
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.`on-drag`
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.left
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.none
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.right
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.unlocked
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@bang88/react-native-drawer-layout", JSImport.Default)
  @js.native
  class default () extends DrawerLayout
  /* static members */
  object default {
    
    @JSImport("@bang88/react-native-drawer-layout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@bang88/react-native-drawer-layout", "default.positions")
    @js.native
    def positions: Left = js.native
    @scala.inline
    def positions_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positions")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DrawerLayout
    extends Component[DrawerLayoutProperties, js.Object, js.Any] {
    
    /**
      * Closes the drawer.
      */
    def closeDrawer(): Unit = js.native
    
    /**
      * Opens the drawer.
      */
    def openDrawer(): Unit = js.native
  }
  
  type DrawerLayoutCloseEventHandler = js.Function0[Unit]
  
  type DrawerLayoutOpenEventHandler = js.Function0[Unit]
  
  @js.native
  trait DrawerLayoutProperties extends ViewProps {
    
    /**
      * Child content.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Specifies the background color of the drawer. The default value is white. If you want to set
      * the opacity of the drawer, use rgba.
      */
    var drawerBackgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Specifies the lock mode of the drawer. The drawer can be locked in 3 states:
      *
      * - unlocked (default), meaning that the drawer will respond (open/close) to touch gestures.
      * - locked-closed, meaning that the drawer will stay closed and not respond to gestures.
      * - locked-open, meaning that the drawer will stay opened and not respond to gestures.
      *
      * The drawer may still be opened and closed programmatically (`openDrawer`/`closeDrawer`).
      */
    var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
    
    /**
      * Specifies the side of the screen from which the drawer will slide in.
      */
    var drawerPosition: left | right = js.native
    
    /**
      * Specifies the width of the drawer, more precisely the width of the view that be pulled in from
      * the edge of the window.
      */
    var drawerWidth: Double = js.native
    
    /**
      * Determines whether the keyboard gets dismissed in response to a drag.
      *
      * - 'none' (the default), drags do not dismiss the keyboard.
      * - 'on-drag', the keyboard is dismissed when a drag begins.
      */
    var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
    
    /**
      * Function called whenever the navigation view has been closed.
      */
    var onDrawerClose: js.UndefOr[DrawerLayoutCloseEventHandler] = js.native
    
    /**
      * Function called whenever the navigation view has been opened.
      */
    var onDrawerOpen: js.UndefOr[DrawerLayoutOpenEventHandler] = js.native
    
    /**
      * Function called whenever there is an interaction with the navigation view.
      */
    var onDrawerSlide: js.UndefOr[DrawerLayoutSlideEventHandler] = js.native
    
    /**
      * Function called when the drawer state has changed. The drawer can be in 3 states:
      *
      * - idle, meaning there is no interaction with the navigation view happening at the time
      * - dragging, meaning there is currently an interaction with the navigation view
      * - settling, meaning that there was an interaction with the navigation view, and the navigation
      *   view is now finishing its closing or opening animation
      */
    var onDrawerStateChanged: js.UndefOr[DrawerLayoutStateChangeEventHandler] = js.native
    
    /**
      * The navigation view that will be rendered to the side of the screen and can be pulled in.
      */
    var renderNavigationView: ReactNode = js.native
    
    /**
      * Make the drawer take the entire screen and draw the background of the status bar to allow it
      * to open over the status bar. It will only have an effect on API 21+.
      */
    var statusBarBackgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Use native driver animations.
      */
    var useNativeAnimations: js.UndefOr[Boolean] = js.native
  }
  object DrawerLayoutProperties {
    
    @scala.inline
    def apply(drawerPosition: left | right, drawerWidth: Double): DrawerLayoutProperties = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLayoutProperties]
    }
    
    @scala.inline
    implicit class DrawerLayoutPropertiesMutableBuilder[Self <: DrawerLayoutProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      @scala.inline
      def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      @scala.inline
      def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      @scala.inline
      def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      @scala.inline
      def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      @scala.inline
      def setOnDrawerSlide(value: /* event */ DrawerLayoutSlideEvent => Unit): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDrawerSlideUndefined: Self = StObject.set(x, "onDrawerSlide", js.undefined)
      
      @scala.inline
      def setOnDrawerStateChanged(value: /* state */ String => Unit): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
      
      @scala.inline
      def setRenderNavigationView(value: ReactNode): Self = StObject.set(x, "renderNavigationView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderNavigationViewUndefined: Self = StObject.set(x, "renderNavigationView", js.undefined)
      
      @scala.inline
      def setStatusBarBackgroundColor(value: String): Self = StObject.set(x, "statusBarBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarBackgroundColorUndefined: Self = StObject.set(x, "statusBarBackgroundColor", js.undefined)
      
      @scala.inline
      def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
    }
  }
  
  @js.native
  trait DrawerLayoutSlideEvent extends StObject {
    
    var nativeEvent: Offset = js.native
  }
  object DrawerLayoutSlideEvent {
    
    @scala.inline
    def apply(nativeEvent: Offset): DrawerLayoutSlideEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLayoutSlideEvent]
    }
    
    @scala.inline
    implicit class DrawerLayoutSlideEventMutableBuilder[Self <: DrawerLayoutSlideEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: Offset): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type DrawerLayoutSlideEventHandler = js.Function1[/* event */ DrawerLayoutSlideEvent, Unit]
  
  type DrawerLayoutStateChangeEventHandler = js.Function1[/* state */ String, Unit]
}
