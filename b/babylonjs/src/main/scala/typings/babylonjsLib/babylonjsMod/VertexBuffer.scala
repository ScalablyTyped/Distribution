package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Specialized buffer used to store vertex data
     */
@JSImport("babylonjs", "VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends babylonjsLib.BABYLONNs.VertexBuffer {
  /**
           * Constructor
           * @param engine the engine
           * @param data the data to use for this vertex buffer
           * @param kind the vertex buffer kind
           * @param updatable whether the data is updatable
           * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
           * @param stride the stride (optional)
           * @param instanced whether the buffer is instanced (optional)
           * @param offset the offset of the data (optional)
           * @param size the number of components (optional)
           * @param type the type of the component (optional)
           * @param normalized whether the data contains normalized data (optional)
           * @param useBytes set to true if stride and offset are in bytes (optional)
           */
  def this(engine: js.Any, data: babylonjsLib.BABYLONNs.Buffer, kind: java.lang.String, updatable: scala.Boolean, postponeInternalCreation: js.UndefOr[scala.Boolean], stride: js.UndefOr[scala.Double], instanced: js.UndefOr[scala.Boolean], offset: js.UndefOr[scala.Double], size: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], normalized: js.UndefOr[scala.Boolean], useBytes: js.UndefOr[scala.Boolean]) = this()
  /**
           * Constructor
           * @param engine the engine
           * @param data the data to use for this vertex buffer
           * @param kind the vertex buffer kind
           * @param updatable whether the data is updatable
           * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
           * @param stride the stride (optional)
           * @param instanced whether the buffer is instanced (optional)
           * @param offset the offset of the data (optional)
           * @param size the number of components (optional)
           * @param type the type of the component (optional)
           * @param normalized whether the data contains normalized data (optional)
           * @param useBytes set to true if stride and offset are in bytes (optional)
           */
  def this(engine: js.Any, data: babylonjsLib.BABYLONNs.DataArray, kind: java.lang.String, updatable: scala.Boolean, postponeInternalCreation: js.UndefOr[scala.Boolean], stride: js.UndefOr[scala.Double], instanced: js.UndefOr[scala.Boolean], offset: js.UndefOr[scala.Double], size: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], normalized: js.UndefOr[scala.Boolean], useBytes: js.UndefOr[scala.Boolean]) = this()
}

/**
     * Specialized buffer used to store vertex data
     */
@JSImport("babylonjs", "VertexBuffer")
@js.native
object VertexBuffer extends js.Object {
  /**
           * The byte type.
           */
  val BYTE: scala.Double = js.native
  /**
           * Colors
           */
  val ColorKind: java.lang.String = js.native
  /**
           * The float type.
           */
  val FLOAT: scala.Double = js.native
  /**
           * The integer type.
           */
  val INT: scala.Double = js.native
  /**
           * Additional matrix indices (for bones)
           */
  val MatricesIndicesExtraKind: java.lang.String = js.native
  /**
           * Matrix indices (for bones)
           */
  val MatricesIndicesKind: java.lang.String = js.native
  /**
           * Additional matrix weights (for bones)
           */
  val MatricesWeightsExtraKind: java.lang.String = js.native
  /**
           * Matrix weights (for bones)
           */
  val MatricesWeightsKind: java.lang.String = js.native
  /**
           * Normals
           */
  val NormalKind: java.lang.String = js.native
  /**
           * Positions
           */
  val PositionKind: java.lang.String = js.native
  /**
           * The short type.
           */
  val SHORT: scala.Double = js.native
  /**
           * Tangents
           */
  val TangentKind: java.lang.String = js.native
  /**
           * The unsigned byte type.
           */
  val UNSIGNED_BYTE: scala.Double = js.native
  /**
           * The unsigned integer type.
           */
  val UNSIGNED_INT: scala.Double = js.native
  /**
           * The unsigned short type.
           */
  val UNSIGNED_SHORT: scala.Double = js.native
  /**
           * Texture coordinates 2
           */
  val UV2Kind: java.lang.String = js.native
  /**
           * Texture coordinates 3
           */
  val UV3Kind: java.lang.String = js.native
  /**
           * Texture coordinates 4
           */
  val UV4Kind: java.lang.String = js.native
  /**
           * Texture coordinates 5
           */
  val UV5Kind: java.lang.String = js.native
  /**
           * Texture coordinates 6
           */
  val UV6Kind: java.lang.String = js.native
  /**
           * Texture coordinates
           */
  val UVKind: java.lang.String = js.native
  var _GetFloatValue: js.Any = js.native
  /**
           * Deduces the stride given a kind.
           * @param kind The kind string to deduce
           * @returns The deduced stride
           */
  def DeduceStride(kind: java.lang.String): scala.Double = js.native
  /**
           * Enumerates each value of the given parameters as numbers.
           * @param data the data to enumerate
           * @param byteOffset the byte offset of the data
           * @param byteStride the byte stride of the data
           * @param componentCount the number of components per element
           * @param componentType the type of the component
           * @param count the total number of components
           * @param normalized whether the data is normalized
           * @param callback the callback function called for each value
           */
  def ForEach(
    data: babylonjsLib.BABYLONNs.DataArray,
    byteOffset: scala.Double,
    byteStride: scala.Double,
    componentCount: scala.Double,
    componentType: scala.Double,
    count: scala.Double,
    normalized: scala.Boolean,
    callback: js.Function2[/* value */ scala.Double, /* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets the byte length of the given type.
           * @param type the type
           * @returns the number of bytes
           */
  def GetTypeByteLength(`type`: scala.Double): scala.Double = js.native
}

