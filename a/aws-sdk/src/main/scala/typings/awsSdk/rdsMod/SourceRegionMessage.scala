package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRegionMessage extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a read replica or a DB snapshot from.
    */
  var SourceRegions: js.UndefOr[SourceRegionList] = js.native
}
object SourceRegionMessage {
  
  @scala.inline
  def apply(): SourceRegionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceRegionMessage]
  }
  
  @scala.inline
  implicit class SourceRegionMessageOps[Self <: SourceRegionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setSourceRegionsVarargs(value: SourceRegion*): Self = this.set("SourceRegions", js.Array(value :_*))
    
    @scala.inline
    def setSourceRegions(value: SourceRegionList): Self = this.set("SourceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRegions: Self = this.set("SourceRegions", js.undefined)
  }
}
