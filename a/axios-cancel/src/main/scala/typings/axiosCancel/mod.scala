package typings.axiosCancel

import typings.axios.mod.AxiosStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-cancel", JSImport.Default)
  @js.native
  def default(axiosStatic: AxiosStatic): Unit = js.native
  @JSImport("axios-cancel", JSImport.Default)
  @js.native
  def default(axiosStatic: AxiosStatic, options: AxiosCancelOptions): Unit = js.native
  
  @js.native
  trait AxiosCancelOptions extends StObject {
    
    /**
      * Enables logging
      * default: false
      */
    var debug: Boolean = js.native
  }
  object AxiosCancelOptions {
    
    @scala.inline
    def apply(debug: Boolean): AxiosCancelOptions = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosCancelOptions]
    }
    
    @scala.inline
    implicit class AxiosCancelOptionsMutableBuilder[Self <: AxiosCancelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object axiosAugmentingMod {
    
    @js.native
    trait AxiosRequestConfig extends StObject {
      
      var requestId: js.UndefOr[String] = js.native
    }
    object AxiosRequestConfig {
      
      @scala.inline
      def apply(): AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AxiosRequestConfig]
      }
      
      @scala.inline
      implicit class AxiosRequestConfigMutableBuilder[Self <: AxiosRequestConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    @js.native
    trait AxiosStatic extends StObject {
      
      def cancel(requestId: String): Unit = js.native
      
      def cancelAll(): Unit = js.native
    }
    object AxiosStatic {
      
      @scala.inline
      def apply(cancel: String => Unit, cancelAll: () => Unit): typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), cancelAll = js.Any.fromFunction0(cancelAll))
        __obj.asInstanceOf[typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic]
      }
      
      @scala.inline
      implicit class AxiosStaticMutableBuilder[Self <: typings.axiosCancel.mod.axiosAugmentingMod.AxiosStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCancelAll(value: () => Unit): Self = StObject.set(x, "cancelAll", js.Any.fromFunction0(value))
      }
    }
  }
}
