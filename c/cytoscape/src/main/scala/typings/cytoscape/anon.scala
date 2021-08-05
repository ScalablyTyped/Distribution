package typings.cytoscape

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeCollection
import typings.cytoscape.mod.SingularElementReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Both extends StObject {
    
    var both: CollectionReturnValue
    
    var left: CollectionReturnValue
    
    var right: CollectionReturnValue
  }
  object Both {
    
    inline def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Both = {
      val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Both]
    }
    
    extension [Self <: Both](x: Self) {
      
      inline def setBoth(value: CollectionReturnValue): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: CollectionReturnValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: CollectionReturnValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Col extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object Col {
    
    inline def apply(col: Double, row: Double): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Components extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: EdgeCollection
    
    var partitionFirst: NodeCollection
    
    var partitionSecond: NodeCollection
  }
  object Components {
    
    inline def apply(
      components: CollectionReturnValue,
      cut: EdgeCollection,
      partitionFirst: NodeCollection,
      partitionSecond: NodeCollection
    ): Components = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    extension [Self <: Components](x: Self) {
      
      inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setPartitionFirst(value: NodeCollection): Self = StObject.set(x, "partitionFirst", value.asInstanceOf[js.Any])
      
      inline def setPartitionSecond(value: NodeCollection): Self = StObject.set(x, "partitionSecond", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentsCut extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: EdgeCollection
  }
  object ComponentsCut {
    
    inline def apply(components: CollectionReturnValue, cut: EdgeCollection): ComponentsCut = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentsCut]
    }
    
    extension [Self <: ComponentsCut](x: Self) {
      
      inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cut extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: NodeCollection
  }
  object Cut {
    
    inline def apply(components: CollectionReturnValue, cut: NodeCollection): Cut = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cut]
    }
    
    extension [Self <: Cut](x: Self) {
      
      inline def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setCut(value: NodeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    }
  }
  
  trait Degree extends StObject {
    
    def degree(): Double
  }
  object Degree {
    
    inline def apply(degree: () => Double): Degree = {
      val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
      __obj.asInstanceOf[Degree]
    }
    
    extension [Self <: Degree](x: Self) {
      
      inline def setDegree(value: () => Double): Self = StObject.set(x, "degree", js.Any.fromFunction0(value))
    }
  }
  
  trait Ele[T] extends StObject {
    
    /**
      * The element that corresponds to the minimum value.
      */
    var ele: SingularElementReturnValue
    
    /**
      * The minimum value found.
      */
    var value: T
  }
  object Ele {
    
    inline def apply[T](ele: SingularElementReturnValue, value: T): Ele[T] = {
      val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ele[T]]
    }
    
    extension [Self <: Ele[?], T](x: Self & Ele[T]) {
      
      inline def setEle(value: SingularElementReturnValue): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait H extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object H {
    
    inline def apply(h: Double, w: Double, x1: Double, x2: Double, y1: Double, y2: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    extension [Self <: H](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxDegree extends StObject {
    
    def maxDegree(): Double
  }
  object MaxDegree {
    
    inline def apply(maxDegree: () => Double): MaxDegree = {
      val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
      __obj.asInstanceOf[MaxDegree]
    }
    
    extension [Self <: MaxDegree](x: Self) {
      
      inline def setMaxDegree(value: () => Double): Self = StObject.set(x, "maxDegree", js.Any.fromFunction0(value))
    }
  }
  
  trait Parent extends StObject {
    
    var parent: String | Null
  }
  object Parent {
    
    inline def apply(): Parent = {
      val __obj = js.Dynamic.literal(parent = null)
      __obj.asInstanceOf[Parent]
    }
    
    extension [Self <: Parent](x: Self) {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
    }
  }
  
  trait Source extends StObject {
    
    var source: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Source {
    
    inline def apply(): Source = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Weight extends StObject {
    
    var weight: Double
  }
  object Weight {
    
    inline def apply(weight: Double): Weight = {
      val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Weight]
    }
    
    extension [Self <: Weight](x: Self) {
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
