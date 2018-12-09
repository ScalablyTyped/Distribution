package typings
package builderDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outFsMod {
  type AfterCopyFileTransformer = js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]
  type FileTransformer = js.Function1[
    /* file */ java.lang.String, 
    (js.Promise[scala.Null | java.lang.String | nodeLib.Buffer | CopyFileTransformer]) | scala.Null | java.lang.String | nodeLib.Buffer | CopyFileTransformer
  ]
  type Filter = js.Function2[
    /* file */ java.lang.String, 
    /* stat */ fsDashExtraDashPLib.fsDashExtraDashPMod.Stats, 
    scala.Boolean
  ]
}
