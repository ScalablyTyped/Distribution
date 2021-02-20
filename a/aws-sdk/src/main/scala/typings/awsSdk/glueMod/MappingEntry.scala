package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingEntry extends StObject {
  
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.native
  
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.native
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.native
  
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.native
  
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.native
  
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.native
}
object MappingEntry {
  
  @scala.inline
  def apply(): MappingEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingEntry]
  }
  
  @scala.inline
  implicit class MappingEntryMutableBuilder[Self <: MappingEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourcePath(value: SchemaPathString): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
    
    @scala.inline
    def setSourceTable(value: TableName): Self = StObject.set(x, "SourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "SourceTable", js.undefined)
    
    @scala.inline
    def setSourceType(value: FieldType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setTargetPath(value: SchemaPathString): Self = StObject.set(x, "TargetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPathUndefined: Self = StObject.set(x, "TargetPath", js.undefined)
    
    @scala.inline
    def setTargetTable(value: TableName): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
    
    @scala.inline
    def setTargetType(value: FieldType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}
