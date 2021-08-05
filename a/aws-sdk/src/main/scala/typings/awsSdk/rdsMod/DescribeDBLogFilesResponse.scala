package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBLogFilesResponse extends StObject {
  
  /**
    * The DB log files returned.
    */
  var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined
  
  /**
    * A pagination token that can be used in a later DescribeDBLogFiles request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeDBLogFilesResponse {
  
  inline def apply(): DescribeDBLogFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesResponse]
  }
  
  extension [Self <: DescribeDBLogFilesResponse](x: Self) {
    
    inline def setDescribeDBLogFiles(value: DescribeDBLogFilesList): Self = StObject.set(x, "DescribeDBLogFiles", value.asInstanceOf[js.Any])
    
    inline def setDescribeDBLogFilesUndefined: Self = StObject.set(x, "DescribeDBLogFiles", js.undefined)
    
    inline def setDescribeDBLogFilesVarargs(value: DescribeDBLogFilesDetails*): Self = StObject.set(x, "DescribeDBLogFiles", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
