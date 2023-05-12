package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkConcessions
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no concessions exist
    */
  var concessions: js.Array[AppliedTo]
}
object DictkConcessions {
  
  inline def apply(concessions: js.Array[AppliedTo]): DictkConcessions = {
    val __obj = js.Dynamic.literal(concessions = concessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkConcessions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkConcessions] (val x: Self) extends AnyVal {
    
    inline def setConcessions(value: js.Array[AppliedTo]): Self = StObject.set(x, "concessions", value.asInstanceOf[js.Any])
    
    inline def setConcessionsVarargs(value: AppliedTo*): Self = StObject.set(x, "concessions", js.Array(value*))
  }
}
