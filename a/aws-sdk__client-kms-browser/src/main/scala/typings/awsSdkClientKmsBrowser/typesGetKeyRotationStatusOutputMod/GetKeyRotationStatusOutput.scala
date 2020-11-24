package typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyRotationStatusOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>A Boolean value that specifies whether key rotation is enabled.</p>
    */
  var KeyRotationEnabled: js.UndefOr[Boolean] = js.native
}
object GetKeyRotationStatusOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetKeyRotationStatusOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyRotationStatusOutput]
  }
  
  @scala.inline
  implicit class GetKeyRotationStatusOutputOps[Self <: GetKeyRotationStatusOutput] (val x: Self) extends AnyVal {
    
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
    def setKeyRotationEnabled(value: Boolean): Self = this.set("KeyRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyRotationEnabled: Self = this.set("KeyRotationEnabled", js.undefined)
  }
}
