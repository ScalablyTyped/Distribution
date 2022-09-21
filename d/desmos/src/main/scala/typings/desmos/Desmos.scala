package typings.desmos

import org.scalablytyped.runtime.StringDictionary
import typings.desmos.anon.AllowUndo
import typings.desmos.anon.Bottom
import typings.desmos.anon.DragMode
import typings.desmos.anon.ErrorMessage
import typings.desmos.anon.Format
import typings.desmos.anon.GraphConfigurationGraphSe
import typings.desmos.anon.Height
import typings.desmos.anon.Id
import typings.desmos.anon.ListValue
import typings.desmos.anon.MathCoordinates
import typings.desmos.anon.X
import typings.desmos.anon.XY
import typings.desmos.anon.Y
import typings.desmos.anon.`0`
import typings.desmos.desmosStrings.BOTH
import typings.desmos.desmosStrings.NONE
import typings.desmos.desmosStrings.POSITIVE
import typings.desmos.desmosStrings.nemeth
import typings.desmos.desmosStrings.none_
import typings.desmos.desmosStrings.ueb
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Desmos {
  
  /* Inlined parent std.Pick<desmos.Desmos.Calculator, 'getState' | 'setState' | 'setBlank' | 'undo' | 'redo' | 'clearHistory' | 'resize' | 'focusFirstExpression' | 'observeEvent' | 'unobserveEvent' | 'destroy'> */
  @js.native
  trait BasicCalculator extends StObject {
    
    def clearHistory(): Unit = js.native
    @JSName("clearHistory")
    var clearHistory_Original: js.Function0[Unit] = js.native
    
    def destroy(): Unit = js.native
    @JSName("destroy")
    var destroy_Original: js.Function0[Unit] = js.native
    
    def focusFirstExpression(): Unit = js.native
    @JSName("focusFirstExpression")
    var focusFirstExpression_Original: js.Function0[Unit] = js.native
    
    def getState(): GraphState = js.native
    @JSName("getState")
    var getState_Original: js.Function0[GraphState] = js.native
    
    def observeEvent(eventName: String, callback: js.Function0[Unit]): Unit = js.native
    @JSName("observeEvent")
    var observeEvent_Original: js.Function2[/* eventName */ String, /* callback */ js.Function0[Unit], Unit] = js.native
    
    def redo(): Unit = js.native
    @JSName("redo")
    var redo_Original: js.Function0[Unit] = js.native
    
    def resize(): Unit = js.native
    @JSName("resize")
    var resize_Original: js.Function0[Unit] = js.native
    
    def setBlank(): Unit = js.native
    def setBlank(options: `0`): Unit = js.native
    @JSName("setBlank")
    var setBlank_Original: js.Function1[/* options */ js.UndefOr[`0`], Unit] = js.native
    
    def setState(obj: GraphState): Unit = js.native
    def setState(obj: GraphState, options: AllowUndo): Unit = js.native
    @JSName("setState")
    var setState_Original: js.Function2[/* obj */ GraphState, /* options */ js.UndefOr[AllowUndo], Unit] = js.native
    
    def undo(): Unit = js.native
    @JSName("undo")
    var undo_Original: js.Function0[Unit] = js.native
    
    def unobserveEvent(eventName: String): Unit = js.native
    @JSName("unobserveEvent")
    var unobserveEvent_Original: js.Function1[/* eventName */ String, Unit] = js.native
    
    @JSName("updateSettings")
    def updateSettings_1(
      settings: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(element : std.HTMLElement, options : desmos.anon.AdditionalFunctions | undefined): desmos.Desmos.BasicCalculator>[1] */ js.Any
    ): Unit = js.native
  }
  
  /**
    * The page element which will display your axes, grid-lines, equations, and points.
    */
  @js.native
  trait Calculator extends StObject {
    
    def HelperExpression(expression: ExpressionState): ListValue = js.native
    
    def asyncScreenshot(callback: js.Function1[/* dataUri */ String, Unit]): Unit = js.native
    // methods
    /**
      * Similar to GraphingCalculator.screenshot, but asynchronous. Rather than returning a PNG data URI directly,
      * callback will be called with the either a URI string or SVG string as its argument.
      */
    @JSName("asyncScreenshot")
    def asyncScreenshot_0(
      opts: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(opts : desmos.anon.Height | undefined): string>[0] */ js.Any) & Format,
      callback: js.Function1[/* dataUri */ String, Unit]
    ): Unit = js.native
    
    /**
      * Clear the undo/redo history. Does not affect the current state.
      */
    def clearHistory(): Unit = js.native
    
    // properties
    /**
      * Calculator instance's current color palette
      */
    var colors: StringDictionary[String] = js.native
    
    /**
      * Destroy the GraphingCalculator instance, unbind event listeners, and free resources. This method should be called
      * whenever a calculator's container element is removed from the DOM. Attempting to call methods on a GraphingCalculator object after it has been destroyed
      * will result in a no-op and log a warning to the console.
      */
    def destroy(): Unit = js.native
    
    /**
      * An observable object containing information about the calculator's analysis of each expression.
      */
    var expressionAnalysis: StringDictionary[ErrorMessage] = js.native
    
    /**
      * Focus the first expression in the expressions list. Note that the first expression isn't focused by default
      * because if the calculator is embedded in a page that can be scrolled, the browser will typically scroll the focused expression into view
      * at page load time, which may not be desirable.
      */
    def focusFirstExpression(): Unit = js.native
    
    /**
      * Returns a representation of the current expressions list as an array.
      */
    def getExpressions(): js.Array[ExpressionState] = js.native
    
    /**
      * Returns a javascript object representing the current state of the calculator. Use in conjunction with GraphingCalculator.setState to save and restore calculator states.
      * The return value of GraphingCalculator.getState may be serialized to a string using JSON.stringify.
      * Warning: Calculator states should be treated as opaque values. Manipulating states directly may produce a result that cannot be loaded by GraphingCalculator.setState.
      */
    def getState(): GraphState = js.native
    
    /**
      * The graphpaperBounds observable property gives the bounds of the graphpaper in both math coordinates and pixel coordinates.
      */
    var graphpaperBounds: MathCoordinates = js.native
    
    /**
      * true when an expression is selected, false when no expression is selected.
      */
    var isAnyExpressionSelected: Boolean = js.native
    
    /**
      * Whether or not the current viewport projection is uniform with respect to both axes (i.e., the mathematical aspect ratio is square).
      */
    def isProjectionUniform(): Boolean = js.native
    
    /**
      * Convert math coordinates to pixel coordinates.
      */
    def mathToPixels[C /* <: X | Y | XY */](coords: C): C = js.native
    
    /**
      * Update the settings.randomSeed property to a new random value.
      */
    def newRandomSeed(): Unit = js.native
    
    def observe(eventName: String, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * The 'change' event is emitted by the calculator whenever any change occurs that will affect the persisted state of the calculator.
      * This applies to any changes caused either by direct user interaction, or by calls to API methods.
      * Observing the 'change' event allows implementing periodic saving of a user's work without the need for polling.
      */
    def observeEvent(eventName: String, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Convert pixel coordinates to math coordinates.
      */
    def pixelsToMath[C /* <: X | Y | XY */](coords: C): C = js.native
    
    /**
      * Advance to the next state in the undo/redo history, if available.
      */
    def redo(): Unit = js.native
    
    /**
      * Remove an expression from the expressions list.
      */
    def removeExpression(expression_state: Id): Unit = js.native
    
    /**
      * Remove several expressions from the expressions list.
      */
    def removeExpressions(expression_states: js.Array[Id]): Unit = js.native
    
    /**
      * Remove the selected expression. Returns the id of the expression that was removed, or undefined if no expression was selected.
      */
    def removeSelected(): String = js.native
    
    /**
      * Resize the calculator to fill its container. This will happen automatically unless the autosize constructor option is set to false.
      * In that case, this method must be called whenever the dimensions of the calculator's container element change, and whenever the container element is added to or removed from the DOM.
      */
    def resize(): Unit = js.native
    
    /**
      * Returns an image of the current graphpaper in the form of a PNG data URI. You can use the returned data URI directly in the src attribute of an image.
      * To save the data as a traditional image file, you can parse the data and base64 decode it.
      */
    def screenshot(): String = js.native
    def screenshot(opts: Height): String = js.native
    
    /**
      * Observable property that holds the id of the currently selected expression, or undefined when no expression is selected.
      */
    var selectedExpressionId: String = js.native
    
    /**
      * Reset the calculator to a blank state.
      */
    def setBlank(): Unit = js.native
    def setBlank(options: `0`): Unit = js.native
    
    /**
      * Replace the calculator's "Delete All" button (under the "Edit List" menu) with a "Reset" button that will reset the calculator to the state
      * represented by obj. Also, if a default state is set, the "home" zoom button will reset the zoom to the viewport associated with the default state instead of the usual Desmos default
      * (roughly from -10 to 10, centered at the origin). If the showResetButtonOnGraphpaper option is true, a small reset button will appear on the graphpaper.
      */
    def setDefaultState(obj: GraphState): Unit = js.native
    
    /**
      * This will update or create a mathematical expression.
      */
    def setExpression(expression: ExpressionState): Unit = js.native
    
    /**
      * This function will attempt to create expressions for each element in the array.
      */
    def setExpressions(expressions: js.Array[ExpressionState]): Unit = js.native
    
    /**
      * Updates the math coordinates of the graphpaper bounds.
      * If invalid bounds are provided, the graphpaper bounds will not be changed.
      */
    def setMathBounds(bounds: Bottom): Unit = js.native
    
    /**
      * Reset the calculator to a state previously saved using GraphingCalculator.getState.
      */
    def setState(obj: GraphState): Unit = js.native
    def setState(obj: GraphState, options: AllowUndo): Unit = js.native
    
    /**
      * Object with observable properties for each public property.
      */
    var settings: GraphConfigurationGraphSe = js.native
    
    /**
      * Language codes suitable for passing into Calculator.updateSettings.
      */
    var supportedLanguages: js.Array[String] = js.native
    
    /**
      * Return to the previous state in the undo/redo history, if available.
      */
    def undo(): Unit = js.native
    
    def unobserve(eventName: String): Unit = js.native
    
    /**
      * Remove all observers added by GraphingCalculator.observeEvent('change'). For finer control over removing observers, see the section on managing observers.
      */
    def unobserveEvent(eventName: String): Unit = js.native
    
    /**
      * Updates any of the properties allowed in the constructor. Only properties that are present will be changed.
      * Also note that certain combinations of options are mutually exclusive. If an update would produce incompatible options,
      * additional options may be ignored or adjusted to obtain a compatible set. To prevent the calculator from making those adjustments on your behalf,
      * you should avoid passing in the following combinations:
      * - graphpaper: false with expressionsCollapsed: true or zoomButtons: true
      * - lockViewport: true with zoomButtons: true
      */
    def updateSettings(settings: GraphConfiguration & GraphSettings): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.desmos.anon.Color
    - typings.desmos.anon.Columns
  */
  trait ExpressionState extends StObject
  object ExpressionState {
    
    inline def Color(): typings.desmos.anon.Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.desmos.anon.Color]
    }
    
    inline def Columns(columns: js.Array[DragMode]): typings.desmos.anon.Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("table")
      __obj.asInstanceOf[typings.desmos.anon.Columns]
    }
  }
  
  trait GraphConfiguration extends StObject {
    
    /**
      * Allow creating secret folders
      * @default false
      */
    var administerSecretFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine whether the calculator should automatically resize whenever there are changes to element's dimensions. If set to false you will need to
      * explicitly call .resize() in certain situations. See .resize().
      * @default true
      */
    var autosize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a subtle 1px gray border around the entire calculator
      * @default true
      */
    var border: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show Braille controls in the settings menu and enable shortcut keys for switching between Braille modes.
      * @default true
      */
    var brailleControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * none'   Set the input and output Braille code for persons using refreshable Braille displays. Valid options are 'nemeth', 'ueb', or 'none'.
      * @default "none"
      */
    var brailleMode: js.UndefOr[nemeth | ueb | none_] = js.undefined
    
    /**
      * Limit the size of an expression to 100 characters
      * @default false
      */
    var capExpressionSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, clearing the graph through the UI or calling setBlank() will leave the calculator in degreeMode. Note that, if a default state is set,
      * resetting the graph through the UI will result in the calculator's degreeMode matching the mode of that state, regardless of this option.
      * @default false
      */
    var clearIntoDegreeMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The color palette that the calculator will cycle through. See the Colors section.
      */
    var colors: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * When true, users are able to toggle between decimal and fraction output in evaluations if Desmos detects a good rational approximation.
      * @default true
      */
    var decimalToFraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable functions related to univariate data visualizations, statistical distributions, and hypothesis testing
      * @default true
      */
    var distributions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the expressions list
      * @default true
      */
    var expressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collapse the expressions list
      * @default false
      */
    var expressionsCollapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the bar on top of the expressions list
      * @default true
      */
    var expressionsTopbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the creation of folders in the expressions list
      * @default true
      */
    var folders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Base font size.
      * @default 16
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Force distance and midpoint functions to be enabled, even if restrictedFunctions is set to true. In that case the geometry functions will also be added to the the "Misc" keypad
      * @default false
      */
    var forceEnableGeometryFunctions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, all linearizable regression models will have log mode enabled by default, and the checkbox used to toggle log mode will be hidden from the expression interface.
      * @default false
      */
    var forceLogModeRegressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the graphpaper
      * @default true
      */
    var graphpaper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify custom processing for user-uploaded images. See Image Uploads for more details.
      * @param file comment for stuff
      */
    var imageUploadCallback: js.UndefOr[
        js.Function2[
          /* file */ File, 
          /* cb */ js.Function2[/* err */ js.Error, /* url */ String, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Allow adding images
      * @default true
      */
    var images: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display the calculator with an inverted color scheme.
      * @default false
      */
    var invertedColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the onscreen keypad.
      * @default true
      */
    var keypad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Language. See the https://www.desmos.com/api/v1.6/docs/index.html#document-languages for more information.
      * @default "en"
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Allow hyperlinks in notes/folders, and links to help documentation in the expressions list (e.g. regressions with negative R2 values or plots with unresolved detail)
      * @default true
      */
    var links: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable user panning and zooming graphpaper
      * @default false
      */
    var lockViewport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the creation of text notes in the expressions list
      * @default true
      */
    var notes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Paste a valid desmos graph URL to import that graph
      * @default false
      */
    var pasteGraphLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Paste validly formatted table data to create a table up to 50 rows
      * @default true
      */
    var pasteTableData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine whether the calculator should plot implicit equations and inequalities
      * @default true
      */
    var plotImplicits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine whether the calculator should plot inequalities
      * @default true
      */
    var plotInequalities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine whether the calculator should plot single-variable implicit equations
      * @default true
      */
    var plotSingleVariableImplicitEquations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show Points of Interest (POIs) as gray dots that can be clicked on
      * @default true
      */
    var pointsOfInterest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, fonts and line thicknesses are increased to aid legibility.
      * @default false
      */
    var projectorMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display the keypad in QWERTY layout (false shows an alphabetical layout)
      * @default true
      */
    var qwertyKeyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show a restricted menu of available functions
      * @default false
      */
    var restrictedFunctions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the settings wrench, for changing graph display
      * @default true
      */
    var settingsMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a default state is set, show an onscreen reset button
      * @default false
      */
    var showResetButtonOnGraphpaper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow users to write six-dot Braille characters using the Home Row keys (S, D, F, J, K, and L). Requires that brailleMode be 'nemeth' or 'ueb'.
      * @default false
      */
    var sixKeyInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow the creation of sliders in the expressions list
      * @default true
      */
    var sliders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow tracing curves to inspect coordinates, and showing point coordinates when clicked
      * @default true
      */
    var trace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show onscreen zoom buttons
      * @default true
      */
    var zoomButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, tables and distributions will display an icon that allows the user to automatically snap the viewport to appropriate bounds for viewing that expression.
      * @default true
      */
    var zoomFit: js.UndefOr[Boolean] = js.undefined
  }
  object GraphConfiguration {
    
    inline def apply(): GraphConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphConfiguration]
    }
    
    extension [Self <: GraphConfiguration](x: Self) {
      
      inline def setAdministerSecretFolders(value: Boolean): Self = StObject.set(x, "administerSecretFolders", value.asInstanceOf[js.Any])
      
      inline def setAdministerSecretFoldersUndefined: Self = StObject.set(x, "administerSecretFolders", js.undefined)
      
      inline def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBrailleControls(value: Boolean): Self = StObject.set(x, "brailleControls", value.asInstanceOf[js.Any])
      
      inline def setBrailleControlsUndefined: Self = StObject.set(x, "brailleControls", js.undefined)
      
      inline def setBrailleMode(value: nemeth | ueb | none_): Self = StObject.set(x, "brailleMode", value.asInstanceOf[js.Any])
      
      inline def setBrailleModeUndefined: Self = StObject.set(x, "brailleMode", js.undefined)
      
      inline def setCapExpressionSize(value: Boolean): Self = StObject.set(x, "capExpressionSize", value.asInstanceOf[js.Any])
      
      inline def setCapExpressionSizeUndefined: Self = StObject.set(x, "capExpressionSize", js.undefined)
      
      inline def setClearIntoDegreeMode(value: Boolean): Self = StObject.set(x, "clearIntoDegreeMode", value.asInstanceOf[js.Any])
      
      inline def setClearIntoDegreeModeUndefined: Self = StObject.set(x, "clearIntoDegreeMode", js.undefined)
      
      inline def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDecimalToFraction(value: Boolean): Self = StObject.set(x, "decimalToFraction", value.asInstanceOf[js.Any])
      
      inline def setDecimalToFractionUndefined: Self = StObject.set(x, "decimalToFraction", js.undefined)
      
      inline def setDistributions(value: Boolean): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
      
      inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
      
      inline def setExpressions(value: Boolean): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsCollapsed(value: Boolean): Self = StObject.set(x, "expressionsCollapsed", value.asInstanceOf[js.Any])
      
      inline def setExpressionsCollapsedUndefined: Self = StObject.set(x, "expressionsCollapsed", js.undefined)
      
      inline def setExpressionsTopbar(value: Boolean): Self = StObject.set(x, "expressionsTopbar", value.asInstanceOf[js.Any])
      
      inline def setExpressionsTopbarUndefined: Self = StObject.set(x, "expressionsTopbar", js.undefined)
      
      inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      inline def setFolders(value: Boolean): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setForceEnableGeometryFunctions(value: Boolean): Self = StObject.set(x, "forceEnableGeometryFunctions", value.asInstanceOf[js.Any])
      
      inline def setForceEnableGeometryFunctionsUndefined: Self = StObject.set(x, "forceEnableGeometryFunctions", js.undefined)
      
      inline def setForceLogModeRegressions(value: Boolean): Self = StObject.set(x, "forceLogModeRegressions", value.asInstanceOf[js.Any])
      
      inline def setForceLogModeRegressionsUndefined: Self = StObject.set(x, "forceLogModeRegressions", js.undefined)
      
      inline def setGraphpaper(value: Boolean): Self = StObject.set(x, "graphpaper", value.asInstanceOf[js.Any])
      
      inline def setGraphpaperUndefined: Self = StObject.set(x, "graphpaper", js.undefined)
      
      inline def setImageUploadCallback(
        value: (/* file */ File, /* cb */ js.Function2[/* err */ js.Error, /* url */ String, Unit]) => Unit
      ): Self = StObject.set(x, "imageUploadCallback", js.Any.fromFunction2(value))
      
      inline def setImageUploadCallbackUndefined: Self = StObject.set(x, "imageUploadCallback", js.undefined)
      
      inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setInvertedColors(value: Boolean): Self = StObject.set(x, "invertedColors", value.asInstanceOf[js.Any])
      
      inline def setInvertedColorsUndefined: Self = StObject.set(x, "invertedColors", js.undefined)
      
      inline def setKeypad(value: Boolean): Self = StObject.set(x, "keypad", value.asInstanceOf[js.Any])
      
      inline def setKeypadUndefined: Self = StObject.set(x, "keypad", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLockViewport(value: Boolean): Self = StObject.set(x, "lockViewport", value.asInstanceOf[js.Any])
      
      inline def setLockViewportUndefined: Self = StObject.set(x, "lockViewport", js.undefined)
      
      inline def setNotes(value: Boolean): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setPasteGraphLink(value: Boolean): Self = StObject.set(x, "pasteGraphLink", value.asInstanceOf[js.Any])
      
      inline def setPasteGraphLinkUndefined: Self = StObject.set(x, "pasteGraphLink", js.undefined)
      
      inline def setPasteTableData(value: Boolean): Self = StObject.set(x, "pasteTableData", value.asInstanceOf[js.Any])
      
      inline def setPasteTableDataUndefined: Self = StObject.set(x, "pasteTableData", js.undefined)
      
      inline def setPlotImplicits(value: Boolean): Self = StObject.set(x, "plotImplicits", value.asInstanceOf[js.Any])
      
      inline def setPlotImplicitsUndefined: Self = StObject.set(x, "plotImplicits", js.undefined)
      
      inline def setPlotInequalities(value: Boolean): Self = StObject.set(x, "plotInequalities", value.asInstanceOf[js.Any])
      
      inline def setPlotInequalitiesUndefined: Self = StObject.set(x, "plotInequalities", js.undefined)
      
      inline def setPlotSingleVariableImplicitEquations(value: Boolean): Self = StObject.set(x, "plotSingleVariableImplicitEquations", value.asInstanceOf[js.Any])
      
      inline def setPlotSingleVariableImplicitEquationsUndefined: Self = StObject.set(x, "plotSingleVariableImplicitEquations", js.undefined)
      
      inline def setPointsOfInterest(value: Boolean): Self = StObject.set(x, "pointsOfInterest", value.asInstanceOf[js.Any])
      
      inline def setPointsOfInterestUndefined: Self = StObject.set(x, "pointsOfInterest", js.undefined)
      
      inline def setProjectorMode(value: Boolean): Self = StObject.set(x, "projectorMode", value.asInstanceOf[js.Any])
      
      inline def setProjectorModeUndefined: Self = StObject.set(x, "projectorMode", js.undefined)
      
      inline def setQwertyKeyboard(value: Boolean): Self = StObject.set(x, "qwertyKeyboard", value.asInstanceOf[js.Any])
      
      inline def setQwertyKeyboardUndefined: Self = StObject.set(x, "qwertyKeyboard", js.undefined)
      
      inline def setRestrictedFunctions(value: Boolean): Self = StObject.set(x, "restrictedFunctions", value.asInstanceOf[js.Any])
      
      inline def setRestrictedFunctionsUndefined: Self = StObject.set(x, "restrictedFunctions", js.undefined)
      
      inline def setSettingsMenu(value: Boolean): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
      
      inline def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
      
      inline def setShowResetButtonOnGraphpaper(value: Boolean): Self = StObject.set(x, "showResetButtonOnGraphpaper", value.asInstanceOf[js.Any])
      
      inline def setShowResetButtonOnGraphpaperUndefined: Self = StObject.set(x, "showResetButtonOnGraphpaper", js.undefined)
      
      inline def setSixKeyInput(value: Boolean): Self = StObject.set(x, "sixKeyInput", value.asInstanceOf[js.Any])
      
      inline def setSixKeyInputUndefined: Self = StObject.set(x, "sixKeyInput", js.undefined)
      
      inline def setSliders(value: Boolean): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
      
      inline def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setZoomButtons(value: Boolean): Self = StObject.set(x, "zoomButtons", value.asInstanceOf[js.Any])
      
      inline def setZoomButtonsUndefined: Self = StObject.set(x, "zoomButtons", js.undefined)
      
      inline def setZoomFit(value: Boolean): Self = StObject.set(x, "zoomFit", value.asInstanceOf[js.Any])
      
      inline def setZoomFitUndefined: Self = StObject.set(x, "zoomFit", js.undefined)
    }
  }
  
  trait GraphSettings extends StObject {
    
    /**
      * When true, trig functions assume arguments are in degrees. Otherwise, arguments are assumed to be in radians.
      * @default false
      */
    var degreeMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, use a polar grid. Otherwise, use cartesian grid.
      * @default false
      */
    var polarMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show or hide numeric tick labels at successive angles. Only relevant when polarMode is true.
      * @default true
      */
    var polarNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Global random seed used for generating values from the calculator's built-in random() function. See the section on random seeds below.
      * @default ""
      */
    var randomSeed: js.UndefOr[String] = js.undefined
    
    /**
      * Show or hide grid lines on the graph paper.
      * @default true
      */
    var showGrid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show or hide the x axis.
      * @default true
      */
    var showXAxis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show or hide the y axis.
      * @default true
      */
    var showYAxis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether to place arrows at one or both ends of the x axis. See Axis Arrow Modes.
      * @default "NONE"
      */
    var xAxisArrowMode: js.UndefOr[NONE | POSITIVE | BOTH] = js.undefined
    
    /**
      * Label placed below the x axis.
      * @default ""
      */
    var xAxisLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Subdivisions between ticks on the x axis. Must be an integer between 0 and 5. 1 means that only the major grid lines will be shown. When set to 0, subdivisions are chosen automatically.
      * @default 0
      */
    var xAxisMinorSubdivisions: js.UndefOr[Double] = js.undefined
    
    /**
      * Show or hide numeric tick labels on the x axis.
      * @default true
      */
    var xAxisNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Spacing between numeric ticks on the x axis. Will be ignored if set too small to display. When set to 0, tick spacing is chosen automatically.
      * @default 0
      */
    var xAxisStep: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines whether to place arrows at one or both ends of the y axis. See Axis Arrow Modes.
      * @default "NONE"
      */
    var yAxisArrowMode: js.UndefOr[NONE | POSITIVE | BOTH] = js.undefined
    
    /**
      * Label placed beside the y axis.
      * @default ""
      */
    var yAxisLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Subdivisions between ticks on the y axis. Must be an integer between 0 and 5. 1 means that only the major grid lines will be shown. When set to 0, subdivisions are chosen automatically.
      * @default 0
      */
    var yAxisMinorSubdivisions: js.UndefOr[Double] = js.undefined
    
    /**
      * Show or hide numeric tick labels on the y axis.
      * @default true
      */
    var yAxisNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Spacing between numeric ticks on the y axis. Will be ignored if set too small to display. When set to 0, tick spacing is chosen automatically.
      * @default 0
      */
    var yAxisStep: js.UndefOr[Double] = js.undefined
  }
  object GraphSettings {
    
    inline def apply(): GraphSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GraphSettings]
    }
    
    extension [Self <: GraphSettings](x: Self) {
      
      inline def setDegreeMode(value: Boolean): Self = StObject.set(x, "degreeMode", value.asInstanceOf[js.Any])
      
      inline def setDegreeModeUndefined: Self = StObject.set(x, "degreeMode", js.undefined)
      
      inline def setPolarMode(value: Boolean): Self = StObject.set(x, "polarMode", value.asInstanceOf[js.Any])
      
      inline def setPolarModeUndefined: Self = StObject.set(x, "polarMode", js.undefined)
      
      inline def setPolarNumbers(value: Boolean): Self = StObject.set(x, "polarNumbers", value.asInstanceOf[js.Any])
      
      inline def setPolarNumbersUndefined: Self = StObject.set(x, "polarNumbers", js.undefined)
      
      inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
      
      inline def setRandomSeedUndefined: Self = StObject.set(x, "randomSeed", js.undefined)
      
      inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      inline def setShowXAxis(value: Boolean): Self = StObject.set(x, "showXAxis", value.asInstanceOf[js.Any])
      
      inline def setShowXAxisUndefined: Self = StObject.set(x, "showXAxis", js.undefined)
      
      inline def setShowYAxis(value: Boolean): Self = StObject.set(x, "showYAxis", value.asInstanceOf[js.Any])
      
      inline def setShowYAxisUndefined: Self = StObject.set(x, "showYAxis", js.undefined)
      
      inline def setXAxisArrowMode(value: NONE | POSITIVE | BOTH): Self = StObject.set(x, "xAxisArrowMode", value.asInstanceOf[js.Any])
      
      inline def setXAxisArrowModeUndefined: Self = StObject.set(x, "xAxisArrowMode", js.undefined)
      
      inline def setXAxisLabel(value: String): Self = StObject.set(x, "xAxisLabel", value.asInstanceOf[js.Any])
      
      inline def setXAxisLabelUndefined: Self = StObject.set(x, "xAxisLabel", js.undefined)
      
      inline def setXAxisMinorSubdivisions(value: Double): Self = StObject.set(x, "xAxisMinorSubdivisions", value.asInstanceOf[js.Any])
      
      inline def setXAxisMinorSubdivisionsUndefined: Self = StObject.set(x, "xAxisMinorSubdivisions", js.undefined)
      
      inline def setXAxisNumbers(value: Boolean): Self = StObject.set(x, "xAxisNumbers", value.asInstanceOf[js.Any])
      
      inline def setXAxisNumbersUndefined: Self = StObject.set(x, "xAxisNumbers", js.undefined)
      
      inline def setXAxisStep(value: Double): Self = StObject.set(x, "xAxisStep", value.asInstanceOf[js.Any])
      
      inline def setXAxisStepUndefined: Self = StObject.set(x, "xAxisStep", js.undefined)
      
      inline def setYAxisArrowMode(value: NONE | POSITIVE | BOTH): Self = StObject.set(x, "yAxisArrowMode", value.asInstanceOf[js.Any])
      
      inline def setYAxisArrowModeUndefined: Self = StObject.set(x, "yAxisArrowMode", js.undefined)
      
      inline def setYAxisLabel(value: String): Self = StObject.set(x, "yAxisLabel", value.asInstanceOf[js.Any])
      
      inline def setYAxisLabelUndefined: Self = StObject.set(x, "yAxisLabel", js.undefined)
      
      inline def setYAxisMinorSubdivisions(value: Double): Self = StObject.set(x, "yAxisMinorSubdivisions", value.asInstanceOf[js.Any])
      
      inline def setYAxisMinorSubdivisionsUndefined: Self = StObject.set(x, "yAxisMinorSubdivisions", js.undefined)
      
      inline def setYAxisNumbers(value: Boolean): Self = StObject.set(x, "yAxisNumbers", value.asInstanceOf[js.Any])
      
      inline def setYAxisNumbersUndefined: Self = StObject.set(x, "yAxisNumbers", js.undefined)
      
      inline def setYAxisStep(value: Double): Self = StObject.set(x, "yAxisStep", value.asInstanceOf[js.Any])
      
      inline def setYAxisStepUndefined: Self = StObject.set(x, "yAxisStep", js.undefined)
    }
  }
  
  type GraphState = Any
}
