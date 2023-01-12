package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetadataEntryMod {
  
  trait MetadataEntry extends StObject {
    
    /**
      * _MetadataKey shape
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * _MetadataValue shape
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  object MetadataEntry {
    
    inline def apply(): MetadataEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataEntry] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledMetadataEntry = MetadataEntry
}
