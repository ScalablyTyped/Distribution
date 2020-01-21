package typings.builderUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type AfterCopyFileTransformer = js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]
  type FileTransformer = js.Function1[
    /* file */ java.lang.String, 
    (js.Promise[
      scala.Null | java.lang.String | typings.node.Buffer | typings.builderUtil.fsMod.CopyFileTransformer
    ]) | scala.Null | java.lang.String | typings.node.Buffer | typings.builderUtil.fsMod.CopyFileTransformer
  ]
  type Filter = js.Function2[/* file */ java.lang.String, /* stat */ typings.fsExtra.mod.Stats, scala.Boolean]
}
