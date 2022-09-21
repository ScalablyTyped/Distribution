package typings.blackEngine

import typings.blackEngine.capsStyleMod.CapsStyle
import typings.blackEngine.displayObjectMod.DisplayObject
import typings.blackEngine.graphicsDataMod.GraphicsData
import typings.blackEngine.graphicsGradientMod.GraphicsGradient
import typings.blackEngine.graphicsLinearGradientMod.GraphicsLinearGradient
import typings.blackEngine.graphicsPatternMod.GraphicsPattern
import typings.blackEngine.jointStyleMod.JointStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsMod {
  
  @JSImport("black-engine/display/Graphics", "Graphics")
  @js.native
  open class Graphics () extends DisplayObject {
    def this(graphicsData: String) = this()
    def this(graphicsData: GraphicsData) = this()
    def this(graphicsData: String, trim: Boolean) = this()
    def this(graphicsData: Null, trim: Boolean) = this()
    def this(graphicsData: Unit, trim: Boolean) = this()
    def this(graphicsData: GraphicsData, trim: Boolean) = this()
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    def circle(x: Double, y: Double, radius: Double): Unit = js.native
    
    def clear(): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def createLinearGradient(x: Any, y: Any, width: Any, height: Any): GraphicsLinearGradient = js.native
    
    def fill(): Unit = js.native
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
    
    /* private */ var mBounds: Any = js.native
    
    /* private */ var mDataOffsetX: Any = js.native
    
    /* private */ var mDataOffsetY: Any = js.native
    
    /* private */ var mGraphicsData: Any = js.native
    
    /* private */ var mLocalBounds: Any = js.native
    
    /* private */ var mTrim: Any = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    def roundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = js.native
    
    def setLineDash(segments: Any): Unit = js.native
    
    def shadowBlur(level: Double): Unit = js.native
    
    def shadowColor(color: Double): Unit = js.native
    def shadowColor(color: Double, alpha: Double): Unit = js.native
    
    def stroke(): Unit = js.native
  }
}
