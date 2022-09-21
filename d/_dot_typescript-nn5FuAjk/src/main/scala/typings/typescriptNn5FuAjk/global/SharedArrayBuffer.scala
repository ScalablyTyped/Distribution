package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.SharedArrayBufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SharedArrayBuffer")
@js.native
open class SharedArrayBuffer protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.SharedArrayBuffer {
  def this(byteLength: Double) = this()
}
object SharedArrayBuffer {
  
  inline def apply: SharedArrayBufferConstructor = js.Dynamic.global.selectDynamic("SharedArrayBuffer").asInstanceOf[SharedArrayBufferConstructor]
}
