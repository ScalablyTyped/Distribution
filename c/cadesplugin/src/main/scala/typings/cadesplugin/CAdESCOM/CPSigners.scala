package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPSigners extends StObject {
  
  val Count: Double = js.native
  
  def Item(index: Double): CPSigner = js.native
}
object CPSigners {
  
  @scala.inline
  def apply(Count: Double, Item: Double => CPSigner): CPSigners = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[CPSigners]
  }
  
  @scala.inline
  implicit class CPSignersMutableBuilder[Self <: CPSigners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => CPSigner): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
