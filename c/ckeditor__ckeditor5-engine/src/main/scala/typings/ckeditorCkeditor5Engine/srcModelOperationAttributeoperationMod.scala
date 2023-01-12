package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.NewValue
import typings.ckeditorCkeditor5Engine.anon.`12`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.addAttribute
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.changeAttribute
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.removeAttribute
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationAttributeoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/attributeoperation", JSImport.Default)
  @js.native
  open class default[O /* <: js.UndefOr[String | Double | Boolean] */, N /* <: js.UndefOr[String | Double | Boolean] */] protected ()
    extends StObject
       with AttributeOperation[O, N] {
    /**
      * Creates an operation that changes, removes or adds attributes.
      *
      * If only `newValue` is set, attribute will be added on a node. Note that all nodes in operation's range must not
      * have an attribute with the same key as the added attribute.
      *
      * If only `oldValue` is set, then attribute with given key will be removed. Note that all nodes in operation's range
      * must have an attribute with that key added.
      *
      * If both `newValue` and `oldValue` are set, then the operation will change the attribute value. Note that all nodes in
      * operation's ranges must already have an attribute with given key and `oldValue` as value
      */
    def this(
      range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      key: String,
      oldValue: O,
      newValue: N
    ) = this()
    def this(
      range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      key: String,
      oldValue: O,
      newValue: N,
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
    override def clone_MAttributeOperation(): AttributeOperation[O, N] = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MAttributeOperation(): AttributeOperation[O, N] = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Key of an attribute to change or remove.
      */
    /* CompleteClass */
    override val key: String = js.native
    
    /**
      * New value of the attribute with given key or `null`, if operation should remove attribute.
      */
    /* CompleteClass */
    override val newValue: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any = js.native
    
    /**
      * Old value of the attribute with given key or `null`, if attribute was not set before.
      */
    /* CompleteClass */
    override val oldValue: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any = js.native
    
    /**
      * Range on which operation should be applied.
      */
    /* CompleteClass */
    override val range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
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
    override val type_AttributeOperation: addAttribute | removeAttribute | changeAttribute = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/attributeoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/attributeoperation", "default.className")
    @js.native
    val className: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.AttributeOperation = js.native
    
    /**
      * Creates `AttributeOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: NewValue, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): AttributeOperation[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[AttributeOperation[Any, Any]]
  }
  
  trait AttributeOperation[O /* <: js.UndefOr[String | Double | Boolean] */, N /* <: js.UndefOr[String | Double | Boolean] */]
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MAttributeOperation(): AttributeOperation[O, N]
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MAttributeOperation(): AttributeOperation[O, N]
    
    /**
      * Key of an attribute to change or remove.
      */
    val key: String
    
    /**
      * New value of the attribute with given key or `null`, if operation should remove attribute.
      */
    val newValue: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any
    
    /**
      * Old value of the attribute with given key or `null`, if attribute was not set before.
      */
    val oldValue: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any
    
    /**
      * Range on which operation should be applied.
      */
    val range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
    
    @JSName("type")
    val type_AttributeOperation: addAttribute | removeAttribute | changeAttribute
  }
  object AttributeOperation {
    
    inline def apply[O /* <: js.UndefOr[String | Double | Boolean] */, N /* <: js.UndefOr[String | Double | Boolean] */](
      clone_ : () => AttributeOperation[O, N],
      getReversed: () => AttributeOperation[O, N],
      isDocumentOperation: Boolean,
      key: String,
      newValue: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any,
      oldValue: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any,
      range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      toJSON: () => `12`,
      `type`: addAttribute | removeAttribute | changeAttribute
    ): AttributeOperation[O, N] = {
      val __obj = js.Dynamic.literal(getReversed = js.Any.fromFunction0(getReversed), isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperation[O, N]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeOperation[?, ?], O /* <: js.UndefOr[String | Double | Boolean] */, N /* <: js.UndefOr[String | Double | Boolean] */] (val x: Self & (AttributeOperation[O, N])) extends AnyVal {
      
      inline def setClone_(value: () => AttributeOperation[O, N]): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setGetReversed(value: () => AttributeOperation[O, N]): Self = StObject.set(x, "getReversed", js.Any.fromFunction0(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: N extends undefined ? null : N */ js.Any
      ): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: O extends undefined ? null : O */ js.Any
      ): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setRange(value: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setType(value: addAttribute | removeAttribute | changeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
