package typings
package chaiDashSpiesLib.ChaiSpiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait At extends js.Object {
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
  def least(n: scala.Double): chaiDashSpiesLib.ChaiNs.Assertion
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
  def most(n: scala.Double): chaiDashSpiesLib.ChaiNs.Assertion
}

