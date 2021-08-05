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
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Class = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compound extends StObject {
    
    var compound: js.UndefOr[Boolean] = js.undefined
    
    var directed: js.UndefOr[Boolean] = js.undefined
    
    var multigraph: js.UndefOr[Boolean] = js.undefined
  }
  object Compound {
    
    inline def apply(): Compound = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compound]
    }
    
    extension [Self <: Compound](x: Self) {
      
      inline def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
      
      inline def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
      
      inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
      
      inline def setMultigraph(value: Boolean): Self = StObject.set(x, "multigraph", value.asInstanceOf[js.Any])
      
      inline def setMultigraphUndefined: Self = StObject.set(x, "multigraph", js.undefined)
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
