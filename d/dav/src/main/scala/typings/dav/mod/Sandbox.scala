package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Sandbox")
@js.native
open class Sandbox () extends StObject {
  
  /**
    * abort sandboxed requests as a group.
    */
  def abort(): Unit = js.native
  
  def add(request: Any): Unit = js.native
  
  var requestList: js.Array[Any] = js.native
}
