package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  /**
    * The path to the Amazon S3 target.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
}

object S3Target {
  @scala.inline
  def apply(): S3Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Target]
  }
  @scala.inline
  implicit class S3TargetOps[Self <: S3Target] (val x: Self) extends AnyVal {
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

