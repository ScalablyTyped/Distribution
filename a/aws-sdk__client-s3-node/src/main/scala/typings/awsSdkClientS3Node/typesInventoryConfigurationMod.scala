package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.All
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Current
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ETag
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EncryptionStatus
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.IsMultipartUploaded
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.LastModifiedDate
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ReplicationStatus
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Size
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.StorageClass
import typings.awsSdkClientS3Node.typesInventoryDestinationMod.InventoryDestination
import typings.awsSdkClientS3Node.typesInventoryDestinationMod.UnmarshalledInventoryDestination
import typings.awsSdkClientS3Node.typesInventoryFilterMod.InventoryFilter
import typings.awsSdkClientS3Node.typesInventoryFilterMod.UnmarshalledInventoryFilter
import typings.awsSdkClientS3Node.typesInventoryScheduleMod.InventorySchedule
import typings.awsSdkClientS3Node.typesInventoryScheduleMod.UnmarshalledInventorySchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryConfigurationMod {
  
  trait InventoryConfiguration extends StObject {
    
    /**
      * <p>Contains information about where to publish the inventory results.</p>
      */
    var Destination: InventoryDestination
    
    /**
      * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
      */
    var Filter: js.UndefOr[InventoryFilter] = js.undefined
    
    /**
      * <p>The ID used to identify the inventory configuration.</p>
      */
    var Id: String
    
    /**
      * <p>Specifies which object version(s) to included in the inventory results.</p>
      */
    var IncludedObjectVersions: All | Current | String
    
    /**
      * <p>Specifies whether the inventory is enabled or disabled.</p>
      */
    var IsEnabled: Boolean
    
    /**
      * <p>Contains the optional fields that are included in the inventory results.</p>
      */
    var OptionalFields: js.UndefOr[
        (js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]) | (js.Iterable[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ])
      ] = js.undefined
    
    /**
      * <p>Specifies the schedule for generating inventory results.</p>
      */
    var Schedule: InventorySchedule
  }
  object InventoryConfiguration {
    
    inline def apply(
      Destination: InventoryDestination,
      Id: String,
      IncludedObjectVersions: All | Current | String,
      IsEnabled: Boolean,
      Schedule: InventorySchedule
    ): InventoryConfiguration = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryConfiguration]
    }
    
    extension [Self <: InventoryConfiguration](x: Self) {
      
      inline def setDestination(value: InventoryDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: InventoryFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIncludedObjectVersions(value: All | Current | String): Self = StObject.set(x, "IncludedObjectVersions", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
      
      inline def setOptionalFields(
        value: (js.Array[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ]) | (js.Iterable[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ])
      ): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
      
      inline def setOptionalFieldsUndefined: Self = StObject.set(x, "OptionalFields", js.undefined)
      
      inline def setOptionalFieldsVarargs(
        value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
      ): Self = StObject.set(x, "OptionalFields", js.Array(value*))
      
      inline def setSchedule(value: InventorySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledInventoryConfiguration
    extends StObject
       with InventoryConfiguration {
    
    /**
      * <p>Contains information about where to publish the inventory results.</p>
      */
    @JSName("Destination")
    var Destination_UnmarshalledInventoryConfiguration: UnmarshalledInventoryDestination
    
    /**
      * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledInventoryConfiguration: js.UndefOr[UnmarshalledInventoryFilter] = js.undefined
    
    /**
      * <p>Contains the optional fields that are included in the inventory results.</p>
      */
    @JSName("OptionalFields")
    var OptionalFields_UnmarshalledInventoryConfiguration: js.UndefOr[
        js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]
      ] = js.undefined
    
    /**
      * <p>Specifies the schedule for generating inventory results.</p>
      */
    @JSName("Schedule")
    var Schedule_UnmarshalledInventoryConfiguration: UnmarshalledInventorySchedule
  }
  object UnmarshalledInventoryConfiguration {
    
    inline def apply(
      Destination: UnmarshalledInventoryDestination,
      Id: String,
      IncludedObjectVersions: All | Current | String,
      IsEnabled: Boolean,
      Schedule: UnmarshalledInventorySchedule
    ): UnmarshalledInventoryConfiguration = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledInventoryConfiguration]
    }
    
    extension [Self <: UnmarshalledInventoryConfiguration](x: Self) {
      
      inline def setDestination(value: UnmarshalledInventoryDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: UnmarshalledInventoryFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setOptionalFields(
        value: js.Array[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ]
      ): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
      
      inline def setOptionalFieldsUndefined: Self = StObject.set(x, "OptionalFields", js.undefined)
      
      inline def setOptionalFieldsVarargs(
        value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
      ): Self = StObject.set(x, "OptionalFields", js.Array(value*))
      
      inline def setSchedule(value: UnmarshalledInventorySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    }
  }
}
