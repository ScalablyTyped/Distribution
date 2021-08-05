package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationRequest extends StObject {
  
  /**
    * Name of the Amazon Kinesis Analytics application to delete.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    *  You can use the DescribeApplication operation to get this value. 
    */
  var CreateTimestamp: Timestamp
}
object DeleteApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName, CreateTimestamp: Timestamp): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CreateTimestamp = CreateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  extension [Self <: DeleteApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
  }
}
