package typings.canvg

import typings.canvg.canvgInts.`0`
import typings.canvg.canvgInts.`1`
import typings.canvg.pointMod.Point
import typings.svgPathdata.mod.SVGPathData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathParserMod {
  
  @JSImport("canvg/dist/PathParser", "PathParser")
  @js.native
  open class PathParser protected () extends SVGPathData {
    def this(path: String) = this()
    
    def addMarker(point: Point): Unit = js.native
    def addMarker(point: Point, from: Unit, priorTo: Point): Unit = js.native
    def addMarker(point: Point, from: Point): Unit = js.native
    def addMarker(point: Point, from: Point, priorTo: Point): Unit = js.native
    
    def addMarkerAngle(point: Point, angle: Double): Unit = js.native
    
    /* private */ var angles: Any = js.native
    
    var command: Command | Null = js.native
    
    @JSName("commands")
    val commands_PathParser: js.Array[Command] = js.native
    
    var control: Point = js.native
    
    var current: Point = js.native
    
    def getAsControlPoint(): Point = js.native
    def getAsControlPoint(xProp: String): Point = js.native
    def getAsControlPoint(xProp: String, yProp: String): Point = js.native
    def getAsControlPoint(xProp: Unit, yProp: String): Point = js.native
    
    def getAsCurrentPoint(): Point = js.native
    def getAsCurrentPoint(xProp: String): Point = js.native
    def getAsCurrentPoint(xProp: String, yProp: String): Point = js.native
    def getAsCurrentPoint(xProp: Unit, yProp: String): Point = js.native
    
    def getMarkerAngles(): js.Array[Double] = js.native
    
    def getMarkerPoints(): js.Array[Point] = js.native
    
    def getPoint(): Point = js.native
    def getPoint(xProp: String): Point = js.native
    def getPoint(xProp: String, yProp: String): Point = js.native
    def getPoint(xProp: Unit, yProp: String): Point = js.native
    
    def getReflectedControlPoint(): Point = js.native
    
    /* private */ var i: Any = js.native
    
    def isEnd(): Boolean = js.native
    
    def makeAbsolute(point: Point): Point = js.native
    
    def next(): Command = js.native
    
    /* private */ var points: Any = js.native
    
    /* private */ var previousCommand: Any = js.native
    
    def reset(): Unit = js.native
    
    var start: Point = js.native
  }
  
  /* Inlined {  type :canvg.canvg/dist/PathParser.CommandType} & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandM, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandL, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandH, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandV, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandZ, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandQ, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandT, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandC, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandS, 'type'> & std.Omit<svg-pathdata.svg-pathdata/lib/types.CommandA, 'type'> */
  trait Command extends StObject {
    
    var cX: js.UndefOr[Double] = js.undefined
    
    var cY: js.UndefOr[Double] = js.undefined
    
    var lArcFlag: `0` | `1`
    
    var phi1: js.UndefOr[Double] = js.undefined
    
    var phi2: js.UndefOr[Double] = js.undefined
    
    var rX: Double
    
    var rY: Double
    
    var relative: Boolean
    
    var sweepFlag: `0` | `1`
    
    var `type`: CommandType
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var xRot: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object Command {
    
    inline def apply(
      lArcFlag: `0` | `1`,
      rX: Double,
      rY: Double,
      relative: Boolean,
      sweepFlag: `0` | `1`,
      `type`: CommandType,
      x: Double,
      x1: Double,
      x2: Double,
      xRot: Double,
      y: Double,
      y1: Double,
      y2: Double
    ): Command = {
      val __obj = js.Dynamic.literal(lArcFlag = lArcFlag.asInstanceOf[js.Any], rX = rX.asInstanceOf[js.Any], rY = rY.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xRot = xRot.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCX(value: Double): Self = StObject.set(x, "cX", value.asInstanceOf[js.Any])
      
      inline def setCXUndefined: Self = StObject.set(x, "cX", js.undefined)
      
      inline def setCY(value: Double): Self = StObject.set(x, "cY", value.asInstanceOf[js.Any])
      
      inline def setCYUndefined: Self = StObject.set(x, "cY", js.undefined)
      
      inline def setLArcFlag(value: `0` | `1`): Self = StObject.set(x, "lArcFlag", value.asInstanceOf[js.Any])
      
      inline def setPhi1(value: Double): Self = StObject.set(x, "phi1", value.asInstanceOf[js.Any])
      
      inline def setPhi1Undefined: Self = StObject.set(x, "phi1", js.undefined)
      
      inline def setPhi2(value: Double): Self = StObject.set(x, "phi2", value.asInstanceOf[js.Any])
      
      inline def setPhi2Undefined: Self = StObject.set(x, "phi2", js.undefined)
      
      inline def setRX(value: Double): Self = StObject.set(x, "rX", value.asInstanceOf[js.Any])
      
      inline def setRY(value: Double): Self = StObject.set(x, "rY", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSweepFlag(value: `0` | `1`): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      inline def setType(value: CommandType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setXRot(value: Double): Self = StObject.set(x, "xRot", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandType = /* import warning: importer.ImportType#apply Failed type conversion: svg-pathdata.svg-pathdata/lib/types.SVGCommand['type'] */ js.Any
}
