package typings.dagre

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Class extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var paddingX: js.UndefOr[Double] = js.undefined
    
    var paddingY: js.UndefOr[Double] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Class {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Class = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compound extends StObject {
    
    var compound: js.UndefOr[Boolean] = js.undefined
    
    var directed: js.UndefOr[Boolean] = js.undefined
    
    var multigraph: js.UndefOr[Boolean] = js.undefined
  }
  object Compound {
    
    @scala.inline
    def apply(): Compound = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compound]
    }
    
    @scala.inline
    implicit class CompoundMutableBuilder[Self <: Compound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      @scala.inline
      def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
      
      @scala.inline
      def setMultigraph(value: Boolean): Self = StObject.set(x, "multigraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultigraphUndefined: Self = StObject.set(x, "multigraph", js.undefined)
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
