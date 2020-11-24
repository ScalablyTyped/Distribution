package typings.contentfulManagement.contentTypeFieldsMod

import typings.contentfulManagement.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validation extends js.Object {
  
  var assetFileSize: js.UndefOr[NumRange] = js.native
  
  var assetImageDimensions: js.UndefOr[Height] = js.native
  
  var dateRange: js.UndefOr[DateRange] = js.native
  
  var enabledMarks: js.UndefOr[js.Array[String]] = js.native
  
  var enabledNodeTypes: js.UndefOr[js.Array[String]] = js.native
  
  var in: js.UndefOr[js.Array[String]] = js.native
  
  var linkContentType: js.UndefOr[js.Array[String]] = js.native
  
  var linkMimetypeGroup: js.UndefOr[js.Array[String]] = js.native
  
  var prohibitRegexp: js.UndefOr[RegExp] = js.native
  
  var range: js.UndefOr[NumRange] = js.native
  
  var regexp: js.UndefOr[RegExp] = js.native
  
  var size: js.UndefOr[NumRange] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object Validation {
  
  @scala.inline
  def apply(): Validation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validation]
  }
  
  @scala.inline
  implicit class ValidationOps[Self <: Validation] (val x: Self) extends AnyVal {
    
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
    def setAssetFileSize(value: NumRange): Self = this.set("assetFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetFileSize: Self = this.set("assetFileSize", js.undefined)
    
    @scala.inline
    def setAssetImageDimensions(value: Height): Self = this.set("assetImageDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetImageDimensions: Self = this.set("assetImageDimensions", js.undefined)
    
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setEnabledMarksVarargs(value: String*): Self = this.set("enabledMarks", js.Array(value :_*))
    
    @scala.inline
    def setEnabledMarks(value: js.Array[String]): Self = this.set("enabledMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledMarks: Self = this.set("enabledMarks", js.undefined)
    
    @scala.inline
    def setEnabledNodeTypesVarargs(value: String*): Self = this.set("enabledNodeTypes", js.Array(value :_*))
    
    @scala.inline
    def setEnabledNodeTypes(value: js.Array[String]): Self = this.set("enabledNodeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledNodeTypes: Self = this.set("enabledNodeTypes", js.undefined)
    
    @scala.inline
    def setInVarargs(value: String*): Self = this.set("in", js.Array(value :_*))
    
    @scala.inline
    def setIn(value: js.Array[String]): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setLinkContentTypeVarargs(value: String*): Self = this.set("linkContentType", js.Array(value :_*))
    
    @scala.inline
    def setLinkContentType(value: js.Array[String]): Self = this.set("linkContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkContentType: Self = this.set("linkContentType", js.undefined)
    
    @scala.inline
    def setLinkMimetypeGroupVarargs(value: String*): Self = this.set("linkMimetypeGroup", js.Array(value :_*))
    
    @scala.inline
    def setLinkMimetypeGroup(value: js.Array[String]): Self = this.set("linkMimetypeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkMimetypeGroup: Self = this.set("linkMimetypeGroup", js.undefined)
    
    @scala.inline
    def setProhibitRegexp(value: RegExp): Self = this.set("prohibitRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProhibitRegexp: Self = this.set("prohibitRegexp", js.undefined)
    
    @scala.inline
    def setRange(value: NumRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setSize(value: NumRange): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
