package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList. */
@js.native
trait DataTransferItemList
  extends StObject
     with /* index */ NumberDictionary[DataTransferItem] {
  
  /** Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be provided also. */
  def add(data: java.lang.String, `type`: java.lang.String): DataTransferItem | Null = js.native
  def add(data: File): DataTransferItem | Null = js.native
  
  /** Removes all the entries in the drag data store. */
  def clear(): Unit = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DataTransferItem]] = js.native
  
  /** Returns the number of items in the drag data store. */
  val length: Double = js.native
  
  /** Removes the indexth entry in the drag data store. */
  def remove(index: Double): Unit = js.native
}
