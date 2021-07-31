package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPropertiesResult extends StObject {
  
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: js.UndefOr[typings.awsSdk.workspacesMod.ClientProperties] = js.undefined
  
  /**
    * The resource identifier, in the form of a directory ID.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
}
object ClientPropertiesResult {
  
  @scala.inline
  def apply(): ClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPropertiesResult]
  }
  
  @scala.inline
  implicit class ClientPropertiesResultMutableBuilder[Self <: ClientPropertiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientProperties(value: ClientProperties): Self = StObject.set(x, "ClientProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPropertiesUndefined: Self = StObject.set(x, "ClientProperties", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
