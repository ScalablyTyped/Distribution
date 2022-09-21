package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/history", JSImport.Default)
  @js.native
  /**
    * Creates an empty History instance.
    */
  open class default ()
    extends StObject
       with History
  
  @js.native
  trait History extends StObject {
    
    /**
      * Adds an operation to the history.
      */
    def addOperation(operation: Operation): Unit = js.native
    
    /**
      * Returns operation from the history that bases on given `baseVersion`.
      */
    def getOperation(baseVersion: Double): js.UndefOr[Operation] = js.native
    
    /**
      * Returns operations added to the history.
      */
    def getOperations(): js.Array[Operation] = js.native
    def getOperations(from: Double): js.Array[Operation] = js.native
    def getOperations(from: Double, to: Double): js.Array[Operation] = js.native
    def getOperations(from: Unit, to: Double): js.Array[Operation] = js.native
    
    /**
      * For given `undoingOperation`, returns the operation which has been undone by it.
      */
    def getUndoneOperation(undoingOperation: Operation): js.UndefOr[Operation] = js.native
    
    /**
      * Checks whether given `operation` is undoing any other operation.
      */
    def isUndoingOperation(operation: Operation): Boolean = js.native
    
    /**
      * Checks whether given `operation` has been undone by any other operation.
      */
    def isUndoneOperation(operation: Operation): Boolean = js.native
    
    /**
      * Marks in history that one operation is an operation that is undoing the other operation. By marking operation this way,
      * history is keeping more context information about operations, which helps in operational transformation.
      */
    def setOperationAsUndone(undoneOperation: Operation, undoingOperation: Operation): Unit = js.native
  }
}
