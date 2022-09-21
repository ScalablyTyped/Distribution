package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPAuthenticatedAttributes2 extends StObject {
  
  def Add(attribute: CPAttribute): Unit
  
  def Clear(): Unit
  
  val Count: Double
  
  def Item(index: Double): CPAttribute
  
  def Remove(index: Double): Unit
}
object CPAuthenticatedAttributes2 {
  
  inline def apply(
    Add: CPAttribute => Unit,
    Clear: () => Unit,
    Count: Double,
    Item: Double => CPAttribute,
    Remove: Double => Unit
  ): CPAuthenticatedAttributes2 = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[CPAuthenticatedAttributes2]
  }
  
  extension [Self <: CPAuthenticatedAttributes2](x: Self) {
    
    inline def setAdd(value: CPAttribute => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => CPAttribute): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
