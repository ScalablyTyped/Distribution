package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericResource extends Resource {
  /**
    * The identity of the resource.
    */
  var identity: js.UndefOr[Identity] = js.native
  /**
    * ID of the resource that manages this resource.
    */
  var managedBy: js.UndefOr[String] = js.native
  /**
    * The SKU of the resource.
    */
  var sku: js.UndefOr[Sku] = js.native
}

