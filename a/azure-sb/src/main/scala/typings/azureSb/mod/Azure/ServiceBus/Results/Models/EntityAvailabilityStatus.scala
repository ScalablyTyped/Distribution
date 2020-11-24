package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityAvailabilityStatus extends js.Object
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityAvailabilityStatus")
@js.native
object EntityAvailabilityStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityAvailabilityStatus with String] = js.native
  
  @js.native
  sealed trait Available extends EntityAvailabilityStatus
  /* "Available" */ @js.native
  object Available extends TopLevel[Available with String]
  
  @js.native
  sealed trait Limited extends EntityAvailabilityStatus
  /* "Limited" */ @js.native
  object Limited extends TopLevel[Limited with String]
  
  @js.native
  sealed trait Renaming extends EntityAvailabilityStatus
  /* "Renaming" */ @js.native
  object Renaming extends TopLevel[Renaming with String]
  
  @js.native
  sealed trait Restoring extends EntityAvailabilityStatus
  /* "Restoring" */ @js.native
  object Restoring extends TopLevel[Restoring with String]
  
  @js.native
  sealed trait Unknown extends EntityAvailabilityStatus
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
}
