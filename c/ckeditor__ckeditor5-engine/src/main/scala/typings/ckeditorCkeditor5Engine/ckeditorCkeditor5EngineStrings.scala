package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.mod.model.PositionRelation
import typings.ckeditorCkeditor5Engine.mod.model.PositionStickiness
import typings.ckeditorCkeditor5Engine.mod.model.TreeWalkerValueType
import typings.ckeditorCkeditor5Engine.mod.view.ChangeType
import typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ckeditorCkeditor5EngineStrings {
  @js.native
  sealed trait after
    extends PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  
  @js.native
  sealed trait attributeElement extends js.Object
  
  @js.native
  sealed trait attributes extends ChangeType
  
  @js.native
  sealed trait backward extends TreeWalkerDirection
  
  @js.native
  sealed trait before
    extends PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  
  @js.native
  sealed trait character extends TreeWalkerValueType
  
  @js.native
  sealed trait children extends ChangeType
  
  @js.native
  sealed trait codePoint extends js.Object
  
  @js.native
  sealed trait containerElement extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait different
    extends typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  
  @js.native
  sealed trait documentFragment extends js.Object
  
  @js.native
  sealed trait element extends js.Object
  
  @js.native
  sealed trait elementEnd
    extends TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  
  @js.native
  sealed trait elementStart
    extends TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  
  @js.native
  sealed trait emptyElement extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait forward extends TreeWalkerDirection
  
  @js.native
  sealed trait rootElement extends js.Object
  
  @js.native
  sealed trait same
    extends PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  
  @js.native
  sealed trait text
    extends ChangeType
       with TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  
  @js.native
  sealed trait textProxy extends js.Object
  
  @js.native
  sealed trait toNext extends PositionStickiness
  
  @js.native
  sealed trait toNone extends PositionStickiness
  
  @js.native
  sealed trait toPrevious extends PositionStickiness
  
  @js.native
  sealed trait transparent extends js.Object
  
  @js.native
  sealed trait uiElement extends js.Object
  
  @js.native
  sealed trait word extends js.Object
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def attributeElement: attributeElement = "attributeElement".asInstanceOf[attributeElement]
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def character: character = "character".asInstanceOf[character]
  @scala.inline
  def children: children = "children".asInstanceOf[children]
  @scala.inline
  def codePoint: codePoint = "codePoint".asInstanceOf[codePoint]
  @scala.inline
  def containerElement: containerElement = "containerElement".asInstanceOf[containerElement]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def different: different = "different".asInstanceOf[different]
  @scala.inline
  def documentFragment: documentFragment = "documentFragment".asInstanceOf[documentFragment]
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  @scala.inline
  def elementEnd: elementEnd = "elementEnd".asInstanceOf[elementEnd]
  @scala.inline
  def elementStart: elementStart = "elementStart".asInstanceOf[elementStart]
  @scala.inline
  def emptyElement: emptyElement = "emptyElement".asInstanceOf[emptyElement]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def rootElement: rootElement = "rootElement".asInstanceOf[rootElement]
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def textProxy: textProxy = "textProxy".asInstanceOf[textProxy]
  @scala.inline
  def toNext: toNext = "toNext".asInstanceOf[toNext]
  @scala.inline
  def toNone: toNone = "toNone".asInstanceOf[toNone]
  @scala.inline
  def toPrevious: toPrevious = "toPrevious".asInstanceOf[toPrevious]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  @scala.inline
  def uiElement: uiElement = "uiElement".asInstanceOf[uiElement]
  @scala.inline
  def word: word = "word".asInstanceOf[word]
}

