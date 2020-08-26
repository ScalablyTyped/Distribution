package typings.awsSdkClientCodecommitNode.typesLocationMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AFTER
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BEFORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * <p>The name of the file being compared, including its extension and subdirectory, if any.</p>
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * <p>The position of a change within a compared file, in line number format.</p>
    */
  var filePosition: js.UndefOr[Double] = js.native
  /**
    * <p>In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.</p>
    */
  var relativeFileVersion: js.UndefOr[BEFORE | AFTER | String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFilePosition(value: Double): Self = this.set("filePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePosition: Self = this.set("filePosition", js.undefined)
    @scala.inline
    def setRelativeFileVersion(value: BEFORE | AFTER | String): Self = this.set("relativeFileVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeFileVersion: Self = this.set("relativeFileVersion", js.undefined)
  }
  
}

