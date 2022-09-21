package typings.checkTypes

import org.scalablytyped.runtime.Instantiable1
import typings.checkTypes.mod.ArrayFunction
import typings.checkTypes.mod.ArrayLikeFunction
import typings.checkTypes.mod.AssertExtended
import typings.checkTypes.mod.CheckTypePredicates
import typings.checkTypes.mod.ExtendWithAssert
import typings.checkTypes.mod.IterableFunction
import typings.checkTypes.mod.MaybeFunction
import typings.checkTypes.mod.NegationFunction
import typings.checkTypes.mod.ObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.ArrayFunction> */
  trait ExtendWithAssertArrayFunc extends StObject {
    
    var of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)
  }
  object ExtendWithAssertArrayFunc {
    
    inline def apply(of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): ExtendWithAssertArrayFunc = {
      val __obj = js.Dynamic.literal(of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWithAssertArrayFunc]
    }
    
    extension [Self <: ExtendWithAssertArrayFunc](x: Self) {
      
      inline def setOf(value: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.ArrayLikeFunction> */
  trait ExtendWithAssertArrayLike extends StObject {
    
    var of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)
  }
  object ExtendWithAssertArrayLike {
    
    inline def apply(of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): ExtendWithAssertArrayLike = {
      val __obj = js.Dynamic.literal(of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWithAssertArrayLike]
    }
    
    extension [Self <: ExtendWithAssertArrayLike](x: Self) {
      
      inline def setOf(value: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.CheckTypePredicates> */
  trait ExtendWithAssertCheckType extends StObject {
    
    var array: ExtendWithAssert[ArrayFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayFunction])
    
    var arrayLike: ExtendWithAssert[ArrayLikeFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayLikeFunction])
    
    var assigned: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var between: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]))
    
    var boolean: (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]))
    
    var contains: (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]))
    
    var date: (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]))
    
    var emptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var emptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var emptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var equal: (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]))
    
    var even: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
    
    var function: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var greater: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]))
    
    var greaterOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]))
    
    var hasLength: (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]))
    
    var inRange: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]))
    
    var infinity: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var instance: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]))
    
    var instanceStrict: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]))
    
    var integer: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]))
    
    var iterable: ExtendWithAssert[IterableFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[IterableFunction])
    
    var less: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]))
    
    var lessOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]))
    
    var like: (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]))
    
    var `match`: (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]))
    
    var negative: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
    
    var nonEmptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var nonEmptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var nonEmptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var `null`: (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]))
    
    var number: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]))
    
    var `object`: ExtendWithAssert[ObjectFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ObjectFunction])
    
    var odd: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
    
    var positive: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
    
    var primitive: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    
    var string: (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]))
    
    var undefined: (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]))
    
    var zero: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
  }
  object ExtendWithAssertCheckType {
    
    inline def apply(
      array: ExtendWithAssert[ArrayFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayFunction]),
      arrayLike: ExtendWithAssert[ArrayLikeFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayLikeFunction]),
      assigned: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      between: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]])),
      boolean: (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]])),
      contains: (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]])),
      date: (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]])),
      emptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      emptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      emptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      equal: (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]])),
      even: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])),
      function: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      greater: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]])),
      greaterOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]])),
      hasLength: (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]])),
      inRange: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]])),
      infinity: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      instance: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]])),
      instanceStrict: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]])),
      integer: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]])),
      iterable: ExtendWithAssert[IterableFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[IterableFunction]),
      less: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]])),
      lessOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]])),
      like: (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]])),
      `match`: (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]])),
      negative: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])),
      nonEmptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      nonEmptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      nonEmptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      `null`: (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]])),
      number: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]])),
      `object`: ExtendWithAssert[ObjectFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ObjectFunction]),
      odd: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])),
      positive: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])),
      primitive: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])),
      string: (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]])),
      undefined: (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]])),
      zero: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
    ): ExtendWithAssertCheckType = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arrayLike = arrayLike.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], emptyArray = emptyArray.asInstanceOf[js.Any], emptyObject = emptyObject.asInstanceOf[js.Any], emptyString = emptyString.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], even = even.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], greater = greater.asInstanceOf[js.Any], greaterOrEqual = greaterOrEqual.asInstanceOf[js.Any], hasLength = hasLength.asInstanceOf[js.Any], inRange = inRange.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], instanceStrict = instanceStrict.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], iterable = iterable.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], lessOrEqual = lessOrEqual.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], nonEmptyArray = nonEmptyArray.asInstanceOf[js.Any], nonEmptyObject = nonEmptyObject.asInstanceOf[js.Any], nonEmptyString = nonEmptyString.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], odd = odd.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], primitive = primitive.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWithAssertCheckType]
    }
    
    extension [Self <: ExtendWithAssertCheckType](x: Self) {
      
      inline def setArray(
        value: ExtendWithAssert[ArrayFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayFunction])
      ): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayLike(
        value: ExtendWithAssert[ArrayLikeFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ArrayLikeFunction])
      ): Self = StObject.set(x, "arrayLike", value.asInstanceOf[js.Any])
      
      inline def setAssigned(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
      
      inline def setBetween(
        value: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]))
      ): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBoolean(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]))
      ): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setContains(
        value: (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]))
      ): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setDate(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]))
      ): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setEmptyArray(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "emptyArray", value.asInstanceOf[js.Any])
      
      inline def setEmptyObject(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "emptyObject", value.asInstanceOf[js.Any])
      
      inline def setEmptyString(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "emptyString", value.asInstanceOf[js.Any])
      
      inline def setEqual(
        value: (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]))
      ): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
      
      inline def setEven(
        value: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
      ): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setFunction(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setGreater(
        value: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]))
      ): Self = StObject.set(x, "greater", value.asInstanceOf[js.Any])
      
      inline def setGreaterOrEqual(
        value: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]))
      ): Self = StObject.set(x, "greaterOrEqual", value.asInstanceOf[js.Any])
      
      inline def setHasLength(
        value: (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]))
      ): Self = StObject.set(x, "hasLength", value.asInstanceOf[js.Any])
      
      inline def setInRange(
        value: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]))
      ): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInfinity(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
      
      inline def setInstance(
        value: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]))
      ): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceStrict(
        value: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]))
      ): Self = StObject.set(x, "instanceStrict", value.asInstanceOf[js.Any])
      
      inline def setInteger(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]))
      ): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIterable(
        value: ExtendWithAssert[IterableFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[IterableFunction])
      ): Self = StObject.set(x, "iterable", value.asInstanceOf[js.Any])
      
      inline def setLess(
        value: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]))
      ): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      inline def setLessOrEqual(
        value: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]))
      ): Self = StObject.set(x, "lessOrEqual", value.asInstanceOf[js.Any])
      
      inline def setLike(
        value: (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]))
      ): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setMatch(
        value: (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]))
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setNegative(
        value: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
      ): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNonEmptyArray(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "nonEmptyArray", value.asInstanceOf[js.Any])
      
      inline def setNonEmptyObject(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "nonEmptyObject", value.asInstanceOf[js.Any])
      
      inline def setNonEmptyString(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "nonEmptyString", value.asInstanceOf[js.Any])
      
      inline def setNull(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]))
      ): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNumber(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]))
      ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(
        value: ExtendWithAssert[ObjectFunction] | ((AssertExtended[Any, Any]) & ExtendWithAssert[ObjectFunction])
      ): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOdd(
        value: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
      ): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setPositive(
        value: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]))
      ): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPrimitive(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setString(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]))
      ): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setUndefined(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]))
      ): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setZero(
        value: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]))
      ): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.CheckTypePredicates> & check-types.check-types.ExtendWithAssert<std.Pick<check-types.check-types.CheckType, 'not' | 'maybe'>> & check-types.check-types.AssertFunction */
  @js.native
  trait ExtendWithAssertCheckTypeCall extends StObject {
    
    def apply[T](possibleFalsy: T): T = js.native
    def apply[T](possibleFalsy: T, message: String): T = js.native
    def apply[T](possibleFalsy: T, message: String, errorType: Instantiable): T = js.native
    def apply[T](possibleFalsy: T, message: Unit, errorType: Instantiable): T = js.native
    
    var array: ExtendWithAssertArrayFunc | ((AssertExtended[Any, Any]) & ExtendWithAssertArrayFunc) = js.native
    
    var arrayLike: ExtendWithAssertArrayLike | ((AssertExtended[Any, Any]) & ExtendWithAssertArrayLike) = js.native
    
    var assigned: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var between: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]])) = js.native
    
    var boolean: (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is boolean */ Boolean]])) = js.native
    
    var contains: (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* substring */ String, Boolean]])) = js.native
    
    var date: (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is std.Date */ Boolean]])) = js.native
    
    var emptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var emptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var emptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var equal: (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* b */ Any, Boolean]])) = js.native
    
    var even: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])) = js.native
    
    var function: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var greater: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]])) = js.native
    
    var greaterOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]])) = js.native
    
    var hasLength: (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* length */ Double, Boolean]])) = js.native
    
    var inRange: (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]])) = js.native
    
    var infinity: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var instance: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]])) = js.native
    
    var instanceStrict: (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]])) = js.native
    
    var integer: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]])) = js.native
    
    var iterable: ExtendWithAssertIterableF | ((AssertExtended[Any, Any]) & ExtendWithAssertIterableF) = js.native
    
    var less: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]])) = js.native
    
    var lessOrEqual: (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]])) = js.native
    
    var like: (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]])) = js.native
    
    var `match`: (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]])) = js.native
    
    var maybe: (ExtendWithAssert[CheckTypePredicates & MaybeFunction]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[CheckTypePredicates & MaybeFunction])) = js.native
    
    var negative: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])) = js.native
    
    var nonEmptyArray: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var nonEmptyObject: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var nonEmptyString: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var not: (ExtendWithAssert[CheckTypePredicates & NegationFunction]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[CheckTypePredicates & NegationFunction])) = js.native
    
    var `null`: (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is null */ Boolean]])) = js.native
    
    var number: (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is number */ Boolean]])) = js.native
    
    var `object`: ExtendWithAssertObjectFun | ((AssertExtended[Any, Any]) & ExtendWithAssertObjectFun) = js.native
    
    var odd: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])) = js.native
    
    var positive: (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* num */ Double, Boolean]])) = js.native
    
    var primitive: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
    
    var string: (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is string */ Boolean]])) = js.native
    
    var undefined: (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, /* is undefined */ Boolean]])) = js.native
    
    var zero: (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]]) | ((AssertExtended[Any, Any]) & (ExtendWithAssert[js.Function1[/* a */ Any, Boolean]])) = js.native
  }
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.IterableFunction> */
  trait ExtendWithAssertIterableF extends StObject {
    
    var of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)
  }
  object ExtendWithAssertIterableF {
    
    inline def apply(of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): ExtendWithAssertIterableF = {
      val __obj = js.Dynamic.literal(of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWithAssertIterableF]
    }
    
    extension [Self <: ExtendWithAssertIterableF](x: Self) {
      
      inline def setOf(value: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined check-types.check-types.ExtendWithAssert<check-types.check-types.ObjectFunction> */
  trait ExtendWithAssertObjectFun extends StObject {
    
    var of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)
  }
  object ExtendWithAssertObjectFun {
    
    inline def apply(of: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): ExtendWithAssertObjectFun = {
      val __obj = js.Dynamic.literal(of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWithAssertObjectFun]
    }
    
    extension [Self <: ExtendWithAssertObjectFun](x: Self) {
      
      inline def setOf(value: ExtendWithAssertCheckType | ((AssertExtended[Any, Any]) & ExtendWithAssertCheckType)): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, Any]
}
