package typings.chromeRemoteInterface.mod

import typings.devtoolsProtocol.typesProtocolMappingMod.ProtocolMapping.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// '<domain>.<event>' i.e. Page.loadEventFired
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ Property in keyof T ]: (): T[Property] extends [any]? std.Promise<T[Property][0]> : std.Promise<void>}
  }}}
  */
@js.native
trait EventPromises[T /* <: Events */] extends StObject
