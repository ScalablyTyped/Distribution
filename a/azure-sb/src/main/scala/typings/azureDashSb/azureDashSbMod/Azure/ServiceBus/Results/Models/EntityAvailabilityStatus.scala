package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.TopLevel
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Available
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Limited
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Renaming
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Restoring
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Unknown
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityAvailabilityStatus with String] = js.native
  /* "Available" */ @js.native
  object Available extends TopLevel[Available with String]
  
  /* "Limited" */ @js.native
  object Limited extends TopLevel[Limited with String]
  
  /* "Renaming" */ @js.native
  object Renaming extends TopLevel[Renaming with String]
  
  /* "Restoring" */ @js.native
  object Restoring extends TopLevel[Restoring with String]
  
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
  
}

