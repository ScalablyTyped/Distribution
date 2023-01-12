package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSuite extends StObject {
  
  def execute(): Unit
}
object XSuite {
  
  inline def apply(execute: () => Unit): XSuite = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XSuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSuite] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
