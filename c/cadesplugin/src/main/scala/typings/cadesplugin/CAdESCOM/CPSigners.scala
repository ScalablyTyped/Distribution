package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPSigners extends StObject {
  
  val Count: Double
  
  def Item(index: Double): CPSigner
}
object CPSigners {
  
  inline def apply(Count: Double, Item: Double => CPSigner): CPSigners = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[CPSigners]
  }
  
  extension [Self <: CPSigners](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => CPSigner): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
