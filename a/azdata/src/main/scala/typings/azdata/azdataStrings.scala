package typings.azdata

import typings.azdata.mod.AlignContentType
import typings.azdata.mod.AlignItemsType
import typings.azdata.mod.DisplayType
import typings.azdata.mod.FlexWrapType
import typings.azdata.mod.InputBoxInputType
import typings.azdata.mod.JustifyContentType
import typings.azdata.mod.PositionType
import typings.azdata.mod.TextAlignType
import typings.azdata.mod.nb.CellType
import typings.azdata.mod.nb.Channel
import typings.azdata.mod.nb.KernelStatus
import typings.azdata.mod.nb.OutputTypeName
import typings.azdata.mod.nb.StreamType
import typings.azdata.mod.queryeditor.QueryEventType
import typings.azdata.mod.window.DialogButtonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object azdataStrings {
  @js.native
  sealed trait `Spacetable-column-group` extends DisplayType
  
  @js.native
  sealed trait _empty extends DisplayType
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait absolute extends PositionType
  
  @js.native
  sealed trait baseline extends AlignItemsType
  
  @js.native
  sealed trait block extends DisplayType
  
  @js.native
  sealed trait bold extends js.Object
  
  @js.native
  sealed trait busy extends KernelStatus
  
  @js.native
  sealed trait center
    extends AlignContentType
       with AlignItemsType
       with JustifyContentType
       with TextAlignType
  
  @js.native
  sealed trait code extends CellType
  
  @js.native
  sealed trait color extends InputBoxInputType
  
  @js.native
  sealed trait connected extends KernelStatus
  
  @js.native
  sealed trait contents extends DisplayType
  
  @js.native
  sealed trait date extends InputBoxInputType
  
  @js.native
  sealed trait `datetime-local` extends InputBoxInputType
  
  @js.native
  sealed trait dead extends KernelStatus
  
  @js.native
  sealed trait display_data extends OutputTypeName
  
  @js.native
  sealed trait email extends InputBoxInputType
  
  @js.native
  sealed trait end extends AlignItemsType
  
  @js.native
  sealed trait error extends OutputTypeName
  
  @js.native
  sealed trait execute_reply extends Channel
  
  @js.native
  sealed trait execute_result extends OutputTypeName
  
  @js.native
  sealed trait executionPlan extends QueryEventType
  
  @js.native
  sealed trait `first baseline` extends AlignItemsType
  
  @js.native
  sealed trait fixed extends PositionType
  
  @js.native
  sealed trait flex extends DisplayType
  
  @js.native
  sealed trait `flex-end`
    extends AlignContentType
       with AlignItemsType
       with JustifyContentType
  
  @js.native
  sealed trait `flex-start`
    extends AlignContentType
       with AlignItemsType
       with JustifyContentType
  
  @js.native
  sealed trait grid extends DisplayType
  
  @js.native
  sealed trait idle extends KernelStatus
  
  @js.native
  sealed trait inherit
    extends AlignContentType
       with AlignItemsType
       with DisplayType
       with JustifyContentType
       with PositionType
       with TextAlignType
  
  @js.native
  sealed trait initial
    extends AlignContentType
       with AlignItemsType
       with DisplayType
       with JustifyContentType
       with PositionType
       with TextAlignType
  
  @js.native
  sealed trait `inline` extends DisplayType
  
  @js.native
  sealed trait `inline-block` extends DisplayType
  
  @js.native
  sealed trait `inline-flex` extends DisplayType
  
  @js.native
  sealed trait `inline-grid` extends DisplayType
  
  @js.native
  sealed trait `inline-table` extends DisplayType
  
  @js.native
  sealed trait iopub extends Channel
  
  @js.native
  sealed trait justify extends TextAlignType
  
  @js.native
  sealed trait `last baseline` extends AlignItemsType
  
  @js.native
  sealed trait left
    extends DialogButtonPosition
       with TextAlignType
  
  @js.native
  sealed trait `list-item` extends DisplayType
  
  @js.native
  sealed trait markdown extends CellType
  
  @js.native
  sealed trait month extends InputBoxInputType
  
  @js.native
  sealed trait none extends DisplayType
  
  @js.native
  sealed trait normal extends AlignItemsType
  
  @js.native
  sealed trait nowrap extends FlexWrapType
  
  @js.native
  sealed trait number extends InputBoxInputType
  
  @js.native
  sealed trait ok extends js.Object
  
  @js.native
  sealed trait password extends InputBoxInputType
  
  @js.native
  sealed trait queryStart extends QueryEventType
  
  @js.native
  sealed trait queryStop extends QueryEventType
  
  @js.native
  sealed trait queryUpdate extends QueryEventType
  
  @js.native
  sealed trait range extends InputBoxInputType
  
  @js.native
  sealed trait raw extends CellType
  
  @js.native
  sealed trait reconnecting extends KernelStatus
  
  @js.native
  sealed trait relative extends PositionType
  
  @js.native
  sealed trait restarting extends KernelStatus
  
  @js.native
  sealed trait right
    extends DialogButtonPosition
       with TextAlignType
  
  @js.native
  sealed trait `run-in` extends DisplayType
  
  @js.native
  sealed trait `safe center` extends AlignItemsType
  
  @js.native
  sealed trait search extends InputBoxInputType
  
  @js.native
  sealed trait shell extends Channel
  
  @js.native
  sealed trait `space-around`
    extends AlignContentType
       with JustifyContentType
  
  @js.native
  sealed trait `space-between`
    extends AlignContentType
       with JustifyContentType
  
  @js.native
  sealed trait start extends AlignItemsType
  
  @js.native
  sealed trait starting extends KernelStatus
  
  @js.native
  sealed trait static extends PositionType
  
  @js.native
  sealed trait stderr extends StreamType
  
  @js.native
  sealed trait stdin extends Channel
  
  @js.native
  sealed trait stdout extends StreamType
  
  @js.native
  sealed trait sticky extends PositionType
  
  @js.native
  sealed trait stream extends OutputTypeName
  
  @js.native
  sealed trait stretch
    extends AlignContentType
       with AlignItemsType
  
  @js.native
  sealed trait table extends DisplayType
  
  @js.native
  sealed trait `table-caption` extends DisplayType
  
  @js.native
  sealed trait `table-cell` extends DisplayType
  
  @js.native
  sealed trait `table-column` extends DisplayType
  
  @js.native
  sealed trait `table-footer-group` extends DisplayType
  
  @js.native
  sealed trait `table-header-group` extends DisplayType
  
  @js.native
  sealed trait `table-row` extends DisplayType
  
  @js.native
  sealed trait `table-row-group` extends DisplayType
  
  @js.native
  sealed trait text extends InputBoxInputType
  
  @js.native
  sealed trait time extends InputBoxInputType
  
  @js.native
  sealed trait unknown extends KernelStatus
  
  @js.native
  sealed trait `unsafe center` extends AlignItemsType
  
  @js.native
  sealed trait unset extends AlignItemsType
  
  @js.native
  sealed trait update_display_data extends OutputTypeName
  
  @js.native
  sealed trait url extends InputBoxInputType
  
  @js.native
  sealed trait visualize extends QueryEventType
  
  @js.native
  sealed trait week extends InputBoxInputType
  
  @js.native
  sealed trait wrap extends FlexWrapType
  
  @js.native
  sealed trait `wrap-reverse` extends FlexWrapType
  
  @scala.inline
  def `Spacetable-column-group`: `Spacetable-column-group` = " table-column-group".asInstanceOf[`Spacetable-column-group`]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def busy: busy = "busy".asInstanceOf[busy]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def contents: contents = "contents".asInstanceOf[contents]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def `datetime-local`: `datetime-local` = "datetime-local".asInstanceOf[`datetime-local`]
  @scala.inline
  def dead: dead = "dead".asInstanceOf[dead]
  @scala.inline
  def display_data: display_data = "display_data".asInstanceOf[display_data]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def execute_reply: execute_reply = "execute_reply".asInstanceOf[execute_reply]
  @scala.inline
  def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  @scala.inline
  def executionPlan: executionPlan = "executionPlan".asInstanceOf[executionPlan]
  @scala.inline
  def `first baseline`: `first baseline` = "first baseline".asInstanceOf[`first baseline`]
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  @scala.inline
  def flex: flex = "flex".asInstanceOf[flex]
  @scala.inline
  def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  @scala.inline
  def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  @scala.inline
  def `inline-flex`: `inline-flex` = "inline-flex".asInstanceOf[`inline-flex`]
  @scala.inline
  def `inline-grid`: `inline-grid` = "inline-grid".asInstanceOf[`inline-grid`]
  @scala.inline
  def `inline-table`: `inline-table` = "inline-table".asInstanceOf[`inline-table`]
  @scala.inline
  def iopub: iopub = "iopub".asInstanceOf[iopub]
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  @scala.inline
  def `last baseline`: `last baseline` = "last baseline".asInstanceOf[`last baseline`]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `list-item`: `list-item` = "list-item".asInstanceOf[`list-item`]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def nowrap: nowrap = "nowrap".asInstanceOf[nowrap]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def queryStart: queryStart = "queryStart".asInstanceOf[queryStart]
  @scala.inline
  def queryStop: queryStop = "queryStop".asInstanceOf[queryStop]
  @scala.inline
  def queryUpdate: queryUpdate = "queryUpdate".asInstanceOf[queryUpdate]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  @scala.inline
  def restarting: restarting = "restarting".asInstanceOf[restarting]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def `run-in`: `run-in` = "run-in".asInstanceOf[`run-in`]
  @scala.inline
  def `safe center`: `safe center` = "safe center".asInstanceOf[`safe center`]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  @scala.inline
  def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  @scala.inline
  def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def starting: starting = "starting".asInstanceOf[starting]
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdin: stdin = "stdin".asInstanceOf[stdin]
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  @scala.inline
  def sticky: sticky = "sticky".asInstanceOf[sticky]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def stretch: stretch = "stretch".asInstanceOf[stretch]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  @scala.inline
  def `table-caption`: `table-caption` = "table-caption".asInstanceOf[`table-caption`]
  @scala.inline
  def `table-cell`: `table-cell` = "table-cell".asInstanceOf[`table-cell`]
  @scala.inline
  def `table-column`: `table-column` = "table-column".asInstanceOf[`table-column`]
  @scala.inline
  def `table-footer-group`: `table-footer-group` = "table-footer-group".asInstanceOf[`table-footer-group`]
  @scala.inline
  def `table-header-group`: `table-header-group` = "table-header-group".asInstanceOf[`table-header-group`]
  @scala.inline
  def `table-row`: `table-row` = "table-row".asInstanceOf[`table-row`]
  @scala.inline
  def `table-row-group`: `table-row-group` = "table-row-group".asInstanceOf[`table-row-group`]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def `unsafe center`: `unsafe center` = "unsafe center".asInstanceOf[`unsafe center`]
  @scala.inline
  def unset: unset = "unset".asInstanceOf[unset]
  @scala.inline
  def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def visualize: visualize = "visualize".asInstanceOf[visualize]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  @scala.inline
  def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
}

