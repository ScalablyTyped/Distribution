package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait National
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * International voice calls. Requied if international calling is supported
    */
  var international: Number
  
  /**
    * National voice calls
    */
  var national: Number
  
  /**
    * Roaming voice calls, Required if roaming is supported
    */
  var roaming: Number
}
object National {
  
  inline def apply(international: Number, national: Number, roaming: Number): National = {
    val __obj = js.Dynamic.literal(international = international.asInstanceOf[js.Any], national = national.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[National]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: National] (val x: Self) extends AnyVal {
    
    inline def setInternational(value: Number): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setNational(value: Number): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Number): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
  }
}
