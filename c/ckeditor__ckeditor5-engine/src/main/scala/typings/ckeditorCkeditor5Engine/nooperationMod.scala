package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.`12`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.noop
import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nooperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/nooperation", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NoOperation {
    
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
    override def clone_MNoOperation(): NoOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MNoOperation(): NoOperation = js.native
    
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
    /* CompleteClass */
    @JSName("type")
    override val type_NoOperation: noop = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/nooperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.NoOperation = js.native
  }
  
  trait NoOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MNoOperation(): NoOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MNoOperation(): NoOperation
    
    @JSName("type")
    val type_NoOperation: noop
  }
  object NoOperation {
    
    inline def apply(
      clone_ : () => NoOperation,
      getReversed: () => NoOperation,
      isDocumentOperation: Boolean,
      toJSON: () => `12`
    ): NoOperation = {
      val __obj = js.Dynamic.literal(getReversed = js.Any.fromFunction0(getReversed), isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")("noop")
      __obj.asInstanceOf[NoOperation]
    }
    
    extension [Self <: NoOperation](x: Self) {
      
      inline def setClone_(value: () => NoOperation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setGetReversed(value: () => NoOperation): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setType(value: noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
