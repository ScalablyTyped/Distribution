package typings.danmarshallJscadTypings

import org.scalablytyped.runtime.NumberDictionary
import typings.danmarshallJscadTypings.typesCsgMod.CSG.ICircleOptions
import typings.danmarshallJscadTypings.typesCsgMod.CSG.Polygon
import typings.danmarshallJscadTypings.typesCsgMod.CSG.Vector2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsgMod {
  
  @JSImport("@danmarshall/jscad-typings/types/csg", "CAG")
  @js.native
  open class CAG () extends CxG {
    
    def extrude(options: CAGExtrudeOptions): CSG = js.native
    
    def subtract(cag: js.Array[CAG]): CAG = js.native
    def subtract(cag: CAG): CAG = js.native
    
    def union(cag: js.Array[CAG]): CAG = js.native
    def union(cag: CAG): CAG = js.native
  }
  /* static members */
  object CAG {
    
    @JSImport("@danmarshall/jscad-typings/types/csg", "CAG")
    @js.native
    val ^ : js.Any = js.native
    
    inline def circle(options: ICircleOptions): CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(options.asInstanceOf[js.Any]).asInstanceOf[CAG]
    
    inline def fromPoints(points: js.Array[NumberDictionary[Double] | Vector2D]): CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[CAG]
  }
  
  @JSImport("@danmarshall/jscad-typings/types/csg", "CSG")
  @js.native
  open class CSG () extends CxG {
    
    var polygons: js.Array[Polygon] = js.native
    
    def toCompactBinary(): Any = js.native
    
    def union(csg: js.Array[CSG]): CSG = js.native
    def union(csg: CSG): CSG = js.native
  }
  object CSG {
    
    @JSImport("@danmarshall/jscad-typings/types/csg", "CSG.Path2D")
    @js.native
    open class Path2D () extends CxG {
      
      def appendArc(endpoint: Vector2D, options: IEllpiticalArcOptions): Path2D = js.native
      
      def appendBezier(controlpoints: Any, options: Any): Path2D = js.native
      
      def appendPoint(point: Vector2D): Path2D = js.native
      
      def appendPoints(points: js.Array[Vector2D]): Path2D = js.native
      
      def close(): Path2D = js.native
      
      def innerToCAG(): CAG = js.native
    }
    object Path2D {
      
      @JSImport("@danmarshall/jscad-typings/types/csg", "CSG.Path2D")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def arc(options: IArcOptions): Path2D = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")(options.asInstanceOf[js.Any]).asInstanceOf[Path2D]
    }
    
    @JSImport("@danmarshall/jscad-typings/types/csg", "CSG.Polygon")
    @js.native
    open class Polygon () extends CxG {
      
      def toStlString(): String = js.native
    }
    
    @JSImport("@danmarshall/jscad-typings/types/csg", "CSG.Vector2D")
    @js.native
    open class Vector2D () extends CxG
    
    trait IArcOptions
      extends StObject
         with ICircleOptions {
      
      var endangle: js.UndefOr[Double] = js.undefined
      
      var maketangent: js.UndefOr[Boolean] = js.undefined
      
      var startangle: js.UndefOr[Double] = js.undefined
    }
    object IArcOptions {
      
      inline def apply(): IArcOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IArcOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IArcOptions] (val x: Self) extends AnyVal {
        
        inline def setEndangle(value: Double): Self = StObject.set(x, "endangle", value.asInstanceOf[js.Any])
        
        inline def setEndangleUndefined: Self = StObject.set(x, "endangle", js.undefined)
        
        inline def setMaketangent(value: Boolean): Self = StObject.set(x, "maketangent", value.asInstanceOf[js.Any])
        
        inline def setMaketangentUndefined: Self = StObject.set(x, "maketangent", js.undefined)
        
        inline def setStartangle(value: Double): Self = StObject.set(x, "startangle", value.asInstanceOf[js.Any])
        
        inline def setStartangleUndefined: Self = StObject.set(x, "startangle", js.undefined)
      }
    }
    
    trait ICircleOptions
      extends StObject
         with IRadiusOptions {
      
      var center: js.UndefOr[Vector2D | js.Array[Double]] = js.undefined
    }
    object ICircleOptions {
      
      inline def apply(): ICircleOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICircleOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICircleOptions] (val x: Self) extends AnyVal {
        
        inline def setCenter(value: Vector2D | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
        
        inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
        
        inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      }
    }
    
    trait IEllpiticalArcOptions
      extends StObject
         with IRadiusOptions {
      
      var clockwise: js.UndefOr[Boolean] = js.undefined
      
      var large: js.UndefOr[Boolean] = js.undefined
      
      var xaxisrotation: js.UndefOr[Double] = js.undefined
      
      var xradius: js.UndefOr[Double] = js.undefined
      
      var yradius: js.UndefOr[Double] = js.undefined
    }
    object IEllpiticalArcOptions {
      
      inline def apply(): IEllpiticalArcOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IEllpiticalArcOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IEllpiticalArcOptions] (val x: Self) extends AnyVal {
        
        inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
        
        inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
        
        inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
        
        inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
        
        inline def setXaxisrotation(value: Double): Self = StObject.set(x, "xaxisrotation", value.asInstanceOf[js.Any])
        
        inline def setXaxisrotationUndefined: Self = StObject.set(x, "xaxisrotation", js.undefined)
        
        inline def setXradius(value: Double): Self = StObject.set(x, "xradius", value.asInstanceOf[js.Any])
        
        inline def setXradiusUndefined: Self = StObject.set(x, "xradius", js.undefined)
        
        inline def setYradius(value: Double): Self = StObject.set(x, "yradius", value.asInstanceOf[js.Any])
        
        inline def setYradiusUndefined: Self = StObject.set(x, "yradius", js.undefined)
      }
    }
    
    trait IRadiusOptions extends StObject {
      
      var radius: js.UndefOr[Double] = js.undefined
      
      var resolution: js.UndefOr[Double] = js.undefined
    }
    object IRadiusOptions {
      
      inline def apply(): IRadiusOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRadiusOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IRadiusOptions] (val x: Self) extends AnyVal {
        
        inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
        
        inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
        
        inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
        
        inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      }
    }
  }
  
  @JSImport("@danmarshall/jscad-typings/types/csg", "CxG")
  @js.native
  open class CxG () extends StObject {
    
    def translate(v: js.Array[Double]): this.type = js.native
  }
  
  trait CAGExtrudeOptions extends StObject {
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object CAGExtrudeOptions {
    
    inline def apply(): CAGExtrudeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CAGExtrudeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CAGExtrudeOptions] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    }
  }
}
