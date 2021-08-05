package typings.azdata.mod.nb

import typings.azdata.anon.Azdatacellguid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellContents extends StObject {
  
  var cell_type: CellType
  
  var execution_count: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Azdatacellguid] = js.undefined
  
  var outputs: js.UndefOr[js.Array[ICellOutput]] = js.undefined
  
  var source: String | js.Array[String]
}
object ICellContents {
  
  inline def apply(cell_type: CellType, source: String | js.Array[String]): ICellContents = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellContents]
  }
  
  extension [Self <: ICellContents](x: Self) {
    
    inline def setCell_type(value: CellType): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setExecution_count(value: Double): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countUndefined: Self = StObject.set(x, "execution_count", js.undefined)
    
    inline def setMetadata(value: Azdatacellguid): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOutputs(value: js.Array[ICellOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: ICellOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
