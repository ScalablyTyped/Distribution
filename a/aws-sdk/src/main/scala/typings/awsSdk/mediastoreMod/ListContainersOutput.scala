package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContainersOutput extends js.Object {
  /**
    * The names of the containers.
    */
  var Containers: ContainerList = js.native
  /**
    *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListContainersOutput {
  @scala.inline
  def apply(Containers: ContainerList): ListContainersOutput = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersOutput]
  }
  @scala.inline
  implicit class ListContainersOutputOps[Self <: ListContainersOutput] (val x: Self) extends AnyVal {
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
    def setContainersVarargs(value: Container*): Self = this.set("Containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: ContainerList): Self = this.set("Containers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

