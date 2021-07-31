package typings.badgin

import typings.badgin.anon.Clear
import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgingMod {
  
  @JSImport("badgin/build/badging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @scala.inline
  def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  
  @scala.inline
  def set(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object global {
    
    trait Navigator extends StObject {
      
      var clearExperimentalAppBadge: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var setExperimentalAppBadge: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
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
    
    trait Window extends StObject {
      
      var ExperimentalBadge: js.UndefOr[Clear] = js.undefined
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
