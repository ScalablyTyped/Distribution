package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtensionInfo extends StObject {
  
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.undefined
  
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.EndDateTime] = js.undefined
  
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionId] = js.undefined
  
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionStatus] = js.undefined
  
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionStatusReason] = js.undefined
  
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.StartDateTime] = js.undefined
}
object SchemaExtensionInfo {
  
  inline def apply(): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
  
  extension [Self <: SchemaExtensionInfo](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setEndDateTime(value: EndDateTime): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionIdUndefined: Self = StObject.set(x, "SchemaExtensionId", js.undefined)
    
    inline def setSchemaExtensionStatus(value: SchemaExtensionStatus): Self = StObject.set(x, "SchemaExtensionStatus", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionStatusReason(value: SchemaExtensionStatusReason): Self = StObject.set(x, "SchemaExtensionStatusReason", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionStatusReasonUndefined: Self = StObject.set(x, "SchemaExtensionStatusReason", js.undefined)
    
    inline def setSchemaExtensionStatusUndefined: Self = StObject.set(x, "SchemaExtensionStatus", js.undefined)
    
    inline def setStartDateTime(value: StartDateTime): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
  }
}
