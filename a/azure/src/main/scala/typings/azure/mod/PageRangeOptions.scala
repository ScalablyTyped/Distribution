package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRangeOptions
  extends StObject
     with LeaseIdOptions {
  
  var rangeEnd: js.UndefOr[Double] = js.undefined
  
  var rangeStart: js.UndefOr[Double] = js.undefined
  
  var snapshotId: js.UndefOr[String] = js.undefined
}
object PageRangeOptions {
  
  inline def apply(): PageRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRangeOptions]
  }
  
  extension [Self <: PageRangeOptions](x: Self) {
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
