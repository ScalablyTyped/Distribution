package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalNetworkRequest extends StObject {
  
  /**
    * A description of the global network. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateGlobalNetworkRequest {
  
  @scala.inline
  def apply(): CreateGlobalNetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalNetworkRequest]
  }
  
  @scala.inline
  implicit class CreateGlobalNetworkRequestMutableBuilder[Self <: CreateGlobalNetworkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
