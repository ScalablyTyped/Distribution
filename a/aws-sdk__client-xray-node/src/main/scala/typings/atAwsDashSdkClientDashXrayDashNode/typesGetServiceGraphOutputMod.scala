package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceMod._UnmarshalledService
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetServiceGraphOutput", JSImport.Namespace)
@js.native
object typesGetServiceGraphOutputMod extends js.Object {
  @js.native
  trait GetServiceGraphOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The end of the time frame for which the graph was generated.</p>
      */
    var EndTime: js.UndefOr[Date] = js.native
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>The services that have processed a traced request during the specified time frame.</p>
      */
    var Services: js.UndefOr[js.Array[_UnmarshalledService]] = js.native
    /**
      * <p>The start of the time frame for which the graph was generated.</p>
      */
    var StartTime: js.UndefOr[Date] = js.native
  }
  
}

