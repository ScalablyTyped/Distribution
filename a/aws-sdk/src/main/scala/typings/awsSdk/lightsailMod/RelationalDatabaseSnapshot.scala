package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseSnapshot extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the database snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the database snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The software of the database snapshot (for example, MySQL)
    */
  var engine: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The database engine version for the database snapshot (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
    */
  var fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.undefined
  
  /**
    * The bundle ID of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseBundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source database from which the database snapshot was created.
    */
  var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Region name and Availability Zone where the database snapshot is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the database snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Lightsail resource type.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The size of the disk in GB (for example, 32) for the database snapshot.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * The state of the database snapshot.
    */
  var state: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object RelationalDatabaseSnapshot {
  
  inline def apply(): RelationalDatabaseSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseSnapshot]
  }
  
  extension [Self <: RelationalDatabaseSnapshot](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEngine(value: NonEmptyString): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    inline def setFromRelationalDatabaseArn(value: NonEmptyString): Self = StObject.set(x, "fromRelationalDatabaseArn", value.asInstanceOf[js.Any])
    
    inline def setFromRelationalDatabaseArnUndefined: Self = StObject.set(x, "fromRelationalDatabaseArn", js.undefined)
    
    inline def setFromRelationalDatabaseBlueprintId(value: String): Self = StObject.set(x, "fromRelationalDatabaseBlueprintId", value.asInstanceOf[js.Any])
    
    inline def setFromRelationalDatabaseBlueprintIdUndefined: Self = StObject.set(x, "fromRelationalDatabaseBlueprintId", js.undefined)
    
    inline def setFromRelationalDatabaseBundleId(value: String): Self = StObject.set(x, "fromRelationalDatabaseBundleId", value.asInstanceOf[js.Any])
    
    inline def setFromRelationalDatabaseBundleIdUndefined: Self = StObject.set(x, "fromRelationalDatabaseBundleId", js.undefined)
    
    inline def setFromRelationalDatabaseName(value: NonEmptyString): Self = StObject.set(x, "fromRelationalDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setFromRelationalDatabaseNameUndefined: Self = StObject.set(x, "fromRelationalDatabaseName", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
