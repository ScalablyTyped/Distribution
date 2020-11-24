package typings.chaiSpies.ChaiSpies

import typings.chaiSpies.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Always extends js.Object {
  
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
  ): Assertion = js.native
  @JSName("with")
  var with_Original: AlwaysWith = js.native
}
