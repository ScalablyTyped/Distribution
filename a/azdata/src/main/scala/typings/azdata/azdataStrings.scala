package typings.azdata

import typings.azdata.mod.AlignContentType
import typings.azdata.mod.AlignItemsType
import typings.azdata.mod.DisplayType
import typings.azdata.mod.FlexWrapType
import typings.azdata.mod.InfoBoxStyle
import typings.azdata.mod.InputBoxInputType
import typings.azdata.mod.JustifyContentType
import typings.azdata.mod.PositionType
import typings.azdata.mod.TextAlignType
import typings.azdata.mod.VisualizationType
import typings.azdata.mod.connection.ConnectionEventType
import typings.azdata.mod.nb.CellType
import typings.azdata.mod.nb.Channel
import typings.azdata.mod.nb.KernelStatus
import typings.azdata.mod.nb.OutputTypeName
import typings.azdata.mod.nb.StreamType
import typings.azdata.mod.queryeditor.QueryEventType
import typings.azdata.mod.window.CloseReason
import typings.azdata.mod.window.DialogButtonPosition
import typings.azdata.mod.window.DialogPosition
import typings.azdata.mod.window.DialogStyle
import typings.azdata.mod.window._DialogWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azdataStrings {
  
  @js.native
  sealed trait _empty
    extends StObject
       with DisplayType
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait absolute
    extends StObject
       with PositionType
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait bar
    extends StObject
       with VisualizationType
  inline def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait baseline
    extends StObject
       with AlignItemsType
  inline def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait below
    extends StObject
       with DialogPosition
  inline def below: below = "below".asInstanceOf[below]
  
  @js.native
  sealed trait block
    extends StObject
       with DisplayType
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait bold extends StObject
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait busy
    extends StObject
       with KernelStatus
  inline def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait callout
    extends StObject
       with DialogStyle
  inline def callout: callout = "callout".asInstanceOf[callout]
  
  @js.native
  sealed trait cancel
    extends StObject
       with CloseReason
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait center
    extends StObject
       with AlignContentType
       with AlignItemsType
       with JustifyContentType
       with TextAlignType
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait close
    extends StObject
       with CloseReason
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait code
    extends StObject
       with CellType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait color
    extends StObject
       with InputBoxInputType
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait connected
    extends StObject
       with KernelStatus
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait contents
    extends StObject
       with DisplayType
  inline def contents: contents = "contents".asInstanceOf[contents]
  
  @js.native
  sealed trait count
    extends StObject
       with VisualizationType
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait date
    extends StObject
       with InputBoxInputType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait `datetime-local`
    extends StObject
       with InputBoxInputType
  inline def `datetime-local`: `datetime-local` = "datetime-local".asInstanceOf[`datetime-local`]
  
  @js.native
  sealed trait dead
    extends StObject
       with KernelStatus
  inline def dead: dead = "dead".asInstanceOf[dead]
  
  @js.native
  sealed trait display_data
    extends StObject
       with OutputTypeName
  inline def display_data: display_data = "display_data".asInstanceOf[display_data]
  
  @js.native
  sealed trait doughnut
    extends StObject
       with VisualizationType
  inline def doughnut: doughnut = "doughnut".asInstanceOf[doughnut]
  
  @js.native
  sealed trait email
    extends StObject
       with InputBoxInputType
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait end
    extends StObject
       with AlignItemsType
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with InfoBoxStyle
       with OutputTypeName
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait execute_reply
    extends StObject
       with Channel
  inline def execute_reply: execute_reply = "execute_reply".asInstanceOf[execute_reply]
  
  @js.native
  sealed trait execute_result
    extends StObject
       with OutputTypeName
  inline def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  
  @js.native
  sealed trait executionPlan
    extends StObject
       with QueryEventType
  inline def executionPlan: executionPlan = "executionPlan".asInstanceOf[executionPlan]
  
  @js.native
  sealed trait `first baseline`
    extends StObject
       with AlignItemsType
  inline def `first baseline`: `first baseline` = ("first baseline").asInstanceOf[`first baseline`]
  
  @js.native
  sealed trait fixed
    extends StObject
       with PositionType
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait flex
    extends StObject
       with DisplayType
  inline def flex: flex = "flex".asInstanceOf[flex]
  
  @js.native
  sealed trait `flex-end`
    extends StObject
       with AlignContentType
       with AlignItemsType
       with JustifyContentType
  inline def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  
  @js.native
  sealed trait `flex-start`
    extends StObject
       with AlignContentType
       with AlignItemsType
       with JustifyContentType
  inline def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @js.native
  sealed trait flyout
    extends StObject
       with DialogStyle
  inline def flyout: flyout = "flyout".asInstanceOf[flyout]
  
  @js.native
  sealed trait grid
    extends StObject
       with DisplayType
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait horizontalBar
    extends StObject
       with VisualizationType
  inline def horizontalBar: horizontalBar = "horizontalBar".asInstanceOf[horizontalBar]
  
  @js.native
  sealed trait idle
    extends StObject
       with KernelStatus
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image
    extends StObject
       with VisualizationType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait information
    extends StObject
       with InfoBoxStyle
  inline def information: information = "information".asInstanceOf[information]
  
  @js.native
  sealed trait inherit
    extends StObject
       with AlignContentType
       with AlignItemsType
       with DisplayType
       with JustifyContentType
       with PositionType
       with TextAlignType
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial
    extends StObject
       with AlignContentType
       with AlignItemsType
       with DisplayType
       with JustifyContentType
       with PositionType
       with TextAlignType
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with DisplayType
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait `inline-block`
    extends StObject
       with DisplayType
  inline def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  
  @js.native
  sealed trait `inline-flex`
    extends StObject
       with DisplayType
  inline def `inline-flex`: `inline-flex` = "inline-flex".asInstanceOf[`inline-flex`]
  
  @js.native
  sealed trait `inline-grid`
    extends StObject
       with DisplayType
  inline def `inline-grid`: `inline-grid` = "inline-grid".asInstanceOf[`inline-grid`]
  
  @js.native
  sealed trait `inline-table`
    extends StObject
       with DisplayType
  inline def `inline-table`: `inline-table` = "inline-table".asInstanceOf[`inline-table`]
  
  @js.native
  sealed trait iopub
    extends StObject
       with Channel
  inline def iopub: iopub = "iopub".asInstanceOf[iopub]
  
  @js.native
  sealed trait justify
    extends StObject
       with TextAlignType
  inline def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait `last baseline`
    extends StObject
       with AlignItemsType
  inline def `last baseline`: `last baseline` = ("last baseline").asInstanceOf[`last baseline`]
  
  @js.native
  sealed trait left
    extends StObject
       with DialogButtonPosition
       with DialogPosition
       with TextAlignType
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait line
    extends StObject
       with VisualizationType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait `list-item`
    extends StObject
       with DisplayType
  inline def `list-item`: `list-item` = "list-item".asInstanceOf[`list-item`]
  
  @js.native
  sealed trait markdown
    extends StObject
       with CellType
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait medium
    extends StObject
       with _DialogWidth
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait month
    extends StObject
       with InputBoxInputType
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait narrow
    extends StObject
       with _DialogWidth
  inline def narrow: narrow = "narrow".asInstanceOf[narrow]
  
  @js.native
  sealed trait none
    extends StObject
       with DisplayType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal
    extends StObject
       with AlignItemsType
       with DialogStyle
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait nowrap
    extends StObject
       with FlexWrapType
  inline def nowrap: nowrap = "nowrap".asInstanceOf[nowrap]
  
  @js.native
  sealed trait number
    extends StObject
       with InputBoxInputType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait ok
    extends StObject
       with CloseReason
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait onConnect
    extends StObject
       with ConnectionEventType
  inline def onConnect: onConnect = "onConnect".asInstanceOf[onConnect]
  
  @js.native
  sealed trait onConnectionChanged
    extends StObject
       with ConnectionEventType
  inline def onConnectionChanged: onConnectionChanged = "onConnectionChanged".asInstanceOf[onConnectionChanged]
  
  @js.native
  sealed trait onDisconnect
    extends StObject
       with ConnectionEventType
  inline def onDisconnect: onDisconnect = "onDisconnect".asInstanceOf[onDisconnect]
  
  @js.native
  sealed trait password
    extends StObject
       with InputBoxInputType
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait pie
    extends StObject
       with VisualizationType
  inline def pie: pie = "pie".asInstanceOf[pie]
  
  @js.native
  sealed trait queryStart
    extends StObject
       with QueryEventType
  inline def queryStart: queryStart = "queryStart".asInstanceOf[queryStart]
  
  @js.native
  sealed trait queryStop
    extends StObject
       with QueryEventType
  inline def queryStop: queryStop = "queryStop".asInstanceOf[queryStop]
  
  @js.native
  sealed trait queryUpdate
    extends StObject
       with QueryEventType
  inline def queryUpdate: queryUpdate = "queryUpdate".asInstanceOf[queryUpdate]
  
  @js.native
  sealed trait range
    extends StObject
       with InputBoxInputType
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait raw
    extends StObject
       with CellType
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait reconnecting
    extends StObject
       with KernelStatus
  inline def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  
  @js.native
  sealed trait relative
    extends StObject
       with PositionType
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait restarting
    extends StObject
       with KernelStatus
  inline def restarting: restarting = "restarting".asInstanceOf[restarting]
  
  @js.native
  sealed trait right
    extends StObject
       with DialogButtonPosition
       with TextAlignType
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `run-in`
    extends StObject
       with DisplayType
  inline def `run-in`: `run-in` = "run-in".asInstanceOf[`run-in`]
  
  @js.native
  sealed trait `safe center`
    extends StObject
       with AlignItemsType
  inline def `safe center`: `safe center` = ("safe center").asInstanceOf[`safe center`]
  
  @js.native
  sealed trait scatter
    extends StObject
       with VisualizationType
  inline def scatter: scatter = "scatter".asInstanceOf[scatter]
  
  @js.native
  sealed trait search
    extends StObject
       with InputBoxInputType
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait shell
    extends StObject
       with Channel
  inline def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait `space-around`
    extends StObject
       with AlignContentType
       with JustifyContentType
  inline def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  
  @js.native
  sealed trait `space-between`
    extends StObject
       with AlignContentType
       with JustifyContentType
  inline def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  
  @js.native
  sealed trait start
    extends StObject
       with AlignItemsType
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait starting
    extends StObject
       with KernelStatus
  inline def starting: starting = "starting".asInstanceOf[starting]
  
  @js.native
  sealed trait static
    extends StObject
       with PositionType
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait stderr
    extends StObject
       with StreamType
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdin
    extends StObject
       with Channel
  inline def stdin: stdin = "stdin".asInstanceOf[stdin]
  
  @js.native
  sealed trait stdout
    extends StObject
       with StreamType
  inline def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait sticky
    extends StObject
       with PositionType
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait stream
    extends StObject
       with OutputTypeName
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait stretch
    extends StObject
       with AlignContentType
       with AlignItemsType
  inline def stretch: stretch = "stretch".asInstanceOf[stretch]
  
  @js.native
  sealed trait success
    extends StObject
       with InfoBoxStyle
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait table
    extends StObject
       with DisplayType
       with VisualizationType
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait `table-caption`
    extends StObject
       with DisplayType
  inline def `table-caption`: `table-caption` = "table-caption".asInstanceOf[`table-caption`]
  
  @js.native
  sealed trait `table-cell`
    extends StObject
       with DisplayType
  inline def `table-cell`: `table-cell` = "table-cell".asInstanceOf[`table-cell`]
  
  @js.native
  sealed trait `table-column`
    extends StObject
       with DisplayType
  inline def `table-column`: `table-column` = "table-column".asInstanceOf[`table-column`]
  
  @js.native
  sealed trait `table-column-group`
    extends StObject
       with DisplayType
  inline def `table-column-group`: `table-column-group` = "table-column-group".asInstanceOf[`table-column-group`]
  
  @js.native
  sealed trait `table-footer-group`
    extends StObject
       with DisplayType
  inline def `table-footer-group`: `table-footer-group` = "table-footer-group".asInstanceOf[`table-footer-group`]
  
  @js.native
  sealed trait `table-header-group`
    extends StObject
       with DisplayType
  inline def `table-header-group`: `table-header-group` = "table-header-group".asInstanceOf[`table-header-group`]
  
  @js.native
  sealed trait `table-row`
    extends StObject
       with DisplayType
  inline def `table-row`: `table-row` = "table-row".asInstanceOf[`table-row`]
  
  @js.native
  sealed trait `table-row-group`
    extends StObject
       with DisplayType
  inline def `table-row-group`: `table-row-group` = "table-row-group".asInstanceOf[`table-row-group`]
  
  @js.native
  sealed trait text
    extends StObject
       with InputBoxInputType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait time
    extends StObject
       with InputBoxInputType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeSeries
    extends StObject
       with VisualizationType
  inline def timeSeries: timeSeries = "timeSeries".asInstanceOf[timeSeries]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait unknown
    extends StObject
       with KernelStatus
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait `unsafe center`
    extends StObject
       with AlignItemsType
  inline def `unsafe center`: `unsafe center` = ("unsafe center").asInstanceOf[`unsafe center`]
  
  @js.native
  sealed trait unset
    extends StObject
       with AlignItemsType
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait update_display_data
    extends StObject
       with OutputTypeName
  inline def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
  
  @js.native
  sealed trait url
    extends StObject
       with InputBoxInputType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait visualize
    extends StObject
       with QueryEventType
  inline def visualize: visualize = "visualize".asInstanceOf[visualize]
  
  @js.native
  sealed trait warning
    extends StObject
       with InfoBoxStyle
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait week
    extends StObject
       with InputBoxInputType
  inline def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait wide
    extends StObject
       with _DialogWidth
  inline def wide: wide = "wide".asInstanceOf[wide]
  
  @js.native
  sealed trait wrap
    extends StObject
       with FlexWrapType
  inline def wrap: wrap = "wrap".asInstanceOf[wrap]
  
  @js.native
  sealed trait `wrap-reverse`
    extends StObject
       with FlexWrapType
  inline def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
}
