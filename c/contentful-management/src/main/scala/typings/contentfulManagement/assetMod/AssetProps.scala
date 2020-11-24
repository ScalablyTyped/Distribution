package typings.contentfulManagement.assetMod

import typings.contentfulManagement.anon.Description
import typings.contentfulManagement.anon.localestringMetaSysProps
import typings.contentfulManagement.commonTypesMod.MetadataProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetProps extends js.Object {
  
  var fields: Description = js.native
  
  var metadata: js.UndefOr[MetadataProps] = js.native
  
  var sys: localestringMetaSysProps = js.native
}
object AssetProps {
  
  @scala.inline
  def apply(fields: Description, sys: localestringMetaSysProps): AssetProps = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetProps]
  }
  
  @scala.inline
  implicit class AssetPropsOps[Self <: AssetProps] (val x: Self) extends AnyVal {
    
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
    def setFields(value: Description): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: localestringMetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataProps): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
