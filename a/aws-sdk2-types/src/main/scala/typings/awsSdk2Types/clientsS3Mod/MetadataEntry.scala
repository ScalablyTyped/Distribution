package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataEntry extends StObject {
  
  /**
    * Name of the Object.
    */
  var Name: js.UndefOr[MetadataKey] = js.undefined
  
  /**
    * Value of the Object.
    */
  var Value: js.UndefOr[MetadataValue] = js.undefined
}
object MetadataEntry {
  
  inline def apply(): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataEntry] (val x: Self) extends AnyVal {
    
    inline def setName(value: MetadataKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: MetadataValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
