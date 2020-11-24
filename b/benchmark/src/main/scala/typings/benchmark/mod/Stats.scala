package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends js.Object {
  
  var deviation: Double = js.native
  
  var mean: Double = js.native
  
  var moe: Double = js.native
  
  var rme: Double = js.native
  
  var sample: js.Array[_] = js.native
  
  var sem: Double = js.native
  
  var variance: Double = js.native
}
object Stats {
  
  @scala.inline
  def apply(
    deviation: Double,
    mean: Double,
    moe: Double,
    rme: Double,
    sample: js.Array[_],
    sem: Double,
    variance: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], moe = moe.asInstanceOf[js.Any], rme = rme.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sem = sem.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    
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
    def setDeviation(value: Double): Self = this.set("deviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoe(value: Double): Self = this.set("moe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRme(value: Double): Self = this.set("rme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleVarargs(value: js.Any*): Self = this.set("sample", js.Array(value :_*))
    
    @scala.inline
    def setSample(value: js.Array[_]): Self = this.set("sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSem(value: Double): Self = this.set("sem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Double): Self = this.set("variance", value.asInstanceOf[js.Any])
  }
}
