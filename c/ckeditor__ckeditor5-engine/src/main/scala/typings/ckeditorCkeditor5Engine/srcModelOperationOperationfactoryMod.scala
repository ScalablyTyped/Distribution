package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ClassName
import typings.ckeditorCkeditor5Engine.anon.`0`
import typings.ckeditorCkeditor5Engine.anon.`1`
import typings.ckeditorCkeditor5Engine.anon.`2`
import typings.ckeditorCkeditor5Engine.anon.`3`
import typings.ckeditorCkeditor5Engine.anon.`4`
import typings.ckeditorCkeditor5Engine.anon.`5`
import typings.ckeditorCkeditor5Engine.anon.`6`
import typings.ckeditorCkeditor5Engine.anon.`7`
import typings.ckeditorCkeditor5Engine.anon.`8`
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationOperationfactoryMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operationfactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OperationFactory {
    
    /* CompleteClass */
    @JSName("_")
    override def _underscore(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operationfactory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ClassName, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `0`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default]
    inline def fromJSON(json: `1`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default]
    inline def fromJSON(json: `2`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default]
    inline def fromJSON(json: `3`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default]
    inline def fromJSON(json: `4`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default]
    inline def fromJSON(json: `5`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `6`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default]
    inline def fromJSON(json: `7`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typings.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default]
    inline def fromJSON(json: `8`, document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Operation]
  }
  
  trait OperationFactory extends StObject {
    
    @JSName("_")
    def _underscore(): Unit
  }
  object OperationFactory {
    
    inline def apply(_underscore: () => Unit): OperationFactory = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(js.Any.fromFunction0(_underscore))
      __obj.asInstanceOf[OperationFactory]
    }
    
    extension [Self <: OperationFactory](x: Self) {
      
      inline def set_underscore(value: () => Unit): Self = StObject.set(x, "_", js.Any.fromFunction0(value))
    }
  }
}
