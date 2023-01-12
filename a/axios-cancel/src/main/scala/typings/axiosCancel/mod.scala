package typings.axiosCancel

import typings.axios.mod.AxiosStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-cancel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(axiosStatic: AxiosStatic): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(axiosStatic.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(axiosStatic: AxiosStatic, options: AxiosCancelOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(axiosStatic.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AxiosCancelOptions extends StObject {
    
    /**
      * Enables logging
      * default: false
      */
    var debug: Boolean
  }
  object AxiosCancelOptions {
    
    inline def apply(debug: Boolean): AxiosCancelOptions = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosCancelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxiosCancelOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var requestId: js.UndefOr[String] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AxiosRequestConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AxiosRequestConfig] (val x: Self) extends AnyVal {
        
        inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    trait AxiosStatic extends StObject {
      
      def cancel(requestId: String): Unit
      
      def cancelAll(): Unit
    }
    object AxiosStatic {
      
      inline def apply(cancel: String => Unit, cancelAll: () => Unit): typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), cancelAll = js.Any.fromFunction0(cancelAll))
        __obj.asInstanceOf[typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic] (val x: Self) extends AnyVal {
        
        inline def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
        
        inline def setCancelAll(value: () => Unit): Self = StObject.set(x, "cancelAll", js.Any.fromFunction0(value))
      }
    }
  }
}
