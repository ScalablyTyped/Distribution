package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object DescribeObjectsOutput {
  @scala.inline
  def apply(pipelineObjects: PipelineObjectList): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
  @scala.inline
  implicit class DescribeObjectsOutputOps[Self <: DescribeObjectsOutput] (val x: Self) extends AnyVal {
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
    def setPipelineObjectsVarargs(value: PipelineObject*): Self = this.set("pipelineObjects", js.Array(value :_*))
    @scala.inline
    def setPipelineObjects(value: PipelineObjectList): Self = this.set("pipelineObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = this.set("hasMoreResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMoreResults: Self = this.set("hasMoreResults", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
  
}

