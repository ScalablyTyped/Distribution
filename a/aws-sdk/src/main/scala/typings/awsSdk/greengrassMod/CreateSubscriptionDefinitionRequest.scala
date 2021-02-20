package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSubscriptionDefinitionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  
  /**
    * Information about the initial version of the subscription definition.
    */
  var InitialVersion: js.UndefOr[SubscriptionDefinitionVersion] = js.native
  
  /**
    * The name of the subscription definition.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateSubscriptionDefinitionRequest {
  
  @scala.inline
  def apply(): CreateSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionDefinitionRequest]
  }
  
  @scala.inline
  implicit class CreateSubscriptionDefinitionRequestMutableBuilder[Self <: CreateSubscriptionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setInitialVersion(value: SubscriptionDefinitionVersion): Self = StObject.set(x, "InitialVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVersionUndefined: Self = StObject.set(x, "InitialVersion", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
