package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asciiMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/ascii", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emitForest(trees: js.Array[ReadonlyRangeTree]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emitForest")(trees.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def emitForestLines(trees: js.Array[ReadonlyRangeTree]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("emitForestLines")(trees.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parseFunctionRanges(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionRanges")(text.asInstanceOf[js.Any], offsetMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[RangeCov]]
  
  inline def parseOffsets(text: String): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOffsets")(text.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
  
  trait ReadonlyRangeTree extends StObject {
    
    val children: js.Array[ReadonlyRangeTree]
    
    val count: Double
    
    val end: Double
    
    val start: Double
  }
  object ReadonlyRangeTree {
    
    inline def apply(children: js.Array[ReadonlyRangeTree], count: Double, end: Double, start: Double): ReadonlyRangeTree = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRangeTree]
    }
    
    extension [Self <: ReadonlyRangeTree](x: Self) {
      
      inline def setChildren(value: js.Array[ReadonlyRangeTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReadonlyRangeTree*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
