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
  def apply(): ListFunctionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsRequest]
  }
  @scala.inline
  implicit class ListFunctionsRequestOps[Self <: ListFunctionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctionVersion(value: FunctionVersion): Self = this.set("FunctionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionVersion: Self = this.set("FunctionVersion", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMasterRegion(value: MasterRegion): Self = this.set("MasterRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterRegion: Self = this.set("MasterRegion", js.undefined)
    @scala.inline
    def setMaxItems(value: MaxListItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
  
}

