package typings.code

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("code", "count")
  @js.native
  def count(): Double = js.native
  
  @JSImport("code", "expect")
  @js.native
  def expect[T](value: T): AssertionChain[T] = js.native
  @JSImport("code", "expect")
  @js.native
  def expect[T](value: T, prefix: String): AssertionChain[T] = js.native
  @JSImport("code", "expect")
  @js.native
  def expect[T](value: js.Array[T]): AssertionChain[T] = js.native
  @JSImport("code", "expect")
  @js.native
  def expect[T](value: js.Array[T], prefix: String): AssertionChain[T] = js.native
  
  @JSImport("code", "fail")
  @js.native
  def fail(message: String): Unit = js.native
  
  @JSImport("code", "incomplete")
  @js.native
  def incomplete(): js.Array[String] | Null = js.native
  
  @JSImport("code", "settings")
  @js.native
  val settings: Settings_ = js.native
  
  @JSImport("code", "thrownAt")
  @js.native
  def thrownAt(): CodeError = js.native
  @JSImport("code", "thrownAt")
  @js.native
  def thrownAt(error: Error): CodeError = js.native
  
  type Assertion[T] = Grammar[T] with Flags[T]
  
  type AssertionChain[T] = Assertion[T] with Expectation[T]
  
  @js.native
  trait CodeError extends StObject {
    
    var column: String = js.native
    
    var filename: String = js.native
    
    var line: String = js.native
  }
  object CodeError {
    
    @scala.inline
    def apply(column: String, filename: String, line: String): CodeError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeError]
    }
    
    @scala.inline
    implicit class CodeErrorMutableBuilder[Self <: CodeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type Expectation[T] = Types[T] with Values[T]
  
  @js.native
  trait Flags[T] extends StObject {
    
    /** Inverses the expected result of any assertion */
    var not: AssertionChain[T] = js.native
    
    /**
      * Requires that inclusion matches appear only once in the provided value.
      * Used by include().
      */
    var once: AssertionChain[T] = js.native
    
    /**
      * Requires that only the provided elements appear in the provided value.
      * Used by include().
      */
    var only: AssertionChain[T] = js.native
    
    /**
      * Allows a partial match when asserting inclusion
      * Used by include(). Defaults to false.
      */
    var part: AssertionChain[T] = js.native
    
    /**
      * Performs a comparison using strict equality (===).
      * Code defaults to deep comparison. Used by equal() and include().
      */
    var shallow: AssertionChain[T] = js.native
  }
  object Flags {
    
    @scala.inline
    def apply[T](
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
    implicit class FlagsMutableBuilder[Self <: Flags[_], T] (val x: Self with Flags[T]) extends AnyVal {
      
      @scala.inline
      def setNot(value: AssertionChain[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnce(value: AssertionChain[T]): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnly(value: AssertionChain[T]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPart(value: AssertionChain[T]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallow(value: AssertionChain[T]): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Grammar[T] extends StObject {
    
    /** Connecting word. */
    var a: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var an: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var and: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var at: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var be: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var have: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var in: AssertionChain[T] = js.native
    
    /** Connecting word. */
    var to: AssertionChain[T] = js.native
  }
  object Grammar {
    
    @scala.inline
    def apply[T](
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
    implicit class GrammarMutableBuilder[Self <: Grammar[_], T] (val x: Self with Grammar[T]) extends AnyVal {
      
      @scala.inline
      def setA(value: AssertionChain[T]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAn(value: AssertionChain[T]): Self = StObject.set(x, "an", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnd(value: AssertionChain[T]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAt(value: AssertionChain[T]): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBe(value: AssertionChain[T]): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHave(value: AssertionChain[T]): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: AssertionChain[T]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: AssertionChain[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings_ extends StObject {
    
    /**
      * Ignore object prototypes when doing a deep comparison?
      * Defaults to false.
      */
    var comparePrototypes: js.UndefOr[Boolean] = js.native
    
    /**
      * Truncate long assertion error messages for readability?
      * Defaults to true.
      */
    var truncateMessages: js.UndefOr[Boolean] = js.native
  }
  object Settings_ {
    
    @scala.inline
    def apply(): Settings_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings_]
    }
    
    @scala.inline
    implicit class Settings_MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparePrototypes(value: Boolean): Self = StObject.set(x, "comparePrototypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparePrototypesUndefined: Self = StObject.set(x, "comparePrototypes", js.undefined)
      
      @scala.inline
      def setTruncateMessages(value: Boolean): Self = StObject.set(x, "truncateMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateMessagesUndefined: Self = StObject.set(x, "truncateMessages", js.undefined)
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
    def error(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
    def error(`type`: js.UndefOr[scala.Nothing], message: RegExp): AssertionChain[T] = js.native
    def error(`type`: js.Any): AssertionChain[T] = js.native
    def error(`type`: js.Any, message: String): AssertionChain[T] = js.native
    def error(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
    
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
    def equal(value: T, options: js.Any): AssertionChain[T] = js.native
    def equal(value: js.Array[T]): AssertionChain[T] = js.native
    def equal(value: js.Array[T], options: js.Any): AssertionChain[T] = js.native
    
    def equals(value: T, options: js.Any): AssertionChain[T] = js.native
    def equals(value: js.Array[T]): AssertionChain[T] = js.native
    def equals(value: js.Array[T], options: js.Any): AssertionChain[T] = js.native
    
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
    def instanceOf(`type`: js.Any): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has the provided instanceof value. */
    def instanceof(`type`: js.Any): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is at least (>=) the provided value. */
    def least(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value has a length property matching the provided size or an object with the specified number of keys. */
    def length(size: Double): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is less than (<) the provided value. */
    def lessThan(value: T): AssertionChain[T] = js.native
    
    /** Asserts that the reference value's toString() representation matches the provided regular expression. */
    def `match`(regex: RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value's toString() representation matches the provided regular expression. */
    def matches(regex: RegExp): AssertionChain[T] = js.native
    
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
    def reject(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
    def reject(`type`: js.UndefOr[scala.Nothing], message: RegExp): AssertionChain[T] = js.native
    def reject(`type`: js.Any): AssertionChain[T] = js.native
    def reject(`type`: js.Any, message: String): AssertionChain[T] = js.native
    def reject(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the Promise reference value rejects with an exception when called */
    def rejects(): AssertionChain[T] = js.native
    def rejects(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
    def rejects(`type`: js.UndefOr[scala.Nothing], message: RegExp): AssertionChain[T] = js.native
    def rejects(`type`: js.Any): AssertionChain[T] = js.native
    def rejects(`type`: js.Any, message: String): AssertionChain[T] = js.native
    def rejects(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
    
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
    def `throw`(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
    def `throw`(`type`: js.UndefOr[scala.Nothing], message: RegExp): AssertionChain[T] = js.native
    def `throw`(`type`: js.Any): AssertionChain[T] = js.native
    def `throw`(`type`: js.Any, message: String): AssertionChain[T] = js.native
    def `throw`(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the function reference value throws an exception when called. */
    def throws(): AssertionChain[T] = js.native
    def throws(`type`: js.UndefOr[scala.Nothing], message: String): AssertionChain[T] = js.native
    def throws(`type`: js.UndefOr[scala.Nothing], message: RegExp): AssertionChain[T] = js.native
    def throws(`type`: js.Any): AssertionChain[T] = js.native
    def throws(`type`: js.Any, message: String): AssertionChain[T] = js.native
    def throws(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is true. */
    def `true`(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is undefined. */
    def undefined(): AssertionChain[T] = js.native
    
    /** Asserts that the reference value is within (from <= value <= to) the provided values. */
    def within(from: T, to: T): AssertionChain[T] = js.native
  }
}
