package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineDefaultParametersMessage extends StObject {
  
  /**
    * The name of the cache parameter group family. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: String
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeEngineDefaultParametersMessage {
  
  @scala.inline
  def apply(CacheParameterGroupFamily: String): DescribeEngineDefaultParametersMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupFamily = CacheParameterGroupFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngineDefaultParametersMessage]
  }
  
  @scala.inline
  implicit class DescribeEngineDefaultParametersMessageMutableBuilder[Self <: DescribeEngineDefaultParametersMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
