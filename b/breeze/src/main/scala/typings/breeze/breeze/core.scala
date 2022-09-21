package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @js.native
  trait Enum
    extends StObject
       with IEnum {
    
    def addSymbol(): EnumSymbol = js.native
    def addSymbol(propertiesObj: Any): EnumSymbol = js.native
    
    def resolveSymbols(): Unit = js.native
  }
  
  trait EnumSymbol extends StObject {
    
    def getName(): String
    
    var parentEnum: IEnum
  }
  object EnumSymbol {
    
    inline def apply(getName: () => String, parentEnum: IEnum): EnumSymbol = {
      val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumSymbol]
    }
    
    extension [Self <: EnumSymbol](x: Self) {
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setParentEnum(value: IEnum): Self = StObject.set(x, "parentEnum", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* error */ js.Error, Unit]
  
  @js.native
  trait Event extends StObject {
    
    def clear(): Unit = js.native
    
    def publish(data: Any): Unit = js.native
    def publish(data: Any, publishAsync: Boolean): Unit = js.native
    def publish(data: Any, publishAsync: Boolean, errorCallback: ErrorCallback): Unit = js.native
    def publish(data: Any, publishAsync: Unit, errorCallback: ErrorCallback): Unit = js.native
    
    def publishAsync(data: Any): Unit = js.native
    def publishAsync(data: Any, errorCallback: ErrorCallback): Unit = js.native
    
    def subscribe(): Double = js.native
    def subscribe(callback: js.Function1[/* data */ Any, Unit]): Double = js.native
    
    def unsubscribe(unsubKey: Double): Boolean = js.native
  }
  
  trait IEnum extends StObject {
    
    def contains(`object`: Any): Boolean
    
    def fromName(name: String): EnumSymbol
    
    def getNames(): js.Array[String]
    
    def getSymbols(): js.Array[EnumSymbol]
  }
  object IEnum {
    
    inline def apply(
      contains: Any => Boolean,
      fromName: String => EnumSymbol,
      getNames: () => js.Array[String],
      getSymbols: () => js.Array[EnumSymbol]
    ): IEnum = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
      __obj.asInstanceOf[IEnum]
    }
    
    extension [Self <: IEnum](x: Self) {
      
      inline def setContains(value: Any => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setFromName(value: String => EnumSymbol): Self = StObject.set(x, "fromName", js.Any.fromFunction1(value))
      
      inline def setGetNames(value: () => js.Array[String]): Self = StObject.set(x, "getNames", js.Any.fromFunction0(value))
      
      inline def setGetSymbols(value: () => js.Array[EnumSymbol]): Self = StObject.set(x, "getSymbols", js.Any.fromFunction0(value))
    }
  }
}
