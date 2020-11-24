package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEntitiesResponse extends js.Object {
  
  /**
    * An array of descriptions for the specified entities.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.native
}
object GetEntitiesResponse {
  
  @scala.inline
  def apply(): GetEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitiesResponse]
  }
  
  @scala.inline
  implicit class GetEntitiesResponseOps[Self <: GetEntitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setDescriptionsVarargs(value: EntityDescription*): Self = this.set("descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: EntityDescriptions): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
  }
}
