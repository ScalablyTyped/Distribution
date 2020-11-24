package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanFinding extends js.Object {
  
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[FindingDescription] = js.native
  
  /**
    * The name associated with the finding, usually a CVE number.
    */
  var name: js.UndefOr[FindingName] = js.native
  
  /**
    * The finding severity.
    */
  var severity: js.UndefOr[FindingSeverity] = js.native
  
  /**
    * A link containing additional details about the security vulnerability.
    */
  var uri: js.UndefOr[Url] = js.native
}
object ImageScanFinding {
  
  @scala.inline
  def apply(): ImageScanFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFinding]
  }
  
  @scala.inline
  implicit class ImageScanFindingOps[Self <: ImageScanFinding] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: FindingDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: FindingName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSeverity(value: FindingSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setUri(value: Url): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
