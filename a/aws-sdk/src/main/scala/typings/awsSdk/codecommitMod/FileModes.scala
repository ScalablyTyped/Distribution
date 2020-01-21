package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileModes extends js.Object {
  /**
    * The file mode of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The file mode of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The file mode of a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[FileModeTypeEnum] = js.native
}

object FileModes {
  @scala.inline
  def apply(
    base: FileModeTypeEnum = null,
    destination: FileModeTypeEnum = null,
    source: FileModeTypeEnum = null
  ): FileModes = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileModes]
  }
}

