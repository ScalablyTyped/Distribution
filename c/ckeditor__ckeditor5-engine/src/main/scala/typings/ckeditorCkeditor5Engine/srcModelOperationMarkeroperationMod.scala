package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AffectsData
import typings.ckeditorCkeditor5Engine.anon.`13`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marker
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationMarkeroperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/markeroperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MarkerOperation {
    def this(
      name: String,
      oldRange: Null,
      newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean
    ) = this()
    def this(
      name: String,
      oldRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean
    ) = this()
    def this(
      name: String,
      oldRange: Null,
      newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean,
      baseVersion: Double
    ) = this()
    def this(
      name: String,
      oldRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      affectsData: Boolean,
      baseVersion: Double
    ) = this()
    
    /**
      * Specifies whether the marker operation affects the data produced by the data pipeline
      * (is persisted in the editor's data).
      */
    /* CompleteClass */
    override val affectsData: Boolean = js.native
    
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
    override def clone_MMarkerOperation(): MarkerOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MMarkerOperation(): MarkerOperation = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Marker name.
      */
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * Marker range after the change.
      */
    /* CompleteClass */
    override val newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    /**
      * Marker range before the change.
      */
    /* CompleteClass */
    override val oldRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    /**
      * Custom toJSON method to solve child-parent circular dependencies.
      */
    /* CompleteClass */
    override def toJSON(): `13` = js.native
    
    /**
      * Operation type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_MarkerOperation: marker = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/markeroperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/markeroperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.MarkerOperation = js.native
    
    /**
      * Creates `MarkerOperation` object from deserialized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: AffectsData, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): MarkerOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[MarkerOperation]
  }
  
  trait MarkerOperation
    extends StObject
       with Operation {
    
    /**
      * Specifies whether the marker operation affects the data produced by the data pipeline
      * (is persisted in the editor's data).
      */
    val affectsData: Boolean
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MMarkerOperation(): MarkerOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MMarkerOperation(): MarkerOperation
    
    /**
      * Marker name.
      */
    val name: String
    
    /**
      * Marker range after the change.
      */
    val newRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null
    
    /**
      * Marker range before the change.
      */
    val oldRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null
    
    @JSName("type")
    val type_MarkerOperation: marker
  }
  object MarkerOperation {
    
    inline def apply(
      affectsData: Boolean,
      clone_ : () => MarkerOperation,
      getReversed: () => MarkerOperation,
      isDocumentOperation: Boolean,
      name: String,
      toJSON: () => `13`
    ): MarkerOperation = {
      val __obj = js.Dynamic.literal(affectsData = affectsData.asInstanceOf[js.Any], getReversed = js.Any.fromFunction0(getReversed), isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null, newRange = null, oldRange = null)
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")("marker")
      __obj.asInstanceOf[MarkerOperation]
    }
    
    extension [Self <: MarkerOperation](x: Self) {
      
      inline def setAffectsData(value: Boolean): Self = StObject.set(x, "affectsData", value.asInstanceOf[js.Any])
      
      inline def setClone_(value: () => MarkerOperation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setGetReversed(value: () => MarkerOperation): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewRange(value: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      inline def setNewRangeNull: Self = StObject.set(x, "newRange", null)
      
      inline def setOldRange(value: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      inline def setOldRangeNull: Self = StObject.set(x, "oldRange", null)
      
      inline def setType(value: marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
