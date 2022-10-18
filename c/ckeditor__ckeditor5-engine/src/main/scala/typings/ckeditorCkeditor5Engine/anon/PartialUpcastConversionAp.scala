package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.UpcastConversionData
import typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.ViewItem
import typings.ckeditorCkeditor5Engine.srcConversionViewconsumableMod.default
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.UpcastConversionApi> */
trait PartialUpcastConversionAp extends StObject {
  
  var consumable: js.UndefOr[default] = js.undefined
  
  var convertChildren: js.UndefOr[
    js.Function2[
      /* viewItem */ ViewItem, 
      /* positionOrElement */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | typings.ckeditorCkeditor5Engine.srcModelElementMod.default, 
      ModelCursor
    ]
  ] = js.undefined
  
  var convertItem: js.UndefOr[
    js.Function2[
      /* viewItem */ ViewItem, 
      /* modelCursor */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, 
      ModelCursor
    ]
  ] = js.undefined
  
  var getSplitParts: js.UndefOr[
    js.Function1[
      /* element */ typings.ckeditorCkeditor5Engine.srcModelElementMod.default, 
      js.Array[typings.ckeditorCkeditor5Engine.srcModelElementMod.default]
    ]
  ] = js.undefined
  
  var safeInsert: js.UndefOr[
    js.Function2[
      /* node */ typings.ckeditorCkeditor5Engine.srcModelNodeMod.default, 
      /* position */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, 
      Boolean
    ]
  ] = js.undefined
  
  var schema: js.UndefOr[Schema] = js.undefined
  
  var splitToAllowedParent: js.UndefOr[
    js.Function2[
      /* position */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, 
      /* node */ typings.ckeditorCkeditor5Engine.srcModelNodeMod.default, 
      Null | CursorParent
    ]
  ] = js.undefined
  
  var store: js.UndefOr[Record[String, Any]] = js.undefined
  
  var updateConversionResult: js.UndefOr[
    js.Function2[
      /* element */ typings.ckeditorCkeditor5Engine.srcModelElementMod.default, 
      /* data */ UpcastConversionData[ViewItem], 
      scala.Unit
    ]
  ] = js.undefined
  
  var writer: js.UndefOr[typings.ckeditorCkeditor5Engine.srcModelWriterMod.default] = js.undefined
}
object PartialUpcastConversionAp {
  
  inline def apply(): PartialUpcastConversionAp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpcastConversionAp]
  }
  
  extension [Self <: PartialUpcastConversionAp](x: Self) {
    
    inline def setConsumable(value: default): Self = StObject.set(x, "consumable", value.asInstanceOf[js.Any])
    
    inline def setConsumableUndefined: Self = StObject.set(x, "consumable", js.undefined)
    
    inline def setConvertChildren(
      value: (/* viewItem */ ViewItem, /* positionOrElement */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | typings.ckeditorCkeditor5Engine.srcModelElementMod.default) => ModelCursor
    ): Self = StObject.set(x, "convertChildren", js.Any.fromFunction2(value))
    
    inline def setConvertChildrenUndefined: Self = StObject.set(x, "convertChildren", js.undefined)
    
    inline def setConvertItem(
      value: (/* viewItem */ ViewItem, /* modelCursor */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default) => ModelCursor
    ): Self = StObject.set(x, "convertItem", js.Any.fromFunction2(value))
    
    inline def setConvertItemUndefined: Self = StObject.set(x, "convertItem", js.undefined)
    
    inline def setGetSplitParts(
      value: /* element */ typings.ckeditorCkeditor5Engine.srcModelElementMod.default => js.Array[typings.ckeditorCkeditor5Engine.srcModelElementMod.default]
    ): Self = StObject.set(x, "getSplitParts", js.Any.fromFunction1(value))
    
    inline def setGetSplitPartsUndefined: Self = StObject.set(x, "getSplitParts", js.undefined)
    
    inline def setSafeInsert(
      value: (/* node */ typings.ckeditorCkeditor5Engine.srcModelNodeMod.default, /* position */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default) => Boolean
    ): Self = StObject.set(x, "safeInsert", js.Any.fromFunction2(value))
    
    inline def setSafeInsertUndefined: Self = StObject.set(x, "safeInsert", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSplitToAllowedParent(
      value: (/* position */ typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, /* node */ typings.ckeditorCkeditor5Engine.srcModelNodeMod.default) => Null | CursorParent
    ): Self = StObject.set(x, "splitToAllowedParent", js.Any.fromFunction2(value))
    
    inline def setSplitToAllowedParentUndefined: Self = StObject.set(x, "splitToAllowedParent", js.undefined)
    
    inline def setStore(value: Record[String, Any]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setUpdateConversionResult(
      value: (/* element */ typings.ckeditorCkeditor5Engine.srcModelElementMod.default, /* data */ UpcastConversionData[ViewItem]) => scala.Unit
    ): Self = StObject.set(x, "updateConversionResult", js.Any.fromFunction2(value))
    
    inline def setUpdateConversionResultUndefined: Self = StObject.set(x, "updateConversionResult", js.undefined)
    
    inline def setWriter(value: typings.ckeditorCkeditor5Engine.srcModelWriterMod.default): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
