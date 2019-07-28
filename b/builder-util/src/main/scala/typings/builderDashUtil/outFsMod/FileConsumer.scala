package typings.builderDashUtil.outFsMod

import typings.fsDashExtraDashP.fsDashExtraDashPMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConsumer extends js.Object {
  /**
    * @default false
    */
  var isIncludeDir: js.UndefOr[Boolean] = js.undefined
  def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): js.Any
}

object FileConsumer {
  @scala.inline
  def apply(
    consume: (String, Stats, String, js.Array[String]) => js.Any,
    isIncludeDir: js.UndefOr[Boolean] = js.undefined
  ): FileConsumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction4(consume))
    if (!js.isUndefined(isIncludeDir)) __obj.updateDynamic("isIncludeDir")(isIncludeDir)
    __obj.asInstanceOf[FileConsumer]
  }
}

