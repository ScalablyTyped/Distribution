package typings.chaiDashSpies.ChaiSpies

import typings.chaiDashSpies.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Called extends js.Object {
  var always: Always = js.native
  var at: At = js.native
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
  @JSName("with")
  var with_Original: With = js.native
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
}

