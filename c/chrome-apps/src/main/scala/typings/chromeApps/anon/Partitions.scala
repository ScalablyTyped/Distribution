package typings.chromeApps.anon

import typings.chromeApps.chrome.runtime.WebViewPartition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partitions extends StObject {
  
  /** Webview partition list */
  var partitions: js.Array[WebViewPartition]
}
object Partitions {
  
  inline def apply(partitions: js.Array[WebViewPartition]): Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partitions]
  }
  
  extension [Self <: Partitions](x: Self) {
    
    inline def setPartitions(value: js.Array[WebViewPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: WebViewPartition*): Self = StObject.set(x, "partitions", js.Array(value :_*))
  }
}
