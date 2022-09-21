package typings.clipboard

import typings.clipboard.mod.Action
import typings.clipboard.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardStrings {
  
  @js.native
  sealed trait copy
    extends StObject
       with Action
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait cut
    extends StObject
       with Action
  inline def cut: cut = "cut".asInstanceOf[cut]
  
  @js.native
  sealed trait error
    extends StObject
       with Response
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait success
    extends StObject
       with Response
  inline def success: success = "success".asInstanceOf[success]
}
