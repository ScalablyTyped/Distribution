package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.aggregateDTsMod.NonArgAggregateOp
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/sort.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/sort.d.ts", "DEFAULT_SORT_OP")
  @js.native
  val DEFAULT_SORT_OP: /* "min" */ String = js.native
  
  inline def isSortArray[F](sort: Sort[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortArray")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortArray */ Boolean]
  
  inline def isSortByChannel(c: String): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortByChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortByChannel */ Boolean]
  
  inline def isSortByEncoding[F](sort: Sort[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortByEncoding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByEncoding")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.SortByEncoding */ Boolean]
  
  inline def isSortField[F](sort: Sort[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.EncodingSortField<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortField")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/sort.d.ts.EncodingSortField<F> */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.sortDTsMod.SortOrder
    - typings.vegaLite8ozrbXDH.sortDTsMod.SortByChannel
    - typings.vegaLite8ozrbXDH.sortDTsMod.SortByChannelDesc
  */
  trait AllSortString
    extends StObject
       with _Sort[Any]
  
  trait EncodingSortField[F]
    extends StObject
       with _Sort[F] {
    
    /**
      * The data [field](https://vega.github.io/vega-lite/docs/field.html) to sort by.
      *
      * __Default value:__ If unspecified, defaults to the field specified in the outer data reference.
      */
    var field: js.UndefOr[F] = js.undefined
    
    /**
      * An [aggregate operation](https://vega.github.io/vega-lite/docs/aggregate.html#ops) to perform on the field prior to sorting (e.g., `"count"`, `"mean"` and `"median"`).
      * An aggregation is required when there are multiple values of the sort field for each encoded data field.
      * The input data objects will be aggregated, grouped by the encoded data field.
      *
      * For a full list of operations, please see the documentation for [aggregate](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
      *
      * __Default value:__ `"sum"` for stacked plots. Otherwise, `"min"`.
      */
    var op: js.UndefOr[NonArgAggregateOp] = js.undefined
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object EncodingSortField {
    
    inline def apply[F](): EncodingSortField[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingSortField[F]]
    }
    
    extension [Self <: EncodingSortField[?], F](x: Self & EncodingSortField[F]) {
      
      inline def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setOp(value: NonArgAggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.sortDTsMod.SortArray
    - typings.vegaLite8ozrbXDH.sortDTsMod.AllSortString
    - typings.vegaLite8ozrbXDH.sortDTsMod.EncodingSortField[F]
    - typings.vegaLite8ozrbXDH.sortDTsMod.SortByEncoding
    - scala.Null
  */
  type Sort[F] = _Sort[F] | SortArray | Null
  
  type SortArray = js.Array[Boolean | DateTime | Double | String]
  
  /* keyof .vega-lite-8ozrbXDH.anon.FillOpacity */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.color
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.fill
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stroke
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.strokeWidth
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.size
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shape
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.fillOpacity
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.strokeOpacity
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.opacity
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text
  */
  trait SortByChannel
    extends StObject
       with AllSortString
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-x`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-y`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-color`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fill`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-stroke`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeWidth`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-size`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-shape`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fillOpacity`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeOpacity`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-opacity`
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-text`
  */
  trait SortByChannelDesc
    extends StObject
       with AllSortString
  object SortByChannelDesc {
    
    inline def `-color`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-color` = "-color".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-color`]
    
    inline def `-fill`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fill` = "-fill".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fill`]
    
    inline def `-fillOpacity`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fillOpacity` = "-fillOpacity".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-fillOpacity`]
    
    inline def `-opacity`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-opacity` = "-opacity".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-opacity`]
    
    inline def `-shape`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-shape` = "-shape".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-shape`]
    
    inline def `-size`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-size` = "-size".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-size`]
    
    inline def `-stroke`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-stroke` = "-stroke".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-stroke`]
    
    inline def `-strokeOpacity`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeOpacity` = "-strokeOpacity".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeOpacity`]
    
    inline def `-strokeWidth`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeWidth` = "-strokeWidth".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-strokeWidth`]
    
    inline def `-text`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-text` = "-text".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-text`]
    
    inline def `-x`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-x` = "-x".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-x`]
    
    inline def `-y`: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-y` = "-y".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`-y`]
  }
  
  trait SortByEncoding
    extends StObject
       with _Sort[Any] {
    
    /**
      * The [encoding channel](https://vega.github.io/vega-lite/docs/encoding.html#channels) to sort by (e.g., `"x"`, `"y"`)
      */
    var encoding: SortByChannel
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object SortByEncoding {
    
    inline def apply(encoding: SortByChannel): SortByEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortByEncoding]
    }
    
    extension [Self <: SortByEncoding](x: Self) {
      
      inline def setEncoding(value: SortByChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait SortField extends StObject {
    
    /**
      * The name of the field to sort.
      */
    var field: FieldName
    
    /**
      * Whether to sort the field in ascending or descending order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object SortField {
    
    inline def apply(field: FieldName): SortField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortField]
    }
    
    extension [Self <: SortField](x: Self) {
      
      inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait SortFields extends StObject {
    
    var field: js.Array[FieldName]
    
    var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
  }
  object SortFields {
    
    inline def apply(field: js.Array[FieldName]): SortFields = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortFields]
    }
    
    extension [Self <: SortFields](x: Self) {
      
      inline def setField(value: js.Array[FieldName]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldVarargs(value: FieldName*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ascending
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.descending
  */
  trait SortOrder
    extends StObject
       with AllSortString
  object SortOrder {
    
    inline def ascending: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ascending = "ascending".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ascending]
    
    inline def descending: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.descending = "descending".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.descending]
  }
  
  trait _Sort[F] extends StObject
}
