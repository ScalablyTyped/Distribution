package typings.chrome.anon

import typings.chrome.chrome.documentScan.DocumentScanCallbackArg
import typings.chrome.chrome.documentScan.DocumentScanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdocumentScan extends StObject {
  
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}
object TypeofdocumentScan {
  
  inline def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2(scan))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
  
  extension [Self <: TypeofdocumentScan](x: Self) {
    
    inline def setScan(value: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Unit): Self = StObject.set(x, "scan", js.Any.fromFunction2(value))
  }
}
