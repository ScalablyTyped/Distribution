package typings.badgin

import typings.badgin.anon.Clear
import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgingMod {
  
  @JSImport("badgin/build/badging", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("badgin/build/badging", "isAvailable")
  @js.native
  def isAvailable(): Boolean = js.native
  
  @JSImport("badgin/build/badging", "set")
  @js.native
  def set(value: Value): Boolean = js.native
  
  object global {
    
    @js.native
    trait Navigator extends StObject {
      
      var clearExperimentalAppBadge: js.UndefOr[js.Function0[Unit]] = js.native
      
      var setExperimentalAppBadge: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
    }
    object Navigator {
      
      @scala.inline
      def apply(): Navigator = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Navigator]
      }
      
      @scala.inline
      implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearExperimentalAppBadge(value: () => Unit): Self = StObject.set(x, "clearExperimentalAppBadge", js.Any.fromFunction0(value))
        
        @scala.inline
        def setClearExperimentalAppBadgeUndefined: Self = StObject.set(x, "clearExperimentalAppBadge", js.undefined)
        
        @scala.inline
        def setSetExperimentalAppBadge(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setExperimentalAppBadge", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetExperimentalAppBadgeUndefined: Self = StObject.set(x, "setExperimentalAppBadge", js.undefined)
      }
    }
    
    @js.native
    trait Window extends StObject {
      
      var ExperimentalBadge: js.UndefOr[Clear] = js.native
    }
    object Window {
      
      @scala.inline
      def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExperimentalBadge(value: Clear): Self = StObject.set(x, "ExperimentalBadge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExperimentalBadgeUndefined: Self = StObject.set(x, "ExperimentalBadge", js.undefined)
      }
    }
  }
}
