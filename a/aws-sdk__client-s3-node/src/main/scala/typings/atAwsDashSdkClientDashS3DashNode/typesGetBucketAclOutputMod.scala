package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._UnmarshalledGrant
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAclOutput", JSImport.Namespace)
@js.native
object typesGetBucketAclOutputMod extends js.Object {
  @js.native
  trait GetBucketAclOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[_UnmarshalledGrant]] = js.native
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[_UnmarshalledOwner] = js.native
  }
  
}

