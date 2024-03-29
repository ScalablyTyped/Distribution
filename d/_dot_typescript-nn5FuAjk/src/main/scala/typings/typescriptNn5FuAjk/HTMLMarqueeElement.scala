package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to manipulate <marquee> elements.
  * @deprecated
  */
@js.native
trait HTMLMarqueeElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  var behavior: java.lang.String = js.native
  
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  
  /** @deprecated */
  var direction: java.lang.String = js.native
  
  /** @deprecated */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  var hspace: Double = js.native
  
  /** @deprecated */
  var loop: Double = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  var scrollAmount: Double = js.native
  
  /** @deprecated */
  var scrollDelay: Double = js.native
  
  /** @deprecated */
  def start(): Unit = js.native
  
  /** @deprecated */
  def stop(): Unit = js.native
  
  /** @deprecated */
  var trueSpeed: scala.Boolean = js.native
  
  /** @deprecated */
  var vspace: Double = js.native
  
  /** @deprecated */
  var width: java.lang.String = js.native
}
