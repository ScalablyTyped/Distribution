package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLProgram extends js.Object {
  var __SPECTOR_rebuildProgram: js.UndefOr[
    (js.Function4[
      /* vertexSourceCode */ java.lang.String, 
      /* fragmentSourceCode */ java.lang.String, 
      /* onCompiled */ js.Function1[/* program */ this.type, scala.Unit], 
      /* onError */ js.Function1[/* message */ java.lang.String, scala.Unit], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var transformFeedback: js.UndefOr[WebGLTransformFeedback | scala.Null] = js.undefined
}

