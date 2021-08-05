package typings.bmapgl

import typings.bmapgl.BMapGL.DrawingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bmapglStrings {
  
  @js.native
  sealed trait LineString extends StObject
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait Point extends StObject
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon extends StObject
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait blank extends StObject
  inline def blank: blank = "blank".asInstanceOf[blank]
  
  @js.native
  sealed trait bmap extends StObject
  inline def bmap: bmap = "bmap".asInstanceOf[bmap]
  
  @js.native
  sealed trait cesium extends StObject
  inline def cesium: cesium = "cesium".asInstanceOf[cesium]
  
  @js.native
  sealed trait circle
    extends StObject
       with DrawingType
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait dashed extends StObject
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait dotted extends StObject
  inline def dotted: dotted = "dotted".asInstanceOf[dotted]
  
  @js.native
  sealed trait marker
    extends StObject
       with DrawingType
  inline def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait metric extends StObject
  inline def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait polygon_
    extends StObject
       with DrawingType
  inline def polygon_ : polygon_ = "polygon".asInstanceOf[polygon_]
  
  @js.native
  sealed trait polyline
    extends StObject
       with DrawingType
  inline def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait rectangle
    extends StObject
       with DrawingType
  inline def rectangle: rectangle = "rectangle".asInstanceOf[rectangle]
  
  @js.native
  sealed trait solid extends StObject
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait us extends StObject
  inline def us: us = "us".asInstanceOf[us]
}
