package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityAvailabilityStatus extends js.Object

@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityAvailabilityStatus")
@js.native
object EntityAvailabilityStatus extends js.Object {
  @js.native
  sealed trait Available extends EntityAvailabilityStatus
  
  @js.native
  sealed trait Limited extends EntityAvailabilityStatus
  
  @js.native
  sealed trait Renaming extends EntityAvailabilityStatus
  
  @js.native
  sealed trait Restoring extends EntityAvailabilityStatus
  
  @js.native
  sealed trait Unknown extends EntityAvailabilityStatus
  
  /* "Available" */ val Available: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Available with String = js.native
  /* "Limited" */ val Limited: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Limited with String = js.native
  /* "Renaming" */ val Renaming: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Renaming with String = js.native
  /* "Restoring" */ val Restoring: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Restoring with String = js.native
  /* "Unknown" */ val Unknown: typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityAvailabilityStatus with String] = js.native
}

