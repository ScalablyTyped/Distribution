package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesInput extends js.Object {
  /**
    * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

