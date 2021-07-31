package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalTable extends StObject {
  
  /**
    * A display name for the logical table.
    */
  var Alias: LogicalTableAlias
  
  /**
    * Transform operations that act on this logical table.
    */
  var DataTransforms: js.UndefOr[TransformOperationList] = js.undefined
  
  /**
    * Source of this logical table.
    */
  var Source: LogicalTableSource
}
object LogicalTable {
  
  @scala.inline
  def apply(Alias: LogicalTableAlias, Source: LogicalTableSource): LogicalTable = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalTable]
  }
  
  @scala.inline
  implicit class LogicalTableMutableBuilder[Self <: LogicalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: LogicalTableAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransforms(value: TransformOperationList): Self = StObject.set(x, "DataTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransformsUndefined: Self = StObject.set(x, "DataTransforms", js.undefined)
    
    @scala.inline
    def setDataTransformsVarargs(value: TransformOperation*): Self = StObject.set(x, "DataTransforms", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: LogicalTableSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
