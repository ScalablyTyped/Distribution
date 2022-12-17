package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.NewName
import typings.ckeditorCkeditor5Engine.anon.`12`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rename
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationRenameoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/renameoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RenameOperation {
    /**
      * Creates an operation that changes element's name.
      */
    def this(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      oldName: String,
      newName: String
    ) = this()
    def this(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      oldName: String,
      newName: String,
      baseVersion: Double
    ) = this()
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default | Null = js.native
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    /* CompleteClass */
    @JSName("clone")
    override def clone_MRenameOperation(): RenameOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MRenameOperation(): RenameOperation = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * New name for the element.
      */
    /* CompleteClass */
    override val newName: String = js.native
    
    /**
      * Current name of the element.
      */
    /* CompleteClass */
    override val oldName: String = js.native
    
    /**
      * Position before an element to change.
      */
    /* CompleteClass */
    var position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Custom toJSON method to solve child-parent circular dependencies.
      */
    /* CompleteClass */
    override def toJSON(): `12` = js.native
    
    /**
      * Operation type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_RenameOperation: rename = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/renameoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/renameoperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.RenameOperation = js.native
    
    /**
      * Creates `RenameOperation` object from deserialized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: NewName, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): RenameOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[RenameOperation]
  }
  
  trait RenameOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MRenameOperation(): RenameOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MRenameOperation(): RenameOperation
    
    /**
      * New name for the element.
      */
    val newName: String
    
    /**
      * Current name of the element.
      */
    val oldName: String
    
    /**
      * Position before an element to change.
      */
    var position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    @JSName("type")
    val type_RenameOperation: rename
  }
  object RenameOperation {
    
    inline def apply(
      clone_ : () => RenameOperation,
      getReversed: () => RenameOperation,
      isDocumentOperation: Boolean,
      newName: String,
      oldName: String,
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      toJSON: () => `12`
    ): RenameOperation = {
      val __obj = js.Dynamic.literal(getReversed = js.Any.fromFunction0(getReversed), isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")("rename")
      __obj.asInstanceOf[RenameOperation]
    }
    
    extension [Self <: RenameOperation](x: Self) {
      
      inline def setClone_(value: () => RenameOperation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setGetReversed(value: () => RenameOperation): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
      
      inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setType(value: rename): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
