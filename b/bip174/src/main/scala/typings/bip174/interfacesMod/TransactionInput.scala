package typings.bip174.interfacesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionInput extends StObject {
  
  var hash: String | Buffer
  
  var index: Double
  
  var sequence: js.UndefOr[Double] = js.undefined
}
object TransactionInput {
  
  @scala.inline
  def apply(hash: String | Buffer, index: Double): TransactionInput = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInput]
  }
  
  @scala.inline
  implicit class TransactionInputMutableBuilder[Self <: TransactionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String | Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
  }
}
