package typings.checkTypes

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.checkTypes.anon.ExtendWithAssertCheckType
import typings.checkTypes.anon.Instantiable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("check-types", JSImport.Namespace)
  @js.native
  val ^ : CheckType = js.native
  
  @js.native
  trait ArrayFunction extends StObject {
    
    def apply(a: Any): /* is std.Array<any> */ Boolean = js.native
    
    var of: CheckTypePredicates = js.native
  }
  
  @js.native
  trait ArrayLikeFunction extends StObject {
    
    def apply(a: Any): /* is std.ArrayLike<any> */ Boolean = js.native
    
    var of: CheckTypePredicates = js.native
  }
  
  type AssertExtended[T /* <: js.Array[Any] */, R] = js.Function1[
    /* import warning: importer.ImportType#apply c repeated non-array type: T */ /* args */ js.Array[T], 
    R
  ]
  
  type AssertFunction = js.Function3[
    /* possibleFalsy */ Any, 
    /* message */ js.UndefOr[String], 
    /* errorType */ js.UndefOr[Instantiable], 
    Any
  ]
  
  @js.native
  trait CheckType extends StObject {
    
    def all(arr: js.Array[Boolean]): Boolean = js.native
    def all(arr: StringDictionary[Boolean]): Boolean = js.native
    
    def any(arr: js.Array[Boolean]): Boolean = js.native
    def any(arr: StringDictionary[Boolean]): Boolean = js.native
    
    /* Batch operations */
    /**
      * Applying predicate to every element of array and returning resulting array
      *
      * Example: apply([2, 3, "four"], check.number) => [true, true, false]
      */
    @JSName("apply")
    def apply[T](arr: js.Array[Any], predicate: js.Function1[/* repeated */ Any, T]): js.Array[T] = js.native
    
    /* Array predicates */
    def array(a: Any): /* is std.Array<any> */ Boolean = js.native
    
    def arrayLike(a: Any): /* is std.ArrayLike<any> */ Boolean = js.native
    @JSName("arrayLike")
    var arrayLike_Original: ArrayLikeFunction = js.native
    
    /* Array predicates */
    @JSName("array")
    var array_Original: ArrayFunction = js.native
    
    def assert[T](possibleFalsy: T): T = js.native
    def assert[T](possibleFalsy: T, message: String): T = js.native
    def assert[T](possibleFalsy: T, message: String, errorType: Instantiable): T = js.native
    def assert[T](possibleFalsy: T, message: Unit, errorType: Instantiable): T = js.native
    @JSName("assert")
    var assert_Original: ExtendWithAssertCheckType = js.native
    
    def assigned(a: Any): Boolean = js.native
    
    /**
      * Excluding a and b. Any order of a, b
      */
    def between(num: Double, a: Double, b: Double): Boolean = js.native
    
    /* Boolean predicates */
    def boolean(a: Any): /* is boolean */ Boolean = js.native
    
    def contains(a: String, substring: String): Boolean = js.native
    
    /* Date predicates */
    def date(a: Any): /* is std.Date */ Boolean = js.native
    
    def emptyArray(a: Any): Boolean = js.native
    
    def emptyObject(a: Any): Boolean = js.native
    
    def emptyString(a: Any): Boolean = js.native
    
    /* General predicates */
    def equal(a: Any, b: Any): Boolean = js.native
    
    def even(num: Double): Boolean = js.native
    
    /* Function predicates */
    def function(a: Any): Boolean = js.native
    
    def greater(num: Double, greaterThan: Double): Boolean = js.native
    
    def greaterOrEqual(num: Double, greaterOrEqual: Double): Boolean = js.native
    
    def hasLength(a: Any, length: Double): Boolean = js.native
    
    /**
      * Including a, b. Any order of a, b
      */
    def inRange(num: Double, a: Double, b: Double): Boolean = js.native
    
    def includes(a: js.Array[Any], value: Any): Boolean = js.native
    
    def infinity(a: Any): Boolean = js.native
    
    /**
      * Checking via instanceof, fallback constructor.name and .toString()
      */
    def instance[T /* <: js.Object */](a: Any, prototype: T): /* is T */ Boolean = js.native
    
    /**
      * Checking via instanceof
      */
    def instanceStrict[T /* <: js.Object */](a: Any, prototype: T): /* is T */ Boolean = js.native
    
    def integer(a: Any): /* is number */ Boolean = js.native
    
    def iterable(a: Any): /* is std.Iterable<any> */ Boolean = js.native
    @JSName("iterable")
    var iterable_Original: IterableFunction = js.native
    
    def less(num: Double, lessThan: Double): Boolean = js.native
    
    def lessOrEqual(num: Double, lessOrEqual: Double): Boolean = js.native
    
    /**
      * Duck type checking. Structural in other words. Checking if a has all properties of duck
      */
    def like[T /* <: js.Object */](a: Any, duck: T): /* is T */ Boolean = js.native
    
    // Also some difficulties with returning object with only defined in predicates object propertis.
    // Will gladly accept help or ideas. Now using any for returned object
    def map[T /* <: StringDictionary[Any] */](
      arr: T,
      predicates: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: (args : ...any): boolean} */ js.Any
        ]
    ): Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: any} */ js.Any
      ] = js.native
    
    def `match`(a: String, b: js.RegExp): Boolean = js.native
    
    def maybe[T](`val`: T): Boolean | T = js.native
    @JSName("maybe")
    var maybe_Original: CheckTypePredicates & MaybeFunction = js.native
    
    def negative(num: Double): Boolean = js.native
    
    def nonEmptyArray(a: Any): Boolean = js.native
    
    def nonEmptyObject(a: Any): Boolean = js.native
    
    def nonEmptyString(a: Any): Boolean = js.native
    
    /* Modifiers (some of them in their respected sections) */
    def not(`val`: Any): Boolean = js.native
    /* Modifiers (some of them in their respected sections) */
    @JSName("not")
    var not_Original: CheckTypePredicates & NegationFunction = js.native
    
    def `null`(a: Any): /* is null */ Boolean = js.native
    
    /* Number predicates */
    def number(a: Any): /* is number */ Boolean = js.native
    
    /* Object predicates */
    def `object`(a: Any): /* is object */ Boolean = js.native
    /* Object predicates */
    @JSName("object")
    var object_Original: ObjectFunction = js.native
    
    def odd(num: Double): Boolean = js.native
    
    def positive(num: Double): Boolean = js.native
    
    def primitive(a: Any): Boolean = js.native
    
    /* String predicates */
    def string(a: Any): /* is string */ Boolean = js.native
    
    def undefined(a: Any): /* is undefined */ Boolean = js.native
    
    def zero(a: Any): Boolean = js.native
  }
  
  /* Inlined std.Pick<check-types.check-types.CheckType, 'equal' | 'undefined' | 'null' | 'assigned' | 'primitive' | 'zero' | 'infinity' | 'number' | 'integer' | 'even' | 'odd' | 'greater' | 'less' | 'between' | 'greaterOrEqual' | 'lessOrEqual' | 'inRange' | 'positive' | 'negative' | 'string' | 'emptyString' | 'nonEmptyString' | 'contains' | 'match' | 'boolean' | 'object' | 'emptyObject' | 'nonEmptyObject' | 'instanceStrict' | 'instance' | 'like' | 'array' | 'emptyArray' | 'nonEmptyArray' | 'arrayLike' | 'iterable' | 'date' | 'function' | 'hasLength'> */
  trait CheckTypePredicates extends StObject {
    
    def array(a: Any): /* is std.Array<any> */ Boolean
    
    def arrayLike(a: Any): /* is std.ArrayLike<any> */ Boolean
    @JSName("arrayLike")
    var arrayLike_Original: ArrayLikeFunction
    
    @JSName("array")
    var array_Original: ArrayFunction
    
    def assigned(a: Any): Boolean
    @JSName("assigned")
    var assigned_Original: js.Function1[/* a */ Any, Boolean]
    
    def between(num: Double, a: Double, b: Double): Boolean
    @JSName("between")
    var between_Original: js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]
    
    def boolean(a: Any): /* is boolean */ Boolean
    @JSName("boolean")
    var boolean_Original: js.Function1[/* a */ Any, /* is boolean */ Boolean]
    
    def contains(a: String, substring: String): Boolean
    @JSName("contains")
    var contains_Original: js.Function2[/* a */ String, /* substring */ String, Boolean]
    
    def date(a: Any): /* is std.Date */ Boolean
    @JSName("date")
    var date_Original: js.Function1[/* a */ Any, /* is std.Date */ Boolean]
    
    def emptyArray(a: Any): Boolean
    @JSName("emptyArray")
    var emptyArray_Original: js.Function1[/* a */ Any, Boolean]
    
    def emptyObject(a: Any): Boolean
    @JSName("emptyObject")
    var emptyObject_Original: js.Function1[/* a */ Any, Boolean]
    
    def emptyString(a: Any): Boolean
    @JSName("emptyString")
    var emptyString_Original: js.Function1[/* a */ Any, Boolean]
    
    def equal(a: Any, b: Any): Boolean
    @JSName("equal")
    var equal_Original: js.Function2[/* a */ Any, /* b */ Any, Boolean]
    
    def even(num: Double): Boolean
    @JSName("even")
    var even_Original: js.Function1[/* num */ Double, Boolean]
    
    def function(a: Any): Boolean
    @JSName("function")
    var function_Original: js.Function1[/* a */ Any, Boolean]
    
    def greater(num: Double, greaterThan: Double): Boolean
    
    def greaterOrEqual(num: Double, greaterOrEqual: Double): Boolean
    @JSName("greaterOrEqual")
    var greaterOrEqual_Original: js.Function2[/* num */ Double, /* greaterOrEqual */ Double, Boolean]
    
    @JSName("greater")
    var greater_Original: js.Function2[/* num */ Double, /* greaterThan */ Double, Boolean]
    
    def hasLength(a: Any, length: Double): Boolean
    @JSName("hasLength")
    var hasLength_Original: js.Function2[/* a */ Any, /* length */ Double, Boolean]
    
    def inRange(num: Double, a: Double, b: Double): Boolean
    @JSName("inRange")
    var inRange_Original: js.Function3[/* num */ Double, /* a */ Double, /* b */ Double, Boolean]
    
    def infinity(a: Any): Boolean
    @JSName("infinity")
    var infinity_Original: js.Function1[/* a */ Any, Boolean]
    
    def instance[T /* <: js.Object */](a: Any, prototype: T): /* is T */ Boolean
    
    def instanceStrict[T /* <: js.Object */](a: Any, prototype: T): /* is T */ Boolean
    @JSName("instanceStrict")
    var instanceStrict_Original: js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]
    
    @JSName("instance")
    var instance_Original: js.Function2[/* a */ Any, /* prototype */ js.Object, /* is object */ Boolean]
    
    def integer(a: Any): /* is number */ Boolean
    @JSName("integer")
    var integer_Original: js.Function1[/* a */ Any, /* is number */ Boolean]
    
    def iterable(a: Any): /* is std.Iterable<any> */ Boolean
    @JSName("iterable")
    var iterable_Original: IterableFunction
    
    def less(num: Double, lessThan: Double): Boolean
    
    def lessOrEqual(num: Double, lessOrEqual: Double): Boolean
    @JSName("lessOrEqual")
    var lessOrEqual_Original: js.Function2[/* num */ Double, /* lessOrEqual */ Double, Boolean]
    
    @JSName("less")
    var less_Original: js.Function2[/* num */ Double, /* lessThan */ Double, Boolean]
    
    def like[T /* <: js.Object */](a: Any, duck: T): /* is T */ Boolean
    @JSName("like")
    var like_Original: js.Function2[/* a */ Any, /* duck */ js.Object, /* is object */ Boolean]
    
    def `match`(a: String, b: js.RegExp): Boolean
    @JSName("match")
    var match_Original: js.Function2[/* a */ String, /* b */ js.RegExp, Boolean]
    
    def negative(num: Double): Boolean
    @JSName("negative")
    var negative_Original: js.Function1[/* num */ Double, Boolean]
    
    def nonEmptyArray(a: Any): Boolean
    @JSName("nonEmptyArray")
    var nonEmptyArray_Original: js.Function1[/* a */ Any, Boolean]
    
    def nonEmptyObject(a: Any): Boolean
    @JSName("nonEmptyObject")
    var nonEmptyObject_Original: js.Function1[/* a */ Any, Boolean]
    
    def nonEmptyString(a: Any): Boolean
    @JSName("nonEmptyString")
    var nonEmptyString_Original: js.Function1[/* a */ Any, Boolean]
    
    def `null`(a: Any): /* is null */ Boolean
    @JSName("null")
    var null_Original: js.Function1[/* a */ Any, /* is null */ Boolean]
    
    def number(a: Any): /* is number */ Boolean
    @JSName("number")
    var number_Original: js.Function1[/* a */ Any, /* is number */ Boolean]
    
    def `object`(a: Any): /* is object */ Boolean
    @JSName("object")
    var object_Original: ObjectFunction
    
    def odd(num: Double): Boolean
    @JSName("odd")
    var odd_Original: js.Function1[/* num */ Double, Boolean]
    
    def positive(num: Double): Boolean
    @JSName("positive")
    var positive_Original: js.Function1[/* num */ Double, Boolean]
    
    def primitive(a: Any): Boolean
    @JSName("primitive")
    var primitive_Original: js.Function1[/* a */ Any, Boolean]
    
    def string(a: Any): /* is string */ Boolean
    @JSName("string")
    var string_Original: js.Function1[/* a */ Any, /* is string */ Boolean]
    
    def undefined(a: Any): /* is undefined */ Boolean
    @JSName("undefined")
    var undefined_Original: js.Function1[/* a */ Any, /* is undefined */ Boolean]
    
    def zero(a: Any): Boolean
    @JSName("zero")
    var zero_Original: js.Function1[/* a */ Any, Boolean]
  }
  object CheckTypePredicates {
    
    inline def apply(
      array: ArrayFunction,
      arrayLike: ArrayLikeFunction,
      assigned: /* a */ Any => Boolean,
      between: (/* num */ Double, /* a */ Double, /* b */ Double) => Boolean,
      boolean: /* a */ Any => /* is boolean */ Boolean,
      contains: (/* a */ String, /* substring */ String) => Boolean,
      date: /* a */ Any => /* is std.Date */ Boolean,
      emptyArray: /* a */ Any => Boolean,
      emptyObject: /* a */ Any => Boolean,
      emptyString: /* a */ Any => Boolean,
      equal: (/* a */ Any, /* b */ Any) => Boolean,
      even: /* num */ Double => Boolean,
      function: /* a */ Any => Boolean,
      greater: (/* num */ Double, /* greaterThan */ Double) => Boolean,
      greaterOrEqual: (/* num */ Double, /* greaterOrEqual */ Double) => Boolean,
      hasLength: (/* a */ Any, /* length */ Double) => Boolean,
      inRange: (/* num */ Double, /* a */ Double, /* b */ Double) => Boolean,
      infinity: /* a */ Any => Boolean,
      instance: (/* a */ Any, /* prototype */ js.Object) => /* is object */ Boolean,
      instanceStrict: (/* a */ Any, /* prototype */ js.Object) => /* is object */ Boolean,
      integer: /* a */ Any => /* is number */ Boolean,
      iterable: IterableFunction,
      less: (/* num */ Double, /* lessThan */ Double) => Boolean,
      lessOrEqual: (/* num */ Double, /* lessOrEqual */ Double) => Boolean,
      like: (/* a */ Any, /* duck */ js.Object) => /* is object */ Boolean,
      `match`: (/* a */ String, /* b */ js.RegExp) => Boolean,
      negative: /* num */ Double => Boolean,
      nonEmptyArray: /* a */ Any => Boolean,
      nonEmptyObject: /* a */ Any => Boolean,
      nonEmptyString: /* a */ Any => Boolean,
      `null`: /* a */ Any => /* is null */ Boolean,
      number: /* a */ Any => /* is number */ Boolean,
      `object`: ObjectFunction,
      odd: /* num */ Double => Boolean,
      positive: /* num */ Double => Boolean,
      primitive: /* a */ Any => Boolean,
      string: /* a */ Any => /* is string */ Boolean,
      undefined: /* a */ Any => /* is undefined */ Boolean,
      zero: /* a */ Any => Boolean
    ): CheckTypePredicates = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arrayLike = arrayLike.asInstanceOf[js.Any], assigned = js.Any.fromFunction1(assigned), between = js.Any.fromFunction3(between), boolean = js.Any.fromFunction1(boolean), contains = js.Any.fromFunction2(contains), date = js.Any.fromFunction1(date), emptyArray = js.Any.fromFunction1(emptyArray), emptyObject = js.Any.fromFunction1(emptyObject), emptyString = js.Any.fromFunction1(emptyString), equal = js.Any.fromFunction2(equal), even = js.Any.fromFunction1(even), function = js.Any.fromFunction1(function), greater = js.Any.fromFunction2(greater), greaterOrEqual = js.Any.fromFunction2(greaterOrEqual), hasLength = js.Any.fromFunction2(hasLength), inRange = js.Any.fromFunction3(inRange), infinity = js.Any.fromFunction1(infinity), instance = js.Any.fromFunction2(instance), instanceStrict = js.Any.fromFunction2(instanceStrict), integer = js.Any.fromFunction1(integer), iterable = iterable.asInstanceOf[js.Any], less = js.Any.fromFunction2(less), lessOrEqual = js.Any.fromFunction2(lessOrEqual), like = js.Any.fromFunction2(like), negative = js.Any.fromFunction1(negative), nonEmptyArray = js.Any.fromFunction1(nonEmptyArray), nonEmptyObject = js.Any.fromFunction1(nonEmptyObject), nonEmptyString = js.Any.fromFunction1(nonEmptyString), number = js.Any.fromFunction1(number), odd = js.Any.fromFunction1(odd), positive = js.Any.fromFunction1(positive), primitive = js.Any.fromFunction1(primitive), string = js.Any.fromFunction1(string), undefined = js.Any.fromFunction1(undefined), zero = js.Any.fromFunction1(zero))
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckTypePredicates]
    }
    
    extension [Self <: CheckTypePredicates](x: Self) {
      
      inline def setArray(value: ArrayFunction): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayLike(value: ArrayLikeFunction): Self = StObject.set(x, "arrayLike", value.asInstanceOf[js.Any])
      
      inline def setAssigned(value: /* a */ Any => Boolean): Self = StObject.set(x, "assigned", js.Any.fromFunction1(value))
      
      inline def setBetween(value: (/* num */ Double, /* a */ Double, /* b */ Double) => Boolean): Self = StObject.set(x, "between", js.Any.fromFunction3(value))
      
      inline def setBoolean(value: /* a */ Any => /* is boolean */ Boolean): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setContains(value: (/* a */ String, /* substring */ String) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
      
      inline def setDate(value: /* a */ Any => /* is std.Date */ Boolean): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
      
      inline def setEmptyArray(value: /* a */ Any => Boolean): Self = StObject.set(x, "emptyArray", js.Any.fromFunction1(value))
      
      inline def setEmptyObject(value: /* a */ Any => Boolean): Self = StObject.set(x, "emptyObject", js.Any.fromFunction1(value))
      
      inline def setEmptyString(value: /* a */ Any => Boolean): Self = StObject.set(x, "emptyString", js.Any.fromFunction1(value))
      
      inline def setEqual(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setEven(value: /* num */ Double => Boolean): Self = StObject.set(x, "even", js.Any.fromFunction1(value))
      
      inline def setFunction(value: /* a */ Any => Boolean): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
      
      inline def setGreater(value: (/* num */ Double, /* greaterThan */ Double) => Boolean): Self = StObject.set(x, "greater", js.Any.fromFunction2(value))
      
      inline def setGreaterOrEqual(value: (/* num */ Double, /* greaterOrEqual */ Double) => Boolean): Self = StObject.set(x, "greaterOrEqual", js.Any.fromFunction2(value))
      
      inline def setHasLength(value: (/* a */ Any, /* length */ Double) => Boolean): Self = StObject.set(x, "hasLength", js.Any.fromFunction2(value))
      
      inline def setInRange(value: (/* num */ Double, /* a */ Double, /* b */ Double) => Boolean): Self = StObject.set(x, "inRange", js.Any.fromFunction3(value))
      
      inline def setInfinity(value: /* a */ Any => Boolean): Self = StObject.set(x, "infinity", js.Any.fromFunction1(value))
      
      inline def setInstance(value: (/* a */ Any, /* prototype */ js.Object) => /* is object */ Boolean): Self = StObject.set(x, "instance", js.Any.fromFunction2(value))
      
      inline def setInstanceStrict(value: (/* a */ Any, /* prototype */ js.Object) => /* is object */ Boolean): Self = StObject.set(x, "instanceStrict", js.Any.fromFunction2(value))
      
      inline def setInteger(value: /* a */ Any => /* is number */ Boolean): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      inline def setIterable(value: IterableFunction): Self = StObject.set(x, "iterable", value.asInstanceOf[js.Any])
      
      inline def setLess(value: (/* num */ Double, /* lessThan */ Double) => Boolean): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
      
      inline def setLessOrEqual(value: (/* num */ Double, /* lessOrEqual */ Double) => Boolean): Self = StObject.set(x, "lessOrEqual", js.Any.fromFunction2(value))
      
      inline def setLike(value: (/* a */ Any, /* duck */ js.Object) => /* is object */ Boolean): Self = StObject.set(x, "like", js.Any.fromFunction2(value))
      
      inline def setMatch(value: (/* a */ String, /* b */ js.RegExp) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setNegative(value: /* num */ Double => Boolean): Self = StObject.set(x, "negative", js.Any.fromFunction1(value))
      
      inline def setNonEmptyArray(value: /* a */ Any => Boolean): Self = StObject.set(x, "nonEmptyArray", js.Any.fromFunction1(value))
      
      inline def setNonEmptyObject(value: /* a */ Any => Boolean): Self = StObject.set(x, "nonEmptyObject", js.Any.fromFunction1(value))
      
      inline def setNonEmptyString(value: /* a */ Any => Boolean): Self = StObject.set(x, "nonEmptyString", js.Any.fromFunction1(value))
      
      inline def setNull(value: /* a */ Any => /* is null */ Boolean): Self = StObject.set(x, "null", js.Any.fromFunction1(value))
      
      inline def setNumber(value: /* a */ Any => /* is number */ Boolean): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setObject(value: ObjectFunction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOdd(value: /* num */ Double => Boolean): Self = StObject.set(x, "odd", js.Any.fromFunction1(value))
      
      inline def setPositive(value: /* num */ Double => Boolean): Self = StObject.set(x, "positive", js.Any.fromFunction1(value))
      
      inline def setPrimitive(value: /* a */ Any => Boolean): Self = StObject.set(x, "primitive", js.Any.fromFunction1(value))
      
      inline def setString(value: /* a */ Any => /* is string */ Boolean): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def setUndefined(value: /* a */ Any => /* is undefined */ Boolean): Self = StObject.set(x, "undefined", js.Any.fromFunction1(value))
      
      inline def setZero(value: /* a */ Any => Boolean): Self = StObject.set(x, "zero", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends (a : infer U): infer R? check-types.check-types.AssertExtended<U, R> & check-types.check-types.ExtendWithAssert<T[K]> : check-types.check-types.ExtendWithAssert<T[K]>}
    }}}
    */
  @js.native
  trait ExtendWithAssert[T] extends StObject
  
  @js.native
  trait IterableFunction extends StObject {
    
    def apply(a: Any): /* is std.Iterable<any> */ Boolean = js.native
    
    var of: CheckTypePredicates = js.native
  }
  
  type MaybeFunction = js.Function1[/* val */ Any, Boolean | Any]
  
  type NegationFunction = js.Function1[/* val */ Any, Boolean]
  
  @js.native
  trait ObjectFunction extends StObject {
    
    def apply(a: Any): /* is object */ Boolean = js.native
    
    var of: CheckTypePredicates = js.native
  }
  
  type _To = CheckType
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CheckType = ^
}
