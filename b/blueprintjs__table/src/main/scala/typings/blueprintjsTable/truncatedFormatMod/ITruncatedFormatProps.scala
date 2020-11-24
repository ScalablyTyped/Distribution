package typings.blueprintjsTable.truncatedFormatMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITruncatedFormatProps extends IProps {
  
  var children: js.UndefOr[String] = js.native
  
  /**
    * Should the component keep track of the truncation state of the string content. If true, the
    * value of `truncateLength` is ignored. When combined with a `showPopover` value of
    * `WHEN_TRUNCATED`, popovers will only render when necessary.
    * @default false;
    */
  var detectTruncation: js.UndefOr[Boolean] = js.native
  
  /**
    * Values to use for character width, line height, cell padding, and buffer lines desired, when using approximate truncation.
    * These values are used to guess at the size of the text and determine if the popover should be drawn. They should work well
    * enough for default table styles, but may need to be overridden for more accuracy if the default styles or font size, etc
    * are changed.
    */
  var measureByApproxOptions: js.UndefOr[ITrucatedFormateMeasureByApproximateOptions] = js.native
  
  /**
    * Height of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellWidth: js.UndefOr[Double] = js.native
  
  /**
    * Sets the popover content style to `white-space: pre` if `true` or
    * `white-space: normal` if `false`.
    * @default false
    */
  var preformatted: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures when the popover is shown with the `TruncatedPopoverMode` enum.
    *
    * The enum values are:
    * - `ALWAYS`: show the popover.
    * - `NEVER`: don't show the popover.
    * - `WHEN_TRUNCATED`: show the popover only when the text is truncated (default).
    * - `WHEN_TRUNCATED_APPROX`: show the popover only when the text is trunctated, but use
    *   a formula to calculate this based on text length, which is faster but less accurate.
    * @default WHEN_TRUNCATED
    */
  var showPopover: js.UndefOr[TruncatedPopoverMode] = js.native
  
  /**
    * Number of characters that are displayed before being truncated and appended with the
    * `truncationSuffix` prop. A value of 0 will disable truncation. This prop is ignored if
    * `detectTruncation` is `true`.
    * @default 2000
    */
  var truncateLength: js.UndefOr[Double] = js.native
  
  /**
    * The string that is appended to the display string if it is truncated.
    * @default "..."
    */
  var truncationSuffix: js.UndefOr[String] = js.native
}
object ITruncatedFormatProps {
  
  @scala.inline
  def apply(): ITruncatedFormatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITruncatedFormatProps]
  }
  
  @scala.inline
  implicit class ITruncatedFormatPropsOps[Self <: ITruncatedFormatProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDetectTruncation(value: Boolean): Self = this.set("detectTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectTruncation: Self = this.set("detectTruncation", js.undefined)
    
    @scala.inline
    def setMeasureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): Self = this.set("measureByApproxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureByApproxOptions: Self = this.set("measureByApproxOptions", js.undefined)
    
    @scala.inline
    def setParentCellHeight(value: Double): Self = this.set("parentCellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentCellHeight: Self = this.set("parentCellHeight", js.undefined)
    
    @scala.inline
    def setParentCellWidth(value: Double): Self = this.set("parentCellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentCellWidth: Self = this.set("parentCellWidth", js.undefined)
    
    @scala.inline
    def setPreformatted(value: Boolean): Self = this.set("preformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreformatted: Self = this.set("preformatted", js.undefined)
    
    @scala.inline
    def setShowPopover(value: TruncatedPopoverMode): Self = this.set("showPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopover: Self = this.set("showPopover", js.undefined)
    
    @scala.inline
    def setTruncateLength(value: Double): Self = this.set("truncateLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncateLength: Self = this.set("truncateLength", js.undefined)
    
    @scala.inline
    def setTruncationSuffix(value: String): Self = this.set("truncationSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncationSuffix: Self = this.set("truncationSuffix", js.undefined)
  }
}
