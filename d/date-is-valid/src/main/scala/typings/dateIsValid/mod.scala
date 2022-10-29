package typings.dateIsValid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Check if a date is valid or not.
    *
    * @param date The input date.
    * @returns `true` if the date is valid, `false` otherwise.
    *
    * @example
    * import dateIsValid = require("date-is-valid");
    *
    * console.log(dateIsValid(new Date()));
    * // => true
    *
    * console.log(dateIsValid(new Date("foo")));
    * // => false
    */
  inline def apply(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("date-is-valid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
