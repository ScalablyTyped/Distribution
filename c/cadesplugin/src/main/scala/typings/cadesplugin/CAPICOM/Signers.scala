package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signers extends StObject {
  
  val Count: Double = js.native
  
  def Item(index: Double): Signer = js.native
}
object Signers {
  
  @scala.inline
  def apply(Count: Double, Item: Double => Signer): Signers = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Signers]
  }
  
  @scala.inline
  implicit class SignersMutableBuilder[Self <: Signers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Signer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
