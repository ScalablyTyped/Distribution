package typings.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesDifferenceMod.UnmarshalledDifference
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDifferencesOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * <p>A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).</p>
    */
  var differences: js.UndefOr[js.Array[UnmarshalledDifference]] = js.native
}
object GetDifferencesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesOutput]
  }
  
  @scala.inline
  implicit class GetDifferencesOutputOps[Self <: GetDifferencesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setDifferencesVarargs(value: UnmarshalledDifference*): Self = this.set("differences", js.Array(value :_*))
    
    @scala.inline
    def setDifferences(value: js.Array[UnmarshalledDifference]): Self = this.set("differences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDifferences: Self = this.set("differences", js.undefined)
  }
}
