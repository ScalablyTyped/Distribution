package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdFormat extends js.Object {
  
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[DateTime] = js.native
  
  /**
    * The type of resource.
    */
  var Resource: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
    */
  var UseLongIds: js.UndefOr[Boolean] = js.native
}
object IdFormat {
  
  @scala.inline
  def apply(): IdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFormat]
  }
  
  @scala.inline
  implicit class IdFormatOps[Self <: IdFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeadline(value: DateTime): Self = this.set("Deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadline: Self = this.set("Deadline", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    
    @scala.inline
    def setUseLongIds(value: Boolean): Self = this.set("UseLongIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLongIds: Self = this.set("UseLongIds", js.undefined)
  }
}
