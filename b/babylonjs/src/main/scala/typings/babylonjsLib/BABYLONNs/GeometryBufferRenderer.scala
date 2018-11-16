package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This renderer is helpfull to fill one of the render target with a geometry buffer.
     */
@JSGlobal("BABYLON.GeometryBufferRenderer")
@js.native
class GeometryBufferRenderer protected () extends js.Object {
  /**
           * Creates a new G Buffer for the scene
           * @param scene The scene the buffer belongs to
           * @param ratio How big is the buffer related to the main canvas.
           */
  def this(scene: Scene) = this()
  /**
           * Creates a new G Buffer for the scene
           * @param scene The scene the buffer belongs to
           * @param ratio How big is the buffer related to the main canvas.
           */
  def this(scene: Scene, ratio: scala.Double) = this()
  var _cachedDefines: java.lang.String = js.native
  var _effect: Effect = js.native
  var _enablePosition: js.Any = js.native
  var _multiRenderTarget: js.Any = js.native
  var _ratio: js.Any = js.native
  var _scene: js.Any = js.native
  /**
           * Gets wether or not position are enabled for the G buffer.
           */
  /**
          * Sets wether or not position are enabled for the G buffer.
          */
  var enablePosition: scala.Boolean = js.native
  /**
           * Gets wether or not G buffer are supported by the running hardware.
           * This requires draw buffer supports
           */
  val isSupported: scala.Boolean = js.native
  /**
           * Gets the ratio used by the buffer during its creation.
           * How big is the buffer related to the main canvas.
           */
  val ratio: scala.Double = js.native
  /**
           * Set the render list (meshes to be rendered) used in the G buffer.
           */
  var renderList: js.Array[Mesh] = js.native
  /**
           * Gets the number of samples used to render the buffer (anti aliasing).
           */
  /**
          * Sets the number of samples used to render the buffer (anti aliasing).
          */
  var samples: scala.Double = js.native
  /**
           * Gets the scene associated with the buffer.
           */
  val scene: Scene = js.native
  /* protected */ def _createRenderTargets(): scala.Unit = js.native
  /**
           * Disposes the renderer and frees up associated resources.
           */
  def dispose(): scala.Unit = js.native
  /**
           * Gets the current underlying G Buffer.
           * @returns the buffer
           */
  def getGBuffer(): MultiRenderTarget = js.native
  /**
           * Checks wether everything is ready to render a submesh to the G buffer.
           * @param subMesh the submesh to check readiness for
           * @param useInstances is the mesh drawn using instance or not
           * @returns true if ready otherwise false
           */
  def isReady(subMesh: SubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
}

