package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.`12`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.detach
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationDetachoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/detachoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DetachOperation {
    /**
      * Creates an insert operation.
      */
    def this(sourcePosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, howMany: Double) = this()
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default | Null = js.native
    
    /**
      * Offset size of moved range.
      */
    /* CompleteClass */
    override val howMany: Double = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Position before the first {@link module:engine/model/item~Item model item} to detach.
      */
    /* CompleteClass */
    override val sourcePosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
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
    override val type_DetachOperation: detach = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/detachoperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.DetachOperation = js.native
  }
  
  trait DetachOperation
    extends StObject
       with Operation {
    
    /**
      * Offset size of moved range.
      */
    val howMany: Double
    
    /**
      * Position before the first {@link module:engine/model/item~Item model item} to detach.
      */
    val sourcePosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    @JSName("type")
    val type_DetachOperation: detach
  }
  object DetachOperation {
    
    inline def apply(
      howMany: Double,
      isDocumentOperation: Boolean,
      sourcePosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      toJSON: () => `12`
    ): DetachOperation = {
      val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null)
      __obj.updateDynamic("type")("detach")
      __obj.asInstanceOf[DetachOperation]
    }
    
    extension [Self <: DetachOperation](x: Self) {
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setSourcePosition(value: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
      
      inline def setType(value: detach): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
