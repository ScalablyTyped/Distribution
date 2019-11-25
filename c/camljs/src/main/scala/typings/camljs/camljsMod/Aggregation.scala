package typings.camljs.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camljs.Anon_Count
  - typings.camljs.Anon_Sum
  - typings.camljs.Anon_Avg
  - typings.camljs.Anon_Max
  - typings.camljs.Anon_Min
  - typings.camljs.Anon_Stdev
  - typings.camljs.Anon_Var
*/
trait Aggregation extends js.Object

object Aggregation {
  @scala.inline
  def Anon_Sum(sum: String): Aggregation = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Stdev(stdev: String): Aggregation = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Var(`var`: String): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Max(max: String): Aggregation = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Count(count: String): Aggregation = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Avg(avg: String): Aggregation = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
  @scala.inline
  def Anon_Min(min: String): Aggregation = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Aggregation]
  }
}

