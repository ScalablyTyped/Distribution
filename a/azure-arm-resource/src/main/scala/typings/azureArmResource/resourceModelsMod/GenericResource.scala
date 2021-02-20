package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericResource extends Resource {
  
  /**
    * The identity of the resource.
    */
  var identity: js.UndefOr[Identity] = js.native
  
  /**
    * The kind of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * ID of the resource that manages this resource.
    */
  var managedBy: js.UndefOr[String] = js.native
  
  /**
    * The plan of the resource.
    */
  var plan: js.UndefOr[Plan] = js.native
  
  /**
    * The resource properties.
    */
  var properties: js.UndefOr[js.Any] = js.native
  
  /**
    * The SKU of the resource.
    */
  var sku: js.UndefOr[Sku] = js.native
}
