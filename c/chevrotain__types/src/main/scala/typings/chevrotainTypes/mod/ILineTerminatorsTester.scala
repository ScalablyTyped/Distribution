package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineTerminatorsTester extends StObject {
  
  /**
    * Just like the regExp lastIndex with the global flag enabled
    * It should be updated after every match to point to the offset where the next
    * match attempt starts.
    */
  var lastIndex: Double
  
  /**
    * Just like regExp.test
    */
  def test(text: String): Boolean
}
object ILineTerminatorsTester {
  
  inline def apply(lastIndex: Double, test: String => Boolean): ILineTerminatorsTester = {
    val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ILineTerminatorsTester]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILineTerminatorsTester] (val x: Self) extends AnyVal {
    
    inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
    
    inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
