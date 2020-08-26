package typings.bignumberJs.mod.BigNumber

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance
  extends /* key */ StringDictionary[js.Any] {
  /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
  val c: js.Array[Double] | Null = js.native
  /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
  val e: Double | Null = js.native
  /** The sign of the value of this BigNumber, -1, 1, or null. */
  val s: Double | Null = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setCVarargs(value: Double*): Self = this.set("c", js.Array(value :_*))
    @scala.inline
    def setC(value: js.Array[Double]): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNull: Self = this.set("c", null)
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setENull: Self = this.set("e", null)
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setSNull: Self = this.set("s", null)
  }
  
}

