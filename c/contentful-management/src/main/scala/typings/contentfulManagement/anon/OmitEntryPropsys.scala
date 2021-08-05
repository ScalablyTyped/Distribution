package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetadataProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/entry.EntryProp, 'sys'> */
trait OmitEntryPropsys extends StObject {
  
  var fields: Record[String, js.Any]
  
  var metadata: js.UndefOr[MetadataProps] = js.undefined
}
object OmitEntryPropsys {
  
  inline def apply(fields: Record[String, js.Any]): OmitEntryPropsys = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEntryPropsys]
  }
  
  extension [Self <: OmitEntryPropsys](x: Self) {
    
    inline def setFields(value: Record[String, js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
