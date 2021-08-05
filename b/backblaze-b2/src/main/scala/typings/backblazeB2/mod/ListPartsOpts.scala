package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsOpts
  extends StObject
     with CommonArgs {
  
  var fileId: String
  
  /**
    * maximum part count
    * max value 100
    */
  var maxPartCount: js.UndefOr[Double] = js.undefined
  
  var startPartNumber: js.UndefOr[Double] = js.undefined
}
object ListPartsOpts {
  
  inline def apply(fileId: String): ListPartsOpts = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOpts]
  }
  
  extension [Self <: ListPartsOpts](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setMaxPartCount(value: Double): Self = StObject.set(x, "maxPartCount", value.asInstanceOf[js.Any])
    
    inline def setMaxPartCountUndefined: Self = StObject.set(x, "maxPartCount", js.undefined)
    
    inline def setStartPartNumber(value: Double): Self = StObject.set(x, "startPartNumber", value.asInstanceOf[js.Any])
    
    inline def setStartPartNumberUndefined: Self = StObject.set(x, "startPartNumber", js.undefined)
  }
}
