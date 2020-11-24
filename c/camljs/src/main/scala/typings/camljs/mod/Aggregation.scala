package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.camljs.anon.Count
  - typings.camljs.anon.Sum
  - typings.camljs.anon.Avg
  - typings.camljs.anon.Max
  - typings.camljs.anon.Min
  - typings.camljs.anon.Stdev
  - typings.camljs.anon.Var
*/
trait Aggregation extends js.Object
object Aggregation {
  
  @scala.inline
  def Sum(sum: String): Aggregation = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Var(`var`: String): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Count(count: String): Aggregation = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Max(max: String): Aggregation = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Avg(avg: String): Aggregation = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Min(min: String): Aggregation = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  def Stdev(stdev: String): Aggregation = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
}
