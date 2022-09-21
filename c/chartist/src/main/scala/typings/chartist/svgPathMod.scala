package typings.chartist

import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.svgTypesMod.PathCommand
import typings.chartist.svgTypesMod.PathParams
import typings.chartist.svgTypesMod.SvgPathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgPathMod {
  
  @JSImport("chartist/dist/svg/SvgPath", "SvgPath")
  @js.native
  /**
    * Used to construct a new path object.
    * @param close If set to true then this path will be closed when stringified (with a Z at the end)
    * @param options Options object that overrides the default objects. See default options for more details.
    */
  open class SvgPath () extends StObject {
    def this(close: Boolean) = this()
    def this(close: Boolean, options: SvgPathOptions) = this()
    def this(close: Unit, options: SvgPathOptions) = this()
    
    /**
      * Use this function to add a new non-bezier curve SVG path element.
      * @param rx The radius to be used for the x-axis of the arc.
      * @param ry The radius to be used for the y-axis of the arc.
      * @param xAr Defines the orientation of the arc
      * @param lAf Large arc flag
      * @param sf Sweep flag
      * @param x The x coordinate for the target point of the curve element.
      * @param y The y coordinate for the target point of the curve element.
      * @param relative If set to true the curve element will be created with relative coordinates (lowercase letter)
      * @param data Any data that should be stored with the element object that will be accessible in pathElement
      * @return The current path object for easy call chaining.
      */
    def arc(rx: Double, ry: Double, xAr: Double, lAf: Double, sf: Double, x: Double, y: Double): this.type = js.native
    def arc(
      rx: Double,
      ry: Double,
      xAr: Double,
      lAf: Double,
      sf: Double,
      x: Double,
      y: Double,
      relative: Boolean
    ): this.type = js.native
    def arc(
      rx: Double,
      ry: Double,
      xAr: Double,
      lAf: Double,
      sf: Double,
      x: Double,
      y: Double,
      relative: Boolean,
      data: SegmentData
    ): this.type = js.native
    def arc(
      rx: Double,
      ry: Double,
      xAr: Double,
      lAf: Double,
      sf: Double,
      x: Double,
      y: Double,
      relative: Unit,
      data: SegmentData
    ): this.type = js.native
    
    def clone(close: Boolean): SvgPath = js.native
    
    /* private */ val close: Any = js.native
    
    /**
      * Use this function to add a new curve SVG path element.
      * @param x1 The x coordinate for the first control point of the bezier curve.
      * @param y1 The y coordinate for the first control point of the bezier curve.
      * @param x2 The x coordinate for the second control point of the bezier curve.
      * @param y2 The y coordinate for the second control point of the bezier curve.
      * @param x The x coordinate for the target point of the curve element.
      * @param y The y coordinate for the target point of the curve element.
      * @param relative If set to true the curve element will be created with relative coordinates (lowercase letter)
      * @param data Any data that should be stored with the element object that will be accessible in pathElement
      * @return The current path object for easy call chaining.
      */
    def curve(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): this.type = js.native
    def curve(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double, relative: Boolean): this.type = js.native
    def curve(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x: Double,
      y: Double,
      relative: Boolean,
      data: SegmentData
    ): this.type = js.native
    def curve(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x: Double,
      y: Double,
      relative: Unit,
      data: SegmentData
    ): this.type = js.native
    
    /**
      * Use this function to add a new line SVG path element.
      * @param x The x coordinate for the line element.
      * @param y The y coordinate for the line element.
      * @param relative If set to true the line element will be created with relative coordinates (lowercase letter)
      * @param data Any data that should be stored with the element object that will be accessible in pathElement
      * @return The current path object for easy call chaining.
      */
    def line(x: Double, y: Double): this.type = js.native
    def line(x: Double, y: Double, relative: Boolean): this.type = js.native
    def line(x: Double, y: Double, relative: Boolean, data: SegmentData): this.type = js.native
    def line(x: Double, y: Double, relative: Unit, data: SegmentData): this.type = js.native
    
    /**
      * Use this function to add a new move SVG path element.
      * @param x The x coordinate for the move element.
      * @param y The y coordinate for the move element.
      * @param relative If set to true the move element will be created with relative coordinates (lowercase letter)
      * @param data Any data that should be stored with the element object that will be accessible in pathElement
      * @return The current path object for easy call chaining.
      */
    def move(x: Double, y: Double): this.type = js.native
    def move(x: Double, y: Double, relative: Boolean): this.type = js.native
    def move(x: Double, y: Double, relative: Boolean, data: SegmentData): this.type = js.native
    def move(x: Double, y: Double, relative: Unit, data: SegmentData): this.type = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Parses an SVG path seen in the d attribute of path elements, and inserts the parsed elements into the existing path object at the current cursor position. Any closing path indicators (Z at the end of the path) will be ignored by the parser as this is provided by the close option in the options of the path object.
      * @param path Any SVG path that contains move (m), line (l) or curve (c) components.
      * @return The current path object for easy call chaining.
      */
    def parse(path: String): this.type = js.native
    
    var pathElements: js.Array[PathCommand[PathParams]] = js.native
    
    /* private */ var pos: Any = js.native
    
    def position(): Double = js.native
    /**
      * Gets or sets the current position (cursor) inside of the path. You can move around the cursor freely but limited to 0 or the count of existing elements. All modifications with element functions will insert new elements at the position of this cursor.
      * @param pos If a number is passed then the cursor is set to this position in the path element array.
      * @return If the position parameter was passed then the return value will be the path object for easy call chaining. If no position parameter was passed then the current position is returned.
      */
    def position(pos: Double): this.type = js.native
    
    /**
      * Removes elements from the path starting at the current position.
      * @param count Number of path elements that should be removed from the current position.
      * @return The current path object for easy call chaining.
      */
    def remove(count: Double): this.type = js.native
    
    /**
      * Scales all elements in the current SVG path object. There is an individual parameter for each coordinate. Scaling will also be done for control points of curves, affecting the given coordinate.
      * @param x The number which will be used to scale the x, x1 and x2 of all path elements.
      * @param y The number which will be used to scale the y, y1 and y2 of all path elements.
      * @return The current path object for easy call chaining.
      */
    def scale(x: Double, y: Double): this.type = js.native
    
    /**
      * Split a Svg.Path object by a specific command in the path chain. The path chain will be split and an array of newly created paths objects will be returned. This is useful if you'd like to split an SVG path by it's move commands, for example, in order to isolate chunks of drawings.
      * @param command The command you'd like to use to split the path
      */
    def splitByCommand(command: String): js.Array[SvgPath] = js.native
    
    /**
      * This function renders to current SVG path object into a final SVG string that can be used in the d attribute of SVG path elements. It uses the accuracy option to round big decimals. If the close parameter was set in the constructor of this path object then a path closing Z will be appended to the output string.
      */
    def stringify(): String = js.native
    
    /**
      * This function will run over all existing path elements and then loop over their attributes. The callback function will be called for every path element attribute that exists in the current path.
      * The method signature of the callback function looks like this:
      * ```javascript
      * function(pathElement, paramName, pathElementIndex, paramIndex, pathElements)
      * ```
      * If something else than undefined is returned by the callback function, this value will be used to replace the old value. This allows you to build custom transformations of path objects that can't be achieved using the basic transformation functions scale and translate.
      * @param transformFnc The callback function for the transformation. Check the signature in the function description.
      * @return The current path object for easy call chaining.
      */
    def transform(
      transformFnc: js.Function5[
          /* cmd */ PathCommand[PathParams], 
          /* keyof chartist.chartist/dist/svg/types.PathParams */ /* param */ String, 
          /* cmdIndex */ Double, 
          /* paramIndex */ Double, 
          /* cmds */ js.Array[PathCommand[PathParams]], 
          Double | Unit
        ]
    ): this.type = js.native
    
    /**
      * Translates all elements in the current SVG path object. The translation is relative and there is an individual parameter for each coordinate. Translation will also be done for control points of curves, affecting the given coordinate.
      * @param x The number which will be used to translate the x, x1 and x2 of all path elements.
      * @param y The number which will be used to translate the y, y1 and y2 of all path elements.
      * @return The current path object for easy call chaining.
      */
    def translate(x: Double, y: Double): this.type = js.native
  }
  /* static members */
  object SvgPath {
    
    @JSImport("chartist/dist/svg/SvgPath", "SvgPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static function on `SvgPath` is joining multiple paths together into one paths.
      * @param paths A list of paths to be joined together. The order is important.
      * @param close If the newly created path should be a closed path
      * @param options Path options for the newly created path.
      */
    inline def join(paths: js.Array[SvgPath]): SvgPath = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[SvgPath]
    inline def join(paths: js.Array[SvgPath], close: Boolean): SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[SvgPath]
    inline def join(paths: js.Array[SvgPath], close: Boolean, options: SvgPathOptions): SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SvgPath]
    inline def join(paths: js.Array[SvgPath], close: Unit, options: SvgPathOptions): SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SvgPath]
  }
}
