package typings.dateAndTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreparseResult extends js.Object {
  /** Meridiem */
  var A: Double = js.native
  /** Day */
  var D: Double = js.native
  /** 24-hour */
  var H: Double = js.native
  /** Month */
  var M: Double = js.native
  /** Millisecond */
  var S: Double = js.native
  /** Year */
  var Y: Double = js.native
  /** Timezone offset */
  var Z: Double = js.native
  /** Pointer offset */
  var _index: Double = js.native
  /** Length of the date string */
  var _length: Double = js.native
  /** Token matching count */
  var _match: Double = js.native
  /** 12-hour */
  var h: Double = js.native
  /** Minute */
  var m: Double = js.native
  /** Second */
  var s: Double = js.native
}

object PreparseResult {
  @scala.inline
  def apply(
    A: Double,
    D: Double,
    H: Double,
    M: Double,
    S: Double,
    Y: Double,
    Z: Double,
    _index: Double,
    _length: Double,
    _match: Double,
    h: Double,
    m: Double,
    s: Double
  ): PreparseResult = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _match = _match.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreparseResult]
  }
  @scala.inline
  implicit class PreparseResultOps[Self <: PreparseResult] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("A", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: Double): Self = this.set("D", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: Double): Self = this.set("H", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: Double): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Double): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("Z", value.asInstanceOf[js.Any])
    @scala.inline
    def set_index(value: Double): Self = this.set("_index", value.asInstanceOf[js.Any])
    @scala.inline
    def set_length(value: Double): Self = this.set("_length", value.asInstanceOf[js.Any])
    @scala.inline
    def set_match(value: Double): Self = this.set("_match", value.asInstanceOf[js.Any])
  }
  
}

