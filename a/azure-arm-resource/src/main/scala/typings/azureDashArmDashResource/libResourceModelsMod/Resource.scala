package typings.azureDashArmDashResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource
  extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource {
  /**
    * Resource ID
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Resource location
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Resource name
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Resource tags
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Resource type
    */
  val `type`: js.UndefOr[String] = js.native
}

