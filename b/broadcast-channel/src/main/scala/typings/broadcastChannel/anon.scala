package typings.broadcastChannel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FallbackInterval extends StObject {
    
    var fallbackInterval: js.UndefOr[Double] = js.native
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object FallbackInterval {
    
    @scala.inline
    def apply(): FallbackInterval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallbackInterval]
    }
    
    @scala.inline
    implicit class FallbackIntervalMutableBuilder[Self <: FallbackInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackInterval(value: Double): Self = StObject.set(x, "fallbackInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackIntervalUndefined: Self = StObject.set(x, "fallbackInterval", js.undefined)
      
      @scala.inline
      def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait Ttl extends StObject {
    
    var ttl: js.UndefOr[Double] = js.native
    
    var useFastPath: js.UndefOr[Boolean] = js.native
  }
  object Ttl {
    
    @scala.inline
    def apply(): Ttl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ttl]
    }
    
    @scala.inline
    implicit class TtlMutableBuilder[Self <: Ttl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setUseFastPath(value: Boolean): Self = StObject.set(x, "useFastPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastPathUndefined: Self = StObject.set(x, "useFastPath", js.undefined)
    }
  }
}
