package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetEntry extends StObject {
  
  /**
    * The ARN for the data set.
    */
  var Arn: typings.awsSdk.dataexchangeMod.Arn
  
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: typings.awsSdk.dataexchangeMod.AssetType
  
  /**
    * The date and time that the data set was created, in ISO 8601 format.
    */
  var CreatedAt: Timestamp
  
  /**
    * The description for the data set.
    */
  var Description: typings.awsSdk.dataexchangeMod.Description
  
  /**
    * The unique identifier for the data set.
    */
  var Id: typings.awsSdk.dataexchangeMod.Id
  
  /**
    * The name of the data set.
    */
  var Name: typings.awsSdk.dataexchangeMod.Name
  
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: typings.awsSdk.dataexchangeMod.Origin
  
  /**
    * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
    */
  var OriginDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.OriginDetails] = js.undefined
  
  /**
    * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is returned when a data set owner is viewing the entitled copy of its owned data set.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The date and time that the data set was last updated, in ISO 8601 format.
    */
  var UpdatedAt: Timestamp
}
object DataSetEntry {
  
  inline def apply(
    Arn: Arn,
    AssetType: AssetType,
    CreatedAt: Timestamp,
    Description: Description,
    Id: Id,
    Name: Name,
    Origin: Origin,
    UpdatedAt: Timestamp
  ): DataSetEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AssetType = AssetType.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetEntry]
  }
  
  extension [Self <: DataSetEntry](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Origin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginDetails(value: OriginDetails): Self = StObject.set(x, "OriginDetails", value.asInstanceOf[js.Any])
    
    inline def setOriginDetailsUndefined: Self = StObject.set(x, "OriginDetails", js.undefined)
    
    inline def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
