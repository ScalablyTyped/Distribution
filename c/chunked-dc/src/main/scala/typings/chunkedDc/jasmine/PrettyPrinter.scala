package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrettyPrinter
  extends StObject
     with Instantiable0[js.Any] {
  
  def append(value: js.Any): Unit = js.native
  
  def emitArray(array: js.Array[js.Any]): Unit = js.native
  
  def emitObject(obj: js.Any): Unit = js.native
  
  def emitScalar(value: js.Any): Unit = js.native
  
  def emitString(value: String): Unit = js.native
  
  def format(value: js.Any): Unit = js.native
  
  def iterateObject(obj: js.Any, fn: js.Function2[/* property */ String, /* isGetter */ Boolean, Unit]): Unit = js.native
}
