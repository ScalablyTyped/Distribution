package typings.awsSdkClientKmsNode.typesListRetirableGrantsOutputMod

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesGrantListEntryMod.UnmarshalledGrantListEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRetirableGrantsOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[UnmarshalledGrantListEntry]] = js.native
  
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.native
}
object ListRetirableGrantsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListRetirableGrantsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRetirableGrantsOutput]
  }
  
  @scala.inline
  implicit class ListRetirableGrantsOutputOps[Self <: ListRetirableGrantsOutput] (val x: Self) extends AnyVal {
    
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
    def setGrantsVarargs(value: UnmarshalledGrantListEntry*): Self = this.set("Grants", js.Array(value :_*))
    
    @scala.inline
    def setGrants(value: js.Array[UnmarshalledGrantListEntry]): Self = this.set("Grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrants: Self = this.set("Grants", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncated: Self = this.set("Truncated", js.undefined)
  }
}
