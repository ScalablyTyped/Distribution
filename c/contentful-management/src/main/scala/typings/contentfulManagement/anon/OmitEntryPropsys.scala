package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetadataProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/entry.EntryProp, 'sys'> */
@js.native
trait OmitEntryPropsys extends StObject {
  
  var fields: Record[String, _] = js.native
  
  var metadata: js.UndefOr[MetadataProps] = js.native
}
object OmitEntryPropsys {
  
  @scala.inline
  def apply(fields: Record[String, _]): OmitEntryPropsys = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEntryPropsys]
  }
  
  @scala.inline
  implicit class OmitEntryPropsysMutableBuilder[Self <: OmitEntryPropsys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: Record[String, _]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataProps): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
