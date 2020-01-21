package typings.chaiSpies.ChaiSpies

import typings.chaiSpies.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With extends js.Object {
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

