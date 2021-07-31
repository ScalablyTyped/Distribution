package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxiesResponse extends StObject {
  
  /**
    * A return value representing an arbitrary number of DBProxy data structures.
    */
  var DBProxies: js.UndefOr[DBProxyList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeDBProxiesResponse {
  
  @scala.inline
  def apply(): DescribeDBProxiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxiesResponse]
  }
  
  @scala.inline
  implicit class DescribeDBProxiesResponseMutableBuilder[Self <: DescribeDBProxiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxies(value: DBProxyList): Self = StObject.set(x, "DBProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxiesUndefined: Self = StObject.set(x, "DBProxies", js.undefined)
    
    @scala.inline
    def setDBProxiesVarargs(value: DBProxy*): Self = StObject.set(x, "DBProxies", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
