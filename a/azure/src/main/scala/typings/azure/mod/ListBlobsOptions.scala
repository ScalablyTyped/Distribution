package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBlobsOptions
  extends StObject
     with ListContainersOptions {
  
  var delimiter: js.UndefOr[String] = js.undefined
}
object ListBlobsOptions {
  
  inline def apply(marker: String): ListBlobsOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBlobsOptions]
  }
  
  extension [Self <: ListBlobsOptions](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
  }
}
