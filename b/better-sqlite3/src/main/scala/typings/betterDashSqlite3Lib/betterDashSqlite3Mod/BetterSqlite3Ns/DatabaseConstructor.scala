package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.BetterSqlite3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends org.scalablytyped.runtime.Instantiable1[/* filename */ java.lang.String, Database]
     with org.scalablytyped.runtime.Instantiable2[
      /* filename */ java.lang.String, 
      /* options */ betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs.Options, 
      Database
    ] {
  @JSName("Integer")
  var Integer_Original: js.Function1[
    /* val */ integerLib.integerMod.IntegerNs.IntLike, 
    integerLib.integerMod.IntegerNs.IntClass
  ] = js.native
  var SqliteError: org.scalablytyped.runtime.Instantiable2[
    /* message */ java.lang.String, 
    /* code */ java.lang.String, 
    betterDashSqlite3Lib.betterDashSqlite3Mod.SqliteError
  ] = js.native
  def apply(filename: java.lang.String): Database = js.native
  def apply(filename: java.lang.String, options: betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs.Options): Database = js.native
  def Integer(`val`: integerLib.integerMod.IntegerNs.IntLike): integerLib.integerMod.IntegerNs.IntClass = js.native
}

