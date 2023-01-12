package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.CursorParent
import typings.ckeditorCkeditor5Engine.anon.ModelCursor
import typings.ckeditorCkeditor5Engine.anon.PartialUpcastConversionAp
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.SchemaContextDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionUpcastdispatcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UpcastDispatcher {
    def this(conversionApi: PartialUpcastConversionAp) = this()
  }
  
  @js.native
  trait UpcastConversionApi extends StObject {
    
    var consumable: typings.ckeditorCkeditor5Engine.srcConversionViewconsumableMod.default = js.native
    
    def convertChildren(viewItem: ViewItem, positionOrElement: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): ModelCursor = js.native
    def convertChildren(viewItem: ViewItem, positionOrElement: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): ModelCursor = js.native
    
    def convertItem(viewItem: ViewItem, modelCursor: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): ModelCursor = js.native
    
    def getSplitParts(element: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): js.Array[typings.ckeditorCkeditor5Engine.srcModelElementMod.default] = js.native
    
    def safeInsert(
      node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default,
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Boolean = js.native
    
    var schema: Schema = js.native
    
    def splitToAllowedParent(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ): Null | CursorParent = js.native
    
    var store: Record[String, Any] = js.native
    
    def updateConversionResult(
      element: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      data: UpcastConversionData[ViewItem]
    ): Unit = js.native
    
    var writer: typings.ckeditorCkeditor5Engine.srcModelWriterMod.default = js.native
  }
  
  trait UpcastConversionData[T /* <: ViewItem */] extends StObject {
    
    var modelCursor: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    var modelRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
    
    var viewItem: T
  }
  object UpcastConversionData {
    
    inline def apply[T /* <: ViewItem */](
      modelCursor: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      modelRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      viewItem: T
    ): UpcastConversionData[T] = {
      val __obj = js.Dynamic.literal(modelCursor = modelCursor.asInstanceOf[js.Any], modelRange = modelRange.asInstanceOf[js.Any], viewItem = viewItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpcastConversionData[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpcastConversionData[?], T /* <: ViewItem */] (val x: Self & UpcastConversionData[T]) extends AnyVal {
      
      inline def setModelCursor(value: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "modelCursor", value.asInstanceOf[js.Any])
      
      inline def setModelRange(value: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "modelRange", value.asInstanceOf[js.Any])
      
      inline def setViewItem(value: T): Self = StObject.set(x, "viewItem", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait UpcastDispatcher extends StObject {
    
    var conversionApi: UpcastConversionApi = js.native
    
    def convert(viewItem: ViewItem, writer: typings.ckeditorCkeditor5Engine.srcModelWriterMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def convert(
      viewItem: ViewItem,
      writer: typings.ckeditorCkeditor5Engine.srcModelWriterMod.default,
      context: SchemaContextDefinition
    ): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def delegate(events: String*): Any = js.native
    
    def fire[N /* <: String */](
      eventOrInfo: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any) | N,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type UpcastEventArgs<N> is not an array type */ args: UpcastEventArgs[N]
    ): Any = js.native
    
    def listenTo[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, N /* <: String */](emitter: S, event: N, callback: UpcastDispatcherCallback[N, S]): Unit = js.native
    def listenTo[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, N /* <: String */](emitter: S, event: N, callback: UpcastDispatcherCallback[N, S], options: Priority): Unit = js.native
    
    def off[N /* <: String */](event: N): Unit = js.native
    def off[N /* <: String */](event: N, callback: UpcastDispatcherCallback[N, this.type]): Unit = js.native
    
    def on[N /* <: String */](event: N, callback: UpcastDispatcherCallback[N, this.type]): Unit = js.native
    def on[N /* <: String */](event: N, callback: UpcastDispatcherCallback[N, this.type], options: Priority): Unit = js.native
    
    def once[N /* <: String */](event: N, callback: UpcastDispatcherCallback[N, this.type]): Unit = js.native
    def once[N /* <: String */](event: N, callback: UpcastDispatcherCallback[N, this.type], options: Priority): Unit = js.native
    
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(
      event: String,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    def stopDelegating(
      event: Unit,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: N): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: N, callback: UpcastDispatcherCallback[N, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: Unit, callback: UpcastDispatcherCallback[N, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: N): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: N, callback: UpcastDispatcherCallback[N, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: Unit, callback: UpcastDispatcherCallback[N, S]): Unit = js.native
  }
  
  type UpcastDispatcherCallback[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<S, N> */ /* info */ Any, 
    /* args */ UpcastEventArgs[N], 
    Unit
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends 'element' | 'text' | 'documentFragment' ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastEventDataTypes[K], @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastConversionApi] : K extends 'viewCleanup' ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/documentfragment.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/element.default] : K extends 'selectionChange' ? [{  oldSelection :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/documentselection.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/selection.default,   newSelection :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/documentselection.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/selection.default,   domSelection :std.Selection}] : K extends / * template literal string: element:${inferN} * / string ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastConversionData<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/view/element.default & {  name :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any}>, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastConversionApi] : K extends / * template literal string: ${inferNS}:${string} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any extends 'element' | 'text' | 'documentFragment' ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastEventDataTypes[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any], @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastConversionApi] : std.Array<any> : std.Array<any>
    }}}
    */
  type UpcastEventArgs[K /* <: String */] = js.Tuple2[
    /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastEventDataTypes[K] */ js.Any, 
    UpcastConversionApi
  ]
  
  trait UpcastEventDataTypes extends StObject {
    
    var documentFragment: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default]
    
    var element: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewElementMod.default]
    
    var text: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewTextMod.default]
  }
  object UpcastEventDataTypes {
    
    inline def apply(
      documentFragment: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default],
      element: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewElementMod.default],
      text: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewTextMod.default]
    ): UpcastEventDataTypes = {
      val __obj = js.Dynamic.literal(documentFragment = documentFragment.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpcastEventDataTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpcastEventDataTypes] (val x: Self) extends AnyVal {
      
      inline def setDocumentFragment(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default]): Self = StObject.set(x, "documentFragment", value.asInstanceOf[js.Any])
      
      inline def setElement(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewElementMod.default]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setText(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.srcViewTextMod.default]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.srcViewElementMod.default
    - typings.ckeditorCkeditor5Engine.srcViewTextMod.default
    - typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
  */
  trait ViewItem extends StObject
}
