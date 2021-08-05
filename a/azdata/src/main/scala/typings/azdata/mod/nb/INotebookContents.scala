package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotebookContents extends StObject {
  
  val cells: js.Array[ICellContents]
  
  val metadata: INotebookMetadata
  
  val nbformat: Double
  
  val nbformat_minor: Double
}
object INotebookContents {
  
  inline def apply(
    cells: js.Array[ICellContents],
    metadata: INotebookMetadata,
    nbformat: Double,
    nbformat_minor: Double
  ): INotebookContents = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContents]
  }
  
  extension [Self <: INotebookContents](x: Self) {
    
    inline def setCells(value: js.Array[ICellContents]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: ICellContents*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    inline def setMetadata(value: INotebookMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    inline def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
  }
}
