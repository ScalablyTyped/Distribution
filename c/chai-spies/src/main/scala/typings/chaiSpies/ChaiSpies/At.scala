package typings.chaiSpies.ChaiSpies

import typings.chaiSpies.Chai.Assertion
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
}

