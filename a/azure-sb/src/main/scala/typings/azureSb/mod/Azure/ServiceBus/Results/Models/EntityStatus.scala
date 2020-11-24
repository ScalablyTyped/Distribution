package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityStatus extends js.Object
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityStatus")
@js.native
object EntityStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityStatus with String] = js.native
  
  @js.native
  sealed trait Active extends EntityStatus
  /* "Active" */ @js.native
  object Active extends TopLevel[Active with String]
  
  @js.native
  sealed trait Creating extends EntityStatus
  /* "Creating" */ @js.native
  object Creating extends TopLevel[Creating with String]
  
  @js.native
  sealed trait Deleting extends EntityStatus
  /* "Deleting" */ @js.native
  object Deleting extends TopLevel[Deleting with String]
  
  @js.native
  sealed trait Disabled extends EntityStatus
  /* "Disabled" */ @js.native
  object Disabled extends TopLevel[Disabled with String]
  
  @js.native
  sealed trait ReceiveDisabled extends EntityStatus
  /* "ReceiveDisabled" */ @js.native
  object ReceiveDisabled extends TopLevel[ReceiveDisabled with String]
  
  @js.native
  sealed trait Renaming extends EntityStatus
  /* "Renaming" */ @js.native
  object Renaming extends TopLevel[Renaming with String]
  
  @js.native
  sealed trait Restoring extends EntityStatus
  /* "Restoring" */ @js.native
  object Restoring extends TopLevel[Restoring with String]
  
  @js.native
  sealed trait SendDisabled extends EntityStatus
  /* "SendDisabled" */ @js.native
  object SendDisabled extends TopLevel[SendDisabled with String]
  
  @js.native
  sealed trait Unknown extends EntityStatus
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
}
