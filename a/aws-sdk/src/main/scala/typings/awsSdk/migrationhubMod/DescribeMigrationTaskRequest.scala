package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMigrationTaskRequest extends StObject {
  
  /**
    * The identifier given to the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName
  
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream
}
object DescribeMigrationTaskRequest {
  
  inline def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): DescribeMigrationTaskRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMigrationTaskRequest]
  }
  
  extension [Self <: DescribeMigrationTaskRequest](x: Self) {
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
