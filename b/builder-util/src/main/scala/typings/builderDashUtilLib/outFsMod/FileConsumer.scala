package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConsumer extends js.Object {
  /**
    * @default false
    */
  var isIncludeDir: js.UndefOr[scala.Boolean] = js.undefined
  def consume(
    file: java.lang.String,
    fileStat: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats,
    parent: java.lang.String,
    siblingNames: js.Array[java.lang.String]
  ): js.Any
}

object FileConsumer {
  @scala.inline
  def apply(
    consume: js.Function4[
      java.lang.String, 
      fsDashExtraDashPLib.fsDashExtraDashPMod.Stats, 
      java.lang.String, 
      js.Array[java.lang.String], 
      js.Any
    ],
    isIncludeDir: js.UndefOr[scala.Boolean] = js.undefined
  ): FileConsumer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consume")(consume)
    if (!js.isUndefined(isIncludeDir)) __obj.updateDynamic("isIncludeDir")(isIncludeDir)
    __obj.asInstanceOf[FileConsumer]
  }
}

