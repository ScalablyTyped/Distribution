package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.mod.model.PositionRelation
import typings.ckeditorCkeditor5Engine.mod.model.PositionStickiness
import typings.ckeditorCkeditor5Engine.mod.model.TreeWalkerValueType
import typings.ckeditorCkeditor5Engine.mod.view.ChangeType
import typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditorCkeditor5EngineStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait after
    extends StObject
       with PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait attributeElement extends StObject
  @scala.inline
  def attributeElement: attributeElement = "attributeElement".asInstanceOf[attributeElement]
  
  @js.native
  sealed trait attributes
    extends StObject
       with ChangeType
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  
  @js.native
  sealed trait backward
    extends StObject
       with TreeWalkerDirection
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait before
    extends StObject
       with PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait character
    extends StObject
       with TreeWalkerValueType
  @scala.inline
  def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait children
    extends StObject
       with ChangeType
  @scala.inline
  def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait codePoint extends StObject
  @scala.inline
  def codePoint: codePoint = "codePoint".asInstanceOf[codePoint]
  
  @js.native
  sealed trait containerElement extends StObject
  @scala.inline
  def containerElement: containerElement = "containerElement".asInstanceOf[containerElement]
  
  @js.native
  sealed trait different
    extends StObject
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  @scala.inline
  def different: different = "different".asInstanceOf[different]
  
  @js.native
  sealed trait documentFragment extends StObject
  @scala.inline
  def documentFragment: documentFragment = "documentFragment".asInstanceOf[documentFragment]
  
  @js.native
  sealed trait element extends StObject
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait elementEnd
    extends StObject
       with TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  @scala.inline
  def elementEnd: elementEnd = "elementEnd".asInstanceOf[elementEnd]
  
  @js.native
  sealed trait elementStart
    extends StObject
       with TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  @scala.inline
  def elementStart: elementStart = "elementStart".asInstanceOf[elementStart]
  
  @js.native
  sealed trait emptyElement extends StObject
  @scala.inline
  def emptyElement: emptyElement = "emptyElement".asInstanceOf[emptyElement]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait forward
    extends StObject
       with TreeWalkerDirection
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait rootElement extends StObject
  @scala.inline
  def rootElement: rootElement = "rootElement".asInstanceOf[rootElement]
  
  @js.native
  sealed trait same
    extends StObject
       with PositionRelation
       with typings.ckeditorCkeditor5Engine.mod.view.PositionRelation
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  
  @js.native
  sealed trait text
    extends StObject
       with ChangeType
       with TreeWalkerValueType
       with typings.ckeditorCkeditor5Engine.mod.view.TreeWalkerValueType
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textProxy extends StObject
  @scala.inline
  def textProxy: textProxy = "textProxy".asInstanceOf[textProxy]
  
  @js.native
  sealed trait toNext
    extends StObject
       with PositionStickiness
  @scala.inline
  def toNext: toNext = "toNext".asInstanceOf[toNext]
  
  @js.native
  sealed trait toNone
    extends StObject
       with PositionStickiness
  @scala.inline
  def toNone: toNone = "toNone".asInstanceOf[toNone]
  
  @js.native
  sealed trait toPrevious
    extends StObject
       with PositionStickiness
  @scala.inline
  def toPrevious: toPrevious = "toPrevious".asInstanceOf[toPrevious]
  
  @js.native
  sealed trait transparent extends StObject
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait uiElement extends StObject
  @scala.inline
  def uiElement: uiElement = "uiElement".asInstanceOf[uiElement]
  
  @js.native
  sealed trait word extends StObject
  @scala.inline
  def word: word = "word".asInstanceOf[word]
}
