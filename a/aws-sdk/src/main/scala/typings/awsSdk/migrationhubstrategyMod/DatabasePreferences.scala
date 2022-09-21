package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasePreferences extends StObject {
  
  /**
    *  Specifies whether you're interested in self-managed databases or databases managed by AWS. 
    */
  var databaseManagementPreference: js.UndefOr[DatabaseManagementPreference] = js.undefined
  
  /**
    *  Specifies your preferred migration path. 
    */
  var databaseMigrationPreference: js.UndefOr[DatabaseMigrationPreference] = js.undefined
}
object DatabasePreferences {
  
  inline def apply(): DatabasePreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabasePreferences]
  }
  
  extension [Self <: DatabasePreferences](x: Self) {
    
    inline def setDatabaseManagementPreference(value: DatabaseManagementPreference): Self = StObject.set(x, "databaseManagementPreference", value.asInstanceOf[js.Any])
    
    inline def setDatabaseManagementPreferenceUndefined: Self = StObject.set(x, "databaseManagementPreference", js.undefined)
    
    inline def setDatabaseMigrationPreference(value: DatabaseMigrationPreference): Self = StObject.set(x, "databaseMigrationPreference", value.asInstanceOf[js.Any])
    
    inline def setDatabaseMigrationPreferenceUndefined: Self = StObject.set(x, "databaseMigrationPreference", js.undefined)
  }
}
