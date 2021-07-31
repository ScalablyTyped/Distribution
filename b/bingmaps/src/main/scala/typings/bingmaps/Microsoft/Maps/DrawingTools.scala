package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingTools extends StObject {
  
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
object DrawingTools {
  
  @js.native
  sealed trait DrawingBarAction extends StObject
  @JSGlobal("Microsoft.Maps.DrawingTools.DrawingBarAction")
  @js.native
  object DrawingBarAction extends StObject {
    
    /** All items */
    @js.native
    sealed trait all
      extends StObject
         with DrawingBarAction
    
    /** All shape creation items */
    @js.native
    sealed trait createShapes
      extends StObject
         with DrawingBarAction
    
    /** Edit existing primitive */
    @js.native
    sealed trait edit
      extends StObject
         with DrawingBarAction
    
    /** All shape editing items */
    @js.native
    sealed trait editShapes
      extends StObject
         with DrawingBarAction
    
    /** Erase existing primitive */
    @js.native
    sealed trait erase
      extends StObject
         with DrawingBarAction
    
    /** Change fill style */
    @js.native
    sealed trait fillStyle
      extends StObject
         with DrawingBarAction
    
    /** Create point primitive */
    @js.native
    sealed trait point
      extends StObject
         with DrawingBarAction
    
    /** Create polygon primitive */
    @js.native
    sealed trait polygon
      extends StObject
         with DrawingBarAction
    
    /** Create polyline primitive */
    @js.native
    sealed trait polyline
      extends StObject
         with DrawingBarAction
    
    /** Change stroke style */
    @js.native
    sealed trait strokeStyle
      extends StObject
         with DrawingBarAction
    
    /** All shape styling items */
    @js.native
    sealed trait styleShapes
      extends StObject
         with DrawingBarAction
  }
  
  @js.native
  sealed trait DrawingMode extends StObject
  @JSGlobal("Microsoft.Maps.DrawingTools.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    /** Edit an existing shape. Click on a shape to edit it. */
    @js.native
    sealed trait edit
      extends StObject
         with DrawingMode
    
    /** Erase and existing shape. Click on the shapes to erase them. */
    @js.native
    sealed trait erase
      extends StObject
         with DrawingMode
    
    /** Sets the drawing manager into an idle mode. */
    @js.native
    sealed trait none
      extends StObject
         with DrawingMode
    
    /** Allow the user to draw a polygon. */
    @js.native
    sealed trait polygon
      extends StObject
         with DrawingMode
    
    /** Allow the user to draw a polyline. */
    @js.native
    sealed trait polyline
      extends StObject
         with DrawingMode
    
    /** Allow the user to draw a pushpin. */
    @js.native
    sealed trait pushpin
      extends StObject
         with DrawingMode
  }
  
  @js.native
  sealed trait ShapeType extends StObject
  @JSGlobal("Microsoft.Maps.DrawingTools.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    /** A polygon shape type. */
    @js.native
    sealed trait polygon
      extends StObject
         with ShapeType
    
    /** A polyline shape type. */
    @js.native
    sealed trait polyline
      extends StObject
         with ShapeType
  }
}
