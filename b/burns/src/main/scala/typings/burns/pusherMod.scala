package typings.burns

import typings.burns.anon.Broadcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pusherMod {
  
  /**
    * @param {Pusher.Options} config
    * @returns {import('../repositories/broadcasters').Broadcaster}
    */
  inline def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pusher.Options */ Any
  ): Broadcast = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Broadcast]
  
  @JSImport("burns/types/broadcasters/pusher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
