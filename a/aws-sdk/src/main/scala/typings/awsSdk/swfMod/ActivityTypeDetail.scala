package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTypeDetail extends StObject {
  
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
  implicit class ActivityTypeDetailMutableBuilder[Self <: ActivityTypeDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ActivityTypeConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfo(value: ActivityTypeInfo): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
  }
}
