package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityStatus extends js.Object

@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityStatus")
@js.native
object EntityStatus extends js.Object {
  @js.native
  sealed trait Active extends EntityStatus
  
  @js.native
  sealed trait Creating extends EntityStatus
  
  @js.native
  sealed trait Deleting extends EntityStatus
  
  @js.native
  sealed trait Disabled extends EntityStatus
  
  @js.native
  sealed trait ReceiveDisabled extends EntityStatus
  
  @js.native
  sealed trait Renaming extends EntityStatus
  
  @js.native
  sealed trait Restoring extends EntityStatus
  
  @js.native
  sealed trait SendDisabled extends EntityStatus
  
  @js.native
  sealed trait Unknown extends EntityStatus
  
  /* "Active" */ val Active: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Active with String = js.native
  /* "Creating" */ val Creating: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Creating with String = js.native
  /* "Deleting" */ val Deleting: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Deleting with String = js.native
  /* "Disabled" */ val Disabled: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Disabled with String = js.native
  /* "ReceiveDisabled" */ val ReceiveDisabled: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.ReceiveDisabled with String = js.native
  /* "Renaming" */ val Renaming: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Renaming with String = js.native
  /* "Restoring" */ val Restoring: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Restoring with String = js.native
  /* "SendDisabled" */ val SendDisabled: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.SendDisabled with String = js.native
  /* "Unknown" */ val Unknown: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityStatus with String] = js.native
}

