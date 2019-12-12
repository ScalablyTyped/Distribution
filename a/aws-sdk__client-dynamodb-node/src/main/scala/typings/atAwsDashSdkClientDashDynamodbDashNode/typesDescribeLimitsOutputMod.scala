package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeLimitsOutput", JSImport.Namespace)
@js.native
object typesDescribeLimitsOutputMod extends js.Object {
  @js.native
  trait DescribeLimitsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The maximum total read capacity units that your account allows you to provision across all of your tables in this region.</p>
      */
    var AccountMaxReadCapacityUnits: js.UndefOr[Double] = js.native
    /**
      * <p>The maximum total write capacity units that your account allows you to provision across all of your tables in this region.</p>
      */
    var AccountMaxWriteCapacityUnits: js.UndefOr[Double] = js.native
    /**
      * <p>The maximum read capacity units that your account allows you to provision for a new table that you are creating in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).</p>
      */
    var TableMaxReadCapacityUnits: js.UndefOr[Double] = js.native
    /**
      * <p>The maximum write capacity units that your account allows you to provision for a new table that you are creating in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).</p>
      */
    var TableMaxWriteCapacityUnits: js.UndefOr[Double] = js.native
  }
  
}

