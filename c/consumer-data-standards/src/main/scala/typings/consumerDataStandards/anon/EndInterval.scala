package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.FINAL_SUBSTITUTE
import typings.consumerDataStandards.consumerDataStandardsStrings.SUBSTITUTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndInterval
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * End interval for read quality flag
    */
  var endInterval: Double
  
  /**
    * The quality of the read taken
    */
  var quality: SUBSTITUTE | FINAL_SUBSTITUTE
  
  /**
    * Start interval for read quality flag. First read begins at 1
    */
  var startInterval: Double
}
object EndInterval {
  
  inline def apply(endInterval: Double, quality: SUBSTITUTE | FINAL_SUBSTITUTE, startInterval: Double): EndInterval = {
    val __obj = js.Dynamic.literal(endInterval = endInterval.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], startInterval = startInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndInterval] (val x: Self) extends AnyVal {
    
    inline def setEndInterval(value: Double): Self = StObject.set(x, "endInterval", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: SUBSTITUTE | FINAL_SUBSTITUTE): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setStartInterval(value: Double): Self = StObject.set(x, "startInterval", value.asInstanceOf[js.Any])
  }
}
