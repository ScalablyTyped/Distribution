package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checks whether the only parameter of `T[key]` is nullable i.e. all of
  * its properties are optional, and makes it optional if so.
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ key in keyof T ]: T[key] extends (params : any): any? chrome-remote-interface.chrome-remote-interface.IsNullableObj<std.Parameters<T[key]>[0]> extends true? (params : std.Parameters<T[key]>[0] | undefined): std.ReturnType<T[key]> : T[key] : T[key]}
  }}}
  */
@js.native
trait OptIfParamNullable[T] extends StObject
