package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for attribute information associated with buffer instanciation
     */
@JSGlobal("BABYLON.InstancingAttributeInfo")
@js.native
class InstancingAttributeInfo () extends js.Object {
  /**
           * Name of the GLSL attribute, for debugging purpose only
           */
  var attributeName: java.lang.String = js.native
  /**
           * size of the attribute, 1, 2, 3 or 4
           */
  var attributeSize: scala.Double = js.native
  /**
           * type of the attribute, gl.BYTE, gl.UNSIGNED_BYTE, gl.SHORT, gl.UNSIGNED_SHORT, gl.FIXED, gl.FLOAT.
           * default is FLOAT
           */
  var attribyteType: scala.Double = js.native
  /**
           * Index/offset of the attribute in the vertex shader
           */
  var index: scala.Double = js.native
  /**
           * normalization of fixed-point data. behavior unclear, use FALSE, default is FALSE
           */
  var normalized: scala.Boolean = js.native
  /**
           * Offset of the data in the Vertex Buffer acting as the instancing buffer
           */
  var offset: scala.Double = js.native
}

