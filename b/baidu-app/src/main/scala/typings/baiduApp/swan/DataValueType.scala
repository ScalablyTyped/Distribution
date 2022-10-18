package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * There are two valid ways to define the type of data / properties:
  *
  * 1. { name: valueType }
  * 2. { name: { type: valueType, value?: value } }
  *
  * and this conditional type will extract that out so the call-site will typecheck.
  *
  * Note this is different from PropOptions as it is the definitions you passed to Component function
  * whereas this type is for call-site.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Def extends {type (args : ...any): infer T,   value :infer T | undefined} ? T : Def extends (args : ...any): infer T ? T : never
  }}}
  */
@js.native
trait DataValueType[Def] extends StObject
