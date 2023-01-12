package typings.code

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
  
  inline def expect[T](value: T): AssertionChain[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionChain[T]]
  inline def expect[T](value: T, prefix: String): AssertionChain[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[AssertionChain[T]]
  inline def expect[T](value: js.Array[T]): AssertionChain[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionChain[T]]
  inline def expect[T](value: js.Array[T], prefix: String): AssertionChain[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[AssertionChain[T]]
  
  inline def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def incomplete(): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("incomplete")().asInstanceOf[js.Array[String] | Null]
  
  @JSImport("code", "settings")
  @js.native
  val settings: Settings_ = js.native
  
  inline def thrownAt(): CodeError = ^.asInstanceOf[js.Dynamic].applyDynamic("thrownAt")().asInstanceOf[CodeError]
  inline def thrownAt(error: js.Error): CodeError = ^.asInstanceOf[js.Dynamic].applyDynamic("thrownAt")(error.asInstanceOf[js.Any]).asInstanceOf[CodeError]
  
  trait Assertion[T]
    extends StObject
       with Grammar[T]
       with Flags[T]
  object Assertion {
    
    inline def apply[T](
      a: AssertionChain[T],
      an: AssertionChain[T],
      and: AssertionChain[T],
      at: AssertionChain[T],
      be: AssertionChain[T],
      have: AssertionChain[T],
      in: AssertionChain[T],
      not: AssertionChain[T],
      once: AssertionChain[T],
      only: AssertionChain[T],
      part: AssertionChain[T],
      shallow: AssertionChain[T],
      to: AssertionChain[T]
    ): Assertion[T] = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], an = an.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assertion[T]]
    }
  }
  
  type AssertionChain[T] = Assertion[T] & Expectation[T]
  
  trait CodeError extends StObject {
    
    var column: String
    
    var filename: String
    
    var line: String
  }
  object CodeError {
    
    inline def apply(column: String, filename: String, line: String): CodeError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeError] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Expectation[T]
    extends StObject
       with Types[T]
       with Values[T]
  
  trait Flags[T] extends StObject {
    
    /** Inverses the expected result of any assertion */
    var not: AssertionChain[T]
    
    /**
      * Requires that inclusion matches appear only once in the provided value.
      * Used by include().
      */
    var once: AssertionChain[T]
    
    /**
      * Requires that only the provided elements appear in the provided value.
      * Used by include().
      */
    var only: AssertionChain[T]
    
    /**
      * Allows a partial match when asserting inclusion
      * Used by include(). Defaults to false.
      */
    var part: AssertionChain[T]
    
    /**
      * Performs a comparison using strict equality (===).
      * Code defaults to deep comparison. Used by equal() and include().
      */
    var shallow: AssertionChain[T]
  }
  object Flags {
    
    inline def apply[T](
      not: AssertionChain[T],
      once: AssertionChain[T],
      only: AssertionChain[T],
      part: AssertionChain[T],
      shallow: AssertionChain[T]
    ): Flags[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flags[?], T] (val x: Self & Flags[T]) extends AnyVal {
      
      inline def setNot(value: AssertionChain[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setOnce(value: AssertionChain[T]): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnly(value: AssertionChain[T]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setPart(value: AssertionChain[T]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: AssertionChain[T]): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Grammar[T] extends StObject {
    
    /** Connecting word. */
    var a: AssertionChain[T]
    
    /** Connecting word. */
    var an: AssertionChain[T]
    
    /** Connecting word. */
    var and: AssertionChain[T]
    
    /** Connecting word. */
    var at: AssertionChain[T]
    
    /** Connecting word. */
    var be: AssertionChain[T]
    
    /** Connecting word. */
    var have: AssertionChain[T]
    
    /** Connecting word. */
    var in: AssertionChain[T]
    
    /** Connecting word. */
    var to: AssertionChain[T]
  }
  object Grammar {
    
    inline def apply[T](
      a: AssertionChain[T],
      an: AssertionChain[T],
      and: AssertionChain[T],
      at: AssertionChain[T],
      be: AssertionChain[T],
      have: AssertionChain[T],
      in: AssertionChain[T],
      to: AssertionChain[T]
    ): Grammar[T] = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], an = an.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grammar[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grammar[?], T] (val x: Self & Grammar[T]) extends AnyVal {
      
      inline def setA(value: AssertionChain[T]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAn(value: AssertionChain[T]): Self = StObject.set(x, "an", value.asInstanceOf[js.Any])
      
      inline def setAnd(value: AssertionChain[T]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAt(value: AssertionChain[T]): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setBe(value: AssertionChain[T]): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      inline def setHave(value: AssertionChain[T]): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      inline def setIn(value: AssertionChain[T]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setTo(value: AssertionChain[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings_ extends StObject {
    
    /**
      * Ignore object prototypes when doing a deep comparison?
      * Defaults to false.
      */
    var comparePrototypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Truncate long assertion error messages for readability?
      * Defaults to true.
      */
    var truncateMessages: js.UndefOr[Boolean] = js.undefined
  }
  object Settings_ {
    
    inline def apply(): Settings_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
      
      inline def setComparePrototypes(value: Boolean): Self = StObject.set(x, "comparePrototypes", value.asInstanceOf[js.Any])
      
      inline def setComparePrototypesUndefined: Self = StObject.set(x, "comparePrototypes", js.undefined)
      
      inline def setTruncateMessages(value: Boolean): Self = StObject.set(x, "truncateMessages", value.asInstanceOf[js.Any])
      
      inline def setTruncateMessagesUndefined: Self = StObject.set(x, "truncateMessages", js.undefined)
    }
  }
  
  @js.native
  trait Types[T] extends StObject {
    
    /** Asserts that the reference value is an arguments object. */
    def arguments(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is an Array. */
    def array(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a boolean. */
    def boolean(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a Buffer. */
    def buffer(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a Date. */
    def date(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is an error. */
    def error(): AssertionChain[T] = js.native
    def error(`type`: Any): AssertionChain[T] = js.native
    def error(`type`: Any, message: String): AssertionChain[T] = js.native
    def error(`type`: Any, message: js.RegExp): AssertionChain[T] = js.native
    def error(`type`: Unit, message: String): AssertionChain[T] = js.native
    def error(`type`: Unit, message: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a function. */
    def function(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a number. */
    def number(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is an object (excluding array, buffer, or other native objects). */
    def `object`(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a RegExp. */
    def regexp(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is a string. */
    def string(): AssertionChain[T] = js.native
  }
  
  @js.native
  trait Values[T] extends StObject {
    
    /** Asserts that the reference value is about the provided value within a delta margin of difference. */
    def about(value: Double, delta: Double): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is greater than (>) the provided value. */
    def above(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is less than (<) the provided value. */
    def below(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is between but not equal (from < value < to) the provided values. */
    def between(from: T, to: T): AssertionChain[T] = js.native
    
    def contain(values: T): AssertionChain[T] = js.native
    /** Asserts that the reference value (a string, array, or object) includes the provided values. */
    def contain(values: String): AssertionChain[T] = js.native
    def contain(values: js.Array[String | T]): AssertionChain[T] = js.native
    
    def contains(values: T): AssertionChain[T] = js.native
    /** Asserts that the reference value (a string, array, or object) includes the provided values. */
    def contains(values: String): AssertionChain[T] = js.native
    def contains(values: js.Array[String | T]): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has a length property equal to zero or an object with no keys. */
    def empty(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value (a string) ends with the provided value. */
    def endWith(value: String): AssertionChain[T] = js.native
    
    /** Asserts that the reference value (a string) ends with the provided value. */
    def endsWith(value: String): AssertionChain[T] = js.native
    
    /** Asserts that the reference value equals the provided value. */
    def equal(value: T): AssertionChain[T] = js.native
    def equal(value: T, options: Any): AssertionChain[T] = js.native
    def equal(value: js.Array[T]): AssertionChain[T] = js.native
    def equal(value: js.Array[T], options: Any): AssertionChain[T] = js.native
    
    def equals(value: T, options: Any): AssertionChain[T] = js.native
    def equals(value: js.Array[T]): AssertionChain[T] = js.native
    def equals(value: js.Array[T], options: Any): AssertionChain[T] = js.native
    
    /** Asserts that the reference value exists (not null or undefined). */
    def exist(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value exists (not null or undefined). */
    def exists(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is false. */
    def `false`(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is greater than (>) the provided value. */
    def greaterThan(value: T): AssertionChain[T] = js.native
    
    def include(values: T): AssertionChain[T] = js.native
    /** Asserts that the reference value (a string, array, or object) includes the provided values. */
    def include(values: String): AssertionChain[T] = js.native
    def include(values: js.Array[String | T]): AssertionChain[T] = js.native
    
    def includes(values: T): AssertionChain[T] = js.native
    /** Asserts that the reference value (a string, array, or object) includes the provided values. */
    def includes(values: String): AssertionChain[T] = js.native
    def includes(values: js.Array[String | T]): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has the provided instanceof value. */
    def instanceOf(`type`: Any): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has the provided instanceof value. */
    def instanceof(`type`: Any): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is at least (>=) the provided value. */
    def least(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has a length property matching the provided size or an object with the specified number of keys. */
    def length(size: Double): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is less than (<) the provided value. */
    def lessThan(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value's toString() representation matches the provided regular expression. */
    def `match`(regex: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value's toString() representation matches the provided regular expression. */
    def matches(regex: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is at most (<=) the provided value. */
    def max(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is at least (>=) the provided value. */
    def min(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is at most (<=) the provided value. */
    def most(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is null. */
    def `null`(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is within (from <= value <= to) the provided values. */
    def range(from: T, to: T): AssertionChain[T] = js.native
    
    /** Asserts that the Promise reference value rejects with an exception when called */
    def reject(): AssertionChain[T] = js.native
    def reject(`type`: Any): AssertionChain[T] = js.native
    def reject(`type`: Any, message: String): AssertionChain[T] = js.native
    def reject(`type`: Any, message: js.RegExp): AssertionChain[T] = js.native
    def reject(`type`: Unit, message: String): AssertionChain[T] = js.native
    def reject(`type`: Unit, message: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the Promise reference value rejects with an exception when called */
    def rejects(): AssertionChain[T] = js.native
    def rejects(`type`: Any): AssertionChain[T] = js.native
    def rejects(`type`: Any, message: String): AssertionChain[T] = js.native
    def rejects(`type`: Any, message: js.RegExp): AssertionChain[T] = js.native
    def rejects(`type`: Unit, message: String): AssertionChain[T] = js.native
    def rejects(`type`: Unit, message: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value satisfies the provided validator function. */
    def satisfies(validator: js.Function1[/* value */ T, Boolean]): AssertionChain[T] = js.native
    
    /** Asserts that the reference value satisfies the provided validator function. */
    def satisfy(validator: js.Function1[/* value */ T, Boolean]): AssertionChain[T] = js.native
    
    /** Asserts that the reference value (a string) starts with the provided value. */
    def startWith(value: String): AssertionChain[T] = js.native
    
    /** Asserts that the reference value (a string) starts with the provided value. */
    def startsWith(value: String): AssertionChain[T] = js.native
    
    /** Asserts that the function reference value throws an exception when called. */
    def `throw`(): AssertionChain[T] = js.native
    def `throw`(`type`: Any): AssertionChain[T] = js.native
    def `throw`(`type`: Any, message: String): AssertionChain[T] = js.native
    def `throw`(`type`: Any, message: js.RegExp): AssertionChain[T] = js.native
    def `throw`(`type`: Unit, message: String): AssertionChain[T] = js.native
    def `throw`(`type`: Unit, message: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the function reference value throws an exception when called. */
    def throws(): AssertionChain[T] = js.native
    def throws(`type`: Any): AssertionChain[T] = js.native
    def throws(`type`: Any, message: String): AssertionChain[T] = js.native
    def throws(`type`: Any, message: js.RegExp): AssertionChain[T] = js.native
    def throws(`type`: Unit, message: String): AssertionChain[T] = js.native
    def throws(`type`: Unit, message: js.RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is true. */
    def `true`(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is undefined. */
    def undefined(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is within (from <= value <= to) the provided values. */
    def within(from: T, to: T): AssertionChain[T] = js.native
  }
}
