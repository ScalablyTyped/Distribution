package typings.csvStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es5Mod {
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Null | typings.std.Error], 
    /* output */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Cast[T] = js.Function2[
    /* value */ T, 
    /* context */ typings.csvStringify.es5Mod.CastingContext, 
    java.lang.String
  ]
  type Input = js.Array[js.Any]
  type PlainObject[T] = typings.std.Record[java.lang.String, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.csvStringify.csvStringifyStrings.auto
    - typings.csvStringify.csvStringifyStrings.unix
    - typings.csvStringify.csvStringifyStrings.mac
    - typings.csvStringify.csvStringifyStrings.windows
    - typings.csvStringify.csvStringifyStrings.ascii
    - typings.csvStringify.csvStringifyStrings.unicode
  */
  type RecordDelimiter = typings.csvStringify.es5Mod._RecordDelimiter | java.lang.String | typings.node.Buffer
}
