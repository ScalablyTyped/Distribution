package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object corsLib {
  type CustomOrigin = js.Function2[
    /* requestOrigin */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* allow */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
