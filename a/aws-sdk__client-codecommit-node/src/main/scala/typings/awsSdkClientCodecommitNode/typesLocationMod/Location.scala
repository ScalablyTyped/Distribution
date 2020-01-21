package typings.awsSdkClientCodecommitNode.typesLocationMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AFTER
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BEFORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * <p>The name of the file being compared, including its extension and subdirectory, if any.</p>
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The position of a change within a compared file, in line number format.</p>
    */
  var filePosition: js.UndefOr[Double] = js.undefined
  /**
    * <p>In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.</p>
    */
  var relativeFileVersion: js.UndefOr[BEFORE | AFTER | String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    filePath: String = null,
    filePosition: Int | Double = null,
    relativeFileVersion: BEFORE | AFTER | String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (filePosition != null) __obj.updateDynamic("filePosition")(filePosition.asInstanceOf[js.Any])
    if (relativeFileVersion != null) __obj.updateDynamic("relativeFileVersion")(relativeFileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

