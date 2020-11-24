package typings.chaiSpies.ChaiSpies

import typings.chaiSpies.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def least(n: Double): Assertion = js.native
  
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
  def most(n: Double): Assertion = js.native
}
object At {
  
  @scala.inline
  def apply(least: Double => Assertion, most: Double => Assertion): At = {
    val __obj = js.Dynamic.literal(least = js.Any.fromFunction1(least), most = js.Any.fromFunction1(most))
    __obj.asInstanceOf[At]
  }
  
  @scala.inline
  implicit class AtOps[Self <: At] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLeast(value: Double => Assertion): Self = this.set("least", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMost(value: Double => Assertion): Self = this.set("most", js.Any.fromFunction1(value))
  }
}
