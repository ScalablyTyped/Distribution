package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBLogFilesDetails extends js.Object {
  
  /**
    * A POSIX timestamp when the last log entry was written.
    */
  var LastWritten: js.UndefOr[Long] = js.native
  
  /**
    * The name of the log file for the specified DB instance.
    */
  var LogFileName: js.UndefOr[String] = js.native
  
  /**
    * The size, in bytes, of the log file for the specified DB instance.
    */
  var Size: js.UndefOr[Long] = js.native
}
object DescribeDBLogFilesDetails {
  
  @scala.inline
  def apply(): DescribeDBLogFilesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesDetails]
  }
  
  @scala.inline
  implicit class DescribeDBLogFilesDetailsOps[Self <: DescribeDBLogFilesDetails] (val x: Self) extends AnyVal {
    
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
    def setLastWritten(value: Long): Self = this.set("LastWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastWritten: Self = this.set("LastWritten", js.undefined)
    
    @scala.inline
    def setLogFileName(value: String): Self = this.set("LogFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFileName: Self = this.set("LogFileName", js.undefined)
    
    @scala.inline
    def setSize(value: Long): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
}
