package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ event in chrome-remote-interface.chrome-remote-interface.GetEvent<D> ]: (listener : (params : chrome-remote-interface.chrome-remote-interface.GetReturnType<D, event>, sessionId : string | undefined): void): (): chrome-remote-interface.chrome-remote-interface.Client}
  }}}
  */
@js.native
trait DoEventListeners[D /* <: String */] extends StObject
