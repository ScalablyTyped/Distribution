package typings.codemirrorLegacyModes

import typings.codemirrorLanguage.mod.StreamParser
import typings.codemirrorLegacyModes.anon.BackslashStringEscapes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeSqlMod {
  
  @JSImport("@codemirror/legacy-modes/mode/sql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "cassandra")
  @js.native
  val cassandra: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "esper")
  @js.native
  val esper: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "gpSQL")
  @js.native
  val gpSQL: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "gql")
  @js.native
  val gql: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "hive")
  @js.native
  val hive: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "mariaDB")
  @js.native
  val mariaDB: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "msSQL")
  @js.native
  val msSQL: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "mySQL")
  @js.native
  val mySQL: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "pgSQL")
  @js.native
  val pgSQL: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "plSQL")
  @js.native
  val plSQL: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "sparkSQL")
  @js.native
  val sparkSQL: StreamParser[Any] = js.native
  
  inline def sql(conf: BackslashStringEscapes): StreamParser[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(conf.asInstanceOf[js.Any]).asInstanceOf[StreamParser[Any]]
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "sqlite")
  @js.native
  val sqlite: StreamParser[Any] = js.native
  
  @JSImport("@codemirror/legacy-modes/mode/sql", "standardSQL")
  @js.native
  val standardSQL: StreamParser[Any] = js.native
}
