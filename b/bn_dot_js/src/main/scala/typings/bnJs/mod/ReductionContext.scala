package typings.bnJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReductionContext
  extends /* key */ StringDictionary[js.Any] {
  var m: Double = js.native
  var prime: MPrime = js.native
}

object ReductionContext {
  @scala.inline
  def apply(m: Double, prime: MPrime): ReductionContext = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReductionContext]
  }
  @scala.inline
  implicit class ReductionContextOps[Self <: ReductionContext] (val x: Self) extends AnyVal {
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
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrime(value: MPrime): Self = this.set("prime", value.asInstanceOf[js.Any])
  }
  
}

