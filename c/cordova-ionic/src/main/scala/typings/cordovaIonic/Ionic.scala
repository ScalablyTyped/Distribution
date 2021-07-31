package typings.cordovaIonic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ionic {
  
  trait Keyboard extends StObject {
    
    /**
      * Close the keyboard if it is open.
      */
    def close(): Unit
    
    /**
      * Disable native scrolling, useful if you are using JavaScript to scroll
      *
      * @param disbale
      */
    def disableScroll(disbale: Boolean): Unit
    
    /**
      * Hide the keyboard accessory bar with the next, previous and done buttons.
      *
      * @param hide
      */
    def hideKeyboardAccessoryBar(hide: Boolean): Unit
    
    /**
      * Whether or not the keyboard is currently visible.
      */
    var isVisible: Boolean
    
    /**
      * Force keyboard to be shown on Android.
      * This typically helps if autofocus on a text element does not pop up the keyboard automatically
      *
      * Supported Platforms: Android, Blackberry 10
      */
    def show(): Unit
  }
  object Keyboard {
    
    @scala.inline
    def apply(
      close: () => Unit,
      disableScroll: Boolean => Unit,
      hideKeyboardAccessoryBar: Boolean => Unit,
      isVisible: Boolean,
      show: () => Unit
    ): Keyboard = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), disableScroll = js.Any.fromFunction1(disableScroll), hideKeyboardAccessoryBar = js.Any.fromFunction1(hideKeyboardAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Keyboard]
    }
    
    @scala.inline
    implicit class KeyboardMutableBuilder[Self <: Keyboard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableScroll(value: Boolean => Unit): Self = StObject.set(x, "disableScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideKeyboardAccessoryBar(value: Boolean => Unit): Self = StObject.set(x, "hideKeyboardAccessoryBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
}
