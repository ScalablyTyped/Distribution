package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyTargetsResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary number of DBProxyTarget objects, containing details of the corresponding targets.
    */
  var Targets: js.UndefOr[TargetList] = js.undefined
}
object DescribeDBProxyTargetsResponse {
  
  @scala.inline
  def apply(): DescribeDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeDBProxyTargetsResponseMutableBuilder[Self <: DescribeDBProxyTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTargets(value: TargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: DBProxyTarget*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
