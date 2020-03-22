package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunctionsRequest extends js.Object {
  /**
    * Set to ALL to include entries for all published versions of each function.
    */
  var FunctionVersion: js.UndefOr[typings.awsSdk.lambdaMod.FunctionVersion] = js.native
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * For Lambda@Edge functions, the AWS Region of the master function. For example, us-east-1 filters the list of functions to only include Lambda@Edge functions replicated from a master function in US East (N. Virginia). If specified, you must set FunctionVersion to ALL.
    */
  var MasterRegion: js.UndefOr[typings.awsSdk.lambdaMod.MasterRegion] = js.native
  /**
    * The maximum number of functions to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.native
}

object ListFunctionsRequest {
  @scala.inline
  def apply(
    FunctionVersion: FunctionVersion = null,
    Marker: String = null,
    MasterRegion: MasterRegion = null,
    MaxItems: Int | Double = null
  ): ListFunctionsRequest = {
    val __obj = js.Dynamic.literal()
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MasterRegion != null) __obj.updateDynamic("MasterRegion")(MasterRegion.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionsRequest]
  }
}

