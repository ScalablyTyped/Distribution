package typings.cleaveJs

import typings.cleaveJs.optionsMod.CleaveOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cleave.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Cleave {
    def this(selector: String, options: CleaveOptions) = this()
    def this(selector: HTMLElement, options: CleaveOptions) = this()
  }
  
  @js.native
  trait Cleave extends StObject {
    
    def destroy(): Unit = js.native
    
    def getFormattedValue(): String = js.native
    
    def getISOFormatDate(): String = js.native
    
    def getRawValue(): String = js.native
    
    def setPhoneRegionCode(regionCode: String): Unit = js.native
    
    def setRawValue(value: String): Unit = js.native
  }
  object Cleave {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getFormattedValue: () => String,
      getISOFormatDate: () => String,
      getRawValue: () => String,
      setPhoneRegionCode: String => Unit,
      setRawValue: String => Unit
    ): Cleave = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormattedValue = js.Any.fromFunction0(getFormattedValue), getISOFormatDate = js.Any.fromFunction0(getISOFormatDate), getRawValue = js.Any.fromFunction0(getRawValue), setPhoneRegionCode = js.Any.fromFunction1(setPhoneRegionCode), setRawValue = js.Any.fromFunction1(setRawValue))
      __obj.asInstanceOf[Cleave]
    }
    
    @scala.inline
    implicit class CleaveMutableBuilder[Self <: Cleave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFormattedValue(value: () => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetISOFormatDate(value: () => String): Self = StObject.set(x, "getISOFormatDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRawValue(value: () => String): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetPhoneRegionCode(value: String => Unit): Self = StObject.set(x, "setPhoneRegionCode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRawValue(value: String => Unit): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    }
  }
}
