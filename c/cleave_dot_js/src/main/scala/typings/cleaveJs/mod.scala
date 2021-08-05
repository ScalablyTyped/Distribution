package typings.cleaveJs

import typings.cleaveJs.optionsMod.CleaveOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cleave.js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Cleave {
    def this(selector: String, options: CleaveOptions) = this()
    def this(selector: HTMLElement, options: CleaveOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getFormattedValue(): String = js.native
    
    /* CompleteClass */
    override def getISOFormatDate(): String = js.native
    
    /* CompleteClass */
    override def getRawValue(): String = js.native
    
    /* CompleteClass */
    override def setPhoneRegionCode(regionCode: String): Unit = js.native
    
    /* CompleteClass */
    override def setRawValue(value: String): Unit = js.native
  }
  
  trait Cleave extends StObject {
    
    def destroy(): Unit
    
    def getFormattedValue(): String
    
    def getISOFormatDate(): String
    
    def getRawValue(): String
    
    def setPhoneRegionCode(regionCode: String): Unit
    
    def setRawValue(value: String): Unit
  }
  object Cleave {
    
    inline def apply(
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
    
    extension [Self <: Cleave](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetFormattedValue(value: () => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction0(value))
      
      inline def setGetISOFormatDate(value: () => String): Self = StObject.set(x, "getISOFormatDate", js.Any.fromFunction0(value))
      
      inline def setGetRawValue(value: () => String): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
      
      inline def setSetPhoneRegionCode(value: String => Unit): Self = StObject.set(x, "setPhoneRegionCode", js.Any.fromFunction1(value))
      
      inline def setSetRawValue(value: String => Unit): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    }
  }
}
