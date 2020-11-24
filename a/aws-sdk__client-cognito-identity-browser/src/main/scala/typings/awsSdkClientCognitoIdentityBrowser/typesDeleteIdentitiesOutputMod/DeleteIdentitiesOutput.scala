package typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnprocessedIdentityIdMod.UnmarshalledUnprocessedIdentityId
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[UnmarshalledUnprocessedIdentityId]] = js.native
}
object DeleteIdentitiesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentitiesOutput]
  }
  
  @scala.inline
  implicit class DeleteIdentitiesOutputOps[Self <: DeleteIdentitiesOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedIdentityIdsVarargs(value: UnmarshalledUnprocessedIdentityId*): Self = this.set("UnprocessedIdentityIds", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedIdentityIds(value: js.Array[UnmarshalledUnprocessedIdentityId]): Self = this.set("UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedIdentityIds: Self = this.set("UnprocessedIdentityIds", js.undefined)
  }
}
