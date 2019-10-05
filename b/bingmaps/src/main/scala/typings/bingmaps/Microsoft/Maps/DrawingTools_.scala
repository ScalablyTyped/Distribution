package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.DrawingTools")
@js.native
class DrawingTools_ protected () extends js.Object {
  /**
    * @constructor
    * @requires The Microsoft.Maps.DrawingTools module.
    * @param map A map instanct to attach the drawing tools to.
    */
  def this(map: Map) = this()
  /**
    * Initializes the drawing layer and instructs it to create a new shape of a given type.
    * @param shapeType The type of new shape to create.
    * @param created A callback function that is fired after the initial shape is created.
    */
  def create(shapeType: ShapeType): Unit = js.native
  def create(shapeType: ShapeType, created: js.Function1[/* shape */ IPrimitive, Unit]): Unit = js.native
  /** Disposes the instance of the DrawingTools class. */
  def dispose(): Unit = js.native
  /**
    * Adds a shape to the drawing layer and puts it into edit mode.
    * @param shape A shape to put into editting mode.
    */
  def edit(shape: IPrimitive): Unit = js.native
  /**
    * Finishes any shape create / edit operation currently in progress, and returns the shape that was created or editted through a specified callback function.
    * @param finished A callback function to return the completed shape with.
    */
  def finish(): Unit = js.native
  def finish(finished: js.Function1[/* shape */ IPrimitive, Unit]): Unit = js.native
  /**
    * Shows the drawing toolbar, if it isn't already visible.
    * @param options - Options for this DrawingTool operation. Specifically,
    * the drawingBarActions property is used to customize the drawing bar view.
    */
  def showDrawingBar(): Unit = js.native
  def showDrawingBar(options: IDrawingToolOptions): Unit = js.native
  /**
    * Creates a drawing manager which allows multi-shape editing and displays the toolbar.
    * @param callback A callback function that is triggered after the DrawingTools have loaded. 
    */
  def showDrawingManager(): Unit = js.native
  def showDrawingManager(callback: js.Function1[/* manager */ DrawingManager, Unit]): Unit = js.native
}

