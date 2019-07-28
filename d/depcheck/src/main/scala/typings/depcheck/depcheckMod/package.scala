package typings.depcheck

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object depcheckMod {
  type Detector = js.Function1[/* node */ Node, js.Array[String] | String]
  type Node = StringDictionary[js.Any]
  type Parser = js.Function4[
    /* content */ String, 
    /* filePath */ String, 
    /* deps */ js.Array[String], 
    /* rootDir */ String, 
    Node
  ]
}
