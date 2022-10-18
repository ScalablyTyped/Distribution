package typings.chartist

import typings.chartist.distCoreTypesMod.ResponsiveOptions
import typings.chartist.distEventMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreOptionsProviderMod {
  
  @JSImport("chartist/dist/core/optionsProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def optionsProvider[T](options: T, responsiveOptions: Unit, eventEmitter: EventEmitter): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  inline def optionsProvider[T](options: T, responsiveOptions: ResponsiveOptions[T], eventEmitter: EventEmitter): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  
  trait OptionsProvider_[T] extends StObject {
    
    def getCurrentOptions(): T
    
    def removeMediaQueryListeners(): Unit
  }
  object OptionsProvider_ {
    
    inline def apply[T](getCurrentOptions: () => T, removeMediaQueryListeners: () => Unit): OptionsProvider_[T] = {
      val __obj = js.Dynamic.literal(getCurrentOptions = js.Any.fromFunction0(getCurrentOptions), removeMediaQueryListeners = js.Any.fromFunction0(removeMediaQueryListeners))
      __obj.asInstanceOf[OptionsProvider_[T]]
    }
    
    extension [Self <: OptionsProvider_[?], T](x: Self & OptionsProvider_[T]) {
      
      inline def setGetCurrentOptions(value: () => T): Self = StObject.set(x, "getCurrentOptions", js.Any.fromFunction0(value))
      
      inline def setRemoveMediaQueryListeners(value: () => Unit): Self = StObject.set(x, "removeMediaQueryListeners", js.Any.fromFunction0(value))
    }
  }
}
