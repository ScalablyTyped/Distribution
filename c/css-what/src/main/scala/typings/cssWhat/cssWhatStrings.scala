package typings.cssWhat

import typings.cssWhat.parseMod.AttributeAction
import typings.cssWhat.parseMod.TraversalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssWhatStrings {
  
  @js.native
  sealed trait adjacent
    extends StObject
       with TraversalType
  @scala.inline
  def adjacent: adjacent = "adjacent".asInstanceOf[adjacent]
  
  @js.native
  sealed trait any
    extends StObject
       with AttributeAction
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait attribute extends StObject
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait child
    extends StObject
       with TraversalType
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait descendant
    extends StObject
       with TraversalType
  @scala.inline
  def descendant: descendant = "descendant".asInstanceOf[descendant]
  
  @js.native
  sealed trait element
    extends StObject
       with AttributeAction
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait end
    extends StObject
       with AttributeAction
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait equals
    extends StObject
       with AttributeAction
  @scala.inline
  def equals: equals = "equals".asInstanceOf[equals]
  
  @js.native
  sealed trait exists
    extends StObject
       with AttributeAction
  @scala.inline
  def exists: exists = "exists".asInstanceOf[exists]
  
  @js.native
  sealed trait hyphen
    extends StObject
       with AttributeAction
  @scala.inline
  def hyphen: hyphen = "hyphen".asInstanceOf[hyphen]
  
  @js.native
  sealed trait not
    extends StObject
       with AttributeAction
  @scala.inline
  def not: not = "not".asInstanceOf[not]
  
  @js.native
  sealed trait parent
    extends StObject
       with TraversalType
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait pseudo extends StObject
  @scala.inline
  def pseudo: pseudo = "pseudo".asInstanceOf[pseudo]
  
  @js.native
  sealed trait `pseudo-element` extends StObject
  @scala.inline
  def `pseudo-element`: `pseudo-element` = "pseudo-element".asInstanceOf[`pseudo-element`]
  
  @js.native
  sealed trait sibling
    extends StObject
       with TraversalType
  @scala.inline
  def sibling: sibling = "sibling".asInstanceOf[sibling]
  
  @js.native
  sealed trait start
    extends StObject
       with AttributeAction
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait tag extends StObject
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  
  @js.native
  sealed trait universal extends StObject
  @scala.inline
  def universal: universal = "universal".asInstanceOf[universal]
}
