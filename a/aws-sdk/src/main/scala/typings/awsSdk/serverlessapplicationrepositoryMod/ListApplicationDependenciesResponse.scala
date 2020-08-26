package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationDependenciesResponse extends js.Object {
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[listOfApplicationDependencySummary] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListApplicationDependenciesResponse {
  @scala.inline
  def apply(): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
  @scala.inline
  implicit class ListApplicationDependenciesResponseOps[Self <: ListApplicationDependenciesResponse] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: ApplicationDependencySummary*): Self = this.set("Dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: listOfApplicationDependencySummary): Self = this.set("Dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("Dependencies", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

