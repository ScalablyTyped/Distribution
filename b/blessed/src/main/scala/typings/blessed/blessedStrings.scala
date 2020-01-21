package typings.blessed

import typings.blessed.mod.Widgets.ListElementEventType
import typings.blessed.mod.Widgets.NodeEventType
import typings.blessed.mod.Widgets.NodeGenericEventType
import typings.blessed.mod.Widgets.NodeMouseEventType
import typings.blessed.mod.Widgets.NodeScreenEventType
import typings.blessed.mod.Widgets.TextareaElementEventType
import typings.blessed.mod.Widgets.Types.TAlign
import typings.blessed.mod.Widgets.Types.TMouseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object blessedStrings {
  @js.native
  sealed trait action
    extends ListElementEventType
       with TextareaElementEventType
  
  @js.native
  sealed trait `add item` extends ListElementEventType
  
  @js.native
  sealed trait adopt extends NodeEventType
  
  @js.native
  sealed trait ansi extends js.Object
  
  @js.native
  sealed trait attach extends NodeEventType
  
  @js.native
  sealed trait bg extends js.Object
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait blur extends NodeScreenEventType
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait cancel
    extends ListElementEventType
       with TextareaElementEventType
  
  @js.native
  sealed trait cd extends js.Object
  
  @js.native
  sealed trait center extends TAlign
  
  @js.native
  sealed trait click extends NodeScreenEventType
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait cpu extends js.Object
  
  @js.native
  sealed trait `create item` extends ListElementEventType
  
  @js.native
  sealed trait destroy extends NodeGenericEventType
  
  @js.native
  sealed trait detach extends NodeEventType
  
  @js.native
  sealed trait `element click` extends NodeScreenEventType
  
  @js.native
  sealed trait `element mouseout` extends NodeScreenEventType
  
  @js.native
  sealed trait `element mouseover` extends NodeScreenEventType
  
  @js.native
  sealed trait `element mouseup` extends NodeScreenEventType
  
  @js.native
  sealed trait error extends TextareaElementEventType
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait focus extends NodeScreenEventType
  
  @js.native
  sealed trait grid extends js.Object
  
  @js.native
  sealed trait hide extends NodeGenericEventType
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait `inline-block` extends js.Object
  
  @js.native
  sealed trait `insert item` extends ListElementEventType
  
  @js.native
  sealed trait keypress extends js.Object
  
  @js.native
  sealed trait left extends TAlign
  
  @js.native
  sealed trait line extends js.Object
  
  @js.native
  sealed trait mem extends js.Object
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait mouse extends NodeMouseEventType
  
  @js.native
  sealed trait mousedown
    extends NodeMouseEventType
       with TMouseAction
  
  @js.native
  sealed trait mousemove
    extends NodeMouseEventType
       with TMouseAction
  
  @js.native
  sealed trait mouseout extends NodeMouseEventType
  
  @js.native
  sealed trait mouseover extends NodeMouseEventType
  
  @js.native
  sealed trait mouseup
    extends NodeMouseEventType
       with TMouseAction
  
  @js.native
  sealed trait mousewheel extends NodeMouseEventType
  
  @js.native
  sealed trait move extends NodeGenericEventType
  
  @js.native
  sealed trait overlay extends js.Object
  
  @js.native
  sealed trait `parsed content` extends NodeGenericEventType
  
  @js.native
  sealed trait prerender extends NodeGenericEventType
  
  @js.native
  sealed trait press extends js.Object
  
  @js.native
  sealed trait refresh extends js.Object
  
  @js.native
  sealed trait remove extends NodeEventType
  
  @js.native
  sealed trait `remove item` extends ListElementEventType
  
  @js.native
  sealed trait render extends NodeGenericEventType
  
  @js.native
  sealed trait reparent extends NodeEventType
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait resize extends NodeGenericEventType
  
  @js.native
  sealed trait right extends TAlign
  
  @js.native
  sealed trait scroll extends js.Object
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait `select item` extends js.Object
  
  @js.native
  sealed trait `select tab` extends js.Object
  
  @js.native
  sealed trait `set content` extends NodeGenericEventType
  
  @js.native
  sealed trait `set items` extends ListElementEventType
  
  @js.native
  sealed trait show extends NodeGenericEventType
  
  @js.native
  sealed trait submit extends TextareaElementEventType
  
  @js.native
  sealed trait top extends js.Object
  
  @js.native
  sealed trait underline extends js.Object
  
  @js.native
  sealed trait vertical extends js.Object
  
  @js.native
  sealed trait w3m extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  @js.native
  sealed trait wheeldown extends NodeMouseEventType
  
  @js.native
  sealed trait wheelup extends NodeMouseEventType
  
  @scala.inline
  def action: action = "action".asInstanceOf[action]
  @scala.inline
  def `add item`: `add item` = "add item".asInstanceOf[`add item`]
  @scala.inline
  def adopt: adopt = "adopt".asInstanceOf[adopt]
  @scala.inline
  def ansi: ansi = "ansi".asInstanceOf[ansi]
  @scala.inline
  def attach: attach = "attach".asInstanceOf[attach]
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def cd: cd = "cd".asInstanceOf[cd]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  @scala.inline
  def `create item`: `create item` = "create item".asInstanceOf[`create item`]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def detach: detach = "detach".asInstanceOf[detach]
  @scala.inline
  def `element click`: `element click` = "element click".asInstanceOf[`element click`]
  @scala.inline
  def `element mouseout`: `element mouseout` = "element mouseout".asInstanceOf[`element mouseout`]
  @scala.inline
  def `element mouseover`: `element mouseover` = "element mouseover".asInstanceOf[`element mouseover`]
  @scala.inline
  def `element mouseup`: `element mouseup` = "element mouseup".asInstanceOf[`element mouseup`]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  @scala.inline
  def `insert item`: `insert item` = "insert item".asInstanceOf[`insert item`]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def mem: mem = "mem".asInstanceOf[mem]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  @scala.inline
  def `parsed content`: `parsed content` = "parsed content".asInstanceOf[`parsed content`]
  @scala.inline
  def prerender: prerender = "prerender".asInstanceOf[prerender]
  @scala.inline
  def press: press = "press".asInstanceOf[press]
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def `remove item`: `remove item` = "remove item".asInstanceOf[`remove item`]
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  @scala.inline
  def reparent: reparent = "reparent".asInstanceOf[reparent]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def `select item`: `select item` = "select item".asInstanceOf[`select item`]
  @scala.inline
  def `select tab`: `select tab` = "select tab".asInstanceOf[`select tab`]
  @scala.inline
  def `set content`: `set content` = "set content".asInstanceOf[`set content`]
  @scala.inline
  def `set items`: `set items` = "set items".asInstanceOf[`set items`]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def w3m: w3m = "w3m".asInstanceOf[w3m]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  @scala.inline
  def wheeldown: wheeldown = "wheeldown".asInstanceOf[wheeldown]
  @scala.inline
  def wheelup: wheelup = "wheelup".asInstanceOf[wheelup]
}

