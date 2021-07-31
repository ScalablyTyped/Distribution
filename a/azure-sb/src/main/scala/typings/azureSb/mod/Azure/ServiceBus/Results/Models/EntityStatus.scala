package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityStatus extends StObject
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityStatus")
@js.native
object EntityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityStatus & String] = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with EntityStatus
  /* "Active" */ val Active: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Active & String = js.native
  
  @js.native
  sealed trait Creating
    extends StObject
       with EntityStatus
  /* "Creating" */ val Creating: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Creating & String = js.native
  
  @js.native
  sealed trait Deleting
    extends StObject
       with EntityStatus
  /* "Deleting" */ val Deleting: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Deleting & String = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EntityStatus
  /* "Disabled" */ val Disabled: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Disabled & String = js.native
  
  @js.native
  sealed trait ReceiveDisabled
    extends StObject
       with EntityStatus
  /* "ReceiveDisabled" */ val ReceiveDisabled: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.ReceiveDisabled & String = js.native
  
  @js.native
  sealed trait Renaming
    extends StObject
       with EntityStatus
  /* "Renaming" */ val Renaming: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Renaming & String = js.native
  
  @js.native
  sealed trait Restoring
    extends StObject
       with EntityStatus
  /* "Restoring" */ val Restoring: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Restoring & String = js.native
  
  @js.native
  sealed trait SendDisabled
    extends StObject
       with EntityStatus
  /* "SendDisabled" */ val SendDisabled: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.SendDisabled & String = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EntityStatus
  /* "Unknown" */ val Unknown: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Unknown & String = js.native
}
