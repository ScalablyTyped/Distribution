package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchPropertiesRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: typings.awsSdk.ssmMod.OperatingSystem = js.native
  /**
    * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.
    */
  var PatchSet: js.UndefOr[typings.awsSdk.ssmMod.PatchSet] = js.native
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty = js.native
}

object DescribePatchPropertiesRequest {
  @scala.inline
  def apply(OperatingSystem: OperatingSystem, Property: PatchProperty): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
  @scala.inline
  implicit class DescribePatchPropertiesRequestOps[Self <: DescribePatchPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: PatchProperty): Self = this.set("Property", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPatchSet(value: PatchSet): Self = this.set("PatchSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchSet: Self = this.set("PatchSet", js.undefined)
  }
  
}

