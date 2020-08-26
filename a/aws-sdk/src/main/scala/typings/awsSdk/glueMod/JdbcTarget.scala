package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.glueMod.ConnectionName] = js.native
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  /**
    * The path of the JDBC target.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
}

object JdbcTarget {
  @scala.inline
  def apply(): JdbcTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdbcTarget]
  }
  @scala.inline
  implicit class JdbcTargetOps[Self <: JdbcTarget] (val x: Self) extends AnyVal {
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
    def setConnectionName(value: ConnectionName): Self = this.set("ConnectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionName: Self = this.set("ConnectionName", js.undefined)
    @scala.inline
    def setExclusionsVarargs(value: Path*): Self = this.set("Exclusions", js.Array(value :_*))
    @scala.inline
    def setExclusions(value: PathList): Self = this.set("Exclusions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusions: Self = this.set("Exclusions", js.undefined)
    @scala.inline
    def setPath(value: Path): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

