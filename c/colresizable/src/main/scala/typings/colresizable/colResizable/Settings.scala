package typings.colresizable.colResizable

import typings.colresizable.colresizableStrings.fit
import typings.colresizable.colresizableStrings.flex
import typings.colresizable.colresizableStrings.overflow
import typings.jquery.JQueryMouseEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * [default: false] When set to true it aims to remove all previously added enhancements such as events and additional DOM elements assigned by this plugin to
    * a single or collection of tables. It is required to disable a previously colResized table prior its removal from the document object tree.
    * [version: 1.0]
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: [ ] ] An array of column indexes to be excluded, so it will not be possible to drag them manually.
    * [version: 1.6]
    */
  var disabledColumns: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * [default: "e-resize"]  Defines the cursor that will be used while the user is resizing a column.
    * [version: 1.3]
    */
  var dragCursor: js.UndefOr[String] = js.undefined
  /**
    * [default: (internal class)]  This attribute is used as the css class assigned to column anchors while being dragged. It can be used for visual feedback purposes.
    * [version: 1.0]
    */
  var draggingClass: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use resizeMode instead
    * [default: true] It is used to set how the resize method works.
    * In fixed mode resizing a column does not alter total table width, which means that when a column is expanded the next one shrinks.
    * If fixed is set to false then table can change its width and each column can shrink or expand independently.
    * [version: 1.5]
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: false]  Flush is only effective when postbackSafe is enabled.
    * Its purpose is to remove all previously stored data related to the current table layout to get it back to its original layout preventing width restoration after postback.
    * [version: ]
    */
  var flush: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: ""]  Its purpose is to allow column anchor customization by defining the HTML to be used in the column grips to provide some visual feedback.
    * It can be used in a wide range of ways to obtain very different outputs, and its flexibility can be increased by combining it with the draggingClass attribute.
    * [version: 1.0]
    */
  var gripInnerHtml: js.UndefOr[String] = js.undefined
  /**
    * [default: false]  This attribute can be used to prevent vertical expansion of the column anchors to fit the table height.
    * If it is set to true, column handler's size will be bounded to the first row's vertical size.
    * [version: 1.2]
    */
  var headerOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: "e-resize"]  This attribute can be used to customize the cursor that will be displayed when the user is positioned on the column anchors.
    * [version: 1.3]
    */
  var hoverCursor: js.UndefOr[String] = js.undefined
  /**
    * [default: false] When set to true the table layout is updated while dragging column anchors.
    * liveDrag enabled is more CPU consuming so it is not recommended for slow computers, specially when dealing with huge or extremely complicated tables.
    * [version: 1.0]
    */
  var liveDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: null]  If the target table contains an explicit margin-left CSS rule, the same value must be used in this attribute (for example: "auto", "20%", "10px").
    * The reason why it is needed it is because most browsers (all except of IE) don’t allow direct access to the current CSS rule applied to an element in
    * its original units (such as "%", "em" or "auto" values).
    * If you know any workaround which doesn’t involve iteration through all the styles defined in the site and any other external dependencies, please let me know!
    * [version: 1.3]
    */
  var marginLeft: js.UndefOr[String] = js.undefined
  /**
    * [default: null]  It behaves in exactly the same way than the marginLeft attribute but applied to the right margin.
    * [version: 1.3]
    */
  var marginRight: js.UndefOr[String] = js.undefined
  /**
    * [default: 15]  This value specifies the minimum width (measured in pixels) that is allowed for the columns.
    * [version: 1.1]
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * This event is fired while dragging a column anchor if liveDrag is enabled. It can be useful if the table is being used as a multiple range slider.
    * The callback function can obtain a reference to the updated table through the currentTarget attribute of the event retrieved by parameters
    * [version: 1.1]
    */
  var onDrag: js.UndefOr[FunctionCallback] = js.undefined
  /**
    * If a callback function is supplied it will be fired when the user has ended dragging a column anchor altering the previous table layout.
    * The callback function can obtain a reference to the updated table through the currentTarget attribute of the event retrieved by parameters
    * [version: 1.0]
    */
  var onResize: js.UndefOr[FunctionCallback] = js.undefined
  /**
    * [default: false]  This attribute should be set to true if the table is inside of an updatePanel or any other kind of partial page refresh using ajax.
    * Table's ID should be same before and after the partial partial refresh.
    * [version: 1.5]
    */
  var partialRefresh: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: false]  This attribute can be used to specify that the manually selected column widths must remain unaltered after a postback or browser refresh.
    * This feature is mainly oriented to those pages created with server-side logic (codebehind), such as PHP or .NET, and it is only compatible with browsers
    * with sessionStorage support (all modern browsers).
    * However, if you are targeting older browsers (such as IE7 and IE8) you can still emulate sessionStorage using sessionStorage.js.
    * It is important to note that some browsers (IE and FF) doesn’t enable the sessionStorage object while running the website directly from the local file system,
    * so if you want to test this feature it is recommended to view the website through a web server or use browsers such as Chrome or Opera which doesn’t have this limitation.
    * Don't worry about compatibility issues, once your site is up on the internet, all browsers will act in exactly the same way.
    * [version: 1.3]
    */
  var postbackSafe: js.UndefOr[Boolean] = js.undefined
  /**
    * [default: 'fit']  It is used to set how the resize method works. Those are the possible values:
    * - 'fit': this is default resizing model, in which resizing a column does not alter table width, which means that when a column is expanded the next one shrinks.
    * - 'flex': in this mode tables can change its width and each column can shrink or expand independently if there is enough space in the parent container.
    *           If there is not enough space, columns will share its width as they are resized. Table will never get bigger than its parent.
    * - 'overflow': allows to resize columns with overflow of parent container.
    * [version: 1.6]
    */
  var resizeMode: js.UndefOr[fit | flex | overflow] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    disable: js.UndefOr[Boolean] = js.undefined,
    disabledColumns: js.Array[Double] = null,
    dragCursor: String = null,
    draggingClass: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    flush: js.UndefOr[Boolean] = js.undefined,
    gripInnerHtml: String = null,
    headerOnly: js.UndefOr[Boolean] = js.undefined,
    hoverCursor: String = null,
    liveDrag: js.UndefOr[Boolean] = js.undefined,
    marginLeft: String = null,
    marginRight: String = null,
    minWidth: Int | Double = null,
    onDrag: /* e */ JQueryMouseEventObject => Unit = null,
    onResize: /* e */ JQueryMouseEventObject => Unit = null,
    partialRefresh: js.UndefOr[Boolean] = js.undefined,
    postbackSafe: js.UndefOr[Boolean] = js.undefined,
    resizeMode: fit | flex | overflow = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (disabledColumns != null) __obj.updateDynamic("disabledColumns")(disabledColumns)
    if (dragCursor != null) __obj.updateDynamic("dragCursor")(dragCursor)
    if (draggingClass != null) __obj.updateDynamic("draggingClass")(draggingClass)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush)
    if (gripInnerHtml != null) __obj.updateDynamic("gripInnerHtml")(gripInnerHtml)
    if (!js.isUndefined(headerOnly)) __obj.updateDynamic("headerOnly")(headerOnly)
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor)
    if (!js.isUndefined(liveDrag)) __obj.updateDynamic("liveDrag")(liveDrag)
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft)
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (!js.isUndefined(partialRefresh)) __obj.updateDynamic("partialRefresh")(partialRefresh)
    if (!js.isUndefined(postbackSafe)) __obj.updateDynamic("postbackSafe")(postbackSafe)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

