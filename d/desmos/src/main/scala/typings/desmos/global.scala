package typings.desmos

import typings.desmos.Desmos.BasicCalculator
import typings.desmos.Desmos.Calculator
import typings.desmos.Desmos.GraphConfiguration
import typings.desmos.Desmos.GraphSettings
import typings.desmos.anon.AdditionalFunctions
import typings.desmos.anon.Autosize
import typings.desmos.desmosInts.`12`
import typings.desmos.desmosInts.`16`
import typings.desmos.desmosInts.`20`
import typings.desmos.desmosInts.`24`
import typings.desmos.desmosInts.`9`
import typings.desmos.desmosStrings.ABOVE
import typings.desmos.desmosStrings.AUTO
import typings.desmos.desmosStrings.BELOW
import typings.desmos.desmosStrings.BOTH
import typings.desmos.desmosStrings.CROSS
import typings.desmos.desmosStrings.DASHED
import typings.desmos.desmosStrings.DEFAULT
import typings.desmos.desmosStrings.DOTTED
import typings.desmos.desmosStrings.LARGE
import typings.desmos.desmosStrings.LEFT
import typings.desmos.desmosStrings.MEDIUM
import typings.desmos.desmosStrings.NONE
import typings.desmos.desmosStrings.Numbersign000000
import typings.desmos.desmosStrings.Numbersign2d70b3
import typings.desmos.desmosStrings.Numbersign388c46
import typings.desmos.desmosStrings.Numbersign6042a6
import typings.desmos.desmosStrings.Numbersignc74440
import typings.desmos.desmosStrings.Numbersignfa7e19
import typings.desmos.desmosStrings.OPEN
import typings.desmos.desmosStrings.POINT
import typings.desmos.desmosStrings.POSITIVE
import typings.desmos.desmosStrings.RIGHT
import typings.desmos.desmosStrings.SMALL
import typings.desmos.desmosStrings.SOLID
import typings.desmos.desmosStrings.X
import typings.desmos.desmosStrings.XY
import typings.desmos.desmosStrings.Y
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Desmos {
    
    @JSGlobal("Desmos")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The AxisArrowMode specifies whether arrows should be drawn at one or both ends of the x or y axes. It is specified
      * separately for the x and y axes through the xAxisArrowMode and yAxisArrowMode graph settings.
      * The default value for both axes is Desmos.AxisArrowMode.NONE.
      */
    object AxisArrowModes {
      
      @JSGlobal("Desmos.AxisArrowModes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.AxisArrowModes.BOTH")
      @js.native
      def BOTH: typings.desmos.desmosStrings.BOTH = js.native
      inline def BOTH_=(x: BOTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.AxisArrowModes.NONE")
      @js.native
      def NONE: typings.desmos.desmosStrings.NONE = js.native
      inline def NONE_=(x: NONE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.AxisArrowModes.POSITIVE")
      @js.native
      def POSITIVE: typings.desmos.desmosStrings.POSITIVE = js.native
      inline def POSITIVE_=(x: POSITIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITIVE")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Default list of colors
      */
    object Colors {
      
      @JSGlobal("Desmos.Colors")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.Colors.BLACK")
      @js.native
      def BLACK: Numbersign000000 = js.native
      inline def BLACK_=(x: Numbersign000000): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Colors.BLUE")
      @js.native
      def BLUE: Numbersign2d70b3 = js.native
      inline def BLUE_=(x: Numbersign2d70b3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Colors.GREEN")
      @js.native
      def GREEN: Numbersign388c46 = js.native
      inline def GREEN_=(x: Numbersign388c46): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Colors.ORANGE")
      @js.native
      def ORANGE: Numbersignfa7e19 = js.native
      inline def ORANGE_=(x: Numbersignfa7e19): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Colors.PURPLE")
      @js.native
      def PURPLE: Numbersign6042a6 = js.native
      inline def PURPLE_=(x: Numbersign6042a6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PURPLE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Colors.RED")
      @js.native
      def RED: Numbersignc74440 = js.native
      inline def RED_=(x: Numbersignc74440): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
    }
    
    /**
      * The dragMode of a point determines whether it can be changed by dragging in the x direction, the y direction,
      * both, or neither.
      * In addition, a point may have its dragMode set to Desmos.DragModes.AUTO, in which case the normal calculator rules
      * for determining point behavior will be applied. For example, a point whose coordinates are both slider variables would
      * be draggable in both the x and y directions.
      * The dragMode of a table column determines the behavior of the points represented by the column. The dragMode is only applicable
      * to explicitly specified column values, and has no effect on computed column values.
      */
    object DragModes {
      
      @JSGlobal("Desmos.DragModes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.DragModes.AUTO")
      @js.native
      def AUTO: typings.desmos.desmosStrings.AUTO = js.native
      inline def AUTO_=(x: AUTO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.DragModes.NONE")
      @js.native
      def NONE: typings.desmos.desmosStrings.NONE = js.native
      inline def NONE_=(x: NONE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.DragModes.X")
      @js.native
      def X: typings.desmos.desmosStrings.X = js.native
      
      @JSGlobal("Desmos.DragModes.XY")
      @js.native
      def XY: typings.desmos.desmosStrings.XY = js.native
      inline def XY_=(x: XY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XY")(x.asInstanceOf[js.Any])
      
      inline def X_=(x: X): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.DragModes.Y")
      @js.native
      def Y: typings.desmos.desmosStrings.Y = js.native
      inline def Y_=(x: Y): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Though the calculator's fontSize property can be set to any numeric value, we provide a set of predefined font sizes for convenience.
      */
    object FontSizes {
      
      @JSGlobal("Desmos.FontSizes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.FontSizes.LARGE")
      @js.native
      def LARGE: `20` = js.native
      inline def LARGE_=(x: `20`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.FontSizes.MEDIUM")
      @js.native
      def MEDIUM: `16` = js.native
      inline def MEDIUM_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.FontSizes.SMALL")
      @js.native
      def SMALL: `12` = js.native
      inline def SMALL_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.FontSizes.VERY_LARGE")
      @js.native
      def VERY_LARGE: `24` = js.native
      inline def VERY_LARGE_=(x: `24`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERY_LARGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.FontSizes.VERY_SMALL")
      @js.native
      def VERY_SMALL: `9` = js.native
      inline def VERY_SMALL_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERY_SMALL")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Creates a four function calculator object to control the calculator embedded in the DOM element specified by element.
      */
    inline def FourFunctionCalculator(element: HTMLElement): BasicCalculator = ^.asInstanceOf[js.Dynamic].applyDynamic("FourFunctionCalculator")(element.asInstanceOf[js.Any]).asInstanceOf[BasicCalculator]
    inline def FourFunctionCalculator(element: HTMLElement, options: AdditionalFunctions): BasicCalculator = (^.asInstanceOf[js.Dynamic].applyDynamic("FourFunctionCalculator")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BasicCalculator]
    
    /**
      * Creates a calculator object to control the calculator embedded in the DOM element specified by element.
      */
    inline def GraphingCalculator(element: HTMLElement): Calculator = ^.asInstanceOf[js.Dynamic].applyDynamic("GraphingCalculator")(element.asInstanceOf[js.Any]).asInstanceOf[Calculator]
    inline def GraphingCalculator(element: HTMLElement, options: GraphConfiguration & GraphSettings): Calculator = (^.asInstanceOf[js.Dynamic].applyDynamic("GraphingCalculator")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Calculator]
    
    /**
      * The labelOrientation property specifies the desired position of a point's label, relative to the point itself.
      * This will override the calculator's default behavior of trying to position labels in such a way as to maintain legibility. To restore this behavior,
      * set the value back to Desmos.LabelOrientations.DEFAULT.
      * The default value is Desmos.LabelOrientations.DEFAULT.
      */
    object LabelOrientations {
      
      @JSGlobal("Desmos.LabelOrientations")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.LabelOrientations.ABOVE")
      @js.native
      def ABOVE: typings.desmos.desmosStrings.ABOVE = js.native
      inline def ABOVE_=(x: ABOVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOVE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelOrientations.BELOW")
      @js.native
      def BELOW: typings.desmos.desmosStrings.BELOW = js.native
      inline def BELOW_=(x: BELOW): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BELOW")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelOrientations.DEFAULT")
      @js.native
      def DEFAULT: typings.desmos.desmosStrings.DEFAULT = js.native
      inline def DEFAULT_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelOrientations.LEFT")
      @js.native
      def LEFT: typings.desmos.desmosStrings.LEFT = js.native
      inline def LEFT_=(x: LEFT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelOrientations.RIGHT")
      @js.native
      def RIGHT: typings.desmos.desmosStrings.RIGHT = js.native
      inline def RIGHT_=(x: RIGHT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    }
    
    /**
      * The labelSize property specifies the text size of a point's label.
      * The default value is Desmos.LabelSizes.MEDIUM.
      */
    object LabelSizes {
      
      @JSGlobal("Desmos.LabelSizes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.LabelSizes.LARGE")
      @js.native
      def LARGE: typings.desmos.desmosStrings.LARGE = js.native
      inline def LARGE_=(x: LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelSizes.MEDIUM")
      @js.native
      def MEDIUM: typings.desmos.desmosStrings.MEDIUM = js.native
      inline def MEDIUM_=(x: MEDIUM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.LabelSizes.SMALL")
      @js.native
      def SMALL: typings.desmos.desmosStrings.SMALL = js.native
      inline def SMALL_=(x: SMALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Creates a scientific calculator object to control the calculator embedded in the DOM element specified by element.
      */
    inline def ScientificCalculator(element: HTMLElement): BasicCalculator = ^.asInstanceOf[js.Dynamic].applyDynamic("ScientificCalculator")(element.asInstanceOf[js.Any]).asInstanceOf[BasicCalculator]
    inline def ScientificCalculator(element: HTMLElement, options: Autosize): BasicCalculator = (^.asInstanceOf[js.Dynamic].applyDynamic("ScientificCalculator")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BasicCalculator]
    
    /**
      * Drawing styles for points and curves may be chosen from a set of predefined values.
      */
    object Styles {
      
      @JSGlobal("Desmos.Styles")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.Styles.CROSS")
      @js.native
      def CROSS: typings.desmos.desmosStrings.CROSS = js.native
      inline def CROSS_=(x: CROSS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CROSS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Styles.DASHED")
      @js.native
      def DASHED: typings.desmos.desmosStrings.DASHED = js.native
      inline def DASHED_=(x: DASHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DASHED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Styles.DOTTED")
      @js.native
      def DOTTED: typings.desmos.desmosStrings.DOTTED = js.native
      inline def DOTTED_=(x: DOTTED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOTTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Styles.OPEN")
      @js.native
      def OPEN: typings.desmos.desmosStrings.OPEN = js.native
      inline def OPEN_=(x: OPEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Styles.POINT")
      @js.native
      def POINT: typings.desmos.desmosStrings.POINT = js.native
      inline def POINT_=(x: POINT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.Styles.SOLID")
      @js.native
      def SOLID: typings.desmos.desmosStrings.SOLID = js.native
      inline def SOLID_=(x: SOLID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOLID")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Which features are enabled for your API key.
      */
    object enabledFeatures {
      
      @JSGlobal("Desmos.enabledFeatures")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Desmos.enabledFeatures.FourFunctionCalculator")
      @js.native
      def FourFunctionCalculator: Boolean = js.native
      inline def FourFunctionCalculator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourFunctionCalculator")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.enabledFeatures.GraphingCalculator")
      @js.native
      def GraphingCalculator: Boolean = js.native
      inline def GraphingCalculator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphingCalculator")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Desmos.enabledFeatures.ScientificCalculator")
      @js.native
      def ScientificCalculator: Boolean = js.native
      inline def ScientificCalculator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScientificCalculator")(x.asInstanceOf[js.Any])
    }
    
    inline def imageFileToDataURL(file: File, cb: js.Function2[/* err */ js.Error, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imageFileToDataURL")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * An array of language codes suitable for passing into Calculator.updateSettings.
      */
    @JSGlobal("Desmos.supportedLanguages")
    @js.native
    val supportedLanguages: js.Array[String] = js.native
  }
}
