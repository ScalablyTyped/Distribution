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
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  
  inline def set(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object global {
    
    trait Navigator extends StObject {
      
      var clearExperimentalAppBadge: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var setExperimentalAppBadge: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object Navigator {
      
      inline def apply(): Navigator = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Navigator]
      }
      
      extension [Self <: Navigator](x: Self) {
        
        inline def setClearExperimentalAppBadge(value: () => Unit): Self = StObject.set(x, "clearExperimentalAppBadge", js.Any.fromFunction0(value))
        
        inline def setClearExperimentalAppBadgeUndefined: Self = StObject.set(x, "clearExperimentalAppBadge", js.undefined)
        
        inline def setSetExperimentalAppBadge(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setExperimentalAppBadge", js.Any.fromFunction1(value))
        
        inline def setSetExperimentalAppBadgeUndefined: Self = StObject.set(x, "setExperimentalAppBadge", js.undefined)
      }
    }
    
    trait Window extends StObject {
      
      var ExperimentalBadge: js.UndefOr[Clear] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setExperimentalBadge(value: Clear): Self = StObject.set(x, "ExperimentalBadge", value.asInstanceOf[js.Any])
        
        inline def setExperimentalBadgeUndefined: Self = StObject.set(x, "ExperimentalBadge", js.undefined)
      }
    }
  }
}
