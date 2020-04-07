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
    __SPECTOR_rebuildProgram: (/* vertexSourceCode */ String, /* fragmentSourceCode */ String, /* onCompiled */ js.Function1[WebGLProgram, Unit], /* onError */ js.Function1[/* message */ String, Unit]) => Unit = null
  ): WebGLProgram = {
    val __obj = js.Dynamic.literal()
    if (__SPECTOR_rebuildProgram != null) __obj.updateDynamic("__SPECTOR_rebuildProgram")(js.Any.fromFunction4(__SPECTOR_rebuildProgram))
    __obj.asInstanceOf[WebGLProgram]
  }
}

