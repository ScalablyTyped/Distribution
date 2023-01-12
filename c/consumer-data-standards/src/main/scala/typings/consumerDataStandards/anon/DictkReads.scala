package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkReads
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of meter reads sorted by NMI in ascending order followed by readStartDate in descending order
    */
  var reads: js.Array[BasicRead]
}
object DictkReads {
  
  inline def apply(reads: js.Array[BasicRead]): DictkReads = {
    val __obj = js.Dynamic.literal(reads = reads.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkReads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkReads] (val x: Self) extends AnyVal {
    
    inline def setReads(value: js.Array[BasicRead]): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    
    inline def setReadsVarargs(value: BasicRead*): Self = StObject.set(x, "reads", js.Array(value*))
  }
}
