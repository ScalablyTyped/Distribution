package typings.convict

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convictMod {
  import typings.std.Number
  import typings.std.RegExp

  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = typings.convict.convictStrings.Overwrite with T with U
  /* Rewritten from type alias, can be one of: 
    - typings.convict.convictStrings.`*`
    - typings.convict.convictStrings.int
    - typings.convict.convictStrings.port
    - typings.convict.convictStrings.windows_named_pipe
    - typings.convict.convictStrings.port_or_windows_named_pipe
    - typings.convict.convictStrings.url
    - typings.convict.convictStrings.email
    - typings.convict.convictStrings.ipaddress
    - typings.convict.convictStrings.duration
    - typings.convict.convictStrings.timestamp
    - typings.convict.convictStrings.nat
    - java.lang.String
    - js.Object
    - typings.std.Number
    - typings.std.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = _PredefinedFormat | String | js.Object | Number | RegExp | Boolean
  type Schema[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias convict.convict.Schema<T[P]> * / object | convict.convict.SchemaObj<T[P]>}
    */ typings.convict.convictStrings.Schema with T
}
