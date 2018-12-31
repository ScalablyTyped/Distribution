package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object credentialLib {
  type HashCallback = js.Function2[
    /* err */ stdLib.Error, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify hashObject */ /* hash */ js.Any, 
    scala.Unit
  ]
  type VerifyCallback = js.Function2[/* err */ stdLib.Error, /* isValid */ scala.Boolean, scala.Unit]
}
