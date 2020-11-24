package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBLogFilesResponse extends js.Object {
  
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
  implicit class DescribeDBLogFilesResponseOps[Self <: DescribeDBLogFilesResponse] (val x: Self) extends AnyVal {
    
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
    def setDescribeDBLogFilesVarargs(value: DescribeDBLogFilesDetails*): Self = this.set("DescribeDBLogFiles", js.Array(value :_*))
    
    @scala.inline
    def setDescribeDBLogFiles(value: DescribeDBLogFilesList): Self = this.set("DescribeDBLogFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribeDBLogFiles: Self = this.set("DescribeDBLogFiles", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
