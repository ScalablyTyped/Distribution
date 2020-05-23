package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLProgram extends js.Object {
  var __SPECTOR_rebuildProgram: js.UndefOr[
    (js.Function4[
      /* vertexSourceCode */ String, 
      /* fragmentSourceCode */ String, 
      /* onCompiled */ js.Function1[/* program */ this.type, Unit], 
      /* onError */ js.Function1[/* message */ String, Unit], 
      Unit
    ]) | Null
  ] = js.undefined
}

object WebGLProgram {
  @scala.inline
  def apply(
    __SPECTOR_rebuildProgram: js.UndefOr[
      Null | ((/* vertexSourceCode */ String, /* fragmentSourceCode */ String, /* onCompiled */ js.Function1[WebGLProgram, Unit], /* onError */ js.Function1[/* message */ String, Unit]) => Unit)
    ] = js.undefined
  ): WebGLProgram = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__SPECTOR_rebuildProgram)) __obj.updateDynamic("__SPECTOR_rebuildProgram")(if (__SPECTOR_rebuildProgram != null) js.Any.fromFunction4(__SPECTOR_rebuildProgram.asInstanceOf[(/* vertexSourceCode */ String, /* fragmentSourceCode */ String, /* onCompiled */ js.Function1[WebGLProgram, Unit], /* onError */ js.Function1[/* message */ String, Unit]) => Unit]) else null)
    __obj.asInstanceOf[WebGLProgram]
  }
}

