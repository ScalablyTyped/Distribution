package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signers extends StObject {
  
  val Count: Double
  
  def Item(index: Double): Signer
}
object Signers {
  
  inline def apply(Count: Double, Item: Double => Signer): Signers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Signers]
  }
  
  extension [Self <: Signers](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Signer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
