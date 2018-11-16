package typings
package closureDashCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object closureDashCompilerMod {
  type Callback = js.Function3[
    /* err */ stdLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    js.Any
  ]
}
