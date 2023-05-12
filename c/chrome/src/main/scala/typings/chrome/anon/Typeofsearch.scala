package typings.chrome.anon

import typings.chrome.chrome.search.QueryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsearch extends StObject {
  
  def query(options: QueryInfo): js.Promise[Unit] = js.native
  def query(options: QueryInfo, callback: js.Function0[Unit]): Unit = js.native
}
