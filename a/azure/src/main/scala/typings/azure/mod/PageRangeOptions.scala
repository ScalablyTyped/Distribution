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
  
  @scala.inline
  def apply(): PageRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRangeOptions]
  }
  
  @scala.inline
  implicit class PageRangeOptionsMutableBuilder[Self <: PageRangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
