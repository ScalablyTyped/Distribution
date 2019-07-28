package typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.betterDashSqlite3.TypeofInteger
import typings.betterDashSqlite3.betterDashSqlite3Mod.Options
import typings.integer.integerMod.IntClass
import typings.integer.integerMod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends Instantiable1[
      /* filename */ String, 
      typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Database
    ]
     with Instantiable2[
      /* filename */ String, 
      /* options */ Options, 
      typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Database
    ] {
  @JSName("Integer")
  var Integer_Original: (js.Function1[/* val */ IntLike, IntClass]) with TypeofInteger = js.native
  var SqliteError: Instantiable2[
    /* message */ String, 
    /* code */ String, 
    typings.betterDashSqlite3.betterDashSqlite3Mod.SqliteError
  ] = js.native
  def apply(filename: String): typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Database = js.native
  def apply(filename: String, options: Options): typings.betterDashSqlite3.betterDashSqlite3Mod.BetterSqlite3Ns.Database = js.native
  def Integer(`val`: IntLike): IntClass = js.native
}

