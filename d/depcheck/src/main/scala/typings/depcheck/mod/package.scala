package typings.depcheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Detector_ = js.Function1[
    /* node */ typings.depcheck.mod.Node, 
    js.Array[java.lang.String] | java.lang.String
  ]
  type Node = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PackageDependencies = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Parser_ = js.Function4[
    /* content */ java.lang.String, 
    /* filePath */ java.lang.String, 
    /* deps */ js.Array[java.lang.String], 
    /* rootDir */ java.lang.String, 
    typings.depcheck.mod.Node
  ]
}
