package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureResource extends StObject
@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource & Double] = js.native
  
  @js.native
  sealed trait AzureDevOps
    extends StObject
       with AzureResource
  /* 6 */ val AzureDevOps: typings.azdata.mod.AzureResource.AzureDevOps & Double = js.native
  
  @js.native
  sealed trait AzureKeyVault
    extends StObject
       with AzureResource
  /* 3 */ val AzureKeyVault: typings.azdata.mod.AzureResource.AzureKeyVault & Double = js.native
  
  @js.native
  sealed trait Graph
    extends StObject
       with AzureResource
  /* 4 */ val Graph: typings.azdata.mod.AzureResource.Graph & Double = js.native
  
  @js.native
  sealed trait MicrosoftResourceManagement
    extends StObject
       with AzureResource
  /* 5 */ val MicrosoftResourceManagement: typings.azdata.mod.AzureResource.MicrosoftResourceManagement & Double = js.native
  
  @js.native
  sealed trait OssRdbms
    extends StObject
       with AzureResource
  /* 2 */ val OssRdbms: typings.azdata.mod.AzureResource.OssRdbms & Double = js.native
  
  @js.native
  sealed trait ResourceManagement
    extends StObject
       with AzureResource
  /* 0 */ val ResourceManagement: typings.azdata.mod.AzureResource.ResourceManagement & Double = js.native
  
  @js.native
  sealed trait Sql
    extends StObject
       with AzureResource
  /* 1 */ val Sql: typings.azdata.mod.AzureResource.Sql & Double = js.native
}
