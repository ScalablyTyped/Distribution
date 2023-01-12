package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInformation extends StObject {
  
  var cron: String
  
  var endDate: js.UndefOr[Double] = js.undefined
  
  var every: Double
  
  var id: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var name: String
  
  var next: Double
  
  var tz: js.UndefOr[String] = js.undefined
}
object JobInformation {
  
  inline def apply(cron: String, every: Double, key: String, name: String, next: Double): JobInformation = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobInformation] (val x: Self) extends AnyVal {
    
    inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
    
    inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
  }
}
