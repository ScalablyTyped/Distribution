package typings.chromeRemoteInterface.mod

import typings.devtoolsProtocol.typesProtocolMappingMod.ProtocolMapping.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ Property in keyof T ]: (callback : (params : T[Property] extends [any]? T[Property][0] : undefined, sessionId : string | undefined): void): (): chrome-remote-interface.chrome-remote-interface.Client}
  }}}
  */
@js.native
trait EventCallbacks[T /* <: Events */] extends StObject
