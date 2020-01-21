package typings.braftEditor

import typings.braftEditor.mod.BuiltInControlType
import typings.braftEditor.mod.ExtendControlType
import typings.braftEditor.mod.HookType
import typings.braftEditor.mod.ImageControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object braftEditorStrings {
  @js.native
  sealed trait `align-center` extends ImageControlType
  
  @js.native
  sealed trait `align-left` extends ImageControlType
  
  @js.native
  sealed trait `align-right` extends ImageControlType
  
  @js.native
  sealed trait blockquote extends BuiltInControlType
  
  @js.native
  sealed trait bold extends BuiltInControlType
  
  @js.native
  sealed trait button extends js.Object
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait `change-block-type` extends HookType
  
  @js.native
  sealed trait clear extends BuiltInControlType
  
  @js.native
  sealed trait code extends BuiltInControlType
  
  @js.native
  sealed trait component extends js.Object
  
  @js.native
  sealed trait `deselect-medias` extends HookType
  
  @js.native
  sealed trait dropdown extends js.Object
  
  @js.native
  sealed trait emoji extends BuiltInControlType
  
  @js.native
  sealed trait en extends js.Object
  
  @js.native
  sealed trait `exec-editor-command` extends HookType
  
  @js.native
  sealed trait `float-left` extends ImageControlType
  
  @js.native
  sealed trait `float-right` extends ImageControlType
  
  @js.native
  sealed trait `font-family` extends BuiltInControlType
  
  @js.native
  sealed trait `font-size` extends BuiltInControlType
  
  @js.native
  sealed trait fr extends js.Object
  
  @js.native
  sealed trait fullscreen extends BuiltInControlType
  
  @js.native
  sealed trait headings extends BuiltInControlType
  
  @js.native
  sealed trait hr extends BuiltInControlType
  
  @js.native
  sealed trait `insert-emoji` extends HookType
  
  @js.native
  sealed trait `insert-medias` extends HookType
  
  @js.native
  sealed trait italic extends BuiltInControlType
  
  @js.native
  sealed trait jpn extends js.Object
  
  @js.native
  sealed trait justify extends js.Object
  
  @js.native
  sealed trait kr extends js.Object
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait `letter-spacing` extends BuiltInControlType
  
  @js.native
  sealed trait `line-height` extends BuiltInControlType
  
  @js.native
  sealed trait link
    extends BuiltInControlType
       with ImageControlType
  
  @js.native
  sealed trait `list-ol` extends BuiltInControlType
  
  @js.native
  sealed trait `list-ul` extends BuiltInControlType
  
  @js.native
  sealed trait media extends BuiltInControlType
  
  @js.native
  sealed trait modal extends js.Object
  
  @js.native
  sealed trait `open-braft-finder` extends HookType
  
  @js.native
  sealed trait pl extends js.Object
  
  @js.native
  sealed trait redo extends BuiltInControlType
  
  @js.native
  sealed trait remove extends ImageControlType
  
  @js.native
  sealed trait `remove-medias` extends HookType
  
  @js.native
  sealed trait `remove-styles` extends BuiltInControlType
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait ru extends js.Object
  
  @js.native
  sealed trait `select-files` extends HookType
  
  @js.native
  sealed trait `select-medias` extends HookType
  
  @js.native
  sealed trait separator
    extends BuiltInControlType
       with ExtendControlType
  
  @js.native
  sealed trait size extends ImageControlType
  
  @js.native
  sealed trait `strike-through` extends BuiltInControlType
  
  @js.native
  sealed trait subscript extends BuiltInControlType
  
  @js.native
  sealed trait superscript extends BuiltInControlType
  
  @js.native
  sealed trait table extends BuiltInControlType
  
  @js.native
  sealed trait `text-align` extends BuiltInControlType
  
  @js.native
  sealed trait `text-color` extends BuiltInControlType
  
  @js.native
  sealed trait `text-indent` extends BuiltInControlType
  
  @js.native
  sealed trait `toggle-font-family` extends HookType
  
  @js.native
  sealed trait `toggle-font-size` extends HookType
  
  @js.native
  sealed trait `toggle-inline-style` extends HookType
  
  @js.native
  sealed trait `toggle-letter-spacing` extends HookType
  
  @js.native
  sealed trait `toggle-line-height` extends HookType
  
  @js.native
  sealed trait `toggle-link` extends HookType
  
  @js.native
  sealed trait `toggle-text-alignment` extends HookType
  
  @js.native
  sealed trait `toggle-text-background-color` extends HookType
  
  @js.native
  sealed trait `toggle-text-color` extends HookType
  
  @js.native
  sealed trait tr extends js.Object
  
  @js.native
  sealed trait underline extends BuiltInControlType
  
  @js.native
  sealed trait undo extends BuiltInControlType
  
  @js.native
  sealed trait zh extends js.Object
  
  @js.native
  sealed trait `zh-hant` extends js.Object
  
  @scala.inline
  def `align-center`: `align-center` = "align-center".asInstanceOf[`align-center`]
  @scala.inline
  def `align-left`: `align-left` = "align-left".asInstanceOf[`align-left`]
  @scala.inline
  def `align-right`: `align-right` = "align-right".asInstanceOf[`align-right`]
  @scala.inline
  def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def `change-block-type`: `change-block-type` = "change-block-type".asInstanceOf[`change-block-type`]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def component: component = "component".asInstanceOf[component]
  @scala.inline
  def `deselect-medias`: `deselect-medias` = "deselect-medias".asInstanceOf[`deselect-medias`]
  @scala.inline
  def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  @scala.inline
  def emoji: emoji = "emoji".asInstanceOf[emoji]
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  @scala.inline
  def `exec-editor-command`: `exec-editor-command` = "exec-editor-command".asInstanceOf[`exec-editor-command`]
  @scala.inline
  def `float-left`: `float-left` = "float-left".asInstanceOf[`float-left`]
  @scala.inline
  def `float-right`: `float-right` = "float-right".asInstanceOf[`float-right`]
  @scala.inline
  def `font-family`: `font-family` = "font-family".asInstanceOf[`font-family`]
  @scala.inline
  def `font-size`: `font-size` = "font-size".asInstanceOf[`font-size`]
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  @scala.inline
  def headings: headings = "headings".asInstanceOf[headings]
  @scala.inline
  def hr: hr = "hr".asInstanceOf[hr]
  @scala.inline
  def `insert-emoji`: `insert-emoji` = "insert-emoji".asInstanceOf[`insert-emoji`]
  @scala.inline
  def `insert-medias`: `insert-medias` = "insert-medias".asInstanceOf[`insert-medias`]
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  @scala.inline
  def jpn: jpn = "jpn".asInstanceOf[jpn]
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  @scala.inline
  def kr: kr = "kr".asInstanceOf[kr]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `letter-spacing`: `letter-spacing` = "letter-spacing".asInstanceOf[`letter-spacing`]
  @scala.inline
  def `line-height`: `line-height` = "line-height".asInstanceOf[`line-height`]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def `list-ol`: `list-ol` = "list-ol".asInstanceOf[`list-ol`]
  @scala.inline
  def `list-ul`: `list-ul` = "list-ul".asInstanceOf[`list-ul`]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def modal: modal = "modal".asInstanceOf[modal]
  @scala.inline
  def `open-braft-finder`: `open-braft-finder` = "open-braft-finder".asInstanceOf[`open-braft-finder`]
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  @scala.inline
  def redo: redo = "redo".asInstanceOf[redo]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def `remove-medias`: `remove-medias` = "remove-medias".asInstanceOf[`remove-medias`]
  @scala.inline
  def `remove-styles`: `remove-styles` = "remove-styles".asInstanceOf[`remove-styles`]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def ru: ru = "ru".asInstanceOf[ru]
  @scala.inline
  def `select-files`: `select-files` = "select-files".asInstanceOf[`select-files`]
  @scala.inline
  def `select-medias`: `select-medias` = "select-medias".asInstanceOf[`select-medias`]
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  @scala.inline
  def `strike-through`: `strike-through` = "strike-through".asInstanceOf[`strike-through`]
  @scala.inline
  def subscript: subscript = "subscript".asInstanceOf[subscript]
  @scala.inline
  def superscript: superscript = "superscript".asInstanceOf[superscript]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  @scala.inline
  def `text-align`: `text-align` = "text-align".asInstanceOf[`text-align`]
  @scala.inline
  def `text-color`: `text-color` = "text-color".asInstanceOf[`text-color`]
  @scala.inline
  def `text-indent`: `text-indent` = "text-indent".asInstanceOf[`text-indent`]
  @scala.inline
  def `toggle-font-family`: `toggle-font-family` = "toggle-font-family".asInstanceOf[`toggle-font-family`]
  @scala.inline
  def `toggle-font-size`: `toggle-font-size` = "toggle-font-size".asInstanceOf[`toggle-font-size`]
  @scala.inline
  def `toggle-inline-style`: `toggle-inline-style` = "toggle-inline-style".asInstanceOf[`toggle-inline-style`]
  @scala.inline
  def `toggle-letter-spacing`: `toggle-letter-spacing` = "toggle-letter-spacing".asInstanceOf[`toggle-letter-spacing`]
  @scala.inline
  def `toggle-line-height`: `toggle-line-height` = "toggle-line-height".asInstanceOf[`toggle-line-height`]
  @scala.inline
  def `toggle-link`: `toggle-link` = "toggle-link".asInstanceOf[`toggle-link`]
  @scala.inline
  def `toggle-text-alignment`: `toggle-text-alignment` = "toggle-text-alignment".asInstanceOf[`toggle-text-alignment`]
  @scala.inline
  def `toggle-text-background-color`: `toggle-text-background-color` = "toggle-text-background-color".asInstanceOf[`toggle-text-background-color`]
  @scala.inline
  def `toggle-text-color`: `toggle-text-color` = "toggle-text-color".asInstanceOf[`toggle-text-color`]
  @scala.inline
  def tr: tr = "tr".asInstanceOf[tr]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  @scala.inline
  def zh: zh = "zh".asInstanceOf[zh]
  @scala.inline
  def `zh-hant`: `zh-hant` = "zh-hant".asInstanceOf[`zh-hant`]
}

