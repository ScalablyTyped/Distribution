package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerGlobalScope extends StObject {
  
  def importScripts(args: String*): Unit
}
object WorkerGlobalScope {
  
  inline def apply(importScripts: /* repeated */ String => Unit): WorkerGlobalScope = {
    val __obj = js.Dynamic.literal(importScripts = js.Any.fromFunction1(importScripts))
    __obj.asInstanceOf[WorkerGlobalScope]
  }
  
  extension [Self <: WorkerGlobalScope](x: Self) {
    
    inline def setImportScripts(value: /* repeated */ String => Unit): Self = StObject.set(x, "importScripts", js.Any.fromFunction1(value))
  }
}
