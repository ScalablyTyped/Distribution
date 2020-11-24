package typings.azureArmResource.linkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLink
  extends typings.msRestAzure.mod.BaseResource {
  
  /**
    * The fully qualified ID of the resource link.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource link.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * Properties for resource link.
    */
  var properties: js.UndefOr[ResourceLinkProperties] = js.native
  
  /**
    * The resource link object.
    */
  val `type`: js.UndefOr[js.Any] = js.native
}
