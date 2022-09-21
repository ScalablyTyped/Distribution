package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.IsLocal
import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/batch", JSImport.Default)
  @js.native
  /**
    * Creates a batch instance.
    * @see module:engine/model/model~Model#change
    */
  open class default ()
    extends StObject
       with Batch {
    def this(`type`: IsLocal) = this()
    
    /**
      * Adds an operation to the batch instance.
      */
    /* CompleteClass */
    override def addOperation(operation: Operation): Operation = js.native
    
    /**
      * Returns the base version of this batch, which is equal to the base version of the first operation in the batch.
      * If there are no operations in the batch or neither operation has the base version set, it returns `null`.
      */
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * Whether batch includes operations created locally (`true`) or operations created on other, remote editors (`false`).
      */
    /* CompleteClass */
    override val isLocal: Boolean = js.native
    
    /**
      * Whether batch includes operations connected with typing.
      */
    /* CompleteClass */
    override val isTyping: Boolean = js.native
    
    /**
      * Whether batch was created by the undo feature and undoes other operations.
      */
    /* CompleteClass */
    override val isUndo: Boolean = js.native
    
    /**
      * Whether batch can be undone through the undo feature.
      */
    /* CompleteClass */
    override val isUndoable: Boolean = js.native
    
    /**
      * An array of operations that compose this batch.
      */
    /* CompleteClass */
    override val operations: js.Array[Operation] = js.native
  }
  
  trait Batch extends StObject {
    
    /**
      * Adds an operation to the batch instance.
      */
    def addOperation(operation: Operation): Operation
    
    /**
      * Returns the base version of this batch, which is equal to the base version of the first operation in the batch.
      * If there are no operations in the batch or neither operation has the base version set, it returns `null`.
      */
    val baseVersion: Double | Null
    
    /**
      * Whether batch includes operations created locally (`true`) or operations created on other, remote editors (`false`).
      */
    val isLocal: Boolean
    
    /**
      * Whether batch includes operations connected with typing.
      */
    val isTyping: Boolean
    
    /**
      * Whether batch was created by the undo feature and undoes other operations.
      */
    val isUndo: Boolean
    
    /**
      * Whether batch can be undone through the undo feature.
      */
    val isUndoable: Boolean
    
    /**
      * An array of operations that compose this batch.
      */
    val operations: js.Array[Operation]
  }
  object Batch {
    
    inline def apply(
      addOperation: Operation => Operation,
      isLocal: Boolean,
      isTyping: Boolean,
      isUndo: Boolean,
      isUndoable: Boolean,
      operations: js.Array[Operation]
    ): Batch = {
      val __obj = js.Dynamic.literal(addOperation = js.Any.fromFunction1(addOperation), isLocal = isLocal.asInstanceOf[js.Any], isTyping = isTyping.asInstanceOf[js.Any], isUndo = isUndo.asInstanceOf[js.Any], isUndoable = isUndoable.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], baseVersion = null)
      __obj.asInstanceOf[Batch]
    }
    
    extension [Self <: Batch](x: Self) {
      
      inline def setAddOperation(value: Operation => Operation): Self = StObject.set(x, "addOperation", js.Any.fromFunction1(value))
      
      inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
      
      inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
      
      inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
      
      inline def setIsTyping(value: Boolean): Self = StObject.set(x, "isTyping", value.asInstanceOf[js.Any])
      
      inline def setIsUndo(value: Boolean): Self = StObject.set(x, "isUndo", value.asInstanceOf[js.Any])
      
      inline def setIsUndoable(value: Boolean): Self = StObject.set(x, "isUndoable", value.asInstanceOf[js.Any])
      
      inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
    }
  }
}
