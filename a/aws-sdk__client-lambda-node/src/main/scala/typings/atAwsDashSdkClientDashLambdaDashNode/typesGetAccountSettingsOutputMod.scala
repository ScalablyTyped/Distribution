package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountLimitMod._UnmarshalledAccountLimit
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountUsageMod._UnmarshalledAccountUsage
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/GetAccountSettingsOutput", JSImport.Namespace)
@js.native
object typesGetAccountSettingsOutputMod extends js.Object {
  @js.native
  trait GetAccountSettingsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Limits related to concurrency and code storage.</p>
      */
    var AccountLimit: js.UndefOr[_UnmarshalledAccountLimit] = js.native
    /**
      * <p>The number of functions and amount of storage in use.</p>
      */
    var AccountUsage: js.UndefOr[_UnmarshalledAccountUsage] = js.native
  }
  
}

