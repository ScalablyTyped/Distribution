package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.CursorParent
import typings.ckeditorCkeditor5Engine.anon.DomSelection
import typings.ckeditorCkeditor5Engine.anon.ModelCursor
import typings.ckeditorCkeditor5Engine.anon.NameAny
import typings.ckeditorCkeditor5Engine.anon.PartialUpcastConversionAp
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.schemaMod.Schema
import typings.ckeditorCkeditor5Engine.schemaMod.SchemaContextDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upcastdispatcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UpcastDispatcher {
    def this(conversionApi: PartialUpcastConversionAp) = this()
  }
  
  @js.native
  trait UpcastConversionApi extends StObject {
    
    var consumable: typings.ckeditorCkeditor5Engine.viewconsumableMod.default = js.native
    
    def convertChildren(viewItem: ViewItem, positionOrElement: typings.ckeditorCkeditor5Engine.elementMod.default): ModelCursor = js.native
    def convertChildren(viewItem: ViewItem, positionOrElement: typings.ckeditorCkeditor5Engine.positionMod.default): ModelCursor = js.native
    
    def convertItem(viewItem: ViewItem, modelCursor: typings.ckeditorCkeditor5Engine.positionMod.default): ModelCursor = js.native
    
    def getSplitParts(element: typings.ckeditorCkeditor5Engine.elementMod.default): js.Array[typings.ckeditorCkeditor5Engine.elementMod.default] = js.native
    
    def safeInsert(
      node: typings.ckeditorCkeditor5Engine.nodeMod.default,
      position: typings.ckeditorCkeditor5Engine.positionMod.default
    ): Boolean = js.native
    
    var schema: Schema = js.native
    
    def splitToAllowedParent(
      position: typings.ckeditorCkeditor5Engine.positionMod.default,
      node: typings.ckeditorCkeditor5Engine.nodeMod.default
    ): Null | CursorParent = js.native
    
    var store: Record[String, Any] = js.native
    
    def updateConversionResult(element: typings.ckeditorCkeditor5Engine.elementMod.default, data: UpcastConversionData[ViewItem]): Unit = js.native
    
    var writer: typings.ckeditorCkeditor5Engine.writerMod.default = js.native
  }
  
  trait UpcastConversionData[T /* <: ViewItem */] extends StObject {
    
    var modelCursor: typings.ckeditorCkeditor5Engine.positionMod.default
    
    var modelRange: typings.ckeditorCkeditor5Engine.rangeMod.default
    
    var viewItem: T
  }
  object UpcastConversionData {
    
    inline def apply[T /* <: ViewItem */](
      modelCursor: typings.ckeditorCkeditor5Engine.positionMod.default,
      modelRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      viewItem: T
    ): UpcastConversionData[T] = {
      val __obj = js.Dynamic.literal(modelCursor = modelCursor.asInstanceOf[js.Any], modelRange = modelRange.asInstanceOf[js.Any], viewItem = viewItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpcastConversionData[T]]
    }
    
    extension [Self <: UpcastConversionData[?], T /* <: ViewItem */](x: Self & UpcastConversionData[T]) {
      
      inline def setModelCursor(value: typings.ckeditorCkeditor5Engine.positionMod.default): Self = StObject.set(x, "modelCursor", value.asInstanceOf[js.Any])
      
      inline def setModelRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "modelRange", value.asInstanceOf[js.Any])
      
      inline def setViewItem(value: T): Self = StObject.set(x, "viewItem", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait UpcastDispatcher extends StObject {
    
    var conversionApi: UpcastConversionApi = js.native
    
    def convert(viewItem: ViewItem, writer: typings.ckeditorCkeditor5Engine.writerMod.default): typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    def convert(
      viewItem: ViewItem,
      writer: typings.ckeditorCkeditor5Engine.writerMod.default,
      context: SchemaContextDefinition
    ): typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default = js.native
    
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
  
  type UpcastEventArgs[K /* <: String */] = (js.Array[
    Any | DomSelection | typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default | typings.ckeditorCkeditor5Engine.viewElementMod.default
  ]) | (js.Tuple2[
    (/* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastEventDataTypes[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any] */ js.Any) | (UpcastConversionData[typings.ckeditorCkeditor5Engine.viewElementMod.default & NameAny]), 
    UpcastConversionApi
  ])
  
  trait UpcastEventDataTypes extends StObject {
    
    var documentFragment: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default]
    
    var element: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewElementMod.default]
    
    var text: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewTextMod.default]
  }
  object UpcastEventDataTypes {
    
    inline def apply(
      documentFragment: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default],
      element: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewElementMod.default],
      text: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewTextMod.default]
    ): UpcastEventDataTypes = {
      val __obj = js.Dynamic.literal(documentFragment = documentFragment.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpcastEventDataTypes]
    }
    
    extension [Self <: UpcastEventDataTypes](x: Self) {
      
      inline def setDocumentFragment(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default]): Self = StObject.set(x, "documentFragment", value.asInstanceOf[js.Any])
      
      inline def setElement(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewElementMod.default]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setText(value: UpcastConversionData[typings.ckeditorCkeditor5Engine.viewTextMod.default]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.viewElementMod.default
    - typings.ckeditorCkeditor5Engine.viewTextMod.default
    - typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default
  */
  trait ViewItem extends StObject
}
