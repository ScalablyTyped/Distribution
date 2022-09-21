package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent
  extends StObject
     with Event {
  
  val colno: Double = js.native
  
  val error: Any = js.native
  
  val filename: java.lang.String = js.native
  
  val lineno: Double = js.native
  
  val message: java.lang.String = js.native
}
