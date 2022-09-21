package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A base interface used by the component transfer function interfaces. */
@js.native
trait SVGComponentTransferFunctionElement
  extends StObject
     with SVGElement {
  
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
  
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
  
  val amplitude: SVGAnimatedNumber = js.native
  
  val exponent: SVGAnimatedNumber = js.native
  
  val intercept: SVGAnimatedNumber = js.native
  
  val offset: SVGAnimatedNumber = js.native
  
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
  
  val slope: SVGAnimatedNumber = js.native
  
  val tableValues: SVGAnimatedNumberList = js.native
  
  val `type`: SVGAnimatedEnumeration = js.native
}
