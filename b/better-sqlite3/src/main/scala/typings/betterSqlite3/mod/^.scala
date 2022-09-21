package typings.betterSqlite3.mod

import org.scalablytyped.runtime.TopLevel
import typings.betterSqlite3.mod.BetterSqlite3.DatabaseConstructor
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("better-sqlite3", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with typings.betterSqlite3.mod.BetterSqlite3.Database {
  def this(filename: String) = this()
  def this(filename: Buffer) = this()
  def this(filename: String, options: Options) = this()
  def this(filename: Buffer, options: Options) = this()
}
@JSImport("better-sqlite3", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[js.Object & DatabaseConstructor]
