package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Common.b2Color
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2DebugDraw")
@js.native
/**
  * Constructor.
  **/
open class b2DebugDraw ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2DebugDraw {
  
  /**
    * Append flags to the current flags.
    * @param flags Flags to add.
    **/
  /* CompleteClass */
  override def AppendFlags(flags: Double): Unit = js.native
  
  /**
    * Clear flags from the current flags.
    * @param flags flags to clear.
    **/
  /* CompleteClass */
  override def ClearFlags(flags: Double): Unit = js.native
  
  /**
    * Draw a circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param color Circle draw color.
    **/
  /* CompleteClass */
  override def DrawCircle(center: b2Vec2, radius: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  /* CompleteClass */
  override def DrawPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a line segment.
    * @param p1 Line beginpoint.
    * @param p2 Line endpoint.
    * @param color Line color.
    **/
  /* CompleteClass */
  override def DrawSegment(p1: b2Vec2, p2: b2Vec2, color: b2Color): Unit = js.native
  
  /**
    * Draw a solid circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param axis Circle axis.
    * @param color Circle color.
    **/
  /* CompleteClass */
  override def DrawSolidCircle(center: b2Vec2, radius: Double, axis: b2Vec2, color: b2Color): Unit = js.native
  
  /**
    * Draw a solid closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  /* CompleteClass */
  override def DrawSolidPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  
  /**
    * Draw a transform. Choose your own length scale.
    * @param xf Transform to draw.
    **/
  /* CompleteClass */
  override def DrawTransform(xf: b2Transform): Unit = js.native
  
  /**
    * Get the alpha value used for lines.
    * @return Alpha value used for drawing lines.
    **/
  /* CompleteClass */
  override def GetAlpha(): Double = js.native
  
  /**
    * Get the draw scale.
    * @return Draw scale ratio.
    **/
  /* CompleteClass */
  override def GetDrawScale(): Double = js.native
  
  /**
    * Get the alpha value used for fills.
    * @return Alpha value used for drawing fills.
    **/
  /* CompleteClass */
  override def GetFillAlpha(): Double = js.native
  
  /**
    * Get the drawing flags.
    * @return Drawing flags.
    **/
  /* CompleteClass */
  override def GetFlags(): Double = js.native
  
  /**
    * Get the line thickness.
    * @return Line thickness.
    **/
  /* CompleteClass */
  override def GetLineThickness(): Double = js.native
  
  /**
    * Get the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called GetSprite().
    * @return The HTML Canvas Element used for debug drawing.
    **/
  /* CompleteClass */
  override def GetSprite(): CanvasRenderingContext2D = js.native
  
  /**
    * Get the scale used for drawing XForms.
    * @return Scale for drawing transforms.
    **/
  /* CompleteClass */
  override def GetXFormScale(): Double = js.native
  
  /**
    * Set the alpha value used for lines.
    * @param alpha Alpha value for drawing lines.
    **/
  /* CompleteClass */
  override def SetAlpha(alpha: Double): Unit = js.native
  
  /**
    * Set the draw scale.
    * @param drawScale Draw scale ratio.
    **/
  /* CompleteClass */
  override def SetDrawScale(drawScale: Double): Unit = js.native
  
  /**
    * Set the alpha value used for fills.
    * @param alpha Alpha value for drawing fills.
    **/
  /* CompleteClass */
  override def SetFillAlpha(alpha: Double): Unit = js.native
  
  /**
    * Set the drawing flags.
    * @param flags Sets the drawing flags.
    **/
  /* CompleteClass */
  override def SetFlags(flags: Double): Unit = js.native
  
  /**
    * Set the line thickness.
    * @param lineThickness The new line thickness.
    **/
  /* CompleteClass */
  override def SetLineThickness(lineThickness: Double): Unit = js.native
  
  /**
    * Set the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called SetSprite().
    * @param canvas HTML Canvas Element to draw debug information to.
    **/
  /* CompleteClass */
  override def SetSprite(canvas: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Set the scale used for drawing XForms.
    * @param xformScale The transform scale.
    **/
  /* CompleteClass */
  override def SetXFormScale(xformScale: Double): Unit = js.native
}
/* static members */
object b2DebugDraw {
  
  @JSGlobal("Box2D.Dynamics.b2DebugDraw")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Draw axis aligned bounding boxes.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_aabbBit")
  @js.native
  def e_aabbBit: Double = js.native
  inline def e_aabbBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_aabbBit")(x.asInstanceOf[js.Any])
  
  /**
    * Draw center of mass frame.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_centerOfMassBit")
  @js.native
  def e_centerOfMassBit: Double = js.native
  inline def e_centerOfMassBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_centerOfMassBit")(x.asInstanceOf[js.Any])
  
  /**
    * Draw controllers.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_controllerBit")
  @js.native
  def e_controllerBit: Double = js.native
  inline def e_controllerBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_controllerBit")(x.asInstanceOf[js.Any])
  
  /**
    * Draw joint connections.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_jointBit")
  @js.native
  def e_jointBit: Double = js.native
  inline def e_jointBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_jointBit")(x.asInstanceOf[js.Any])
  
  /**
    * Draw broad-phase pairs.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_pairBit")
  @js.native
  def e_pairBit: Double = js.native
  inline def e_pairBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_pairBit")(x.asInstanceOf[js.Any])
  
  /**
    * Draw shapes.
    **/
  @JSGlobal("Box2D.Dynamics.b2DebugDraw.e_shapeBit")
  @js.native
  def e_shapeBit: Double = js.native
  inline def e_shapeBit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_shapeBit")(x.asInstanceOf[js.Any])
}
