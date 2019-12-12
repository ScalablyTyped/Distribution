package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreDifferenceMod._UnmarshalledDifference
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetDifferencesOutput", JSImport.Namespace)
@js.native
object typesGetDifferencesOutputMod extends js.Object {
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
    var differences: js.UndefOr[js.Array[_UnmarshalledDifference]] = js.native
  }
  
}

