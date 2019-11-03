package typings.azureDashArmDashResource.libResourceModelsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupListResult extends Array[ResourceGroup] {
  /**
    * The URL to use for getting the next set of results.
    */
  val nextLink: js.UndefOr[String] = js.native
}

