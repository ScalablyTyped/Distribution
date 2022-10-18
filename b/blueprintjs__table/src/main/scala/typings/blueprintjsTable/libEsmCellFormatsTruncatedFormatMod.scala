package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCellFormatsTruncatedFormatMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat")
  @js.native
  open class TruncatedFormat protected () extends PureComponent[TruncatedFormatProps, ITruncatedFormatState, Any] {
    def this(props: TruncatedFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TruncatedFormatProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTruncatedFormat(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTruncatedFormat(): Unit = js.native
    
    /* private */ var contentDiv: Any = js.native
    
    /* private */ var handleContentDivRef: Any = js.native
    
    /* private */ var handlePopoverClose: Any = js.native
    
    /* private */ var handlePopoverOpen: Any = js.native
    
    /* private */ var renderPopover: Any = js.native
    
    /* private */ var setTruncationState: Any = js.native
    
    /* private */ var shouldShowPopover: Any = js.native
  }
  /* static members */
  object TruncatedFormat {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat.defaultProps")
    @js.native
    def defaultProps: TruncatedFormatProps = js.native
    inline def defaultProps_=(x: TruncatedFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TruncatedPopoverMode extends StObject
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedPopoverMode")
  @js.native
  object TruncatedPopoverMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TruncatedPopoverMode & String] = js.native
    
    @js.native
    sealed trait ALWAYS
      extends StObject
         with TruncatedPopoverMode
    /* "always" */ val ALWAYS: typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.ALWAYS & String = js.native
    
    @js.native
    sealed trait NEVER
      extends StObject
         with TruncatedPopoverMode
    /* "never" */ val NEVER: typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.NEVER & String = js.native
    
    @js.native
    sealed trait WHEN_TRUNCATED
      extends StObject
         with TruncatedPopoverMode
    /* "when-truncated" */ val WHEN_TRUNCATED: typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED & String = js.native
    
    @js.native
    sealed trait WHEN_TRUNCATED_APPROX
      extends StObject
         with TruncatedPopoverMode
    /* "when-truncated-approx" */ val WHEN_TRUNCATED_APPROX: typings.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED_APPROX & String = js.native
  }
  
  trait ITrucatedFormateMeasureByApproximateOptions extends StObject {
    
    /**
      * Approximate character width (in pixels), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      *
      * @default 8
      */
    var approximateCharWidth: Double
    
    /**
      * Approximate line height (in pixels), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles, but should be changed if the fonts or styles are changed significantly.
      *
      * @default 18
      */
    var approximateLineHeight: Double
    
    /**
      * Total horizonal cell padding (both sides), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      *
      * @default 20
      */
    var cellHorizontalPadding: Double
    
    /**
      * Number of buffer lines desired, used to determine whether to display the popover in approx truncation mode.
      * Buffer lines are extra lines at the bottom of the cell that space is made for, to make sure that the cell text will fit
      * after the math calculates how many lines the text is expected to take.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      *
      * @default 0
      */
    var numBufferLines: Double
  }
  object ITrucatedFormateMeasureByApproximateOptions {
    
    inline def apply(
      approximateCharWidth: Double,
      approximateLineHeight: Double,
      cellHorizontalPadding: Double,
      numBufferLines: Double
    ): ITrucatedFormateMeasureByApproximateOptions = {
      val __obj = js.Dynamic.literal(approximateCharWidth = approximateCharWidth.asInstanceOf[js.Any], approximateLineHeight = approximateLineHeight.asInstanceOf[js.Any], cellHorizontalPadding = cellHorizontalPadding.asInstanceOf[js.Any], numBufferLines = numBufferLines.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrucatedFormateMeasureByApproximateOptions]
    }
    
    extension [Self <: ITrucatedFormateMeasureByApproximateOptions](x: Self) {
      
      inline def setApproximateCharWidth(value: Double): Self = StObject.set(x, "approximateCharWidth", value.asInstanceOf[js.Any])
      
      inline def setApproximateLineHeight(value: Double): Self = StObject.set(x, "approximateLineHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHorizontalPadding(value: Double): Self = StObject.set(x, "cellHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setNumBufferLines(value: Double): Self = StObject.set(x, "numBufferLines", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITruncatedFormatProps
    extends StObject
       with IProps {
    
    var children: js.UndefOr[String] = js.undefined
    
    /**
      * Should the component keep track of the truncation state of the string content. If true, the
      * value of `truncateLength` is ignored. When combined with a `showPopover` value of
      * `WHEN_TRUNCATED`, popovers will only render when necessary.
      *
      * @default false;
      */
    var detectTruncation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Values to use for character width, line height, cell padding, and buffer lines desired, when using approximate truncation.
      * These values are used to guess at the size of the text and determine if the popover should be drawn. They should work well
      * enough for default table styles, but may need to be overridden for more accuracy if the default styles or font size, etc
      * are changed.
      */
    var measureByApproxOptions: js.UndefOr[ITrucatedFormateMeasureByApproximateOptions] = js.undefined
    
    /**
      * Height of the parent cell. Used by shouldComponentUpdate only
      */
    var parentCellHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the parent cell. Used by shouldComponentUpdate only
      */
    var parentCellWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the popover content style to `white-space: pre` if `true` or
      * `white-space: normal` if `false`.
      *
      * @default false
      */
    var preformatted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures when the popover is shown with the `TruncatedPopoverMode` enum.
      *
      * The enum values are:
      * - `ALWAYS`: show the popover.
      * - `NEVER`: don't show the popover.
      * - `WHEN_TRUNCATED`: show the popover only when the text is truncated (default).
      * - `WHEN_TRUNCATED_APPROX`: show the popover only when the text is trunctated, but use
      *   a formula to calculate this based on text length, which is faster but less accurate.
      *
      * @default WHEN_TRUNCATED
      */
    var showPopover: js.UndefOr[TruncatedPopoverMode] = js.undefined
    
    /**
      * Number of characters that are displayed before being truncated and appended with the
      * `truncationSuffix` prop. A value of 0 will disable truncation. This prop is ignored if
      * `detectTruncation` is `true`.
      *
      * @default 2000
      */
    var truncateLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The string that is appended to the display string if it is truncated.
      *
      * @default "..."
      */
    var truncationSuffix: js.UndefOr[String] = js.undefined
  }
  object ITruncatedFormatProps {
    
    inline def apply(): ITruncatedFormatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITruncatedFormatProps]
    }
    
    extension [Self <: ITruncatedFormatProps](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDetectTruncation(value: Boolean): Self = StObject.set(x, "detectTruncation", value.asInstanceOf[js.Any])
      
      inline def setDetectTruncationUndefined: Self = StObject.set(x, "detectTruncation", js.undefined)
      
      inline def setMeasureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): Self = StObject.set(x, "measureByApproxOptions", value.asInstanceOf[js.Any])
      
      inline def setMeasureByApproxOptionsUndefined: Self = StObject.set(x, "measureByApproxOptions", js.undefined)
      
      inline def setParentCellHeight(value: Double): Self = StObject.set(x, "parentCellHeight", value.asInstanceOf[js.Any])
      
      inline def setParentCellHeightUndefined: Self = StObject.set(x, "parentCellHeight", js.undefined)
      
      inline def setParentCellWidth(value: Double): Self = StObject.set(x, "parentCellWidth", value.asInstanceOf[js.Any])
      
      inline def setParentCellWidthUndefined: Self = StObject.set(x, "parentCellWidth", js.undefined)
      
      inline def setPreformatted(value: Boolean): Self = StObject.set(x, "preformatted", value.asInstanceOf[js.Any])
      
      inline def setPreformattedUndefined: Self = StObject.set(x, "preformatted", js.undefined)
      
      inline def setShowPopover(value: TruncatedPopoverMode): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
      
      inline def setShowPopoverUndefined: Self = StObject.set(x, "showPopover", js.undefined)
      
      inline def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
      
      inline def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
      
      inline def setTruncationSuffix(value: String): Self = StObject.set(x, "truncationSuffix", value.asInstanceOf[js.Any])
      
      inline def setTruncationSuffixUndefined: Self = StObject.set(x, "truncationSuffix", js.undefined)
    }
  }
  
  trait ITruncatedFormatState extends StObject {
    
    var isPopoverOpen: js.UndefOr[Boolean] = js.undefined
    
    var isTruncated: js.UndefOr[Boolean] = js.undefined
  }
  object ITruncatedFormatState {
    
    inline def apply(): ITruncatedFormatState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITruncatedFormatState]
    }
    
    extension [Self <: ITruncatedFormatState](x: Self) {
      
      inline def setIsPopoverOpen(value: Boolean): Self = StObject.set(x, "isPopoverOpen", value.asInstanceOf[js.Any])
      
      inline def setIsPopoverOpenUndefined: Self = StObject.set(x, "isPopoverOpen", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "isTruncated", js.undefined)
    }
  }
  
  type TruncatedFormatProps = ITruncatedFormatProps
}
