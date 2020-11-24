package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inflection extends js.Object {
  
  var values: js.Array[Double] = js.native
  
  var x: js.Array[Double] = js.native
  
  var y: js.Array[Double] = js.native
  
  var z: js.UndefOr[js.Array[Double]] = js.native
}
object Inflection {
  
  @scala.inline
  def apply(values: js.Array[Double], x: js.Array[Double], y: js.Array[Double]): Inflection = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inflection]
  }
  
  @scala.inline
  implicit class InflectionOps[Self <: Inflection] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZVarargs(value: Double*): Self = this.set("z", js.Array(value :_*))
    
    @scala.inline
    def setZ(value: js.Array[Double]): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
