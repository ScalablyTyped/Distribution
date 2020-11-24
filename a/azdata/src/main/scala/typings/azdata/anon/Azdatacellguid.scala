package typings.azdata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Azdatacellguid extends js.Object {
  
  var azdata_cell_guid: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object Azdatacellguid {
  
  @scala.inline
  def apply(): Azdatacellguid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Azdatacellguid]
  }
  
  @scala.inline
  implicit class AzdatacellguidOps[Self <: Azdatacellguid] (val x: Self) extends AnyVal {
    
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
    def setAzdata_cell_guid(value: String): Self = this.set("azdata_cell_guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzdata_cell_guid: Self = this.set("azdata_cell_guid", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
