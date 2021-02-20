package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityAvailabilityStatus extends StObject
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityAvailabilityStatus")
@js.native
object EntityAvailabilityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityAvailabilityStatus with String] = js.native
  
  @js.native
  sealed trait Available extends EntityAvailabilityStatus
  /* "Available" */ val Available: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Available with String = js.native
  
  @js.native
  sealed trait Limited extends EntityAvailabilityStatus
  /* "Limited" */ val Limited: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Limited with String = js.native
  
  @js.native
  sealed trait Renaming extends EntityAvailabilityStatus
  /* "Renaming" */ val Renaming: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Renaming with String = js.native
  
  @js.native
  sealed trait Restoring extends EntityAvailabilityStatus
  /* "Restoring" */ val Restoring: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Restoring with String = js.native
  
  @js.native
  sealed trait Unknown extends EntityAvailabilityStatus
  /* "Unknown" */ val Unknown: typings.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Unknown with String = js.native
}
