package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookContents extends StObject {
  
  val cells: js.Array[ICellContents] = js.native
  
  val metadata: INotebookMetadata = js.native
  
  val nbformat: Double = js.native
  
  val nbformat_minor: Double = js.native
}
object INotebookContents {
  
  @scala.inline
  def apply(
    cells: js.Array[ICellContents],
    metadata: INotebookMetadata,
    nbformat: Double,
    nbformat_minor: Double
  ): INotebookContents = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContents]
  }
  
  @scala.inline
  implicit class INotebookContentsMutableBuilder[Self <: INotebookContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[ICellContents]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: ICellContents*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: INotebookMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
  }
}
