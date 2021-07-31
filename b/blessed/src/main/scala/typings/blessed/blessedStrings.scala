package typings.blessed

import typings.blessed.mod.Widgets.ListElementEventType
import typings.blessed.mod.Widgets.NodeEventType
import typings.blessed.mod.Widgets.NodeGenericEventType
import typings.blessed.mod.Widgets.NodeMouseEventType
import typings.blessed.mod.Widgets.NodeScreenEventType
import typings.blessed.mod.Widgets.TextareaElementEventType
import typings.blessed.mod.Widgets.Types.TAlign
import typings.blessed.mod.Widgets.Types.TMouseAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blessedStrings {
  
  @js.native
  sealed trait action
    extends StObject
       with ListElementEventType
       with TextareaElementEventType
  @scala.inline
  def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait `add item`
    extends StObject
       with ListElementEventType
  @scala.inline
  def `add item`: `add item` = ("add item").asInstanceOf[`add item`]
  
  @js.native
  sealed trait adopt
    extends StObject
       with NodeEventType
  @scala.inline
  def adopt: adopt = "adopt".asInstanceOf[adopt]
  
  @js.native
  sealed trait ansi extends StObject
  @scala.inline
  def ansi: ansi = "ansi".asInstanceOf[ansi]
  
  @js.native
  sealed trait attach
    extends StObject
       with NodeEventType
  @scala.inline
  def attach: attach = "attach".asInstanceOf[attach]
  
  @js.native
  sealed trait bg extends StObject
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait block extends StObject
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blur
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bottom extends StObject
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait cancel
    extends StObject
       with ListElementEventType
       with TextareaElementEventType
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait cd extends StObject
  @scala.inline
  def cd: cd = "cd".asInstanceOf[cd]
  
  @js.native
  sealed trait center
    extends StObject
       with TAlign
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait click
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait cpu extends StObject
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  
  @js.native
  sealed trait `create item`
    extends StObject
       with ListElementEventType
  @scala.inline
  def `create item`: `create item` = ("create item").asInstanceOf[`create item`]
  
  @js.native
  sealed trait destroy
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait detach
    extends StObject
       with NodeEventType
  @scala.inline
  def detach: detach = "detach".asInstanceOf[detach]
  
  @js.native
  sealed trait `element click`
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def `element click`: `element click` = ("element click").asInstanceOf[`element click`]
  
  @js.native
  sealed trait `element mouseout`
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def `element mouseout`: `element mouseout` = ("element mouseout").asInstanceOf[`element mouseout`]
  
  @js.native
  sealed trait `element mouseover`
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def `element mouseover`: `element mouseover` = ("element mouseover").asInstanceOf[`element mouseover`]
  
  @js.native
  sealed trait `element mouseup`
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def `element mouseup`: `element mouseup` = ("element mouseup").asInstanceOf[`element mouseup`]
  
  @js.native
  sealed trait error
    extends StObject
       with TextareaElementEventType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait file extends StObject
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait focus
    extends StObject
       with NodeScreenEventType
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait grid extends StObject
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait hide
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait horizontal extends StObject
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait `inline` extends StObject
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait `inline-block` extends StObject
  @scala.inline
  def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  
  @js.native
  sealed trait `insert item`
    extends StObject
       with ListElementEventType
  @scala.inline
  def `insert item`: `insert item` = ("insert item").asInstanceOf[`insert item`]
  
  @js.native
  sealed trait keypress extends StObject
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait left
    extends StObject
       with TAlign
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait line extends StObject
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait mem extends StObject
  @scala.inline
  def mem: mem = "mem".asInstanceOf[mem]
  
  @js.native
  sealed trait middle extends StObject
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait mouse
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mousedown
    extends StObject
       with NodeMouseEventType
       with TMouseAction
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mousemove
    extends StObject
       with NodeMouseEventType
       with TMouseAction
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @js.native
  sealed trait mouseout
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait mouseup
    extends StObject
       with NodeMouseEventType
       with TMouseAction
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mousewheel
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  
  @js.native
  sealed trait move
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait overlay extends StObject
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait `parsed content`
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def `parsed content`: `parsed content` = ("parsed content").asInstanceOf[`parsed content`]
  
  @js.native
  sealed trait prerender
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def prerender: prerender = "prerender".asInstanceOf[prerender]
  
  @js.native
  sealed trait press extends StObject
  @scala.inline
  def press: press = "press".asInstanceOf[press]
  
  @js.native
  sealed trait refresh extends StObject
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait remove
    extends StObject
       with NodeEventType
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait `remove item`
    extends StObject
       with ListElementEventType
  @scala.inline
  def `remove item`: `remove item` = ("remove item").asInstanceOf[`remove item`]
  
  @js.native
  sealed trait render
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait reparent
    extends StObject
       with NodeEventType
  @scala.inline
  def reparent: reparent = "reparent".asInstanceOf[reparent]
  
  @js.native
  sealed trait reset extends StObject
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait resize
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait right
    extends StObject
       with TAlign
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait scroll extends StObject
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait select extends StObject
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait `select item` extends StObject
  @scala.inline
  def `select item`: `select item` = ("select item").asInstanceOf[`select item`]
  
  @js.native
  sealed trait `select tab` extends StObject
  @scala.inline
  def `select tab`: `select tab` = ("select tab").asInstanceOf[`select tab`]
  
  @js.native
  sealed trait `set content`
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def `set content`: `set content` = ("set content").asInstanceOf[`set content`]
  
  @js.native
  sealed trait `set items`
    extends StObject
       with ListElementEventType
  @scala.inline
  def `set items`: `set items` = ("set items").asInstanceOf[`set items`]
  
  @js.native
  sealed trait show
    extends StObject
       with NodeGenericEventType
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait submit
    extends StObject
       with TextareaElementEventType
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait top extends StObject
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait underline extends StObject
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  
  @js.native
  sealed trait vertical extends StObject
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait w3m extends StObject
  @scala.inline
  def w3m: w3m = "w3m".asInstanceOf[w3m]
  
  @js.native
  sealed trait warning extends StObject
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait wheeldown
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def wheeldown: wheeldown = "wheeldown".asInstanceOf[wheeldown]
  
  @js.native
  sealed trait wheelup
    extends StObject
       with NodeMouseEventType
  @scala.inline
  def wheelup: wheelup = "wheelup".asInstanceOf[wheelup]
}
