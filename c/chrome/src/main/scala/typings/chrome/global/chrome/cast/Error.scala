package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Error")
@js.native
open class Error protected ()
  extends StObject
     with typings.chrome.chrome.cast.Error {
  /**
    * @param code
    * @param opt_description
    * @param opt_details
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
    */
  def this(code: typings.chrome.chrome.cast.ErrorCode) = this()
  def this(code: typings.chrome.chrome.cast.ErrorCode, description: String) = this()
  def this(code: typings.chrome.chrome.cast.ErrorCode, description: String, details: js.Object) = this()
  def this(code: typings.chrome.chrome.cast.ErrorCode, description: Unit, details: js.Object) = this()
  
  /* CompleteClass */
  var code: typings.chrome.chrome.cast.ErrorCode = js.native
  
  /* CompleteClass */
  var description: String | Null = js.native
  
  /* CompleteClass */
  var details: js.Object = js.native
}
