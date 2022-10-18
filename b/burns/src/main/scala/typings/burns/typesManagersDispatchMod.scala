package typings.burns

import typings.burns.anon.Add
import typings.burns.anon.CreateBroadcaster
import typings.burns.anon.DequeueHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesManagersDispatchMod {
  
  /**
    * @param {typeof import("../repositories/config")} configRepository
    * @param {typeof import("../repositories/events")} eventsRepository
    */
  inline def apply(configRepository: CreateBroadcaster, eventsRepository: Add): DequeueHandlers = (^.asInstanceOf[js.Dynamic].apply(configRepository.asInstanceOf[js.Any], eventsRepository.asInstanceOf[js.Any])).asInstanceOf[DequeueHandlers]
  
  @JSImport("burns/types/managers/dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
