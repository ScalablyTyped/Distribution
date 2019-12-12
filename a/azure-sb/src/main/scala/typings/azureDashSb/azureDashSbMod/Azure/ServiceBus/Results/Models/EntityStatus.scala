package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.TopLevel
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Active
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Creating
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Deleting
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Disabled
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.ReceiveDisabled
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Renaming
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Restoring
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.SendDisabled
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.EntityStatus.Unknown
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityStatus with String] = js.native
  /* "Active" */ @js.native
  object Active extends TopLevel[Active with String]
  
  /* "Creating" */ @js.native
  object Creating extends TopLevel[Creating with String]
  
  /* "Deleting" */ @js.native
  object Deleting extends TopLevel[Deleting with String]
  
  /* "Disabled" */ @js.native
  object Disabled extends TopLevel[Disabled with String]
  
  /* "ReceiveDisabled" */ @js.native
  object ReceiveDisabled extends TopLevel[ReceiveDisabled with String]
  
  /* "Renaming" */ @js.native
  object Renaming extends TopLevel[Renaming with String]
  
  /* "Restoring" */ @js.native
  object Restoring extends TopLevel[Restoring with String]
  
  /* "SendDisabled" */ @js.native
  object SendDisabled extends TopLevel[SendDisabled with String]
  
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
  
}

