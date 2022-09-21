package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsRequest extends StObject {
  
  /**
    * The name of the database to get temporary authorization to log on to. Constraints:   Must be 1 to 64 alphanumeric characters or hyphens.   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   The first character must be a letter.   Must not contain a colon ( : ) or slash ( / ).   Cannot be a reserved word. A list of reserved words can be found in Reserved Words  in the Amazon Redshift Database Developer Guide  
    */
  var dbName: js.UndefOr[DbName] = js.undefined
  
  /**
    * The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum is 3600 seconds.
    */
  var durationSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the workgroup associated with the database.
    */
  var workgroupName: WorkgroupName
}
object GetCredentialsRequest {
  
  inline def apply(workgroupName: WorkgroupName): GetCredentialsRequest = {
    val __obj = js.Dynamic.literal(workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsRequest]
  }
  
  extension [Self <: GetCredentialsRequest](x: Self) {
    
    inline def setDbName(value: DbName): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setDurationSeconds(value: Integer): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
