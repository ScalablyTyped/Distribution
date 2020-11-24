package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBProxiesResponse extends js.Object {
  
  /**
    * A return value representing an arbitrary number of DBProxy data structures.
    */
  var DBProxies: js.UndefOr[DBProxyList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeDBProxiesResponse {
  
  @scala.inline
  def apply(): DescribeDBProxiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxiesResponse]
  }
  
  @scala.inline
  implicit class DescribeDBProxiesResponseOps[Self <: DescribeDBProxiesResponse] (val x: Self) extends AnyVal {
    
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
    def setDBProxiesVarargs(value: DBProxy*): Self = this.set("DBProxies", js.Array(value :_*))
    
    @scala.inline
    def setDBProxies(value: DBProxyList): Self = this.set("DBProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBProxies: Self = this.set("DBProxies", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
