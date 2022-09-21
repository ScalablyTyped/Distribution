package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRelationalDatabaseRequest extends StObject {
  
  /**
    * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL  The name of the database to create when the Lightsail database resource is created. If this parameter isn't specified, no database is created in the database resource. Constraints:   Must contain 1 to 64 letters or numbers.   Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).   Can't be a word reserved by the specified database engine. For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for MySQL 5.6, MySQL 5.7, and MySQL 8.0.    PostgreSQL  The name of the database to create when the Lightsail database resource is created. If this parameter isn't specified, a database named postgres is created in the database resource. Constraints:   Must contain 1 to 63 letters or numbers.   Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).   Can't be a word reserved by the specified database engine. For more information about reserved words in PostgreSQL, see the SQL Key Words articles for PostgreSQL 9.6, PostgreSQL 10, PostgreSQL 11, and PostgreSQL 12.  
    */
  var masterDatabaseName: String
  
  /**
    * The password for the master user. The password can include any printable ASCII character except "/", """, or "@". It cannot contain spaces.  MySQL  Constraints: Must contain from 8 to 41 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The name for the master user.  MySQL  Constraints:   Required for MySQL.   Must be 1 to 16 letters or numbers. Can contain underscores.   First character must be a letter.   Can't be a reserved word for the chosen database engine. For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for MySQL 5.6, MySQL 5.7, or MySQL 8.0.    PostgreSQL  Constraints:   Required for PostgreSQL.   Must be 1 to 63 letters or numbers. Can contain underscores.   First character must be a letter.   Can't be a reserved word for the chosen database engine. For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for PostgreSQL 9.6, PostgreSQL 10, PostgreSQL 11, and PostgreSQL 12.  
    */
  var masterUsername: String
  
  /**
    * The daily time range during which automated backups are created for your new database if automated backups are enabled. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more information about the preferred backup window time blocks for each region, see the Working With Backups guide in the Amazon Relational Database Service (Amazon RDS) documentation. Constraints:   Must be in the hh24:mi-hh24:mi format. Example: 16:00-16:30    Specified in Coordinated Universal Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var preferredBackupWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur on your new database. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Constraints:   Must be in the ddd:hh24:mi-ddd:hh24:mi format.   Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.   Must be at least 30 minutes.   Specified in Coordinated Universal Time (UTC).   Example: Tue:17:00-Tue:17:30   
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The blueprint ID for your new database. A blueprint describes the major engine version of a database. You can get a list of database blueprints IDs by using the get relational database blueprints operation.
    */
  var relationalDatabaseBlueprintId: String
  
  /**
    * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation.
    */
  var relationalDatabaseBundleId: String
  
  /**
    * The name to use for your new Lightsail database resource. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseName: ResourceName
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateRelationalDatabaseRequest {
  
  inline def apply(
    masterDatabaseName: String,
    masterUsername: String,
    relationalDatabaseBlueprintId: String,
    relationalDatabaseBundleId: String,
    relationalDatabaseName: ResourceName
  ): CreateRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(masterDatabaseName = masterDatabaseName.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], relationalDatabaseBlueprintId = relationalDatabaseBlueprintId.asInstanceOf[js.Any], relationalDatabaseBundleId = relationalDatabaseBundleId.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseRequest]
  }
  
  extension [Self <: CreateRelationalDatabaseRequest](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setMasterDatabaseName(value: String): Self = StObject.set(x, "masterDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPassword(value: SensitiveString): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setRelationalDatabaseBlueprintId(value: String): Self = StObject.set(x, "relationalDatabaseBlueprintId", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseBundleId(value: String): Self = StObject.set(x, "relationalDatabaseBundleId", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
