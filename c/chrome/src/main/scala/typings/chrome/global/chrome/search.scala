package typings.chrome.global.chrome

import typings.chrome.chrome.search.QueryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Search
////////////////////
/**
  * Use the chrome.search API to search via the default provider.
  * Permissions:  "search"
  */
object search {
  
  @JSGlobal("chrome.search")
  @js.native
  val ^ : js.Any = js.native
  
  inline def query(options: QueryInfo, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
