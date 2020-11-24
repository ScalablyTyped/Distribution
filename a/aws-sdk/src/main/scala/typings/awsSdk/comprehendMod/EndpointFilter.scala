package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointFilter extends js.Object {
  
  /**
    * Specifies a date after which the returned endpoint or endpoints were created.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * Specifies a date before which the returned endpoint or endpoints were created.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  
  /**
    * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting, Failed.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}
object EndpointFilter {
  
  @scala.inline
  def apply(): EndpointFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointFilter]
  }
  
  @scala.inline
  implicit class EndpointFilterOps[Self <: EndpointFilter] (val x: Self) extends AnyVal {
    
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
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setModelArn(value: ComprehendModelArn): Self = this.set("ModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelArn: Self = this.set("ModelArn", js.undefined)
    
    @scala.inline
    def setStatus(value: EndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
