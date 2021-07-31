package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frozen extends StObject {
  
  var frozen: Boolean
  
  var reversed: Boolean
}
object Frozen {
  
  @scala.inline
  def apply(frozen: Boolean, reversed: Boolean): Frozen = {
    val __obj = js.Dynamic.literal(frozen = frozen.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frozen]
  }
  
  @scala.inline
  implicit class FrozenMutableBuilder[Self <: Frozen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
  }
}
