package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Common.b2Color
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DebugDraw extends StObject {
  
  /**
    * Append flags to the current flags.
    * @param flags Flags to add.
    **/
  def AppendFlags(flags: Double): Unit = js.native
  
  /**
    * Clear flags from the current flags.
    * @param flags flags to clear.
    **/
  def ClearFlags(flags: Double): Unit = js.native
  
  /**
    * Draw a circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param color Circle draw color.
    **/
  def DrawCircle(center: b2Vec2, radius: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  def DrawPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a line segment.
    * @param p1 Line beginpoint.
    * @param p2 Line endpoint.
    * @param color Line color.
    **/
  def DrawSegment(p1: b2Vec2, p2: b2Vec2, color: b2Color): Unit = js.native
  
  /**
    * Draw a solid circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param axis Circle axis.
    * @param color Circle color.
    **/
  def DrawSolidCircle(center: b2Vec2, radius: Double, axis: b2Vec2, color: b2Color): Unit = js.native
  
  /**
    * Draw a solid closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  def DrawSolidPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a transform. Choose your own length scale.
    * @param xf Transform to draw.
    **/
  def DrawTransform(xf: b2Transform): Unit = js.native
  
  /**
    * Get the alpha value used for lines.
    * @return Alpha value used for drawing lines.
    **/
  def GetAlpha(): Double = js.native
  
  /**
    * Get the draw scale.
    * @return Draw scale ratio.
    **/
  def GetDrawScale(): Double = js.native
  
  /**
    * Get the alpha value used for fills.
    * @return Alpha value used for drawing fills.
    **/
  def GetFillAlpha(): Double = js.native
  
  /**
    * Get the drawing flags.
    * @return Drawing flags.
    **/
  def GetFlags(): Double = js.native
  
  /**
    * Get the line thickness.
    * @return Line thickness.
    **/
  def GetLineThickness(): Double = js.native
  
  /**
    * Get the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called GetSprite().
    * @return The HTML Canvas Element used for debug drawing.
    **/
  def GetSprite(): CanvasRenderingContext2D = js.native
  
  /**
    * Get the scale used for drawing XForms.
    * @return Scale for drawing transforms.
    **/
  def GetXFormScale(): Double = js.native
  
  /**
    * Set the alpha value used for lines.
    * @param alpha Alpha value for drawing lines.
    **/
  def SetAlpha(alpha: Double): Unit = js.native
  
  /**
    * Set the draw scale.
    * @param drawScale Draw scale ratio.
    **/
  def SetDrawScale(drawScale: Double): Unit = js.native
  
  /**
    * Set the alpha value used for fills.
    * @param alpha Alpha value for drawing fills.
    **/
  def SetFillAlpha(alpha: Double): Unit = js.native
  
  /**
    * Set the drawing flags.
    * @param flags Sets the drawing flags.
    **/
  def SetFlags(flags: Double): Unit = js.native
  
  /**
    * Set the line thickness.
    * @param lineThickness The new line thickness.
    **/
  def SetLineThickness(lineThickness: Double): Unit = js.native
  
  /**
    * Set the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called SetSprite().
    * @param canvas HTML Canvas Element to draw debug information to.
    **/
  def SetSprite(canvas: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Set the scale used for drawing XForms.
    * @param xformScale The transform scale.
    **/
  def SetXFormScale(xformScale: Double): Unit = js.native
}
object b2DebugDraw {
  
  @scala.inline
  def apply(
    AppendFlags: Double => Unit,
    ClearFlags: Double => Unit,
    DrawCircle: (b2Vec2, Double, b2Color) => Unit,
    DrawPolygon: (js.Array[b2Vec2], Double, b2Color) => Unit,
    DrawSegment: (b2Vec2, b2Vec2, b2Color) => Unit,
    DrawSolidCircle: (b2Vec2, Double, b2Vec2, b2Color) => Unit,
    DrawSolidPolygon: (js.Array[b2Vec2], Double, b2Color) => Unit,
    DrawTransform: b2Transform => Unit,
    GetAlpha: () => Double,
    GetDrawScale: () => Double,
    GetFillAlpha: () => Double,
    GetFlags: () => Double,
    GetLineThickness: () => Double,
    GetSprite: () => CanvasRenderingContext2D,
    GetXFormScale: () => Double,
    SetAlpha: Double => Unit,
    SetDrawScale: Double => Unit,
    SetFillAlpha: Double => Unit,
    SetFlags: Double => Unit,
    SetLineThickness: Double => Unit,
    SetSprite: CanvasRenderingContext2D => Unit,
    SetXFormScale: Double => Unit
  ): b2DebugDraw = {
    val __obj = js.Dynamic.literal(AppendFlags = js.Any.fromFunction1(AppendFlags), ClearFlags = js.Any.fromFunction1(ClearFlags), DrawCircle = js.Any.fromFunction3(DrawCircle), DrawPolygon = js.Any.fromFunction3(DrawPolygon), DrawSegment = js.Any.fromFunction3(DrawSegment), DrawSolidCircle = js.Any.fromFunction4(DrawSolidCircle), DrawSolidPolygon = js.Any.fromFunction3(DrawSolidPolygon), DrawTransform = js.Any.fromFunction1(DrawTransform), GetAlpha = js.Any.fromFunction0(GetAlpha), GetDrawScale = js.Any.fromFunction0(GetDrawScale), GetFillAlpha = js.Any.fromFunction0(GetFillAlpha), GetFlags = js.Any.fromFunction0(GetFlags), GetLineThickness = js.Any.fromFunction0(GetLineThickness), GetSprite = js.Any.fromFunction0(GetSprite), GetXFormScale = js.Any.fromFunction0(GetXFormScale), SetAlpha = js.Any.fromFunction1(SetAlpha), SetDrawScale = js.Any.fromFunction1(SetDrawScale), SetFillAlpha = js.Any.fromFunction1(SetFillAlpha), SetFlags = js.Any.fromFunction1(SetFlags), SetLineThickness = js.Any.fromFunction1(SetLineThickness), SetSprite = js.Any.fromFunction1(SetSprite), SetXFormScale = js.Any.fromFunction1(SetXFormScale))
    __obj.asInstanceOf[b2DebugDraw]
  }
  
  @scala.inline
  implicit class b2DebugDrawMutableBuilder[Self <: b2DebugDraw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendFlags(value: Double => Unit): Self = StObject.set(x, "AppendFlags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearFlags(value: Double => Unit): Self = StObject.set(x, "ClearFlags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrawCircle(value: (b2Vec2, Double, b2Color) => Unit): Self = StObject.set(x, "DrawCircle", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrawPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Unit): Self = StObject.set(x, "DrawPolygon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrawSegment(value: (b2Vec2, b2Vec2, b2Color) => Unit): Self = StObject.set(x, "DrawSegment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrawSolidCircle(value: (b2Vec2, Double, b2Vec2, b2Color) => Unit): Self = StObject.set(x, "DrawSolidCircle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDrawSolidPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Unit): Self = StObject.set(x, "DrawSolidPolygon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrawTransform(value: b2Transform => Unit): Self = StObject.set(x, "DrawTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAlpha(value: () => Double): Self = StObject.set(x, "GetAlpha", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDrawScale(value: () => Double): Self = StObject.set(x, "GetDrawScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillAlpha(value: () => Double): Self = StObject.set(x, "GetFillAlpha", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlags(value: () => Double): Self = StObject.set(x, "GetFlags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineThickness(value: () => Double): Self = StObject.set(x, "GetLineThickness", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSprite(value: () => CanvasRenderingContext2D): Self = StObject.set(x, "GetSprite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXFormScale(value: () => Double): Self = StObject.set(x, "GetXFormScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAlpha(value: Double => Unit): Self = StObject.set(x, "SetAlpha", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDrawScale(value: Double => Unit): Self = StObject.set(x, "SetDrawScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFillAlpha(value: Double => Unit): Self = StObject.set(x, "SetFillAlpha", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFlags(value: Double => Unit): Self = StObject.set(x, "SetFlags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLineThickness(value: Double => Unit): Self = StObject.set(x, "SetLineThickness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSprite(value: CanvasRenderingContext2D => Unit): Self = StObject.set(x, "SetSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXFormScale(value: Double => Unit): Self = StObject.set(x, "SetXFormScale", js.Any.fromFunction1(value))
  }
}
