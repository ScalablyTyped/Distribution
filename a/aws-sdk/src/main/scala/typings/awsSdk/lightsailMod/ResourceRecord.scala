package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRecord extends StObject {
  
  /**
    * The name of the record.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS record type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the DNS record.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ResourceRecord {
  
  inline def apply(): ResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRecord]
  }
  
  extension [Self <: ResourceRecord](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
