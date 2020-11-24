package typings.cssWhat

import typings.cssWhat.parseMod.AttributeAction
import typings.cssWhat.parseMod.TraversalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssWhatStrings {
  
  @scala.inline
  def adjacent: adjacent = "adjacent".asInstanceOf[adjacent]
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @scala.inline
  def descendant: descendant = "descendant".asInstanceOf[descendant]
  
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def equals: equals = "equals".asInstanceOf[equals]
  
  @scala.inline
  def exists: exists = "exists".asInstanceOf[exists]
  
  @scala.inline
  def hyphen: hyphen = "hyphen".asInstanceOf[hyphen]
  
  @scala.inline
  def not: not = "not".asInstanceOf[not]
  
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @scala.inline
  def pseudo: pseudo = "pseudo".asInstanceOf[pseudo]
  
  @scala.inline
  def `pseudo-element`: `pseudo-element` = "pseudo-element".asInstanceOf[`pseudo-element`]
  
  @scala.inline
  def sibling: sibling = "sibling".asInstanceOf[sibling]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  
  @scala.inline
  def universal: universal = "universal".asInstanceOf[universal]
  
  @js.native
  sealed trait adjacent extends TraversalType
  
  @js.native
  sealed trait any extends AttributeAction
  
  @js.native
  sealed trait attribute extends js.Object
  
  @js.native
  sealed trait child extends TraversalType
  
  @js.native
  sealed trait descendant extends TraversalType
  
  @js.native
  sealed trait element extends AttributeAction
  
  @js.native
  sealed trait end extends AttributeAction
  
  @js.native
  sealed trait equals extends AttributeAction
  
  @js.native
  sealed trait exists extends AttributeAction
  
  @js.native
  sealed trait hyphen extends AttributeAction
  
  @js.native
  sealed trait not extends AttributeAction
  
  @js.native
  sealed trait parent extends TraversalType
  
  @js.native
  sealed trait pseudo extends js.Object
  
  @js.native
  sealed trait `pseudo-element` extends js.Object
  
  @js.native
  sealed trait sibling extends TraversalType
  
  @js.native
  sealed trait start extends AttributeAction
  
  @js.native
  sealed trait tag extends js.Object
  
  @js.native
  sealed trait universal extends js.Object
}
