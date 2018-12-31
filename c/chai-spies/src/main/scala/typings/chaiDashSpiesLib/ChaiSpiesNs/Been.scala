package typings
package chaiDashSpiesLib.ChaiSpiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Been
  extends chaiDashSpiesLib.ChaiNs.Assertion {
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
  var first: chaiDashSpiesLib.ChaiNs.Assertion = js.native
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
  var second: chaiDashSpiesLib.ChaiNs.Assertion = js.native
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
  var third: chaiDashSpiesLib.ChaiNs.Assertion = js.native
  def apply(): chaiDashSpiesLib.ChaiNs.Assertion = js.native
}

