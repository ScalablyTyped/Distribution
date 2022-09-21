package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true). */
@js.native
trait MediaQueryList
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  def addListener(): Unit = js.native
  def addListener(callback: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]): Unit = js.native
  
  val matches: scala.Boolean = js.native
  
  val media: java.lang.String = js.native
  
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  def removeListener(): Unit = js.native
  def removeListener(callback: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]): Unit = js.native
}
