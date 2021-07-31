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
    
    @scala.inline
    def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Both = {
      val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Both]
    }
    
    @scala.inline
    implicit class BothMutableBuilder[Self <: Both] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoth(value: CollectionReturnValue): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: CollectionReturnValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: CollectionReturnValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Col extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object Col {
    
    @scala.inline
    def apply(col: Double, row: Double): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    @scala.inline
    implicit class ColMutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Components extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: EdgeCollection
    
    var partitionFirst: NodeCollection
    
    var partitionSecond: NodeCollection
  }
  object Components {
    
    @scala.inline
    def apply(
      components: CollectionReturnValue,
      cut: EdgeCollection,
      partitionFirst: NodeCollection,
      partitionSecond: NodeCollection
    ): Components = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit class ComponentsMutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionFirst(value: NodeCollection): Self = StObject.set(x, "partitionFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionSecond(value: NodeCollection): Self = StObject.set(x, "partitionSecond", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentsCut extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: EdgeCollection
  }
  object ComponentsCut {
    
    @scala.inline
    def apply(components: CollectionReturnValue, cut: EdgeCollection): ComponentsCut = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentsCut]
    }
    
    @scala.inline
    implicit class ComponentsCutMutableBuilder[Self <: ComponentsCut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCut(value: EdgeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cut extends StObject {
    
    var components: CollectionReturnValue
    
    var cut: NodeCollection
  }
  object Cut {
    
    @scala.inline
    def apply(components: CollectionReturnValue, cut: NodeCollection): Cut = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cut]
    }
    
    @scala.inline
    implicit class CutMutableBuilder[Self <: Cut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: CollectionReturnValue): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCut(value: NodeCollection): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    }
  }
  
  trait Degree extends StObject {
    
    def degree(): Double
  }
  object Degree {
    
    @scala.inline
    def apply(degree: () => Double): Degree = {
      val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
      __obj.asInstanceOf[Degree]
    }
    
    @scala.inline
    implicit class DegreeMutableBuilder[Self <: Degree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDegree(value: () => Double): Self = StObject.set(x, "degree", js.Any.fromFunction0(value))
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
    
    @scala.inline
    def apply[T](ele: SingularElementReturnValue, value: T): Ele[T] = {
      val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ele[T]]
    }
    
    @scala.inline
    implicit class EleMutableBuilder[Self <: Ele[?], T] (val x: Self & Ele[T]) extends AnyVal {
      
      @scala.inline
      def setEle(value: SingularElementReturnValue): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(h: Double, w: Double, x1: Double, x2: Double, y1: Double, y2: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxDegree extends StObject {
    
    def maxDegree(): Double
  }
  object MaxDegree {
    
    @scala.inline
    def apply(maxDegree: () => Double): MaxDegree = {
      val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
      __obj.asInstanceOf[MaxDegree]
    }
    
    @scala.inline
    implicit class MaxDegreeMutableBuilder[Self <: MaxDegree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDegree(value: () => Double): Self = StObject.set(x, "maxDegree", js.Any.fromFunction0(value))
    }
  }
  
  trait Parent extends StObject {
    
    var parent: String | Null
  }
  object Parent {
    
    @scala.inline
    def apply(): Parent = {
      val __obj = js.Dynamic.literal(parent = null)
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
    }
  }
  
  trait Source extends StObject {
    
    var source: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Source {
    
    @scala.inline
    def apply(): Source = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Weight extends StObject {
    
    var weight: Double
  }
  object Weight {
    
    @scala.inline
    def apply(weight: Double): Weight = {
      val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Weight]
    }
    
    @scala.inline
    implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
