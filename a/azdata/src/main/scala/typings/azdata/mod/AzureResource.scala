package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AzureResource extends js.Object

@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends js.Object {
  @js.native
  sealed trait ResourceManagement extends AzureResource
  
  @js.native
  sealed trait Sql extends AzureResource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource with Double] = js.native
  /* 0 */ @js.native
  object ResourceManagement extends TopLevel[ResourceManagement with Double]
  
  /* 1 */ @js.native
  object Sql extends TopLevel[Sql with Double]
  
}

