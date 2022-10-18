package typings.burns

import typings.burns.anon.Broadcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBroadcastersLogMod {
  
  /**
    * @param {?=} config
    * @returns {import('../repositories/broadcasters').Broadcaster}
    */
  inline def apply(): Broadcast = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Broadcast]
  inline def apply(config: Any): Broadcast = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Broadcast]
  
  @JSImport("burns/types/broadcasters/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
