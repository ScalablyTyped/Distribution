package typings.awsSdkClientDynamodbNode.typesUpdateTimeToLiveOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTimeToLiveOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
    */
  var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.native
}
object UpdateTimeToLiveOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
  
  @scala.inline
  implicit class UpdateTimeToLiveOutputOps[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
    
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
    def setTimeToLiveSpecification(value: UnmarshalledTimeToLiveSpecification): Self = this.set("TimeToLiveSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLiveSpecification: Self = this.set("TimeToLiveSpecification", js.undefined)
  }
}
