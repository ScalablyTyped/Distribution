package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildsOutput extends js.Object {
  
  /**
    * A collection of build resources that match the request.
    */
  var Builds: js.UndefOr[BuildList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}
object ListBuildsOutput {
  
  @scala.inline
  def apply(): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsOutput]
  }
  
  @scala.inline
  implicit class ListBuildsOutputOps[Self <: ListBuildsOutput] (val x: Self) extends AnyVal {
    
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
    def setBuildsVarargs(value: Build*): Self = this.set("Builds", js.Array(value :_*))
    
    @scala.inline
    def setBuilds(value: BuildList): Self = this.set("Builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilds: Self = this.set("Builds", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
