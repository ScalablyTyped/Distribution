package typings.canvg

import typings.canvg.anon.Offset
import typings.canvg.canvgInts.`128`
import typings.canvg.canvgInts.`16`
import typings.canvg.canvgInts.`32`
import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.pathElementMod.PathElement
import typings.canvg.pathParserMod.CommandType
import typings.canvg.pathParserMod.PathParser
import typings.canvg.textElementMod.TextElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textPathElementMod {
  
  @JSImport("canvg/dist/Document/TextPathElement", "TextPathElement")
  @js.native
  open class TextPathElement protected () extends TextElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def buildEquidistantCache(inputStep: Double, inputPrecision: Double): Unit = js.native
    
    /* protected */ def calcLength(x: Double, y: Double, commandType: CommandType, points: js.Array[Double]): Double = js.native
    
    /* protected */ val dataArray: js.Array[IPathCommand] = js.native
    
    /* private */ var equidistantCache: Any = js.native
    
    /* protected */ def findSegmentToFitChar(
      ctx: RenderingContext2D,
      anchor: String,
      textFullWidth: Double,
      fullPathWidth: Double,
      spacesNumber: Double,
      inputOffset: Double,
      dy: Double,
      c: String,
      charI: Double
    ): Offset = js.native
    
    /* protected */ def getEquidistantPointOnPath(targetDistance: Double): ICachedPoint = js.native
    /* protected */ def getEquidistantPointOnPath(targetDistance: Double, step: Double): ICachedPoint = js.native
    /* protected */ def getEquidistantPointOnPath(targetDistance: Double, step: Double, precision: Double): ICachedPoint = js.native
    /* protected */ def getEquidistantPointOnPath(targetDistance: Double, step: Unit, precision: Double): ICachedPoint = js.native
    
    /* protected */ def getLetterSpacingAt(): Double = js.native
    /* protected */ def getLetterSpacingAt(idx: Double): Double = js.native
    
    /* protected */ def getLineLength(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /* protected */ def getPathLength(): Double = js.native
    
    /* protected */ def getPointOnCubicBezier(
      pct: Double,
      p1x: Double,
      p1y: Double,
      p2x: Double,
      p2y: Double,
      p3x: Double,
      p3y: Double,
      p4x: Double,
      p4y: Double
    ): IPoint = js.native
    
    /* protected */ def getPointOnEllipticalArc(cx: Double, cy: Double, rx: Double, ry: Double, theta: Double, psi: Double): IPoint = js.native
    
    /* protected */ def getPointOnLine(dist: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double): IPoint = js.native
    /* protected */ def getPointOnLine(dist: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double, fromX: Double): IPoint = js.native
    /* protected */ def getPointOnLine(dist: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double, fromX: Double, fromY: Double): IPoint = js.native
    /* protected */ def getPointOnLine(dist: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double, fromX: Unit, fromY: Double): IPoint = js.native
    
    /* protected */ def getPointOnPath(distance: Double): IPoint = js.native
    
    /* protected */ def getPointOnQuadraticBezier(pct: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double, p3x: Double, p3y: Double): IPoint = js.native
    
    /* protected */ var glyphInfo: js.Array[IGlyphInfo] = js.native
    
    /* private */ var letterSpacingCache: Any = js.native
    
    /* protected */ def measureText(ctx: RenderingContext2D, text: String): Double = js.native
    
    /* private */ val measuresCache: Any = js.native
    
    /* protected */ def parsePathData(path: PathElement): js.Array[IPathCommand] = js.native
    
    def path(ctx: RenderingContext2D): Unit = js.native
    
    /* protected */ def pathA(pathParser: PathParser): js.Array[Double] = js.native
    
    /* protected */ def pathC(pathParser: PathParser, points: js.Array[Double]): Unit = js.native
    
    /* protected */ def pathH(pathParser: PathParser, points: js.Array[Double]): `16` = js.native
    
    /* protected */ def pathL(pathParser: PathParser, points: js.Array[Double]): `16` = js.native
    
    /* protected */ var pathLength: Double = js.native
    
    /* protected */ def pathM(pathParser: PathParser, points: js.Array[Double]): Unit = js.native
    
    /* protected */ def pathQ(pathParser: PathParser, points: js.Array[Double]): Unit = js.native
    
    /* protected */ def pathS(pathParser: PathParser, points: js.Array[Double]): `32` = js.native
    
    /* protected */ def pathT(pathParser: PathParser, points: js.Array[Double]): `128` = js.native
    
    /* protected */ def pathV(pathParser: PathParser, points: js.Array[Double]): `16` = js.native
    
    /* protected */ def setTextData(ctx: RenderingContext2D): Unit = js.native
    
    /* protected */ val text: String = js.native
    
    /* protected */ var textHeight: Double = js.native
    
    /* protected */ var textWidth: Double = js.native
  }
  
  trait ICachedPoint
    extends StObject
       with IPoint {
    
    var distance: Double
  }
  object ICachedPoint {
    
    inline def apply(distance: Double, x: Double, y: Double): ICachedPoint = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICachedPoint]
    }
    
    extension [Self <: ICachedPoint](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGlyphInfo extends StObject {
    
    var p0: ICachedPoint
    
    var p1: ICachedPoint
    
    var rotation: Double
    
    var text: String
  }
  object IGlyphInfo {
    
    inline def apply(p0: ICachedPoint, p1: ICachedPoint, rotation: Double, text: String): IGlyphInfo = {
      val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlyphInfo]
    }
    
    extension [Self <: IGlyphInfo](x: Self) {
      
      inline def setP0(value: ICachedPoint): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
      
      inline def setP1(value: ICachedPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPathCommand extends StObject {
    
    var pathLength: Double
    
    var points: js.Array[Double]
    
    var start: js.UndefOr[IPoint] = js.undefined
    
    var `type`: CommandType
  }
  object IPathCommand {
    
    inline def apply(pathLength: Double, points: js.Array[Double], `type`: CommandType): IPathCommand = {
      val __obj = js.Dynamic.literal(pathLength = pathLength.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPathCommand]
    }
    
    extension [Self <: IPathCommand](x: Self) {
      
      inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setStart(value: IPoint): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setType(value: CommandType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object IPoint {
    
    inline def apply(x: Double, y: Double): IPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoint]
    }
    
    extension [Self <: IPoint](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
