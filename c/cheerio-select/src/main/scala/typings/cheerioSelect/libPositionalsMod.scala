package typings.cheerioSelect

import typings.cssWhat.typesMod.PseudoSelector
import typings.cssWhat.typesMod.Selector
import typings.cssWhat.typesMod.SelectorType.Pseudo
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPositionalsMod {
  
  @JSImport("cheerio-select/lib/positionals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cheerio-select/lib/positionals", "filterNames")
  @js.native
  val filterNames: Set[String] = js.native
  
  inline def getLimit(filter: Filter, data: String, partLimit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLimit")(filter.asInstanceOf[js.Any], data.asInstanceOf[js.Any], partLimit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLimit(filter: Filter, data: Null, partLimit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLimit")(filter.asInstanceOf[js.Any], data.asInstanceOf[js.Any], partLimit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isFilter(s: Selector): /* is cheerio-select.cheerio-select/lib/positionals.CheerioSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFilter")(s.asInstanceOf[js.Any]).asInstanceOf[/* is cheerio-select.cheerio-select/lib/positionals.CheerioSelector */ Boolean]
  
  trait CheerioSelector
    extends StObject
       with PseudoSelector {
    
    @JSName("data")
    var data_CheerioSelector: String | Null
    
    @JSName("name")
    var name_CheerioSelector: Filter
  }
  object CheerioSelector {
    
    inline def apply(name: Filter, `type`: Pseudo): CheerioSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheerioSelector]
    }
    
    extension [Self <: CheerioSelector](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setName(value: Filter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cheerioSelect.cheerioSelectStrings.first
    - typings.cheerioSelect.cheerioSelectStrings.last
    - typings.cheerioSelect.cheerioSelectStrings.eq
    - typings.cheerioSelect.cheerioSelectStrings.nth
    - typings.cheerioSelect.cheerioSelectStrings.gt
    - typings.cheerioSelect.cheerioSelectStrings.lt
    - typings.cheerioSelect.cheerioSelectStrings.even
    - typings.cheerioSelect.cheerioSelectStrings.odd
    - typings.cheerioSelect.cheerioSelectStrings.not
  */
  trait Filter extends StObject
  object Filter {
    
    inline def eq: typings.cheerioSelect.cheerioSelectStrings.eq = "eq".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.eq]
    
    inline def even: typings.cheerioSelect.cheerioSelectStrings.even = "even".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.even]
    
    inline def first: typings.cheerioSelect.cheerioSelectStrings.first = "first".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.first]
    
    inline def gt: typings.cheerioSelect.cheerioSelectStrings.gt = "gt".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.gt]
    
    inline def last: typings.cheerioSelect.cheerioSelectStrings.last = "last".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.last]
    
    inline def lt: typings.cheerioSelect.cheerioSelectStrings.lt = "lt".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.lt]
    
    inline def not: typings.cheerioSelect.cheerioSelectStrings.not = "not".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.not]
    
    inline def nth: typings.cheerioSelect.cheerioSelectStrings.nth = "nth".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.nth]
    
    inline def odd: typings.cheerioSelect.cheerioSelectStrings.odd = "odd".asInstanceOf[typings.cheerioSelect.cheerioSelectStrings.odd]
  }
}
