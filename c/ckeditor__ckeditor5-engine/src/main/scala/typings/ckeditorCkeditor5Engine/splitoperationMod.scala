package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.InsertionPosition
import typings.ckeditorCkeditor5Engine.anon.`12`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.split
import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SplitOperation {
    /**
      * Creates a split operation.
      */
    def this(
      splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      howMany: Double,
      insertionPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      graveyardPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    ) = this()
    def this(
      splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      howMany: Double,
      insertionPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      graveyardPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      baseVersion: Double
    ) = this()
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typings.ckeditorCkeditor5Engine.batchMod.default | Null = js.native
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    /* CompleteClass */
    @JSName("clone")
    override def clone_MSplitOperation(): SplitOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MSplitOperation(): typings.ckeditorCkeditor5Engine.mergeoperationMod.default = js.native
    
    /**
      * Position in the graveyard root before the element which should be used as a parent of the nodes after `position`.
      * If it is not set, a copy of the the `position` parent will be used.
      *
      * The default behavior is to clone the split element. Element from graveyard is used during undo.
      */
    /* CompleteClass */
    var graveyardPosition: typings.ckeditorCkeditor5Engine.positionMod.default | Null = js.native
    
    /**
      * Total offset size of elements that are in the split element after `position`.
      */
    /* CompleteClass */
    override val howMany: Double = js.native
    
    /**
      * Position at which the clone of split element (or element from graveyard) will be inserted.
      */
    /* CompleteClass */
    override val insertionPosition: typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Position inside the new clone of a split element.
      *
      * This is a position where nodes that are after the split position will be moved to.
      */
    /* CompleteClass */
    override val moveTargetPosition: typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    /**
      * Artificial range that contains all the nodes from the split element that will be moved to the new element.
      * The range starts at {@link ~#splitPosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    /* CompleteClass */
    override val movedRange: typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    /**
      * Position at which an element should be split.
      */
    /* CompleteClass */
    var splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
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
    override val type_SplitOperation: split = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.SplitOperation = js.native
    
    /**
      * Creates `SplitOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: InsertionPosition, document: typings.ckeditorCkeditor5Engine.documentMod.default): SplitOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[SplitOperation]
    
    /**
      * Helper function that returns a default insertion position basing on given `splitPosition`. The default insertion
      * position is after the split element.
      */
    inline def getInsertionPosition(splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default): typings.ckeditorCkeditor5Engine.positionMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getInsertionPosition")(splitPosition.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditorCkeditor5Engine.positionMod.default]
  }
  
  trait SplitOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MSplitOperation(): SplitOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MSplitOperation(): typings.ckeditorCkeditor5Engine.mergeoperationMod.default
    
    /**
      * Position in the graveyard root before the element which should be used as a parent of the nodes after `position`.
      * If it is not set, a copy of the the `position` parent will be used.
      *
      * The default behavior is to clone the split element. Element from graveyard is used during undo.
      */
    var graveyardPosition: typings.ckeditorCkeditor5Engine.positionMod.default | Null
    
    /**
      * Total offset size of elements that are in the split element after `position`.
      */
    val howMany: Double
    
    /**
      * Position at which the clone of split element (or element from graveyard) will be inserted.
      */
    val insertionPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    
    /**
      * Position inside the new clone of a split element.
      *
      * This is a position where nodes that are after the split position will be moved to.
      */
    val moveTargetPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    
    /**
      * Artificial range that contains all the nodes from the split element that will be moved to the new element.
      * The range starts at {@link ~#splitPosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    val movedRange: typings.ckeditorCkeditor5Engine.rangeMod.default
    
    /**
      * Position at which an element should be split.
      */
    var splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default
    
    @JSName("type")
    val type_SplitOperation: split
  }
  object SplitOperation {
    
    inline def apply(
      clone_ : () => SplitOperation,
      getReversed: () => typings.ckeditorCkeditor5Engine.mergeoperationMod.default,
      howMany: Double,
      insertionPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      isDocumentOperation: Boolean,
      moveTargetPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      movedRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      splitPosition: typings.ckeditorCkeditor5Engine.positionMod.default,
      toJSON: () => `12`
    ): SplitOperation = {
      val __obj = js.Dynamic.literal(getReversed = js.Any.fromFunction0(getReversed), howMany = howMany.asInstanceOf[js.Any], insertionPosition = insertionPosition.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], moveTargetPosition = moveTargetPosition.asInstanceOf[js.Any], movedRange = movedRange.asInstanceOf[js.Any], splitPosition = splitPosition.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null, graveyardPosition = null)
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")("split")
      __obj.asInstanceOf[SplitOperation]
    }
    
    extension [Self <: SplitOperation](x: Self) {
      
      inline def setClone_(value: () => SplitOperation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setGetReversed(value: () => typings.ckeditorCkeditor5Engine.mergeoperationMod.default): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setGraveyardPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
      
      inline def setGraveyardPositionNull: Self = StObject.set(x, "graveyardPosition", null)
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setInsertionPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "insertionPosition", value.asInstanceOf[js.Any])
      
      inline def setMoveTargetPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "moveTargetPosition", value.asInstanceOf[js.Any])
      
      inline def setMovedRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "movedRange", value.asInstanceOf[js.Any])
      
      inline def setSplitPosition(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "splitPosition", value.asInstanceOf[js.Any])
      
      inline def setType(value: split): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
