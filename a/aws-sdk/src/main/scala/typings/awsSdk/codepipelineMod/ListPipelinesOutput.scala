package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list pipelines call to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of pipelines.
    */
  var pipelines: js.UndefOr[PipelineList] = js.native
}

object ListPipelinesOutput {
  @scala.inline
  def apply(): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesOutput]
  }
  @scala.inline
  implicit class ListPipelinesOutputOps[Self <: ListPipelinesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPipelinesVarargs(value: PipelineSummary*): Self = this.set("pipelines", js.Array(value :_*))
    @scala.inline
    def setPipelines(value: PipelineList): Self = this.set("pipelines", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelines: Self = this.set("pipelines", js.undefined)
  }
  
}

