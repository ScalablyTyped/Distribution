package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSnapshotRecord extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date when the export snapshot record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * A list of objects describing the destination of the export snapshot record.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  
  /**
    * The AWS Region and Availability Zone where the export snapshot record is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The export snapshot record name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * A list of objects describing the source of the export snapshot record.
    */
  var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.native
  
  /**
    * The state of the export snapshot record.
    */
  var state: js.UndefOr[RecordState] = js.native
}
object ExportSnapshotRecord {
  
  @scala.inline
  def apply(): ExportSnapshotRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecord]
  }
  
  @scala.inline
  implicit class ExportSnapshotRecordMutableBuilder[Self <: ExportSnapshotRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDestinationInfo(value: DestinationInfo): Self = StObject.set(x, "destinationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInfoUndefined: Self = StObject.set(x, "destinationInfo", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: ExportSnapshotRecordSourceInfo): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    @scala.inline
    def setState(value: RecordState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
