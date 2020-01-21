package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Each entry in the array is a structure containing: Title (string) KBId (string) Classification (string) Severity (string) State (string, such as "INSTALLED" or "FAILED") InstalledTime (DateTime) InstalledBy (string)
    */
  var Patches: js.UndefOr[PatchComplianceDataList] = js.native
}

object DescribeInstancePatchesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Patches: PatchComplianceDataList = null): DescribeInstancePatchesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Patches != null) __obj.updateDynamic("Patches")(Patches.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchesResult]
  }
}

