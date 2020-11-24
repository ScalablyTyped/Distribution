package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataStoreOptions extends js.Object {
  
  var localQueryComparisonOptions: js.UndefOr[LocalQueryComparisonOptions] = js.native
  
  var namingConvention: js.UndefOr[NamingConvention] = js.native
}
object MetadataStoreOptions {
  
  @scala.inline
  def apply(): MetadataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataStoreOptions]
  }
  
  @scala.inline
  implicit class MetadataStoreOptionsOps[Self <: MetadataStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setLocalQueryComparisonOptions(value: LocalQueryComparisonOptions): Self = this.set("localQueryComparisonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalQueryComparisonOptions: Self = this.set("localQueryComparisonOptions", js.undefined)
    
    @scala.inline
    def setNamingConvention(value: NamingConvention): Self = this.set("namingConvention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamingConvention: Self = this.set("namingConvention", js.undefined)
  }
}
