package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroup
  extends typings.msRestAzure.mod.BaseResource {
  
  /**
    * The ID of the resource group.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The location of the resource group. It cannot be changed after the resource group has been
    * created. It must be one of the supported Azure locations.
    */
  var location: String = js.native
  
  /**
    * The ID of the resource that manages this resource group.
    */
  var managedBy: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource group.
    */
  val name: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[ResourceGroupProperties] = js.native
  
  /**
    * The tags attached to the resource group.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The type of the resource group.
    */
  val `type`: js.UndefOr[String] = js.native
}
