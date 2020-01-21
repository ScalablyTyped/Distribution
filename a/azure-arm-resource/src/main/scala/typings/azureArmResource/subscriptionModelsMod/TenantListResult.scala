package typings.azureArmResource.subscriptionModelsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantListResult extends Array[TenantIdDescription] {
  /**
    * The URL to use for getting the next set of results.
    */
  var nextLink: String = js.native
}

