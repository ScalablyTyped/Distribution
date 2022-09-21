package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSnapshotRecord extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.undefined
  
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.undefined
  
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.undefined
}
object ExportSnapshotRecord {
  
  inline def apply(): ExportSnapshotRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
  
  extension [Self <: ExportSnapshotRecord](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDestinationInfo(value: DestinationInfo): Self = StObject.set(x, "destinationInfo", value.asInstanceOf[js.Any])
    
    inline def setDestinationInfoUndefined: Self = StObject.set(x, "destinationInfo", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSourceInfo(value: ExportSnapshotRecordSourceInfo): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    inline def setState(value: RecordState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
