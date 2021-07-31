package typings.chaiSpies

import typings.chaiSpies.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChaiSpies {
  
  trait Always extends StObject {
    
    /**
      * ####.always.with
      * Assert that every time the spy has been called the argument list contained the given arguments.
      * ```ts
      * spy('foo');
      * spy('foo', 'bar');
      * spy(1, 2, 'foo');
      * expect(spy).to.have.been.called.always.with('foo');
      * spy.should.have.been.called.always.with('foo');
      * ```
      */
    def `with`(
      a: js.Any,
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion
    @JSName("with")
    var with_Original: AlwaysWith
  }
  object Always {
    
    @scala.inline
    def apply(`with`: AlwaysWith): Always = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Always]
    }
    
    @scala.inline
    implicit class AlwaysMutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWith(value: AlwaysWith): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlwaysWith extends StObject {
    
    /**
      * ####.always.with
      * Assert that every time the spy has been called the argument list contained the given arguments.
      * ```ts
      * spy('foo');
      * spy('foo', 'bar');
      * spy(1, 2, 'foo');
      * expect(spy).to.have.been.called.always.with('foo');
      * spy.should.have.been.called.always.with('foo');
      * ```
      */
    def apply(
      a: js.Any,
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion = js.native
    
    /**
      * ####.always.with.exactly
      * Assert that the spy has never been called with a different list of arguments than the one provided.
      * ```ts
      * spy('foo');
      * spy('foo');
      * expect(spy).to.have.been.called.always.with.exactly('foo');
      * spy.should.have.been.called.always.with.exactly('foo');
      * ```
      */
    def exactly(
      a: js.UndefOr[js.Any],
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion = js.native
  }
  
  trait At extends StObject {
    
    /**
      * ####.min(n) / .at.least(n)
      * Assert that a spy has been called minimum of ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.min(3);
      * expect(spy).to.not.have.been.called.at.least(3);
      * spy.should.have.been.called.at.least(3);
      * spy.should.not.have.been.called.min(3);
      * ```
      */
    def least(n: Double): Assertion
    
    /**
      * ####.max(n) / .at.most(n)
      * Assert that a spy has been called maximum of ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.max(3);
      * expect(spy).to.not.have.been.called.at.most(3);
      * spy.should.have.been.called.at.most(3);
      * spy.should.not.have.been.called.max(3);
      * ```
      */
    def most(n: Double): Assertion
  }
  object At {
    
    @scala.inline
    def apply(least: Double => Assertion, most: Double => Assertion): At = {
      val __obj = js.Dynamic.literal(least = js.Any.fromFunction1(least), most = js.Any.fromFunction1(most))
      __obj.asInstanceOf[At]
    }
    
    @scala.inline
    implicit class AtMutableBuilder[Self <: At] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeast(value: Double => Assertion): Self = StObject.set(x, "least", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMost(value: Double => Assertion): Self = StObject.set(x, "most", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Been
    extends StObject
       with Assertion {
    
    def apply(): Assertion = js.native
    
    /**
      * ####.first
      * Assert that a spy has been called first.
      * ```ts
      * expect(spy).to.have.been.called.first;
      * expect(spy).to.not.have.been.called.first;
      * spy.should.have.been.called.first;
      * spy.should.not.have.been.called.first;
      * ```
      */
    var first: Assertion = js.native
    
    /**
      * ####.second
      * Assert that a spy has been called second.
      * ```ts
      * expect(spy).to.have.been.called.second;
      * expect(spy).to.not.have.been.called.second;
      * spy.should.have.been.called.second;
      * spy.should.not.have.been.called.second;
      * ```
      */
    var second: Assertion = js.native
    
    /**
      * ####.third
      * Assert that a spy has been called third.
      * ```ts
      * expect(spy).to.have.been.called.third;
      * expect(spy).to.not.have.been.called.third;
      * spy.should.have.been.called.third;
      * spy.should.not.have.been.called.third;
      * ```
      */
    var third: Assertion = js.native
  }
  
  @js.native
  trait Called extends StObject {
    
    def apply(): Assertion = js.native
    
    /**
      * ####.above(n) / .gt(n)
      * Assert that a spy has been called more than ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.above(3);
      * spy.should.not.have.been.called.above(3);
      * ```
      */
    def above(n: Double): Assertion = js.native
    
    var always: Always = js.native
    
    var at: At = js.native
    
    /**
      * ####.below(n) / .lt(n)
      * Assert that a spy has been called fewer than ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.below(3);
      * spy.should.not.have.been.called.below(3);
      * ```
      */
    def below(n: Double): Assertion = js.native
    
    /**
      * ####.exactly(n)
      * Assert that a spy has been called exactly ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.exactly(3);
      * expect(spy).to.not.have.been.called.exactly(3);
      * spy.should.have.been.called.exactly(3);
      * spy.should.not.have.been.called.exactly(3);
      * ```
      */
    def exactly(n: Double): Assertion = js.native
    
    /**
      * ####.above(n) / .gt(n)
      * Assert that a spy has been called more than ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.gt(3);
      * spy.should.not.have.been.called.gt(3);
      * ```
      */
    def gt(n: Double): Assertion = js.native
    
    /**
      * ####.below(n) / .lt(n)
      * Assert that a spy has been called fewer than ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.lt(3);
      * spy.should.not.have.been.called.lt(3);
      * ```
      */
    def lt(n: Double): Assertion = js.native
    
    /**
      * ####.max(n) / .at.most(n)
      * Assert that a spy has been called maximum of ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.max(3);
      * expect(spy).to.not.have.been.called.at.most(3);
      * spy.should.have.been.called.at.most(3);
      * spy.should.not.have.been.called.max(3);
      * ```
      */
    def max(n: Double): Assertion = js.native
    
    /**
      * ####.min(n) / .at.least(n)
      * Assert that a spy has been called minimum of ```n``` times.
      * ```ts
      * expect(spy).to.have.been.called.min(3);
      * expect(spy).to.not.have.been.called.at.least(3);
      * spy.should.have.been.called.at.least(3);
      * spy.should.not.have.been.called.min(3);
      * ```
      */
    def min(n: Double): Assertion = js.native
    
    /**
      * ####.once
      * Assert that a spy has been called exactly once.
      * ```ts
      * expect(spy).to.have.been.called.once;
      * expect(spy).to.not.have.been.called.once;
      * spy.should.have.been.called.once;
      * spy.should.not.have.been.called.once;
      * ```
      */
    var once: Assertion = js.native
    
    /**
      * ####.twice
      * Assert that a spy has been called exactly twice.
      * ```ts
      * expect(spy).to.have.been.called.twice;
      * expect(spy).to.not.have.been.called.twice;
      * spy.should.have.been.called.twice;
      * spy.should.not.have.been.called.twice;
      * ```
      */
    var twice: Assertion = js.native
    
    /**
      * ####.with
      * Assert that a spy has been called with a given argument at least once, even if more arguments were provided.
      * ```ts
      * spy('foo');
      * expect(spy).to.have.been.called.with('foo');
      * spy.should.have.been.called.with('foo');
      * ```
      * Will also pass for ```spy('foo', 'bar')``` and ```spy(); spy('foo')```.
      * If used with multiple arguments, assert that a spy has been called with all the given arguments at least once.
      * ```ts
      * spy('foo', 'bar', 1);
      * expect(spy).to.have.been.called.with('bar', 'foo');
      * spy.should.have.been.called.with('bar', 'foo');
      * ```
      */
    def `with`(
      a: js.Any,
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion = js.native
    @JSName("with")
    var with_Original: With = js.native
  }
  
  trait Resetable extends StObject {
    
    /**
      * #### proxy.reset (function)
      *
      * Resets __spy object parameters for instantiation and reuse
      * @returns proxy spy object
      */
    def reset(): this.type
  }
  object Resetable {
    
    @scala.inline
    def apply(reset: () => Resetable): Resetable = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Resetable]
    }
    
    @scala.inline
    implicit class ResetableMutableBuilder[Self <: Resetable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Resetable): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Sandbox extends StObject {
    
    /**
      * #### chai.spy.on (function)
      *
      * Wraps an object method into spy. All calls will pass through to the original function.
      *
      * @param {Object} object
      * @param {String} methodNames names to spy on
      * @param {function} fn replacement function
      * @returns function to actually call
      */
    def on(`object`: js.Object, methodNames: String): js.Any = js.native
    def on(
      `object`: js.Object,
      methodNames: String,
      fn: js.Function1[/* parameters */ js.Array[js.Any] | js.Any, js.Any]
    ): js.Any = js.native
    def on(`object`: js.Object, methodNames: js.Array[String]): js.Any = js.native
    def on(
      `object`: js.Object,
      methodNames: js.Array[String],
      fn: js.Function1[/* parameters */ js.Array[js.Any] | js.Any, js.Any]
    ): js.Any = js.native
    
    /**
      * #### chai.spy.restore (function)
      *
      * Restores previously wrapped object's method.
      * Restores all spied objects of a sandbox if called without parameters.
      *
      * @function
      * @param {Object} [object]
      * @param {String|String[]} [methods] name or names
      * @return {Sandbox} Sandbox instance
      */
    def restore(): Unit = js.native
    def restore(`object`: js.Object): Unit = js.native
    def restore(`object`: js.Object, methodNames: String): Unit = js.native
    def restore(`object`: js.Object, methodNames: js.Array[String]): Unit = js.native
    def restore(`object`: Unit, methodNames: String): Unit = js.native
    def restore(`object`: Unit, methodNames: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait Spy extends StObject {
    
    /**
      * #### chai.spy (function)
      *
      * Wraps a function in a proxy function. All calls will pass through to the original function.
      * ```ts
      * function original() {}
      * var spy = chai.spy(original)
      *   , e_spy = chai.spy();
      * ```
      * @param fn function to spy on. @default ```function () {}```
      * @returns function to actually call
      */
    def apply(): SpyFunc0Proxy[Unit] = js.native
    def apply[R](fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
    def apply[R](name: String, fn: SpyFunc0[R]): SpyFunc0Proxy[R] = js.native
    def apply[A1, R](fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
    def apply[A1, R](name: String, fn: SpyFunc1[A1, R]): SpyFunc1Proxy[A1, R] = js.native
    def apply[A1, A2, R](fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
    def apply[A1, A2, R](name: String, fn: SpyFunc2[A1, A2, R]): SpyFunc2Proxy[A1, A2, R] = js.native
    def apply[A1, A2, A3, R](fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
    def apply[A1, A2, A3, R](name: String, fn: SpyFunc3[A1, A2, A3, R]): SpyFunc3Proxy[A1, A2, A3, R] = js.native
    def apply[A1, A2, A3, A4, R](fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
    def apply[A1, A2, A3, A4, R](name: String, fn: SpyFunc4[A1, A2, A3, A4, R]): SpyFunc4Proxy[A1, A2, A3, A4, R] = js.native
    def apply[A1, A2, A3, A4, A5, R](fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
    def apply[A1, A2, A3, A4, A5, R](name: String, fn: SpyFunc5[A1, A2, A3, A4, A5, R]): SpyFunc5Proxy[A1, A2, A3, A4, A5, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, R](fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, R](name: String, fn: SpyFunc6[A1, A2, A3, A4, A5, A6, R]): SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, R](fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, R](name: String, fn: SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]): SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, R](fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, R](name: String, fn: SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]): SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, R](name: String, fn: SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]): SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
    def apply[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R](name: String, fn: SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]): SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.native
    
    def interface(methods: js.Array[String]): js.Any = js.native
    /**
      * #### chai.spy.interface (function)
      *
      * Creates an object with spied methods.
      * ```ts
      * var object = chai.spy.interface('Array', [ 'push', 'pop' ]);
      * ```
      * @param {String} [name] object name
      * @param {String[]|Object} method names or method definitions
      * @returns object with spied methods
      */
    def interface(name: String, methods: js.Array[String]): js.Any = js.native
    def interface[T](methods: T): T = js.native
    def interface[T](name: String, methods: T): T = js.native
    
    /**
      * #### chai.spy.on (function)
      *
      * Wraps an object method into spy. All calls will pass through to the original function.
      * ```ts
      * var spy = chai.spy.on(Array, 'isArray');
      * ```
      * @param {Object} object
      * @param {String} method names to spy on
      * @param {function} fn replacement function
      * @returns function to actually call
      */
    def on(`object`: js.Object, methodNames: String): js.Any = js.native
    def on(
      `object`: js.Object,
      methodNames: String,
      fn: js.Function1[/* parameters */ js.Array[js.Any] | js.Any, js.Any]
    ): js.Any = js.native
    def on(`object`: js.Object, methodNames: js.Array[String]): js.Any = js.native
    def on(
      `object`: js.Object,
      methodNames: js.Array[String],
      fn: js.Function1[/* parameters */ js.Array[js.Any] | js.Any, js.Any]
    ): js.Any = js.native
    
    /**
      * #### chai.spy.restore (function)
      *
      * Restores spy assigned to DEFAULT sandbox
      *
      * Restores previously wrapped object's method.
      * Restores all spied objects of a sandbox if called without parameters.
      *
      * @param {Object} [object]
      * @param {String|String[]} [methods] name or names
      * @return {Sandbox} Sandbox instance
      */
    def restore(): Unit = js.native
    def restore(`object`: js.Object): Unit = js.native
    def restore(`object`: js.Object, methodNames: String): Unit = js.native
    def restore(`object`: js.Object, methodNames: js.Array[String]): Unit = js.native
    def restore(`object`: Unit, methodNames: String): Unit = js.native
    def restore(`object`: Unit, methodNames: js.Array[String]): Unit = js.native
    
    /**
      * #### chai.spy.returns (function)
      *
      * Creates a spy which returns static value.
      *```ts
      *      var method = chai.spy.returns(true);
      *```
      * @param {*} value static value which is returned by spy
      * @returns new spy function which returns static value
      * @api public
      */
    def returns[T](value: T): SpyFunc0Proxy[T] = js.native
    
    /**
      * ### chai.spy.sandbox
      *
      * Creates a sandbox.
      *
      * Sandbox is a set of spies.
      * Sandbox allows to track methods on objects and restore original methods with on restore call.
      *
      * @returns {Sandbox}
      */
    def sandbox(): Sandbox = js.native
  }
  
  type SpyFunc0[R] = js.Function0[R]
  
  @js.native
  trait SpyFunc0Proxy[R]
    extends SpyFunc0[R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(): R = js.native
  }
  
  type SpyFunc1[A1, R] = js.Function1[/* a */ A1, R]
  
  type SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R] = js.Function10[
    /* a */ A1, 
    /* b */ A2, 
    /* c */ A3, 
    /* d */ A4, 
    /* e */ A5, 
    /* f */ A6, 
    /* g */ A7, 
    /* h */ A8, 
    /* i */ A9, 
    /* j */ A10, 
    R
  ]
  
  @js.native
  trait SpyFunc10Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]
    extends SpyFunc10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(
      arg1: A1,
      arg2: A2,
      arg3: A3,
      arg4: A4,
      arg5: A5,
      arg6: A6,
      arg7: A7,
      arg8: A8,
      arg9: A9,
      arg10: A10
    ): R = js.native
  }
  
  @js.native
  trait SpyFunc1Proxy[A1, R]
    extends SpyFunc1[A1, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1): R = js.native
  }
  
  type SpyFunc2[A1, A2, R] = js.Function2[/* a */ A1, /* b */ A2, R]
  
  @js.native
  trait SpyFunc2Proxy[A1, A2, R]
    extends SpyFunc2[A1, A2, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2): R = js.native
  }
  
  type SpyFunc3[A1, A2, A3, R] = js.Function3[/* a */ A1, /* b */ A2, /* c */ A3, R]
  
  @js.native
  trait SpyFunc3Proxy[A1, A2, A3, R]
    extends SpyFunc3[A1, A2, A3, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3): R = js.native
  }
  
  type SpyFunc4[A1, A2, A3, A4, R] = js.Function4[/* a */ A1, /* b */ A2, /* c */ A3, /* d */ A4, R]
  
  @js.native
  trait SpyFunc4Proxy[A1, A2, A3, A4, R]
    extends SpyFunc4[A1, A2, A3, A4, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4): R = js.native
  }
  
  type SpyFunc5[A1, A2, A3, A4, A5, R] = js.Function5[/* a */ A1, /* b */ A2, /* c */ A3, /* d */ A4, /* e */ A5, R]
  
  @js.native
  trait SpyFunc5Proxy[A1, A2, A3, A4, A5, R]
    extends SpyFunc5[A1, A2, A3, A4, A5, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): R = js.native
  }
  
  type SpyFunc6[A1, A2, A3, A4, A5, A6, R] = js.Function6[/* a */ A1, /* b */ A2, /* c */ A3, /* d */ A4, /* e */ A5, /* f */ A6, R]
  
  @js.native
  trait SpyFunc6Proxy[A1, A2, A3, A4, A5, A6, R]
    extends SpyFunc6[A1, A2, A3, A4, A5, A6, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6): R = js.native
  }
  
  type SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R] = js.Function7[/* a */ A1, /* b */ A2, /* c */ A3, /* d */ A4, /* e */ A5, /* f */ A6, /* g */ A7, R]
  
  @js.native
  trait SpyFunc7Proxy[A1, A2, A3, A4, A5, A6, A7, R]
    extends SpyFunc7[A1, A2, A3, A4, A5, A6, A7, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7): R = js.native
  }
  
  type SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R] = js.Function8[
    /* a */ A1, 
    /* b */ A2, 
    /* c */ A3, 
    /* d */ A4, 
    /* e */ A5, 
    /* f */ A6, 
    /* g */ A7, 
    /* h */ A8, 
    R
  ]
  
  @js.native
  trait SpyFunc8Proxy[A1, A2, A3, A4, A5, A6, A7, A8, R]
    extends SpyFunc8[A1, A2, A3, A4, A5, A6, A7, A8, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8): R = js.native
  }
  
  type SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R] = js.Function9[
    /* a */ A1, 
    /* b */ A2, 
    /* c */ A3, 
    /* d */ A4, 
    /* e */ A5, 
    /* f */ A6, 
    /* g */ A7, 
    /* h */ A8, 
    /* i */ A9, 
    R
  ]
  
  @js.native
  trait SpyFunc9Proxy[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]
    extends SpyFunc9[A1, A2, A3, A4, A5, A6, A7, A8, A9, R]
       with Resetable {
    
    /* InferMemberOverrides */
    override def apply(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9): R = js.native
  }
  
  @js.native
  trait With extends StObject {
    
    /**
      * ####.with
      * Assert that a spy has been called with a given argument at least once, even if more arguments were provided.
      * ```ts
      * spy('foo');
      * expect(spy).to.have.been.called.with('foo');
      * spy.should.have.been.called.with('foo');
      * ```
      * Will also pass for ```spy('foo', 'bar')``` and ```spy(); spy('foo')```.
      * If used with multiple arguments, assert that a spy has been called with all the given arguments at least once.
      * ```ts
      * spy('foo', 'bar', 1);
      * expect(spy).to.have.been.called.with('bar', 'foo');
      * spy.should.have.been.called.with('bar', 'foo');
      * ```
      */
    def apply(
      a: js.Any,
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion = js.native
    
    /**
      * ####.with.exactly
      * Similar to .with, but will pass only if the list of arguments is exactly the same as the one provided.
      * ```ts
      * spy();
      * spy('foo', 'bar');
      * expect(spy).to.have.been.called.with.exactly('foo', 'bar');
      * spy.should.have.been.called.with.exactly('foo', 'bar');
      * ```
      * Will not pass for ```spy('foo')```, ```spy('bar')```, ```spy('bar'); spy('foo')```, ```spy('foo'); spy('bar')```, ```spy('bar', 'foo')``` or ```spy('foo', 'bar', 1)```.
      * Can be used for calls with a single argument too.
      */
    def exactly(
      a: js.UndefOr[js.Any],
      b: js.UndefOr[js.Any],
      c: js.UndefOr[js.Any],
      d: js.UndefOr[js.Any],
      e: js.UndefOr[js.Any],
      f: js.UndefOr[js.Any],
      g: js.UndefOr[js.Any],
      h: js.UndefOr[js.Any],
      i: js.UndefOr[js.Any],
      j: js.UndefOr[js.Any]
    ): Assertion = js.native
  }
}
