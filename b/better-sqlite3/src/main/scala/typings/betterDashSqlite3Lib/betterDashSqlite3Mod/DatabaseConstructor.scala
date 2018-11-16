package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends ScalablyTyped.runtime.Instantiable1[/* filename */ java.lang.String, Database]
     with ScalablyTyped.runtime.Instantiable2[/* filename */ java.lang.String, /* options */ DatabaseOptions, Database] {
  @JSName("Integer")
  var Integer_Original: js.Function1[
    /* val */ integerLib.integerMod.IntegerNs.IntLike, 
    integerLib.integerMod.IntegerNs.IntClass
  ] = js.native
  var SqliteError: ScalablyTyped.runtime.Instantiable2[/* message */ java.lang.String, /* code */ java.lang.String, SqliteError] = js.native
  def apply(filename: java.lang.String): Database = js.native
  def apply(filename: java.lang.String, options: DatabaseOptions): Database = js.native
  def Integer(`val`: integerLib.integerMod.IntegerNs.IntLike): integerLib.integerMod.IntegerNs.IntClass = js.native
}

