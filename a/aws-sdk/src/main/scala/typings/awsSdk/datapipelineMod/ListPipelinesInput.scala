package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesInput extends js.Object {
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call ListPipelines with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.native
}

object ListPipelinesInput {
  @scala.inline
  def apply(): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesInput]
  }
  @scala.inline
  implicit class ListPipelinesInputOps[Self <: ListPipelinesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
  
}

