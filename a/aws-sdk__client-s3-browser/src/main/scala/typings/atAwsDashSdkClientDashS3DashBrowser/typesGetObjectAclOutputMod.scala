package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGrantMod._UnmarshalledGrant
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetObjectAclOutput", JSImport.Namespace)
@js.native
object typesGetObjectAclOutputMod extends js.Object {
  @js.native
  trait GetObjectAclOutput
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
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

