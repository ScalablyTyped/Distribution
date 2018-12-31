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

