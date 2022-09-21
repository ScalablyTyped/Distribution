package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operation", JSImport.Default)
  @js.native
  /**
    * Base operation constructor.
    */
  abstract class default ()
    extends StObject
       with Operation {
    def this(baseVersion: Double) = this()
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typings.ckeditorCkeditor5Engine.batchMod.default | Null = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
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
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the operation class used for serialization.
      */
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operation", "default.className")
    @js.native
    val className: String = js.native
    
    /**
      * Creates Operation object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: `12`, doc: typings.ckeditorCkeditor5Engine.documentMod.default): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Operation]
  }
  
  trait Operation extends StObject {
    
    val baseVersion: Double | Null
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    var batch: typings.ckeditorCkeditor5Engine.batchMod.default | Null
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    var clone_FOperation: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /**
      * Creates and returns a reverse operation. Reverse operation when executed right after
      * the original operation will bring back tree model state to the point before the original
      * operation execution. In other words, it reverses changes done by the original operation.
      *
      * Keep in mind that tree model state may change since executing the original operation,
      * so reverse operation will be "outdated". In that case you will need to transform it by
      * all operations that were executed after the original operation.
      */
    var getReversed: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    val isDocumentOperation: Boolean
    
    /**
      * Custom toJSON method to solve child-parent circular dependencies.
      */
    def toJSON(): `12`
    
    /**
      * Operation type.
      */
    val `type`: String
  }
  object Operation {
    
    inline def apply(isDocumentOperation: Boolean, toJSON: () => `12`, `type`: String): Operation = {
      val __obj = js.Dynamic.literal(isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation]
    }
    
    extension [Self <: Operation](x: Self) {
      
      inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
      
      inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
      
      inline def setBatch(value: typings.ckeditorCkeditor5Engine.batchMod.default): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchNull: Self = StObject.set(x, "batch", null)
      
      inline def setClone_(value: () => Operation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setGetReversed(value: () => Operation): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setGetReversedUndefined: Self = StObject.set(x, "getReversed", js.undefined)
      
      inline def setIsDocumentOperation(value: Boolean): Self = StObject.set(x, "isDocumentOperation", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => `12`): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
