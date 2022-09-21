package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.logicalDTsMod.LogicalComposition
import typings.vegaLite8ozrbXDH.parameterDTsMod.ParameterName
import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit
import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnitParams
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/predicate.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fieldFilterExpression(predicate: FieldPredicate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldFilterExpression")(predicate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldFilterExpression(predicate: FieldPredicate, useInRange: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldFilterExpression")(predicate.asInstanceOf[js.Any], useInRange.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fieldValidPredicate(fieldExpr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldValidPredicate")(fieldExpr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldValidPredicate(fieldExpr: String, valid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldValidPredicate")(fieldExpr.asInstanceOf[js.Any], valid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFieldEqualPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldEqualPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldEqualPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldEqualPredicate */ Boolean]
  
  inline def isFieldGTEPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldGTEPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldGTEPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldGTEPredicate */ Boolean]
  
  inline def isFieldGTPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldGTPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldGTPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldGTPredicate */ Boolean]
  
  inline def isFieldLTEPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldLTEPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldLTEPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldLTEPredicate */ Boolean]
  
  inline def isFieldLTPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldLTPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldLTPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldLTPredicate */ Boolean]
  
  inline def isFieldOneOfPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldOneOfPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOneOfPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldOneOfPredicate */ Boolean]
  
  inline def isFieldPredicate(predicate: Predicate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFieldRangePredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldRangePredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldRangePredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldRangePredicate */ Boolean]
  
  inline def isFieldValidPredicate(predicate: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldValidPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldValidPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.FieldValidPredicate */ Boolean]
  
  inline def isSelectionPredicate(predicate: LogicalComposition[Predicate]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.ParameterPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/predicate.d.ts.ParameterPredicate */ Boolean]
  
  inline def normalizePredicate(f: Predicate): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePredicate")(f.asInstanceOf[js.Any]).asInstanceOf[Predicate]
  
  trait FieldEqualPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be equal to.
      */
    var equal: String | Double | Boolean | DateTime | ExprRef | SignalRef
  }
  object FieldEqualPredicate {
    
    inline def apply(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEqualPredicate]
    }
    
    extension [Self <: FieldEqualPredicate](x: Self) {
      
      inline def setEqual(value: String | Double | Boolean | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldGTEPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than or equals to.
      */
    var gte: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldGTEPredicate {
    
    inline def apply(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTEPredicate]
    }
    
    extension [Self <: FieldGTEPredicate](x: Self) {
      
      inline def setGte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldGTPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than.
      */
    var gt: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldGTPredicate {
    
    inline def apply(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTPredicate]
    }
    
    extension [Self <: FieldGTPredicate](x: Self) {
      
      inline def setGt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldLTEPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than or equals to.
      */
    var lte: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldLTEPredicate {
    
    inline def apply(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTEPredicate]
    }
    
    extension [Self <: FieldLTEPredicate](x: Self) {
      
      inline def setLte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldLTPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than.
      */
    var lt: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldLTPredicate {
    
    inline def apply(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTPredicate]
    }
    
    extension [Self <: FieldLTPredicate](x: Self) {
      
      inline def setLt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldOneOfPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * A set of values that the `field`'s value should be a member of,
      * for a data item included in the filtered data.
      */
    var oneOf: js.Array[Boolean | DateTime | Double | String]
  }
  object FieldOneOfPredicate {
    
    inline def apply(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOneOfPredicate]
    }
    
    extension [Self <: FieldOneOfPredicate](x: Self) {
      
      inline def setOneOf(value: js.Array[Boolean | DateTime | Double | String]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "oneOf", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_
  */
  trait FieldPredicate extends StObject
  object FieldPredicate {
    
    inline def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate]
    }
    
    inline def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate]
    }
    
    inline def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate]
    }
    
    inline def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate]
    }
    
    inline def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate]
    }
    
    inline def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate]
    }
    
    inline def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate]
    }
    
    inline def FieldValidPredicate_(field: FieldName, valid: Boolean): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_]
    }
  }
  
  trait FieldPredicateBase extends StObject {
    
    /**
      * Field to be tested.
      */
    var field: FieldName
    
    /**
      * Time unit for the field to be tested.
      */
    var timeUnit: js.UndefOr[TimeUnit | TimeUnitParams] = js.undefined
  }
  object FieldPredicateBase {
    
    inline def apply(field: FieldName): FieldPredicateBase = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPredicateBase]
    }
    
    extension [Self <: FieldPredicateBase](x: Self) {
      
      inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
  
  trait FieldRangePredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * An array of inclusive minimum and maximum values
      * for a field value of a data item to be included in the filtered data.
      * @maxItems 2
      * @minItems 2
      */
    var range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
  }
  object FieldRangePredicate {
    
    inline def apply(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldRangePredicate]
    }
    
    extension [Self <: FieldRangePredicate](x: Self) {
      
      inline def setRange(value: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: (Double | DateTime | Null | ExprRef | SignalRef)*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  trait FieldValidPredicate_
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * If set to true the field's value has to be valid, meaning both not `null` and not [`NaN`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NaN).
      */
    var valid: Boolean
  }
  object FieldValidPredicate_ {
    
    inline def apply(field: FieldName, valid: Boolean): FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValidPredicate_]
    }
    
    extension [Self <: FieldValidPredicate_](x: Self) {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterPredicate
    extends StObject
       with _Predicate {
    
    /**
      * For selection parameters, the predicate of empty selections returns true by default.
      * Override this behavior, by setting this property `empty: false`.
      */
    var empty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter using a parameter name.
      */
    var param: ParameterName
  }
  object ParameterPredicate {
    
    inline def apply(param: ParameterName): ParameterPredicate = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterPredicate]
    }
    
    extension [Self <: ParameterPredicate](x: Self) {
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_
    - typings.vegaLite8ozrbXDH.predicateDotDTsMod.ParameterPredicate
    - java.lang.String
  */
  type Predicate = _Predicate | String
  
  trait _Predicate extends StObject
  object _Predicate {
    
    inline def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldEqualPredicate]
    }
    
    inline def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTEPredicate]
    }
    
    inline def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldGTPredicate]
    }
    
    inline def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTEPredicate]
    }
    
    inline def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldLTPredicate]
    }
    
    inline def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldOneOfPredicate]
    }
    
    inline def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldRangePredicate]
    }
    
    inline def FieldValidPredicate_(field: FieldName, valid: Boolean): typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.FieldValidPredicate_]
    }
    
    inline def ParameterPredicate(param: ParameterName): typings.vegaLite8ozrbXDH.predicateDotDTsMod.ParameterPredicate = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite8ozrbXDH.predicateDotDTsMod.ParameterPredicate]
    }
  }
}
