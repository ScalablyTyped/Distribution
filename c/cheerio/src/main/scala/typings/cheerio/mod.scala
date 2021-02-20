package typings.cheerio

import org.scalablytyped.runtime.Shortcut
import typings.cheerio.cheerio.CheerioAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cheerio", JSImport.Namespace)
  @js.native
  val ^ : CheerioAPI = js.native
  
  type _To = CheerioAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CheerioAPI = ^
}
