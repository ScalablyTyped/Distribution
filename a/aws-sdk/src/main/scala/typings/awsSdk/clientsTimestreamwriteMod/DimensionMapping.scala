package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionMapping extends StObject {
  
  /**
    *  
    */
  var DestinationColumn: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * 
    */
  var SourceColumn: js.UndefOr[SchemaName] = js.undefined
}
object DimensionMapping {
  
  inline def apply(): DimensionMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionMapping] (val x: Self) extends AnyVal {
    
    inline def setDestinationColumn(value: SchemaName): Self = StObject.set(x, "DestinationColumn", value.asInstanceOf[js.Any])
    
    inline def setDestinationColumnUndefined: Self = StObject.set(x, "DestinationColumn", js.undefined)
    
    inline def setSourceColumn(value: SchemaName): Self = StObject.set(x, "SourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceColumnUndefined: Self = StObject.set(x, "SourceColumn", js.undefined)
  }
}
