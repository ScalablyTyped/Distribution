package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTypeDetail extends js.Object {
  
  /**
    * The configuration settings registered with the activity type.
    */
  var configuration: ActivityTypeConfiguration = js.native
  
  /**
    * General information about the activity type. The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.    REGISTERED – The type is registered and available. Workers supporting this type should be running.     DEPRECATED – The type was deprecated using DeprecateActivityType, but is still in use. You should keep workers supporting this type running. You cannot create new tasks of this type.   
    */
  var typeInfo: ActivityTypeInfo = js.native
}
object ActivityTypeDetail {
  
  @scala.inline
  def apply(configuration: ActivityTypeConfiguration, typeInfo: ActivityTypeInfo): ActivityTypeDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], typeInfo = typeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeDetail]
  }
  
  @scala.inline
  implicit class ActivityTypeDetailOps[Self <: ActivityTypeDetail] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: ActivityTypeConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfo(value: ActivityTypeInfo): Self = this.set("typeInfo", value.asInstanceOf[js.Any])
  }
}
