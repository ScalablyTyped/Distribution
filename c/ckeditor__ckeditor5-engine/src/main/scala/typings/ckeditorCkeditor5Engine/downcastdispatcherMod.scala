package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AttributeKey
import typings.ckeditorCkeditor5Engine.anon.AttributeNewValue
import typings.ckeditorCkeditor5Engine.anon.AttributeOldValue
import typings.ckeditorCkeditor5Engine.anon.Item
import typings.ckeditorCkeditor5Engine.anon.ItemMarkerName
import typings.ckeditorCkeditor5Engine.anon.ItemRange
import typings.ckeditorCkeditor5Engine.anon.Length
import typings.ckeditorCkeditor5Engine.anon.MarkerName
import typings.ckeditorCkeditor5Engine.anon.MarkerNameMarkerRange
import typings.ckeditorCkeditor5Engine.anon.MarkerRange
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.Range
import typings.ckeditorCkeditor5Engine.anon.Selection
import typings.ckeditorCkeditor5Engine.schemaMod.Schema
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downcastdispatcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with DowncastDispatcher[T] {
    def this(conversionApi: Partial[DowncastConversionApi[T]]) = this()
  }
  
  trait DowncastConversionApi[T] extends StObject {
    
    var consumable: typings.ckeditorCkeditor5Engine.modelconsumableMod.default
    
    var dispatcher: DowncastDispatcher[js.Object]
    
    var mapper: typings.ckeditorCkeditor5Engine.mapperMod.default
    
    var options: js.UndefOr[T] = js.undefined
    
    var schema: Schema
    
    var writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
  }
  object DowncastConversionApi {
    
    inline def apply[T](
      consumable: typings.ckeditorCkeditor5Engine.modelconsumableMod.default,
      dispatcher: DowncastDispatcher[js.Object],
      mapper: typings.ckeditorCkeditor5Engine.mapperMod.default,
      schema: Schema,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): DowncastConversionApi[T] = {
      val __obj = js.Dynamic.literal(consumable = consumable.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], mapper = mapper.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DowncastConversionApi[T]]
    }
    
    extension [Self <: DowncastConversionApi[?], T](x: Self & DowncastConversionApi[T]) {
      
      inline def setConsumable(value: typings.ckeditorCkeditor5Engine.modelconsumableMod.default): Self = StObject.set(x, "consumable", value.asInstanceOf[js.Any])
      
      inline def setDispatcher(value: DowncastDispatcher[js.Object]): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setMapper(value: typings.ckeditorCkeditor5Engine.mapperMod.default): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setWriter(
        value: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
      ): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait DowncastDispatcher[T] extends StObject {
    
    var conversionApi: DowncastConversionApi[T] = js.native
    
    def convertAttribute(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      key: String,
      oldValue: Any,
      newValue: Any,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertChanges(
      differ: typings.ckeditorCkeditor5Engine.differMod.default,
      markers: typings.ckeditorCkeditor5Engine.markercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertInsert(
      range: typings.ckeditorCkeditor5Engine.rangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertMarkerAdd(
      markerName: String,
      markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertMarkerRemove(
      markerName: String,
      markerRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertRemove(
      position: typings.ckeditorCkeditor5Engine.positionMod.default,
      length: Double,
      name: String,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def convertSelection(
      selection: typings.ckeditorCkeditor5Engine.documentselectionMod.default,
      markers: typings.ckeditorCkeditor5Engine.markercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    def convertSelection(
      selection: typings.ckeditorCkeditor5Engine.selectionMod.default,
      markers: typings.ckeditorCkeditor5Engine.markercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
    def delegate(events: String*): Any = js.native
    
    def fire[N /* <: String */](
      eventOrInfo: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any) | N,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type DowncastEventArgs<N, T> is not an array type */ args: DowncastEventArgs[N, T]
    ): Any = js.native
    
    def listenTo[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: N, callback: DowncastDispatcherCallback[N, T, S]): Unit = js.native
    def listenTo[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: N, callback: DowncastDispatcherCallback[N, T, S], options: Priority): Unit = js.native
    
    def off[N /* <: String */](event: N): Unit = js.native
    def off[N /* <: String */](event: N, callback: DowncastDispatcherCallback[N, T, this.type]): Unit = js.native
    
    def on[N /* <: String */](event: N, callback: DowncastDispatcherCallback[N, T, this.type]): Unit = js.native
    def on[N /* <: String */](event: N, callback: DowncastDispatcherCallback[N, T, this.type], options: Priority): Unit = js.native
    
    def once[N /* <: String */](event: N, callback: DowncastDispatcherCallback[N, T, this.type]): Unit = js.native
    def once[N /* <: String */](event: N, callback: DowncastDispatcherCallback[N, T, this.type], options: Priority): Unit = js.native
    
    def reconvertElement(
      element: typings.ckeditorCkeditor5Engine.elementMod.default,
      writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default]
    ): Unit = js.native
    
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
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: N, callback: DowncastDispatcherCallback[N, T, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: S, event: Unit, callback: DowncastDispatcherCallback[N, T, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: N): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: N, callback: DowncastDispatcherCallback[N, T, S]): Unit = js.native
    def stopListening[N /* <: String */, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](emitter: Unit, event: Unit, callback: DowncastDispatcherCallback[N, T, S]): Unit = js.native
  }
  
  type DowncastDispatcherCallback[N /* <: String */, T, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<S, N> */ /* info */ Any, 
    /* args */ DowncastEventArgs[N, T], 
    Unit
  ]
  
  type DowncastEventArgs[K /* <: String */, T] = js.Array[Any] | (js.Tuple2[
    (/* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastEventDataTypes[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any] */ js.Any) | AttributeNewValue | AttributeOldValue | ItemMarkerName | ItemRange | MarkerNameMarkerRange | Range, 
    DowncastConversionApi[T]
  ])
  
  trait DowncastEventDataTypes extends StObject {
    
    var addMarker: MarkerRange
    
    var attribute: AttributeKey
    
    var insert: Item
    
    var remove: Length
    
    var removeMarker: MarkerName
    
    var selection: Selection
  }
  object DowncastEventDataTypes {
    
    inline def apply(
      addMarker: MarkerRange,
      attribute: AttributeKey,
      insert: Item,
      remove: Length,
      removeMarker: MarkerName,
      selection: Selection
    ): DowncastEventDataTypes = {
      val __obj = js.Dynamic.literal(addMarker = addMarker.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeMarker = removeMarker.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[DowncastEventDataTypes]
    }
    
    extension [Self <: DowncastEventDataTypes](x: Self) {
      
      inline def setAddMarker(value: MarkerRange): Self = StObject.set(x, "addMarker", value.asInstanceOf[js.Any])
      
      inline def setAttribute(value: AttributeKey): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: Item): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Length): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveMarker(value: MarkerName): Self = StObject.set(x, "removeMarker", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
