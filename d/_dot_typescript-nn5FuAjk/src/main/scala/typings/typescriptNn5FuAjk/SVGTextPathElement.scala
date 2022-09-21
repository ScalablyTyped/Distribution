package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <textPath> element. */
@js.native
trait SVGTextPathElement
  extends StObject
     with SVGTextContentElement
     with SVGURIReference {
  
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
  
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
  
  val method: SVGAnimatedEnumeration = js.native
  
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
  
  val spacing: SVGAnimatedEnumeration = js.native
  
  val startOffset: SVGAnimatedLength = js.native
}
