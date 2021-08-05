package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMigrationTaskResult extends StObject {
  
  /**
    * Object encapsulating information about the migration task.
    */
  var MigrationTask: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTask] = js.undefined
}
object DescribeMigrationTaskResult {
  
  inline def apply(): DescribeMigrationTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMigrationTaskResult]
  }
  
  extension [Self <: DescribeMigrationTaskResult](x: Self) {
    
    inline def setMigrationTask(value: MigrationTask): Self = StObject.set(x, "MigrationTask", value.asInstanceOf[js.Any])
    
    inline def setMigrationTaskUndefined: Self = StObject.set(x, "MigrationTask", js.undefined)
  }
}
