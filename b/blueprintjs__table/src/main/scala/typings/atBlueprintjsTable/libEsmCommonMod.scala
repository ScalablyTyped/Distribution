package typings.atBlueprintjsTable

import typings.atBlueprintjsTable.libEsmCommonRectMod.AnyRect
import typings.react.reactMod.CSSProperties
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TextMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common", JSImport.Namespace)
@js.native
object libEsmCommonMod extends js.Object {
  @js.native
  class Grid protected ()
    extends typings.atBlueprintjsTable.libEsmCommonGridMod.Grid {
    /**
      * This constructor accumulates the heights and widths in `O(n)`, saving
      * time in later calculations.
      *
      * @param bleed - The number of rows/cols that we expand beyond the
      *     viewport (on all sides). This helps avoid displaying an empty
      *     viewport when the user scrolls quickly.
      */
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double]) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double) = this()
    def this(rowHeights: js.Array[Double], columnWidths: js.Array[Double], bleed: Double, ghostHeight: Double) = this()
    def this(
      rowHeights: js.Array[Double],
      columnWidths: js.Array[Double],
      bleed: Double,
      ghostHeight: Double,
      ghostWidth: Double
    ) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typings.atBlueprintjsTable.libEsmCommonRectMod.Rect {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
  }
  
  @js.native
  object Clipboard extends js.Object {
    /**
      * Overrides the inherited CSS of the element to make sure it is
      * selectable. This method also makes the element pseudo-invisible.
      */
    def applySelectableStyles(elem: HTMLElement): HTMLElement = js.native
    /**
      * Copies table cells to the clipboard. The parameter is a row-major
      * 2-dimensional `Array` of strings and can contain nulls. We assume all
      * rows are the same length. If not, the cells will still be copied, but
      * the columns may not align. Returns a boolean indicating whether the
      * copy succeeded.
      *
      * See `Clipboard.copy`
      */
    def copyCells(cells: js.Array[js.Array[String]]): Boolean = js.native
    /**
      * Copies the element and its children to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * If a plaintext argument is supplied, we add both the text/html and
      * text/plain mime types to the clipboard. This preserves the built in
      * semantics of copying elements to the clipboard while allowing custom
      * plaintext output for programs that can't cope with HTML data in the
      * clipboard.
      *
      * Verified on Firefox 47, Chrome 51.
      *
      * Note: Sometimes the copy does not succeed. Presumably, in order to
      * prevent memory issues, browsers will limit the total amount of data you
      * can copy to the clipboard. Based on ad hoc testing, we found an
      * inconsistent limit at about 300KB or 40,000 cells. Depending on the on
      * the content of cells, your limits may vary.
      */
    def copyElement(elem: HTMLElement): Boolean = js.native
    def copyElement(elem: HTMLElement, plaintext: String): Boolean = js.native
    /**
      * Copies the text to the clipboard. Returns a boolean
      * indicating whether the copy succeeded.
      *
      * See `Clipboard.copy`
      */
    def copyString(value: String): Boolean = js.native
    /**
      * Returns a boolean indicating whether the current browser nominally
      * supports the `copy` operation using the `execCommand` API.
      */
    def isCopySupported(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Grid extends js.Object {
    var DEFAULT_BLEED: Double = js.native
    var DEFAULT_GHOST_HEIGHT: Double = js.native
    var DEFAULT_GHOST_WIDTH: Double = js.native
    var DEFAULT_MAX_COLUMNS: Double = js.native
    var DEFAULT_MAX_ROWS: Double = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    var ORIGIN: typings.atBlueprintjsTable.libEsmCommonRectMod.Rect = js.native
    /**
      * Returns the CSS properties representing the absolute positioning of
      * this Rect.
      */
    def style(rect: AnyRect): CSSProperties = js.native
    /**
      * Returns a new Rect that subtracts the origin of the second argument
      * from the first.
      */
    def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typings.atBlueprintjsTable.libEsmCommonRectMod.Rect = js.native
    /**
      * Returns the smallest Rect that entirely contains the supplied rects
      */
    def union(anyRect0: AnyRect, anyRect1: AnyRect): typings.atBlueprintjsTable.libEsmCommonRectMod.Rect = js.native
    /**
      * Given a ClientRect or Rect object, returns a Rect object.
      */
    def wrap(rect: AnyRect): typings.atBlueprintjsTable.libEsmCommonRectMod.Rect = js.native
  }
  
  @js.native
  object RenderMode extends js.Object {
    /* "batch" */ val BATCH: typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH with String = js.native
    /* "batch-on-update" */ val BATCH_ON_UPDATE: typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH_ON_UPDATE with String = js.native
    /* "none" */ val NONE: typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.atBlueprintjsTable.libEsmCommonRenderModeMod.RenderMode with String] = js.native
  }
  
  @js.native
  object Utils extends js.Object {
    /**
      * Takes an array of numbers, returns an array of numbers of the same length in which each
      * value is the sum of current and previous values in the input array.
      *
      * Example input:  [10, 20, 50]
      *         output: [10, 30, 80]
      */
    def accumulate(numbers: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Returns a copy of the array that will have a length of the supplied parameter.
      * If the array is too long, it will be truncated. If it is too short, it will be
      * filled with the suppleid `fillValue` argument.
      *
      * @param array - the `Array` to copy and adjust
      * @param length - the target length of the array
      * @param fillValue - the value to add to the array if it is too short
      */
    def arrayOfLength[T](array: js.Array[T], length: Double, fillValue: T): js.Array[T] = js.native
    /**
      * Takes in one full array of values and one sparse array of the same
      * length and type. Returns a copy of the `defaults` array, where each
      * value is replaced with the corresponding non-null value at the same
      * index in `sparseOverrides`.
      *
      * @param defaults - the full array of default values
      * @param sparseOverrides - the sparse array of override values
      */
    def assignSparseValues[T](defaults: js.Array[T], sparseOverrides: js.Array[T]): js.Array[T] = js.native
    /**
      * Performs the binary search algorithm to find the index of the `value`
      * parameter in a sorted list of numbers. If `value` is not in the list, the
      * index where `value` can be inserted to maintain the sort is returned.
      *
      * Unlike a typical binary search implementation, we use a `lookup`
      * callback to access the sorted list of numbers instead of an array. This
      * avoids additional storage overhead.
      *
      * We use this to, for example, find the index of a row/col given its client
      * coordinate.
      *
      * Adapted from lodash https://github.com/lodash/lodash/blob/4.11.2/lodash.js#L3579
      *
      * @param value - the query value
      * @param high - the length of the sorted list of numbers
      * @param lookup - returns the number from the list at the supplied index
      */
    def binarySearch(value: Double, high: Double, lookup: js.Function1[/* index */ Double, Double]): Double = js.native
    /**
      * Given a number, returns a value that is clamped within a
      * minimum/maximum bounded range. The minimum and maximum are optional. If
      * either is missing, that extrema limit is not applied.
      *
      * Assumes max >= min.
      */
    def clamp(value: Double): Double = js.native
    def clamp(value: Double, min: Double): Double = js.native
    def clamp(value: Double, min: Double, max: Double): Double = js.native
    def getApproxCellHeight(
      cellText: String,
      columnWidth: Double,
      approxCharWidth: Double,
      approxLineHeight: Double,
      horizontalPadding: Double,
      numBufferLines: Double
    ): Double = js.native
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts an absolute "guide" index to a relative "reordered" index.
      *
      * Example: Say we want to move the first three columns two spots to the right. While we drag, a
      * vertical guide is shown to preview where we'll be dropping the columns. (In the following
      * ASCII art, `*` denotes a selected column, `·` denotes a cell border, and `|` denotes a
      * vertical guide).
      *
      *     Before mousedown:
      *     · 0 · 1 · 2 · 3 · 4 · 5 ·
      *       *   *   *
      *
      *     During mousemove two spots to the right:
      *     · 0 · 1 · 2 · 3 · 4 | 5 ·
      *       *   *   *
      *
      *     After mouseup:
      *     · 3 · 4 · 0 · 1 · 2 · 5 ·
      *               *   *   *
      *
      * Note that moving the three columns beyond index 4 effectively moves them two spots rightward.
      *
      * In this case, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 5 (the index on whose left boundary the guide appears in the original ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 2, the left-most index of the columns in the new ordering.
      */
    def guideIndexToReorderedIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
    /**
      * Returns true if the mouse event was triggered by the left mouse button.
      */
    def isLeftClick(event: MouseEvent): Boolean = js.native
    /**
      * Measures the bounds of supplied element's textContent.
      * We use the computed font from the supplied element and a non-DOM canvas
      * context to measure the text.
      */
    def measureElementTextContent(element: Element): TextMetrics = js.native
    /**
      * Returns a copy of the provided array with the `length` contiguous elements starting at the
      * `from` index reordered to start at the `to` index.
      *
      * For example, given the array [A,B,C,D,E,F], reordering the 3 contiguous elements starting at
      * index 1 (B, C, and D) to start at index 2 would yield [A,E,B,C,D,F].
      */
    def reorderArray[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
    def reorderArray[T](array: js.Array[T], from: Double, to: Double, length: Double): js.Array[T] = js.native
    /**
      * When reordering a contiguous block of rows or columns to a new index, we show a preview guide
      * at the absolute index in the original ordering but emit the new index in the reordered list.
      * This function converts a relative "reordered"" index to an absolute "guide" index.
      *
      * For the scenario in the example above, the inputs to this function would be:
      *     - oldIndex: 0 (the left-most index of the selected column range in the original ordering)
      *     - newIndex: 2 (the left-most index of the selected column range in the new ordering)
      *     - length: 3 (the number of columns to move)
      *
      * The return value will then be 5, the index on whose left boundary the guide should appear in
      * the original ordering.
      */
    def reorderedIndexToGuideIndex(oldIndex: Double, newIndex: Double, length: Double): Double = js.native
    /**
      * Invokes the callback `n` times, collecting the results in an array, which
      * is the return value. Similar to _.times
      */
    def times[T](n: Double, callback: js.Function1[/* i */ Double, T]): js.Array[T] = js.native
    /**
      * Returns traditional spreadsheet-style column names
      * e.g. (A, B, ..., Z, AA, AB, ..., ZZ, AAA, AAB, ...).
      *
      * Note that this isn't technically mathematically equivalent to base 26 since
      * there is no zero element.
      */
    def toBase26Alpha(num: Double): String = js.native
    /**
      * Returns traditional spreadsheet-style cell names
      * e.g. (A1, B2, ..., Z44, AA1) with rows 1-indexed.
      */
    def toBase26CellName(rowIndex: Double, columnIndex: Double): String = js.native
  }
  
}

