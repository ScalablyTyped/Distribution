package typings.dbJs

import org.scalablytyped.runtime.Shortcut
import typings.dbJs.DbJs.DbJsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("db.js", JSImport.Namespace)
  @js.native
  val ^ : DbJsStatic = js.native
  
  type _To = DbJsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DbJsStatic = ^
}
