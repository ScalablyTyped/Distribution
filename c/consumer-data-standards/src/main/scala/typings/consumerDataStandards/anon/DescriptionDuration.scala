package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionDuration
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Amount value of roaming calls available. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An overview of plan limits. Required unless planType is UNSUPPORTED
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total duration (hours, minutes, and seconds) of roaming voice calls available. Not limited to 24hrs. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of roaming voice calls available Required unless planType is UNSUPPORTED or UNMETERED
    */
  var number: js.UndefOr[Double | Null] = js.undefined
}
object DescriptionDuration {
  
  inline def apply(): DescriptionDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionDuration] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
