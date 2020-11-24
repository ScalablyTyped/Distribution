package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetadataProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/entry.EntryProp, 'sys'> */
@js.native
trait OmitEntryPropsys extends js.Object {
  
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
  implicit class OmitEntryPropsysOps[Self <: OmitEntryPropsys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFields(value: Record[String, _]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataProps): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
