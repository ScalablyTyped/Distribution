package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRegionMessage extends StObject {
  
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
  implicit class SourceRegionMessageMutableBuilder[Self <: SourceRegionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSourceRegions(value: SourceRegionList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionsUndefined: Self = StObject.set(x, "SourceRegions", js.undefined)
    
    @scala.inline
    def setSourceRegionsVarargs(value: SourceRegion*): Self = StObject.set(x, "SourceRegions", js.Array(value :_*))
  }
}
