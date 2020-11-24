package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureResource extends js.Object
@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource with Double] = js.native
  
  @js.native
  sealed trait AzureDevOps extends AzureResource
  /* 6 */ @js.native
  object AzureDevOps extends TopLevel[AzureDevOps with Double]
  
  @js.native
  sealed trait AzureKeyVault extends AzureResource
  /* 3 */ @js.native
  object AzureKeyVault extends TopLevel[AzureKeyVault with Double]
  
  @js.native
  sealed trait Graph extends AzureResource
  /* 4 */ @js.native
  object Graph extends TopLevel[Graph with Double]
  
  @js.native
  sealed trait MicrosoftResourceManagement extends AzureResource
  /* 5 */ @js.native
  object MicrosoftResourceManagement extends TopLevel[MicrosoftResourceManagement with Double]
  
  @js.native
  sealed trait OssRdbms extends AzureResource
  /* 2 */ @js.native
  object OssRdbms extends TopLevel[OssRdbms with Double]
  
  @js.native
  sealed trait ResourceManagement extends AzureResource
  /* 0 */ @js.native
  object ResourceManagement extends TopLevel[ResourceManagement with Double]
  
  @js.native
  sealed trait Sql extends AzureResource
  /* 1 */ @js.native
  object Sql extends TopLevel[Sql with Double]
}
