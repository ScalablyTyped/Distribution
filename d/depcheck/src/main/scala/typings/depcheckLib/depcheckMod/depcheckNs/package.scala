package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object depcheckNs {
  type Detector = js.Function1[/* node */ Node, js.Array[java.lang.String] | java.lang.String]
  type Parser = js.Function4[
    /* content */ java.lang.String, 
    /* filePath */ java.lang.String, 
    /* deps */ js.Array[java.lang.String], 
    /* rootDir */ java.lang.String, 
    Node
  ]
}
