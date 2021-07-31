package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterInstanceTagAttributeRequest extends StObject {
  
  /**
    * Indicates whether to deregister all tag keys in the current Region. Specify false to deregister all tag keys.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the tag keys to deregister.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.undefined
}
object DeregisterInstanceTagAttributeRequest {
  
  @scala.inline
  def apply(): DeregisterInstanceTagAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterInstanceTagAttributeRequest]
  }
  
  @scala.inline
  implicit class DeregisterInstanceTagAttributeRequestMutableBuilder[Self <: DeregisterInstanceTagAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAllTagsOfInstance(value: Boolean): Self = StObject.set(x, "IncludeAllTagsOfInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAllTagsOfInstanceUndefined: Self = StObject.set(x, "IncludeAllTagsOfInstance", js.undefined)
    
    @scala.inline
    def setInstanceTagKeys(value: InstanceTagKeySet): Self = StObject.set(x, "InstanceTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTagKeysUndefined: Self = StObject.set(x, "InstanceTagKeys", js.undefined)
    
    @scala.inline
    def setInstanceTagKeysVarargs(value: String*): Self = StObject.set(x, "InstanceTagKeys", js.Array(value :_*))
  }
}
