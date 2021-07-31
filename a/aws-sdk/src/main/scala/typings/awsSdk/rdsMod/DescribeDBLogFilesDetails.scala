package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBLogFilesDetails extends StObject {
  
  /**
    * A POSIX timestamp when the last log entry was written.
    */
  var LastWritten: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the log file for the specified DB instance.
    */
  var LogFileName: js.UndefOr[String] = js.undefined
  
  /**
    * The size, in bytes, of the log file for the specified DB instance.
    */
  var Size: js.UndefOr[Long] = js.undefined
}
object DescribeDBLogFilesDetails {
  
  @scala.inline
  def apply(): DescribeDBLogFilesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesDetails]
  }
  
  @scala.inline
  implicit class DescribeDBLogFilesDetailsMutableBuilder[Self <: DescribeDBLogFilesDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastWritten(value: Long): Self = StObject.set(x, "LastWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastWrittenUndefined: Self = StObject.set(x, "LastWritten", js.undefined)
    
    @scala.inline
    def setLogFileName(value: String): Self = StObject.set(x, "LogFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileNameUndefined: Self = StObject.set(x, "LogFileName", js.undefined)
    
    @scala.inline
    def setSize(value: Long): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
