package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AttributeKey
import typings.ckeditorCkeditor5Engine.anon.Item
import typings.ckeditorCkeditor5Engine.anon.Length
import typings.ckeditorCkeditor5Engine.anon.MarkerName
import typings.ckeditorCkeditor5Engine.anon.MarkerRange
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.Selection
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionDowncastdispatcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with DowncastDispatcher[T] {
    def this(conversionApi: Partial[DowncastConversionApi[T]]) = this()
  }
  
  trait DowncastConversionApi[T] extends StObject {
    
    var consumable: typings.ckeditorCkeditor5Engine.srcConversionModelconsumableMod.default
    
    var dispatcher: DowncastDispatcher[js.Object]
    
    var mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default
    
    var options: js.UndefOr[T] = js.undefined
    
    var schema: Schema
    
    var writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
  }
  object DowncastConversionApi {
    
    inline def apply[T](
      consumable: typings.ckeditorCkeditor5Engine.srcConversionModelconsumableMod.default,
      dispatcher: DowncastDispatcher[js.Object],
      mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default,
      schema: Schema,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): DowncastConversionApi[T] = {
      val __obj = js.Dynamic.literal(consumable = consumable.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], mapper = mapper.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DowncastConversionApi[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DowncastConversionApi[?], T] (val x: Self & DowncastConversionApi[T]) extends AnyVal {
      
      inline def setConsumable(value: typings.ckeditorCkeditor5Engine.srcConversionModelconsumableMod.default): Self = StObject.set(x, "consumable", value.asInstanceOf[js.Any])
      
      inline def setDispatcher(value: DowncastDispatcher[js.Object]): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setMapper(value: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setWriter(
        value: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
      ): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait DowncastDispatcher[T] extends StObject {
    
    var conversionApi: DowncastConversionApi[T] = js.native
    
    def convertAttribute(
      range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      key: String,
      oldValue: Any,
      newValue: Any,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertChanges(
      differ: typings.ckeditorCkeditor5Engine.srcModelDifferMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertInsert(
      range: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertMarkerAdd(
      markerName: String,
      markerRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertMarkerRemove(
      markerName: String,
      markerRange: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertRemove(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      length: Double,
      name: String,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    
    def convertSelection(
      selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
    ): Unit = js.native
    def convertSelection(
      selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default,
      markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
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
      element: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      writer: typings.ckeditorCkeditor5Engine.srcViewDowncastwriterMod.default[typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default]
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends 'attribute' | 'remove' | 'insert' | 'selection' | 'removeMarker' | 'addMarker' ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastEventDataTypes[K], @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: attribute:${inferN}:$text * / string ? [{  item :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentselection.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/textproxy.default,   range :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default,   attributeKey :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any,   attributeOldValue :any,   attributeNewValue :any}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: attribute:${inferN} * / string ? [{  item :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default,   range :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default,   attributeKey :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any,   attributeOldValue :any,   attributeNewValue :any}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends 'insert:$text' ? [{  item :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/textproxy.default,   range :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: insert:${inferN} * / string ? [{  item :/ * Inlined @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default & {  name :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any} * /
  {constructor (name : string), constructor (name : string, attrs : std.Record<string, string>), constructor (name : string, attrs : [string, string]), constructor (name : string, attrs : std.Record<string, string>, children : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default), constructor (name : string, attrs : [string, string], children : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default), constructor (name : string, attrs : undefined, children : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default), constructor (name : string, attrs : std.Record<string, string>, children : std.Iterable<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default>), constructor (name : string, attrs : [string, string], children : std.Iterable<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default>), constructor (name : string, attrs : undefined, children : std.Iterable<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default>), static fromJSON (json : std.ReturnType<{None (): std.ReturnType<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default['toJSON']> & {  name :string,   children :std.Array<std.ReturnType<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element['toJSON'] | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default['toJSON']>> | undefined}, None (): std.Record<string, string | number | boolean>}>): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element,  readonly childCount :number,  readonly isEmpty :boolean,  readonly maxOffset :number,  readonly name :string,  readonly endOffset :number | null,  readonly index :number | null,  readonly nextSibling :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node | null,  readonly offsetSize :number,  readonly parent :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default | null,  readonly previousSibling :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node | null,  readonly root :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default,  readonly startOffset :number | null, findAncestor (parentName : string): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element | null, findAncestor (parentName : string, options : {  includeSelf :boolean | undefined}): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element | null, getChild (index : number): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default, getChildIndex (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default): number, getChildStartOffset (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default): number, getChildren (): std.IterableIterator<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default>, getNodeByPath (relativePath : std.Array<number>): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default, offsetToIndex (offset : number): number, toJSON (): std.ReturnType<(): std.Record<string, string | number | boolean>> & {  name :string,   children :std.Array<std.ReturnType<{None (): std.ReturnType<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default['toJSON']> & {  name :string,   children :std.Array<std.ReturnType<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element['toJSON'] | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default['toJSON']>> | undefined}, None (): std.Record<string, string | number | boolean>} | {None (): std.ReturnType<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.default['toJSON']> & {  data :string,   attributes :std.Record<string, string | number | boolean>}, None (): std.Record<string, string | number | boolean>}>> | undefined}, constructor (), constructor (attrs : std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toMap * / any>[0]), getAncestors (): std.Array<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default>, getAncestors (options : {  includeSelf :boolean | undefined,   parentFirst :boolean | undefined}): std.Array<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default>, getAttribute (key : string): string | number | boolean | undefined, getAttributeKeys (): std.IterableIterator<string>, getAttributes (): std.IterableIterator<[string, string | number | boolean]>, getCommonAncestor (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default | null, getCommonAncestor (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node, options : {  includeSelf :boolean | undefined}): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default | null, getPath (): std.Array<number>, hasAttribute (key : string): boolean, is (type : 'position' | 'model:position'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/liveposition.default, is (type : 'livePosition' | 'model:livePosition'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/liveposition.default, is (type : 'range' | 'model:range'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/liverange.default, is (type : 'liveRange' | 'model:liveRange'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/liverange.default, is (type : 'marker' | 'model:marker'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/markercollection.Marker, is (type : '$textProxy' | 'model:$textProxy' | 'textProxy' | 'model:textProxy'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/textproxy.default, is (type : 'documentFragment' | 'model:documentFragment'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.default, is (type : 'selection' | 'model:selection'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/selection.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentselection.default, is (type : 'documentSelection' | 'model:documentSelection'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentselection.default, is (type : 'node' | 'model:node'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/rootelement.default, is (type : '$text' | 'model:$text' | 'text' | 'model:text'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/text.default, is (type : 'element' | 'model:element'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/rootelement.default, is (type : 'rootElement' | 'model:rootElement'): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/rootelement.default, is <K extends string>(type : 'element' | 'model:element', name : K): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default & {  name :K} | @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/rootelement.default & {  name :K}, is <K extends string>(type : 'rootElement' | 'model:rootElement', name : K): this is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/rootelement.default & {  name :K}, is (type : string): boolean, is (type : string, name : string): boolean, isAfter (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node): boolean, isAttached (): boolean, isBefore (node : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/node.Node): boolean, toJSON (): std.Record<string, string | number | boolean>,   name :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any},   range :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: removeMarker:${inferN} * / string ? [{  markerName :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any,   markerRange :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: addMarker:${inferN} * / string ? [{  item :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/selection.default | undefined,   range :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default | undefined,   markerName :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any,   markerRange :@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/range.default}, @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : K extends / * template literal string: ${inferNS}:${string} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any extends 'attribute' | 'remove' | 'insert' | 'selection' | 'removeMarker' | 'addMarker' ? [@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastEventDataTypes[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NS * / any], @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastConversionApi<T>] : std.Array<any> : std.Array<any>
    }}}
    */
  type DowncastEventArgs[K /* <: String */, T] = js.Tuple2[
    /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.DowncastEventDataTypes[K] */ js.Any, 
    DowncastConversionApi[T]
  ]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DowncastEventDataTypes] (val x: Self) extends AnyVal {
      
      inline def setAddMarker(value: MarkerRange): Self = StObject.set(x, "addMarker", value.asInstanceOf[js.Any])
      
      inline def setAttribute(value: AttributeKey): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: Item): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Length): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveMarker(value: MarkerName): Self = StObject.set(x, "removeMarker", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
