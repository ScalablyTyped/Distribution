package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSuite extends StObject {
  
  def execute(): Unit = js.native
}
object XSuite {
  
  @scala.inline
  def apply(execute: () => Unit): XSuite = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XSuite]
  }
  
  @scala.inline
  implicit class XSuiteMutableBuilder[Self <: XSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
