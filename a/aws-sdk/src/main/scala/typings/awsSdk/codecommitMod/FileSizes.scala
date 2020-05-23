package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSizes extends js.Object {
  /**
    * The size of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[FileSize] = js.native
  /**
    * The size of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[FileSize] = js.native
  /**
    * The size of a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[FileSize] = js.native
}

object FileSizes {
  @scala.inline
  def apply(
    base: js.UndefOr[FileSize] = js.undefined,
    destination: js.UndefOr[FileSize] = js.undefined,
    source: js.UndefOr[FileSize] = js.undefined
  ): FileSizes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSizes]
  }
}

