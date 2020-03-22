package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camljs.AnonCount
  - typings.camljs.AnonSum
  - typings.camljs.AnonAvg
  - typings.camljs.AnonMax
  - typings.camljs.AnonMin
  - typings.camljs.AnonStdev
  - typings.camljs.AnonVar
*/
trait Aggregation extends js.Object

object Aggregation {
  @scala.inline
  def AnonVar(`var`: String): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonStdev(stdev: String): Aggregation = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonMax(max: String): Aggregation = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonMin(min: String): Aggregation = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonCount(count: String): Aggregation = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonAvg(avg: String): Aggregation = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def AnonSum(sum: String): Aggregation = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
}

