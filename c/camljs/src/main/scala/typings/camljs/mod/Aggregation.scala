package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Aggregation extends StObject
object Aggregation {
  
  @scala.inline
  def Avg(avg: String): typings.camljs.anon.Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Avg]
  }
  
  @scala.inline
  def Count(count: String): typings.camljs.anon.Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Count]
  }
  
  @scala.inline
  def Max(max: String): typings.camljs.anon.Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Max]
  }
  
  @scala.inline
  def Min(min: String): typings.camljs.anon.Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Min]
  }
  
  @scala.inline
  def Stdev(stdev: String): typings.camljs.anon.Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Stdev]
  }
  
  @scala.inline
  def Sum(sum: String): typings.camljs.anon.Sum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Sum]
  }
  
  @scala.inline
  def Var(`var`: String): typings.camljs.anon.Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.camljs.anon.Var]
  }
}
