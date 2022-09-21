package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends StObject {
  
  def disconnect(): Unit
  
  def observe(target: Element): Unit
  
  val root: Element | Document | Null
  
  val rootMargin: java.lang.String
  
  def takeRecords(): Array[IntersectionObserverEntry]
  
  val thresholds: ReadonlyArray[Double]
  
  def unobserve(target: Element): Unit
}
object IntersectionObserver {
  
  inline def apply(
    disconnect: () => Unit,
    observe: Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => Array[IntersectionObserverEntry],
    thresholds: ReadonlyArray[Double],
    unobserve: Element => Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve), root = null)
    __obj.asInstanceOf[IntersectionObserver]
  }
  
  extension [Self <: IntersectionObserver](x: Self) {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setTakeRecords(value: () => Array[IntersectionObserverEntry]): Self = StObject.set(x, "takeRecords", js.Any.fromFunction0(value))
    
    inline def setThresholds(value: ReadonlyArray[Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
  }
}
