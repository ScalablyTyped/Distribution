package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBLogFilesResponse extends StObject {
  
  /**
    * The DB log files returned.
    */
  var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.native
  
  /**
    * A pagination token that can be used in a later DescribeDBLogFiles request.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeDBLogFilesResponse {
  
  @scala.inline
  def apply(): DescribeDBLogFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesResponse]
  }
  
  @scala.inline
  implicit class DescribeDBLogFilesResponseMutableBuilder[Self <: DescribeDBLogFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeDBLogFiles(value: DescribeDBLogFilesList): Self = StObject.set(x, "DescribeDBLogFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeDBLogFilesUndefined: Self = StObject.set(x, "DescribeDBLogFiles", js.undefined)
    
    @scala.inline
    def setDescribeDBLogFilesVarargs(value: DescribeDBLogFilesDetails*): Self = StObject.set(x, "DescribeDBLogFiles", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
