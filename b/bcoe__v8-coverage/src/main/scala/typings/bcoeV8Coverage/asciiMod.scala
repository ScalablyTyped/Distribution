package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asciiMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/ascii", "emitForest")
  @js.native
  def emitForest(trees: js.Array[ReadonlyRangeTree]): String = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/ascii", "emitForestLines")
  @js.native
  def emitForestLines(trees: js.Array[ReadonlyRangeTree]): js.Array[String] = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/ascii", "parseFunctionRanges")
  @js.native
  def parseFunctionRanges(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/ascii", "parseOffsets")
  @js.native
  def parseOffsets(text: String): Map[Double, Double] = js.native
  
  @js.native
  trait ReadonlyRangeTree extends StObject {
    
    val children: js.Array[ReadonlyRangeTree] = js.native
    
    val count: Double = js.native
    
    val end: Double = js.native
    
    val start: Double = js.native
  }
  object ReadonlyRangeTree {
    
    @scala.inline
    def apply(children: js.Array[ReadonlyRangeTree], count: Double, end: Double, start: Double): ReadonlyRangeTree = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRangeTree]
    }
    
    @scala.inline
    implicit class ReadonlyRangeTreeMutableBuilder[Self <: ReadonlyRangeTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReadonlyRangeTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReadonlyRangeTree*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
