package typings
package depcheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object depcheckMod {
  type Detector = js.Function1[/* node */ Node, js.Array[java.lang.String] | java.lang.String]
  type Node = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Parser = js.Function4[
    /* content */ java.lang.String, 
    /* filePath */ java.lang.String, 
    /* deps */ js.Array[java.lang.String], 
    /* rootDir */ java.lang.String, 
    Node
  ]
}
