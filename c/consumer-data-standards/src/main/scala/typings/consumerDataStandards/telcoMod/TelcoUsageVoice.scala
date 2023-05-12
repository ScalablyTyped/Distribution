package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageVoice
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
object TelcoUsageVoice {
  
  inline def apply(international: Number, national: Number, roaming: Number): TelcoUsageVoice = {
    val __obj = js.Dynamic.literal(international = international.asInstanceOf[js.Any], national = national.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageVoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageVoice] (val x: Self) extends AnyVal {
    
    inline def setInternational(value: Number): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setNational(value: Number): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Number): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
  }
}
