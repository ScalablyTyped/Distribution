package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubscriptionDefinitionVersionResponse extends StObject {
  
  /**
    * The ARN of the subscription definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the subscription definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  
  /**
    * Information about the subscription definition version.
    */
  var Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.native
  
  /**
    * The ID of the subscription definition version.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The version of the subscription definition version.
    */
  var Version: js.UndefOr[string] = js.native
}
object GetSubscriptionDefinitionVersionResponse {
  
  @scala.inline
  def apply(): GetSubscriptionDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionResponse]
  }
  
  @scala.inline
  implicit class GetSubscriptionDefinitionVersionResponseMutableBuilder[Self <: GetSubscriptionDefinitionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDefinition(value: SubscriptionDefinitionVersion): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
