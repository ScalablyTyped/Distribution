package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectionInput extends StObject {
  
  /**
    * The name of the connection to be created. The name must be unique in the calling AWS account.
    */
  var ConnectionName: typings.awsSdk.codestarconnectionsMod.ConnectionName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
  
  /**
    * The name of the external provider where your third-party code repository is configured. The valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
  
  /**
    * The key-value pair to use when tagging the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateConnectionInput {
  
  @scala.inline
  def apply(ConnectionName: ConnectionName): CreateConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionInput]
  }
  
  @scala.inline
  implicit class CreateConnectionInputMutableBuilder[Self <: CreateConnectionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
