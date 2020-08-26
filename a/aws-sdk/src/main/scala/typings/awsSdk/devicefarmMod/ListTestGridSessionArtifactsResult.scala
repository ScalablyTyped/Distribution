package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionArtifactsResult extends js.Object {
  /**
    * A list of test grid session artifacts for a TestGridSession.
    */
  var artifacts: js.UndefOr[TestGridSessionArtifacts] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridSessionArtifactsResult {
  @scala.inline
  def apply(): ListTestGridSessionArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionArtifactsResult]
  }
  @scala.inline
  implicit class ListTestGridSessionArtifactsResultOps[Self <: ListTestGridSessionArtifactsResult] (val x: Self) extends AnyVal {
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
    def setArtifactsVarargs(value: TestGridSessionArtifact*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: TestGridSessionArtifacts): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

