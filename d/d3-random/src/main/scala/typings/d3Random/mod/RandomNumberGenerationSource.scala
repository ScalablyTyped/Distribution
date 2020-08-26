package typings.d3Random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomNumberGenerationSource extends js.Object {
  /**
    * Returns the same type of function for generating random numbers but where the given random number
    * generator source is used as the source of randomness instead of Math.random.
    * This is useful when a seeded random number generator is preferable to Math.random.
    *
    * @param source Source (pseudo-)random number generator implementing the Math.random interface.
    * The given random number generator must implement the same interface as Math.random and
    * only return values in the range [0, 1).
    */
  def source(source: js.Function0[Double]): this.type = js.native
}

object RandomNumberGenerationSource {
  @scala.inline
  def apply(source: js.Function0[Double] => RandomNumberGenerationSource): RandomNumberGenerationSource = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction1(source))
    __obj.asInstanceOf[RandomNumberGenerationSource]
  }
  @scala.inline
  implicit class RandomNumberGenerationSourceOps[Self <: RandomNumberGenerationSource] (val x: Self) extends AnyVal {
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
    def setSource(value: js.Function0[Double] => RandomNumberGenerationSource): Self = this.set("source", js.Any.fromFunction1(value))
  }
  
}

