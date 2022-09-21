package typings.blackEngine

import typings.blackEngine.capsStyleMod.CapsStyle
import typings.blackEngine.graphicsGradientMod.GraphicsGradient
import typings.blackEngine.graphicsPatternMod.GraphicsPattern
import typings.blackEngine.jointStyleMod.JointStyle
import typings.blackEngine.matrixMod.Matrix
import typings.blackEngine.rectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsDataMod {
  
  @JSImport("black-engine/display/GraphicsData", "GraphicsData")
  @js.native
  open class GraphicsData () extends StObject {
    
    /* private */ var __bezierDot: Any = js.native
    
    /* private */ var __bezierRange: Any = js.native
    
    /* private */ var __pushCommand: Any = js.native
    
    /* private */ var __quadraticRange: Any = js.native
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    def circle(x: Double, y: Double, radius: Double): Unit = js.native
    
    def clear(): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def fill(isNonZero: Boolean): Unit = js.native
    
    def fillGradient(gradient: GraphicsGradient): Unit = js.native
    
    def fillPattern(pattern: GraphicsPattern): Unit = js.native
    
    def fillStyle(): Unit = js.native
    def fillStyle(color: Double): Unit = js.native
    def fillStyle(color: Double, alpha: Double): Unit = js.native
    def fillStyle(color: Unit, alpha: Double): Unit = js.native
    
    def lineStyle(
      lineWidth: js.UndefOr[Double],
      color: js.UndefOr[Double],
      alpha: js.UndefOr[Double],
      caps: js.UndefOr[CapsStyle],
      joints: js.UndefOr[JointStyle],
      miterLimit: js.UndefOr[Double]
    ): Unit = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    /* private */ var mCommandQueue: Any = js.native
    
    /* private */ var mName: Any = js.native
    
    /* private */ var mNodes: Any = js.native
    
    /* private */ var mPivotX: Any = js.native
    
    /* private */ var mPivotY: Any = js.native
    
    /* private */ var mPosX: Any = js.native
    
    /* private */ var mPosY: Any = js.native
    
    /* private */ var mTransform: Any = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def name: String = js.native
    def name_=(arg: String): Unit = js.native
    
    /* protected */ def onGetLocalBounds(graphics: Any, transform: Matrix): Rectangle = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    def roundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    def searchNode(name: Any): Any = js.native
    def searchNode(name: Any, parent: GraphicsData): Any = js.native
    
    def setLineDash(segments: js.Array[Double]): Unit = js.native
    
    def shadowBlur(level: Double): Unit = js.native
    
    def shadowColor(color: Double, alpha: Double): Unit = js.native
    
    def stroke(): Unit = js.native
  }
}
