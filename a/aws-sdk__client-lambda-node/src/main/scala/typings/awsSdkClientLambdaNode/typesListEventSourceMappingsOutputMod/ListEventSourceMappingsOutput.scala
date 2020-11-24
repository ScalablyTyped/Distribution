package typings.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod.UnmarshalledEventSourceMappingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventSourceMappingsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>An array of <code>EventSourceMappingConfiguration</code> objects.</p>
    */
  var EventSourceMappings: js.UndefOr[js.Array[UnmarshalledEventSourceMappingConfiguration]] = js.native
  
  /**
    * <p>A string, present if there are more event source mappings.</p>
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object ListEventSourceMappingsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListEventSourceMappingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSourceMappingsOutput]
  }
  
  @scala.inline
  implicit class ListEventSourceMappingsOutputOps[Self <: ListEventSourceMappingsOutput] (val x: Self) extends AnyVal {
    
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
    def setEventSourceMappingsVarargs(value: UnmarshalledEventSourceMappingConfiguration*): Self = this.set("EventSourceMappings", js.Array(value :_*))
    
    @scala.inline
    def setEventSourceMappings(value: js.Array[UnmarshalledEventSourceMappingConfiguration]): Self = this.set("EventSourceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceMappings: Self = this.set("EventSourceMappings", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
